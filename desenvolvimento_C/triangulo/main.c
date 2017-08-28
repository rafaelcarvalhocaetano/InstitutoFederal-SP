#include <stdio.h>
#include <stdlib.h>

int main()
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
        printf("A soma dos Angulos deve ser 180\n");
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
