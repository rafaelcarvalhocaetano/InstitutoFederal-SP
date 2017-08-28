#include <stdio.h>
#include <stdlib.h>
//Nome que se dá para o tipo de variavél
typedef int tipoValor;

//constantes
const float PI = 3.14;
//define não ocupa estaço em memoria
#define PII 3.14
void imprimeMenu(int &opcao){
    printf("\n\t\tMENU");
    printf("\n\t1 - OPCAO");
    printf("\n\t2 - OPCAO");
    printf("\n\t3 - OPCAO");
    printf("\n\t4 - SAIR");
    printf("\nDigite a opcao desejada:\n");
    scanf("%d", &opcao);

}
void controlaMenu(int opcao){
    switch(){
    case 1:
        break;
    case 2:
        break;
    case 3:
        break;
    case 4:
        break;
    default:
        printf("Opção invalida ... ");
    }

}
int main()
{
    int opcao;

    imprimeMenu(opcao);
    controlaMenu(opcao);

    tipoValor valor = 10.5;

    printf("------ typedef -------");
    printf("%d ", valor);

    printf("------ constantes -------");
    printf("%f", PI);

    printf("------ define -------");
    printf("%f ", PII);

    float v1;
    int v2;

    v1 = 5.98;
    v2 = (int)v1; //typecast
    if(v2 !=  v1){
        printf("\n\nTem parte decimal\n\n");
    }else{
        printf("\n\nValor Inteiro...");
    }

    system("pause");
    return 0;
}
