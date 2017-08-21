#include <stdio.h>
#include <stdlib.h>

int main()
{
    int valor1, valor2, resultado;

    char op;

    printf("Digite o primeiro numero: \n");
    scanf("%d", &valor1);

    printf("Digite o segundo numero: \n");
    scanf("%d", &valor2);
    setbuf(stdin, NULL);
    //STDIN STANDARD INPUT --> ENTRADA PADRÃO - TECLADO
    //colocando no buffer do teclado null

    printf("Escolha a operação matematica a ser realizada (+ - / * %): ");
    scanf("%c", &op);
    setbuf(stdin, NULL);

    if(op == '+' ){
         resultado = valor1 + valor2;
         printf("O resultado a operacao de %d %c %d e: %d ", valor1, op, valor2, resultado);
    }else if(op == '-' ){
        resultado = valor1 - valor2;
        printf("O resultado a operacao de %d %c %d e: %d ", valor1, op, valor2, resultado);
    }else if(op == '*' ){
        resultado = valor1 * valor2;
        printf("O resultado a operacao de %d %c %d e: %d ", valor1, op, valor2, resultado);
    }else if(op == '/' ){
        resultado = valor1 / valor2;
        printf("O resultado a operacao de %d %c %d e: %d ", valor1, op, valor2, resultado);
    }else if(op == '%' ){
        resultado = valor1 % valor2;
        printf("O resultado a operacao de %d %c %d e: %d ", valor1, op, valor2, resultado);
    }





    return 0;
}
