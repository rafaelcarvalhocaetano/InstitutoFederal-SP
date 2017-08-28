#include <stdio.h>
#include <stdlib.h>

int main(int argc, char argv)
{
    int x;
    printf("Digite um numero: ");
    scanf("%d", &x);

    if(x > 0 && x<10){
        printf("Parte 1");
    }
    if(x<=0 && x>-10){
        printf("Parte 2");
    }
    if(x>=10){
        printf("Parte 3");
    }
    system("pause");
    return 0;
}
