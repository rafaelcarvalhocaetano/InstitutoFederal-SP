#include <stdio.h>
#include <stdlib.h>

int main()
{
   int valorInteiro;
   //4 bytes
   //1 byte == 8 bits
   //%d ou %i
   float valorReal1;
   //8 bytes
   //%f
   double valorReal2;
   //16 bytes
   //%lf
   char letra1;
   //1 byte
   //%c


   printf("Digite um número inteiro: \n");
   scanf("%d", &valorInteiro);
   printf("Digite um número real: \n");
   scanf("%f", &valorReal1);
   printf("Digite um número real: \n");
   scanf("%lf", &valorReal2);
   printf("Digite uma letra1: \n");
   scanf("%c", &letra1);


   printf("Os valores digitados são %d, %f, %lf, %c\n",valorInteiro, valorReal1, valorReal2, letra1);

    return 0;
}
