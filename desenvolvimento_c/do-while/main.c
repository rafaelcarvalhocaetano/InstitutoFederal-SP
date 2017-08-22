#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a = 0;
    int soma = 0;

    do{
        printf("Digite um valor ou -1 para sair ");
        scanf("%d", &a);
        if(a != -1){
            soma += a;
        }
    }
    while(a != -1);

    printf("A soma entre os valores informados: %d ", soma);
    system("pause");
    return 0;
}
