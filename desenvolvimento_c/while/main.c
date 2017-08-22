#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a = 0;
    while(a != 1){
        printf("Digite um valor ou 1 para sair ");
        scanf("%d", &a);
    }
    system("pause");
    return 0;
}
