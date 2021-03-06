/**
 * sor.c
 *
 * Implementação do SOR para os dois casos:
 * SOR em matriz pentadiagonal e SOR livre
 * de matriz
 *
 */

#include <math.h>
#include "sor.h"

/**
 * Algoritmo SOR - Successive Over Relaxation:
 * resolve o sistema linear pentadiagonal
 * @param  sistema Ponteiro para o sistema linear
 * @param  omega   Parâmetro de relaxação do SOR
 * @param  toler   Tolerância do erro de parada
 * @param  iterMax Número máximo de iterações
 * @return         O vetor solução do sistema
 */
double *sor(SistemaLinear* sistema, double omega, double toler, size_t iterMax, size_t* numIter, double* error, double* norma)
{
	double *x; // Vetor solução
	double soma, normaX, normaDif, aux, erro;
	size_t i, iter, dr;
    MatrizPentadiagonal* matriz;

    // Solução inicial nula
	x = calloc(sistema->N, sizeof(double));

    matriz = sistema->matriz;

    // Distância relativa de elementos até a primeira
    // ocorrência de um elemento "e". Em outras palavras,
    // o número n de partições +1 no eixo x
    dr = (matriz->N - matriz->tamED);

    // Iterar até erro aceitável ou máximo de iterações atingido
	iter = 0;
	do {
        normaX = 0;
        normaDif = 0;
        i = 0;
		iter++;

        /*
         * Cálculo de x[0]
         * Primeira linha da matriz: apenas existem
         * os elementos de a, b e d
         */
        soma = matriz->b[i] * x[1] +
               matriz->d[i] * x[dr];

        // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
        aux = (1 - omega) * x[i] + (omega/matriz->a[i]) * (sistema->f[i] - soma);

        // Norma de x[i]
        if(fabs(aux) > normaX)
            normaX = fabs(aux);

        // Norma da diferença (x[i] - x[i-1])
        if(fabs(aux - x[i]) > normaDif)
            normaDif = fabs(aux - x[i]);

        // Atualizando valor de x[i]
        x[i] = aux;

        i++;

        /*
         * Cálculo de x[1] até x[dr-1]
         * Linhas que possuem c, a, b e d até a
         * ocorrência do primeiro elemento de e:
         * de 1 até dr-1
         */
        for(; i < dr; i++) {
            soma = matriz->c[i] * x[i-1] +
                   matriz->b[i] * x[i+1] +
                   matriz->d[i] * x[i+dr];

            // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
            aux = (1 - omega) * x[i] + (omega/matriz->a[i]) * (sistema->f[i] - soma);

            // Norma de x[i]
            if(fabs(aux) > normaX)
                normaX = fabs(aux);

            // Norma da diferença (x[i] - x[i-1])
            if(fabs(aux - x[i]) > normaDif)
                normaDif = fabs(aux - x[i]);

            // Atualizando valor de x[i]
            x[i] = aux;
        }

        /*
         * Cálculo de x[dr] até x[tamED-1]
         * Linhas que possuem e, c, a, b e d até
         * a NÃO ocorrência de elementos de d:
         * de dr até tamED-1
         */
        for(i=dr; i < matriz->tamED; i++) {
            soma = matriz->e[i] * x[i-dr] +
                   matriz->c[i] * x[i-1]  +
                   matriz->b[i] * x[i+1]  +
                   matriz->d[i] * x[i+dr];

            // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
            aux = (1 - omega) * x[i] + (omega/matriz->a[i]) * (sistema->f[i] - soma);

            // Norma de x[i]
            if(fabs(aux) > normaX)
                normaX = fabs(aux);

            // Norma da diferença (x[i] - x[i-1])
            if(fabs(aux - x[i]) > normaDif)
                normaDif = fabs(aux - x[i]);

            // Atualizando valor de x[i]
            x[i] = aux;
        }

        /*
         * Cálculo de x[tamED] até x[N-2]
         * Linhas que possuem e, c, a e b até
         * a NÃO ocorrência de elementos de b:
         * de tamED até N-1
         */
        for(i=matriz->tamED; i < sistema->N-1; i++) {
            soma = matriz->e[i] * x[i-dr] +
                   matriz->c[i] * x[i-1]  +
                   matriz->b[i] * x[i+1];

            // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
            aux = (1 - omega) * x[i] + (omega/matriz->a[i]) * (sistema->f[i] - soma);

            // Norma de x[i]
            if(fabs(aux) > normaX)
                normaX = fabs(aux);

            // Norma da diferença (x[i] - x[i-1])
            if(fabs(aux - x[i]) > normaDif)
                normaDif = fabs(aux - x[i]);

            // Atualizando valor de x[i]
            x[i] = aux;
        }

        /*
         * Cálculo de x[N-1]
         * Última linha da matriz: apenas existem
         * os elementos de e, c e a
         */
        soma = matriz->e[i] * x[i-dr] +
               matriz->c[i] * x[i-1];

        // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
        aux = (1 - omega) * x[i] + (omega/matriz->a[i]) * (sistema->f[i] - soma);

        // Norma de x[i]
        if(fabs(aux) > normaX)
            normaX = fabs(aux);

        // Norma da diferença (x[i] - x[i-1])
        if(fabs(aux - x[i]) > normaDif)
            normaDif = fabs(aux - x[i]);

        // Atualizando valor de x[i]
        x[i] = aux;

		/*
         * Cálculo do erro
         */
		erro = normaDif/normaX;
	}
    while(erro > toler && iter < iterMax);

    *numIter = iter;
    *error = erro;
    *norma = normaX;

	return x;
}

