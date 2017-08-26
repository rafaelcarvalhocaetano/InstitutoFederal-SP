#include <stdio.h>
#include <stdlib.h>

int quadrado(int valor){

    valor *= valor;
    return valor;
}
void quadradoImprime(int valor){
    valor *= valor;
    printf("\n\nQuadrado Sem retorno: -> %d\n\n", valor);
}

int main()
{
    int v1, resultado;
    printf("\nDigite um valor: ");
    scanf("%d", &v1);

    resultado = quadrado(v1);
    printf("\n\nQuadrado -> %d\n\n", resultado);

    printf("--------------------------------------");
    quadradoImprime(v1);

    system("pause");

    return 0;
}
