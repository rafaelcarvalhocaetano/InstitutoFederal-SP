
#include <stdio.h>
#include <stdlib.h>


int main() {
    
    int a, b, resp;
    
    printf("CALCULANDO O PERIMETRO E AREA DE UM RETANGULO \n\n\n");
    
    printf("Informe o lado A do retangulo : \n");
    scanf("%d", &a);
    
    printf("Informe o lado B do retangulo : \n");
    scanf("%d", &b);
    
    resp = (2 * a) + (2 * b);
    printf("O valor do perimetro do retangulo de valor %d e %d  =  %d\n", a, b, resp);
    
    resp = a + b;
    printf("O valor do area do retangulo de valor %d e %d  =  %d", a, b, resp);
    

    return 0;
}

