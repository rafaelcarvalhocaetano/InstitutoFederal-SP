#include <stdio.h>
#include <stdlib.h>

int main(int argc, char argv)
{
    int x, y, z, soma;

    printf("Digite o valor de um dos algulos do triangulo: ");
    scanf("%d", &x);

    printf("Digite o valor do angulo 2 do triangulo: ");
    scanf("%d", &y);

    printf("Digite o valor do angulo 3 do triangulo: ");
    scanf("%d", &z);

    soma = x + y + z;

    if(soma!=180){
        printf("A soma dos Angulos deve ser 180");
    }else{
        if(x==90 || y==90 || z==90){
            printf("Triangulo reto");
        }else if(x>90 || y>90 || z>90){
            printf("Triangulo obtuso");
        }else{
            printf("Triangulo actangulo");
        }
    }
    system("pause");
    return 0;
}