/**
 * Algoritmo SOR - Successive Over Relaxation:
 * resolve o método das diferenças finitas
 * bidimensional livre de matriz
 * @param  omega   Parâmetro de relaxação do SOR
 * @param  toler   Tolerância do erro de parada
 * @param  iterMax Número máximo de iterações
 * @return         O vetor solução do sistema
 */
double *sorLivre(Dados* dados, Ponto* vetorPontos, double omega, double toler, size_t iterMax, size_t* numIter, double* error, double* norma)
{
    double* x;

    if(flagExp == 1)
        x = sorLivreV1(dados, omega, toler, iterMax, numIter, error, norma);
    else if(flagExp == 2)
        x = sorLivreV2(dados, vetorPontos, omega, toler, iterMax, numIter, error, norma);
    else if(flagExp == 3)
        x = sorLivreA1(dados, omega, toler, iterMax, numIter, error, norma);
    else
        x = sorLivreA2(dados, omega, toler, iterMax, numIter, error, norma);

    return x;

}

double *sorLivreV1(Dados* dados, double omega, double toler, size_t iterMax, size_t* numIter, double* error, double* norma)
{
	double *x; // Vetor solução
	double soma, normaX, normaDif, aux, erro;
    double e, c, a, b, d, vetInd, tamED;
    double hx, hy;
	size_t N, i, iter, dr;

    N = dados->qtdX*dados->qtdY;

    // Solução inicial nula
	x = calloc(N, sizeof(double));

	hx = (dados->fimX - dados->inicioX)/((double)dados->qtdX-1);
	hy = (dados->fimY - dados->inicioY)/((double)dados->qtdY-1);

    // Distância relativa de elementos até a primeira
    // ocorrência de um elemento "e". Em outras palavras,
    // o número n de partições +1 no eixo x
    dr = dados->qtdX;

    tamED = N - dados->qtdX;

    // Iterar até erro aceitável ou máximo de iterações atingido
	iter = 0;
	do {
        normaX = 0;
        normaDif = 0;
        i = 0;
		iter++;

        /*
         * Primeiro ponto: cálculo de x[0]
         * Apenas existem a, b e d
         */
        a = 1;
        b = d = 0;
        vetInd = T0;

        soma = b * x[1] +
               d * x[dr];

        // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
        aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

        // Norma de x[i]
        if(fabs(aux) > normaX)
            normaX = fabs(aux);

        // Norma da diferença (x[i] - x[i-1])
        if(fabs(aux - x[i]) > normaDif)
            normaDif = fabs(aux - x[i]);

        // Atualizando valor de x[i]
        x[i] = aux;

        i++;

        /*
         * Pontos na região inferior do domínio
         * Cálculo de x[1] até x[dr-1]
         * Linhas que possuem c, a, b e d até a
         * ocorrência do primeiro elemento de e:
         * de 1 até dr-1
         */
        a = 1;
        b = d = c = 0;
        vetInd = T0;

        for(i=1; i < dr; i++) {
            soma = c * x[i-1] +
                   b * x[i+1] +
                   d * x[i+dr];

            // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
            aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

            // Norma de x[i]
            if(fabs(aux) > normaX)
                normaX = fabs(aux);

            // Norma da diferença (x[i] - x[i-1])
            if(fabs(aux - x[i]) > normaDif)
                normaDif = fabs(aux - x[i]);

            // Atualizando valor de x[i]
            x[i] = aux;
        }

        /*
         * Pontos internos do domínio e pontos
         * que ocorrem nos lados do domínio:
         * Cálculo de x[dr] até x[tamED-1]
         * Linhas que possuem e, c, a, b e d até
         * a NÃO ocorrência de elementos de d:
         * de dr até tamED-1
         */
        for(i=dr; i < tamED; i++) {
            // Ponto à extrema esquerda
            if(i % dr == 0) {
                a = 1;
                b = d = c = e = 0;
                vetInd = T0;
            }
            // Ponto à extrema direita
            else if(i % dr == dr-1) {
                a = 1;
                b = d = c = e = 0;
                vetInd = T0;
            }
            // Ponto interior do domínio
            // (sem tratamento de contorno)
            else {
                e = (-1/(hy*hy));
                c = (-1/(hx*hx));
                a = 2 * ((1/(hx*hx)) + (1/(hy*hy)));
                b = (-1/(hx*hx));
                d = (-1/(hy*hy));
                vetInd = 0;
            }

            soma = e * x[i-dr] +
                   c * x[i-1]  +
                   b * x[i+1]  +
                   d * x[i+dr];

            // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
            aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

            // Norma de x[i]
            if(fabs(aux) > normaX)
                normaX = fabs(aux);

            // Norma da diferença (x[i] - x[i-1])
            if(fabs(aux - x[i]) > normaDif)
                normaDif = fabs(aux - x[i]);

            // Atualizando valor de x[i]
            x[i] = aux;
        }

        /*
         * Pontos na região superior do domínio
         * Cálculo de x[tamED] até x[N-2]
         * Linhas que possuem e, c, a e b até
         * a NÃO ocorrência de elementos de b:
         * de tamED até N-1
         */
        a = 1;
        b = e = c = 0;
        vetInd = T0;

        for(i=tamED; i < N-1; i++) {
            soma = e * x[i-dr] +
                   c * x[i-1]  +
                   b * x[i+1];

            // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
            aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

            // Norma de x[i]
            if(fabs(aux) > normaX)
                normaX = fabs(aux);

            // Norma da diferença (x[i] - x[i-1])
            if(fabs(aux - x[i]) > normaDif)
                normaDif = fabs(aux - x[i]);

            // Atualizando valor de x[i]
            x[i] = aux;
        }

        /*
         * Último Ponto: Cálculo de x[N-1]
         * Apenas existem os elementos de e, c e a
         */
        a = 1;
        c = e = 0;
        vetInd = T0;

        soma = e * x[i-dr] +
               c * x[i-1];

        // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
        aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

        // Norma de x[i]
        if(fabs(aux) > normaX)
            normaX = fabs(aux);

        // Norma da diferença (x[i] - x[i-1])
        if(fabs(aux - x[i]) > normaDif)
            normaDif = fabs(aux - x[i]);

        // Atualizando valor de x[i]
        x[i] = aux;

		/*
         * Cálculo do erro
         */
		erro = normaDif/normaX;
	}
    while(erro > toler && iter < iterMax);

	*numIter = iter;
    *error = erro;
    *norma = normaX;

	return x;
}

