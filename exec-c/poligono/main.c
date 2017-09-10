/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 10 de Setembro de 2017, 19:40
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    int a, b, c, d, e, f;

    printf("INFORME A QUANTIDADE DE VALORES : \n");
    scanf("%d", &f);


    if (f == 3) {
        printf("VOCE ESCOLHEU UM TRIANGULO - INFORME OS VALORES\n");
        scanf("%d", &a);
        scanf("%d", &b);
        scanf("%d", &c);

        int area = (a * b) / 2;
        printf("AREA DO TRIANGULO EH : %d ", area);
    } else if (f == 4) {
        printf("VOCE ESCOLHEU UM QUADRADO - INFORME OS VALORES\n");
        scanf("%d", &a);
        scanf("%d", &b);
        scanf("%d", &c);
        scanf("%d", &d);

        int area = (a * a);
        printf("AREA DO QUADRADO EH : %d ", area);

    } else if (f == 5) {
        printf("VOCE ESCOLHEU UM PENTAGONO - INFORME OS VALORES\n");
        scanf("%d", &a);
        scanf("%d", &b);
        scanf("%d", &c);
        scanf("%d", &d);
        scanf("%d", &e);

        int area = (a * b) / 2;
        printf("AREA DO PENTAGONO EH : %d ", area);

    } else {
        printf("POLIGONO NAO IDENTIFICADO \n");
    }


    return 0;
}

