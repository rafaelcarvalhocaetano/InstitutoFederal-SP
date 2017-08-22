#include <stdio.h>
#include <stdlib.h>

int main()
{
   int vetor[6];
   int i = 0;




   for(i=0; i<6; i++){
    printf("Digite um valor: ");
    scanf("%d", &vetor[i]);
   }
   for(i=0; i<6; i++){
    printf("\nPosicao %d: %d",i, vetor[i]);
   }
    return 0;
}
