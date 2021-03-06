--
-- Catalogo.hs
--
-- Definição e implementação da
-- classe Catalogo e suas funções
--

-- Definição do módulo Catalogo
module Catalogo
( Catalogo(..)
, criaCatalogo
, atualizaCatalogo
, ordenaCatalogo
, escreveSaida
, escreveCatalogo
) where

-- Importando Livro.hs
import Livro
import Data

-- Definição da estrutura Catalogo
data Catalogo = Catalogo {
    livros :: [Livro]
}

-- Como mostrar um Catalogo
instance Show Catalogo where
    show (Catalogo (x:[])) = show x
    show (Catalogo (x:xs)) = show x ++ "\n" ++ show (Catalogo xs)

--
-- FUNÇÕES PRINCIPAIS
--

-- Cria um Catálogo a partir do conteúdo do
-- arquivo 'catalogo.txt' f
criaCatalogo f   = Catalogo livros
    where livros = [livroFromList x | x <- info]
          info   = splitOn "" (lines f)

-- Atualiza o Catálogo a partir do conteúdo
-- do arquivo 'atual.txt' f
atualizaCatalogo c f = updateCatalogue livrosList listaAcoes
    where livrosList = livros c
          listaAcoes = splitOn "" (lines f)

-- Ordena Catálogo por método de comparação
ordenaCatalogo cmp catalogo = Catalogo (quicksortBy cmp (livros catalogo))

-- Escrever Catalogo atualizado em "catalogo.txt"
escreveCatalogo arqv catalogo = writeFile arqv saida
    where saida = show (ordenaCatalogo comparaLivroPorCodigo catalogo)

-- Escrever saída no arquivo "saida.txt"
escreveSaida arqv catalogo = writeFile arqv saidas
    where saidas = t1 ++ c1 ++ t2 ++ c2 ++ t3 ++ c3 ++ t4 ++ c4
          t1 = "Lista de Livros Ordenada Crescentemente por Codigo:\n\n"
          c1 = show (ordenaCatalogo comparaLivroPorCodigo catalogo)
          t2 = "\nLista de Livros Ordenada Decrescentemente por Titulo:\n\n"
          c2 = show (ordenaCatalogo comparaLivroPorTitulo catalogo)
          t3 = "\nLista de Livros Ordenada Crescentemente por Autor:\n\n"
          c3 = show (ordenaCatalogo comparaLivroPorAutor catalogo)
          t4 = "\nLista de Livros Ordenada Decrescentemente por Data de Publicacao:\n\n"
          c4 = show (ordenaCatalogo comparaLivroPorData catalogo)

--
-- FUNÇÕES SECUNDÁRIAS
--

-- Função para adicionar um Livro em uma lista
adicionaLivro livro [] = [livro]
adicionaLivro livro (x:xs)
    | codigo x == codigo livro = x : xs  -- Livro já existe na lista
    | otherwise                = x : adicionaLivro livro xs

-- Função para atualizar as informações
-- de um livro na lista de livros
atualizaLivro _ [] = []
atualizaLivro livro xs = adicionaLivro livro (removeLivro (codigo livro) xs)

-- Função para deletar um livro de uma lista
-- de livros pelo código 'x'
removeLivro _ []                      = []
removeLivro x (y:ys) | x == codigo y  = removeLivro x ys
                     | otherwise      = y : removeLivro x ys

-- Função que atualiza um catalogo a partir
-- de uma lista de livros 'xs' e uma lista
-- de atualizações 'yss'
updateCatalogue xs [] = Catalogo xs
updateCatalogue xs (ys:yss) | head ys == "a" = updateCatalogue listaLivroAtualizado yss
                            | head ys == "e" = updateCatalogue listaSemLivro yss
                            | head ys == "i" = updateCatalogue listaLivroIncluido yss

    where listaLivroAtualizado = atualizaLivro (livroFromList (tail ys)) xs
          listaSemLivro = removeLivro codigo xs
          listaLivroIncluido = adicionaLivro (livroFromList (tail ys)) xs
          codigo = head (tail ys)

-- Função que cria um Livro a partir de uma lista
-- com as informações do livro
livroFromList xs = Livro c t a ass d e r
    where c   = xs!!0
          t   = xs!!1
          a   = xs!!2
          ass = xs!!3
          d   = Data dia mes ano
          e   = xs!!5
          r   = unlines (drop 6 xs)
          [dia,mes,ano] = splitOn '/' (xs!!4)

--
-- FUNÇÕES UTILITÁRIAS
--

-- Quicksort por método 'cmp' de comparação de livros
quicksortBy _ [] = []  
quicksortBy cmp (x:xs) = lesser ++ [x] ++ bigger
    where lesser = quicksortBy cmp [a | a <- xs, cmp a x]
          bigger = quicksortBy cmp [a | a <- xs, cmp x a]

-- Separar uma lista de strings em uma lista de lista de strings
splitOn _ [] = []
splitOn delim l@(x:xs)
    | x==delim = splitOn delim xs
    | otherwise =  h:(splitOn delim t)
        where (h,t) = break (\a -> a==delim) l
