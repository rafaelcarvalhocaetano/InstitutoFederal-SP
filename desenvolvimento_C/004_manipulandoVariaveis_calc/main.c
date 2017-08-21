#include <stdio.h>
#include <stdlib.h>

int main()
{
    int valor1, valor2, resultado;

    printf("Digite o primeiro numero: \n");
    scanf("%d", &valor1);
    printf("Digite o segundo numero: \n");
    scanf("%d", &valor2);

    resultado = valor1 + valor2;

    printf("O resultado a operacao de %d + %d e: %d ", valor1, valor2, resultado);
    return 0;
}
