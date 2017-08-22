#include <stdio.h>
#include <stdlib.h>

int main()
{
    int matriz[2][2];
    int i, j;
    for(i=0; i<2; i++){
        for(j = 0; j < 2; j++){

        printf("Digite um valor: ");
        scanf("%d", &matriz[i][j]);
        }
    }

    printf("\n");

    for(i=0; i<2;i++){
        for(j=0; j<2;j++){
            printf("%d", matriz[i][j]);
        }
        printf("\n");
    }
    system("pause");
    return 0;
}
