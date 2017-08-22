#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main()
{
    char car;
    printf("Digite um caracter: ");
    scanf("%c", &car);

    car = toupper(car);
    //chama a letra MAIUS ou MIN...
   // car = towlower(car);

    if(toupper(car)== 'B'){
        printf("Voce digitou B");
    }else{
        printf("Valor não é B ....");
    }
    return 0;
}
