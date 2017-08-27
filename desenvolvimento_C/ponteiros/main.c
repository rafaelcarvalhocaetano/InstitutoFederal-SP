#include <stdio.h>
#include <stdlib.h>

int main()
{
    int valor;
    int *pontValor;

    valor = 1120;
    pontValor = &valor;

    printf("\nValor da Variavel Ponteiro = %d", *pontValor);

    //%x - decimal
    printf("\nPosição na memoria do Ponteiro = %x", pontValor);

    printf("\nValor = %d \n\n", valor);

    system("pause");
    return 0;
}