double *sorLivreV2(Dados* dados, Ponto* vetorPontos, double omega, double toler, size_t iterMax, size_t* numIter, double* error, double* norma)
{
	double *x; // Vetor solução
	double soma, normaX, normaDif, aux, erro;
    double e, c, a, b, d, vetInd, tamED;
    double hx, hy, px, py;
    const double euler = EULER;
	size_t N, i, iter, dr;

    N = dados->qtdX*dados->qtdY;

    // Solução inicial nula
	x = calloc(N, sizeof(double));

	hx = (dados->fimX - dados->inicioX)/((double)dados->qtdX-1);
	hy = (dados->fimY - dados->inicioY)/((double)dados->qtdY-1);

    // Distância relativa de elementos até a primeira
    // ocorrência de um elemento "e". Em outras palavras,
    // o número n de partições +1 no eixo x
    dr = dados->qtdX;

    tamED = N - dados->qtdX;

    // Iterar até erro aceitável ou máximo de iterações atingido
	iter = 0;
	do {
        normaX = 0;
        normaDif = 0;
        i = 0;
		iter++;

        /*
         * Primeiro ponto: cálculo de x[0]
         * Apenas existem a, b e d
         */
        a = 1;
        b = d = 0;
        vetInd = 0;

        soma = b * x[1] +
               d * x[dr];

        // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
        aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

        // Norma de x[i]
        if(fabs(aux) > normaX)
            normaX = fabs(aux);

        // Norma da diferença (x[i] - x[i-1])
        if(fabs(aux - x[i]) > normaDif)
            normaDif = fabs(aux - x[i]);

        // Atualizando valor de x[i]
        x[i] = aux;

        i++;

        /*
         * Pontos na região inferior do domínio
         * Cálculo de x[1] até x[dr-1]
         * Linhas que possuem c, a, b e d até a
         * ocorrência do primeiro elemento de e:
         * de 1 até dr-1
         */
        a = 1;
        b = d = c = 0;
        vetInd = 0;

        for(i=1; i < dr; i++) {
            soma = c * x[i-1] +
                   b * x[i+1] +
                   d * x[i+dr];

            // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
            aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

            // Norma de x[i]
            if(fabs(aux) > normaX)
                normaX = fabs(aux);

            // Norma da diferença (x[i] - x[i-1])
            if(fabs(aux - x[i]) > normaDif)
                normaDif = fabs(aux - x[i]);

            // Atualizando valor de x[i]
            x[i] = aux;
        }

        /*
         * Pontos internos do domínio e pontos
         * que ocorrem nos lados do domínio:
         * Cálculo de x[dr] até x[tamED-1]
         * Linhas que possuem e, c, a, b e d até
         * a NÃO ocorrência de elementos de d:
         * de dr até tamED-1
         */
        for(i=dr; i < tamED; i++) {
            // Ponto à extrema esquerda
            if(i % dr == 0) {
                a = 1;
                b = d = c = e = 0;
                vetInd = 0;
            }
            // Ponto à extrema direita
            else if(i % dr == dr-1) {
                a = 1;
                b = d = c = e = 0;
                vetInd = 0;
            }
            // Ponto interior do domínio
            // (sem tratamento de contorno)
            else {
                px = vetorPontos[i].x;
                py = vetorPontos[i].y;
                e = (-1/(hy*hy)) - (20*py/(2*hy));
                c = (-1/(hx*hx)) - (1/(2*hx));
                a = 1 + 2 *((1/(hx*hx)) + (1/(hy*hy)));
                b = (-1/(hx*hx)) + (1/(2*hx));
                d = (-1/(hy*hy)) + (20*py/(2*hy));
                vetInd = -((2.5*pow(euler,pow(px,4.5))*(81*pow(px,9)-81*pow(px,8) +
                    135*pow(px,4.5)-99*pow(px,3.5)+8)*(py-1)*py)+(20*pow(euler,pow(px,4.5))*(px-1)*px)) +
                    5*pow(euler,pow(px,4.5)) * (px*(9*(px-1)*pow(px,3.5)+4)-2) * (py-1)*py +
                    20*py*(10*pow(euler,pow(px,4.5))*(px-1)*px*(2*py-1)) +
                    10*px*py*(1-px)*(1-py)*pow(euler,pow(px,4.5));
            }

            soma = e * x[i-dr] +
                   c * x[i-1]  +
                   b * x[i+1]  +
                   d * x[i+dr];

            // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
            aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

            // Norma de x[i]
            if(fabs(aux) > normaX)
                normaX = fabs(aux);

            // Norma da diferença (x[i] - x[i-1])
            if(fabs(aux - x[i]) > normaDif)
                normaDif = fabs(aux - x[i]);

            // Atualizando valor de x[i]
            x[i] = aux;
        }

        /*
         * Pontos na região superior do domínio
         * Cálculo de x[tamED] até x[N-2]
         * Linhas que possuem e, c, a e b até
         * a NÃO ocorrência de elementos de b:
         * de tamED até N-1
         */
        a = 1;
        b = e = c = 0;
        vetInd = 0;

        for(i=tamED; i < N-1; i++) {
            soma = e * x[i-dr] +
                   c * x[i-1]  +
                   b * x[i+1];

            // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
            aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

            // Norma de x[i]
            if(fabs(aux) > normaX)
                normaX = fabs(aux);

            // Norma da diferença (x[i] - x[i-1])
            if(fabs(aux - x[i]) > normaDif)
                normaDif = fabs(aux - x[i]);

            // Atualizando valor de x[i]
            x[i] = aux;
        }

        /*
         * Último Ponto: Cálculo de x[N-1]
         * Apenas existem os elementos de e, c e a
         */
        a = 1;
        c = e = 0;
        vetInd = 0;

        soma = e * x[i-dr] +
               c * x[i-1];

        // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
        aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

        // Norma de x[i]
        if(fabs(aux) > normaX)
            normaX = fabs(aux);

        // Norma da diferença (x[i] - x[i-1])
        if(fabs(aux - x[i]) > normaDif)
            normaDif = fabs(aux - x[i]);

        // Atualizando valor de x[i]
        x[i] = aux;

		/*
         * Cálculo do erro
         */
		erro = normaDif/normaX;
	}
    while(erro > toler && iter < iterMax);

	*numIter = iter;
    *error = erro;
    *norma = normaX;

	return x;
}

