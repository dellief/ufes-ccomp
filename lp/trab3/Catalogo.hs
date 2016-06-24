--
-- Catalogo.hs
--
-- Definição e implementação da
-- classe Catalogo e suas funções
--

-- Definição do módulo Catalogo
module Catalogo
( Catalogo(..)
, adicionaLivro
, livroFromList
, criaListaLivros
, splitOn
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
    show (Catalogo []) = ""
    show (Catalogo (x:xs)) = show x ++ "\n\n" ++ show (Catalogo xs)

-- Função que cria a lista de livros
criaListaLivros _ [] = []
criaListaLivros l (xs:xss) = adicionaLivro l (livroFromList xs) ++ criaListaLivros l xss

-- Função para adicionar um livro em uma lista
adicionaLivro xs (Livro c t a ass d e r) = xs ++ [Livro c t a ass d e r]

-- Função de leitura de um livro
livroFromList xs = Livro c t a ass d e r
    where c   = read (xs!!0) :: Int
          t   = xs!!1
          a   = xs!!2
          ass = xs!!3
          d   = Data dia mes ano
          e   = xs!!5
          r   = xs!!6
          [dia,mes,ano] = splitOn '/' (xs!!4)

--toStringList (Catalogo []) = []
--toStringList (Catalogo (x:xs)) = show x : toStringList (Catalogo xs)

-- Separar uma lista de strings em uma lista de lista de strings
splitOn _ [] = []
splitOn delim l@(x:xs)
    | x==delim = splitOn delim xs
    | otherwise =  h:(splitOn delim t)
        where (h,t) = break (\a -> a==delim) l
