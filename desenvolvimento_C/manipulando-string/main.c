#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char nome1[100], nome2[100];
    /*
    printf("Digite seu nome: ");
    scanf("%s", &nome);

    setbuf(stdin, NULL);

    printf("Nome: %s\n\n", nome);
    */
    printf("Digite seu nome1: ");
    gets(nome1);
    setbuf(stdin, NULL);
    printf("Digite seu nome2: ");
    gets(nome2);

    //if(nome1 == nome2){
    //strcmp compara a posição na memoria para variaveis do tipo string..
    if(strcmp(nome1, nome2) == 0){
        printf("\nNomes iguais ...");
    }else{
        printf("\nNomes diferentes ...");
    }


    system("pause");
    return 0;
}
