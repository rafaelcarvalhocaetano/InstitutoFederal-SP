#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x;
    printf("Digite um numero: ");
    scanf("%d", &x);

    if(x>0){
       printf("O valor e maior que zero");
    }else{
        printf("O valor e igual ou menor que zero");
    }
    return 0;


}
