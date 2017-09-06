

#include <stdio.h>
#include <stdlib.h>


int main(int argc, char** argv) {

    int a, b, resp;
    
    printf("CALCULANDO O AREA DE UM TRIANGULO \n\n");
    
    printf("Informe a base do triangulo : \n");
    scanf("%d", &a);
    
    printf("Informe a altura do triangulo : \n");
    scanf("%d", &b);
    
    
    resp = (a * b) / 2;
    printf("O valor do area do triangulo de base %d e altura %d  =  %d", a, b, resp);
    

    return 0;
}

