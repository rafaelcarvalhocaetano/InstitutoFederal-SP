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
    //strcasecmp = verifica letras maiusculas e minusculas ...
    if(strcasecmp(nome1, nome2) == 0){
        printf("\nNomes iguais ...\n");
    }else{
        printf("\nNomes diferentes ...\n");
    }

    //onde será copiado e para onde será armazando ..
    strcpy(nome2, nome1);
    printf("Vetor 2: %s \n\n", nome2);

    //STRLEN = é igual a lenght do java que conta a quantidade de letras ...
    printf("Nome tem %d de letras \n\n", strlen(nome1));
    strcat(nome1, nome2);
    printf("\n\nNome: %s\n", nome1);

    system("pause");
    return 0;
}