double *sorLivreA1(Dados* dados, double omega, double toler, size_t iterMax, size_t* numIter, double* error, double* norma)
{
	double *x; // Vetor solução
	double soma, normaX, normaDif, aux, erro;
    double e, c, a, b, d, vetInd, tamED;
    double hx, hy;
	size_t N, i, iter, dr;

    N = dados->qtdX*dados->qtdY;

    // Solução inicial nula
	x = calloc(N, sizeof(double));

	hx = (dados->fimX - dados->inicioX)/((double)dados->qtdX-1);
	hy = (dados->fimY - dados->inicioY)/((double)dados->qtdY-1);

    // Distância relativa de elementos até a primeira
    // ocorrência de um elemento "e". Em outras palavras,
    // o número n de partições +1 no eixo x
    dr = dados->qtdX;

    tamED = N - dados->qtdX;

    // Iterar até erro aceitável ou máximo de iterações atingido
	iter = 0;
	do {
        normaX = 0;
        normaDif = 0;
        i = 0;
		iter++;

        /*
         * Primeiro ponto: cálculo de x[0]
         * Apenas existem a, b e d
         */
        a = 1;
        b = d = 0;
        vetInd = 70;

        soma = b * x[1] +
               d * x[dr];

        // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
        aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

        // Norma de x[i]
        if(fabs(aux) > normaX)
            normaX = fabs(aux);

        // Norma da diferença (x[i] - x[i-1])
        if(fabs(aux - x[i]) > normaDif)
            normaDif = fabs(aux - x[i]);

        // Atualizando valor de x[i]
        x[i] = aux;

        i++;

        /*
         * Pontos na região inferior do domínio
         * Cálculo de x[1] até x[dr-1]
         * Linhas que possuem c, a, b e d até a
         * ocorrência do primeiro elemento de e:
         * de 1 até dr-1
         */
        a = 1;
        b = d = c = 0;
        vetInd = 70;

        for(i=1; i < dr; i++) {
            soma = c * x[i-1] +
                   b * x[i+1] +
                   d * x[i+dr];

            // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
            aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

            // Norma de x[i]
            if(fabs(aux) > normaX)
                normaX = fabs(aux);

            // Norma da diferença (x[i] - x[i-1])
            if(fabs(aux - x[i]) > normaDif)
                normaDif = fabs(aux - x[i]);

            // Atualizando valor de x[i]
            x[i] = aux;
        }

        /*
         * Pontos internos do domínio e pontos
         * que ocorrem nos lados do domínio:
         * Cálculo de x[dr] até x[tamED-1]
         * Linhas que possuem e, c, a, b e d até
         * a NÃO ocorrência de elementos de d:
         * de dr até tamED-1
         */
        for(i=dr; i < tamED; i++) {
            // Ponto à extrema esquerda
            if(i % dr == 0) {
                a = 1;
                b = d = c = e = 0;
                vetInd = 200;
            }
            // Ponto à extrema direita
            // Aplicação da condição de contorno mista
            // k*parcial(u)/parcial(n) = c(uRef-u(L,y)
            else if(i % dr == dr-1) {
                e = (-1/(hy*hy));
                c = (-1/(hx*hx));
                a = 2*1/2 + 2*((1/(hx*hx)) + (1/(hy*hy)));
                b = (-1/(hx*hx));
                d = (-1/(hy*hy));
                vetInd = 2*1*70/2;

                vetInd = vetInd - b*hx*70;
                a  = a + b*(1-hx*1);
                b  = 0;
            }
            // Ponto interior do domínio
            // (sem tratamento de contorno)
            else {
                e = (-1/(hy*hy));
                c = (-1/(hx*hx));
                a = 2*1/2 + 2*((1/(hx*hx)) + (1/(hy*hy)));
                b = (-1/(hx*hx));
                d = (-1/(hy*hy));
                vetInd = 2*1*70/2;
            }

            soma = e * x[i-dr] +
                   c * x[i-1]  +
                   b * x[i+1]  +
                   d * x[i+dr];

            // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
            aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

            // Norma de x[i]
            if(fabs(aux) > normaX)
                normaX = fabs(aux);

            // Norma da diferença (x[i] - x[i-1])
            if(fabs(aux - x[i]) > normaDif)
                normaDif = fabs(aux - x[i]);

            // Atualizando valor de x[i]
            x[i] = aux;
        }

        /*
         * Pontos na região superior do domínio
         * Cálculo de x[tamED] até x[N-2]
         * Linhas que possuem e, c, a e b até
         * a NÃO ocorrência de elementos de b:
         * de tamED até N-1
         */
        a = 1;
        b = c = e = 0;
        vetInd = 70;

        for(i=tamED; i < N-1; i++) {
            soma = e * x[i-dr] +
                   c * x[i-1]  +
                   b * x[i+1];

            // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
            aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

            // Norma de x[i]
            if(fabs(aux) > normaX)
                normaX = fabs(aux);

            // Norma da diferença (x[i] - x[i-1])
            if(fabs(aux - x[i]) > normaDif)
                normaDif = fabs(aux - x[i]);

            // Atualizando valor de x[i]
            x[i] = aux;
        }

        /*
         * Último Ponto: Cálculo de x[N-1]
         * Apenas existem os elementos de e, c e a
         */
        a = 1;
        c = e = 0;
        vetInd = 70;

        soma = e * x[i-dr] +
               c * x[i-1];

        // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
        aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

        // Norma de x[i]
        if(fabs(aux) > normaX)
            normaX = fabs(aux);

        // Norma da diferença (x[i] - x[i-1])
        if(fabs(aux - x[i]) > normaDif)
            normaDif = fabs(aux - x[i]);

        // Atualizando valor de x[i]
        x[i] = aux;

		/*
         * Cálculo do erro
         */
		erro = normaDif/normaX;
	}
    while(erro > toler && iter < iterMax);

	*numIter = iter;
    *error = erro;
    *norma = normaX;

	return x;
}

