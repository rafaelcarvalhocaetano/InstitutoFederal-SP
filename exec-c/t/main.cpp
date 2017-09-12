#include <stdio.h>
#include <stdlib.h>


int main(int argc, char** argv) {
	
	int vetor[5];
	int soma, multiplicacao;
	int i;
	
	for(i=0; i<5; i++){
		printf("\nINFORME um Valor para a POSICAO [%d] do Vetor : ", i);
		scanf("%d", &vetor[i]);
	}

	for (i = 0; i < 5; i++) {
	 	 	
      soma += vetor[i];
      multiplicacao *= vetor[i];
             
    }
    printf("\nO VALOR DA MULTIPLICACAO EH : %d ", multiplicacao );
    printf("\nO VALOR DA SOMA EH : %d \n\n\n", soma);

    
	system("pause");
	return 0;
}
