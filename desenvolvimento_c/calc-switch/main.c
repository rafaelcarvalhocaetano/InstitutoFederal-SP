#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a, b;
    float c, d, res;
    char op;
    printf("Informe um valor: ");
    scanf("%d", &a);
    printf("Informe o segundo valor: ");
    scanf("%d", &b);

    setbuf(stdin, NULL);
    printf("Escolha o operador ( + - * / ) ");
    scanf("%c", &op);
    setbuf(stdin, NULL);

    switch(op){
    case '+':
        res = a + b;
        printf("O resultado de %d %c %d: %d", a, op, b, res);
        break;
    case'-':
        res = a - b;
        printf("O resultado de %d %c %d: %d", a, op, b, res);
        break;
    case'*':
        res = a * b;
        printf("O resultado de %d %c %d: %d", a, op, b, res);
        break;
    case'/':
        res = a / b;
        printf("O resultado de %d %c %d: %d", a, op, b, res);
        break;
    default:
        printf("Valor do operador invalido ...");

    }
    return 0;
}