double *sorLivreA2(Dados* dados, double omega, double toler, size_t iterMax, size_t* numIter, double* error, double* norma)
{
	double *x; // Vetor solução
	double soma, normaX, normaDif, aux, erro;
    double e, c, a, b, d, vetInd, tamED;
    double hx, hy;
	size_t N, i, iter, dr;

    N = dados->qtdX*dados->qtdY;

    // Solução inicial nula
	x = calloc(N, sizeof(double));

	hx = (dados->fimX - dados->inicioX)/((double)dados->qtdX-1);
	hy = (dados->fimY - dados->inicioY)/((double)dados->qtdY-1);

    // Distância relativa de elementos até a primeira
    // ocorrência de um elemento "e". Em outras palavras,
    // o número n de partições +1 no eixo x
    dr = dados->qtdX;

    tamED = N - dados->qtdX;

    // Iterar até erro aceitável ou máximo de iterações atingido
	iter = 0;
	do {
        normaX = 0;
        normaDif = 0;
        i = 0;
		iter++;

        /*
         * Primeiro ponto: cálculo de x[0]
         * Apenas existem a, b e d
         */
        a = 1;
        b = d = 0;
        vetInd = T0;

        soma = b * x[1] +
               d * x[dr];

        // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
        aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

        // Norma de x[i]
        if(fabs(aux) > normaX)
            normaX = fabs(aux);

        // Norma da diferença (x[i] - x[i-1])
        if(fabs(aux - x[i]) > normaDif)
            normaDif = fabs(aux - x[i]);

        // Atualizando valor de x[i]
        x[i] = aux;

        i++;

        /*
         * Pontos na região inferior do domínio
         * Cálculo de x[1] até x[dr-1]
         * Linhas que possuem c, a, b e d até a
         * ocorrência do primeiro elemento de e:
         * de 1 até dr-1
         */
        a = 1;
        b = d = c = 0;
        vetInd = T0;

        for(i=1; i < dr; i++) {
            soma = c * x[i-1] +
                   b * x[i+1] +
                   d * x[i+dr];

            // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
            aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

            // Norma de x[i]
            if(fabs(aux) > normaX)
                normaX = fabs(aux);

            // Norma da diferença (x[i] - x[i-1])
            if(fabs(aux - x[i]) > normaDif)
                normaDif = fabs(aux - x[i]);

            // Atualizando valor de x[i]
            x[i] = aux;
        }

        /*
         * Pontos internos do domínio e pontos
         * que ocorrem nos lados do domínio:
         * Cálculo de x[dr] até x[tamED-1]
         * Linhas que possuem e, c, a, b e d até
         * a NÃO ocorrência de elementos de d:
         * de dr até tamED-1
         */
        for(i=dr; i < tamED; i++) {
            // Ponto à extrema esquerda
            if(i % dr == 0) {
                a = 1;
                b = d = c = e = 0;
                vetInd = T0;
            }
            // Ponto à extrema direita
            else if(i % dr == dr-1) {
                a = 1;
                b = d = c = e = 0;
                vetInd = T0;
            }
            // Ponto interior do domínio
            // (sem tratamento de contorno)
            else {
                e = (-1/(hy*hy));
                c = (-1/(hx*hx));
                a = 2 * ((1/(hx*hx)) + (1/(hy*hy)));
                b = (-1/(hx*hx));
                d = (-1/(hy*hy));
                vetInd = 0;
            }

            soma = e * x[i-dr] +
                   c * x[i-1]  +
                   b * x[i+1]  +
                   d * x[i+dr];

            // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
            aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

            // Norma de x[i]
            if(fabs(aux) > normaX)
                normaX = fabs(aux);

            // Norma da diferença (x[i] - x[i-1])
            if(fabs(aux - x[i]) > normaDif)
                normaDif = fabs(aux - x[i]);

            // Atualizando valor de x[i]
            x[i] = aux;
        }

        /*
         * Pontos na região superior do domínio
         * Cálculo de x[tamED] até x[N-2]
         * Linhas que possuem e, c, a e b até
         * a NÃO ocorrência de elementos de b:
         * de tamED até N-1
         */
        for(i=tamED; i < N-1; i++) {
            soma = e * x[i-dr] +
                   c * x[i-1]  +
                   b * x[i+1];

            // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
            aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

            // Norma de x[i]
            if(fabs(aux) > normaX)
                normaX = fabs(aux);

            // Norma da diferença (x[i] - x[i-1])
            if(fabs(aux - x[i]) > normaDif)
                normaDif = fabs(aux - x[i]);

            // Atualizando valor de x[i]
            x[i] = aux;
        }

        /*
         * Último Ponto: Cálculo de x[N-1]
         * Apenas existem os elementos de e, c e a
         */
        a = 1;
        c = e = 0;
        vetInd = T0;

        soma = e * x[i-dr] +
               c * x[i-1];

        // Novo valor de x[i] em auxiliar para calcular norma e avaliar erro
        aux = (1 - omega) * x[i] + (omega/a) * (vetInd - soma);

        // Norma de x[i]
        if(fabs(aux) > normaX)
            normaX = fabs(aux);

        // Norma da diferença (x[i] - x[i-1])
        if(fabs(aux - x[i]) > normaDif)
            normaDif = fabs(aux - x[i]);

        // Atualizando valor de x[i]
        x[i] = aux;

		/*
         * Cálculo do erro
         */
		erro = normaDif/normaX;
	}
    while(erro > toler && iter < iterMax);

	*numIter = iter;
    *error = erro;
    *norma = normaX;;

	return x;
}
