
#include <stdio.h>
#include <stdlib.h>


int main(int argc, char** argv) {
    
    int ladoa, ladob, resposta;
    
    printf("CALCULANDO AREA E PERIMETRO DE UM QUADRADO\n");
    printf("INFORME A VALOR DO PRIMEIRO LADO DO QUADRADO\n");
    scanf("%d", &ladoa);
    printf("INFORME A VALOR DO PRIMEIRO LADO DO QUADRADO\n");
    scanf("%d", &ladob);
    
    
    resposta = (2 * ladoa) + (2 * ladob);
    printf("Valor do perimetro do quadrado de valor %d e %d informado : %d\n", ladoa, ladob, resposta);
    
    resposta = (ladoa * ladob);
    printf("O valor da area do quadrado de valor %d e %d informado e : %d", ladoa, ladob, resposta);
    
    
    return 0;
}

