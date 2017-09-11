/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 11 de Setembro de 2017, 20:38
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {


    int a[5], b[5], c[5];
    int i;

    for (i = 0; i < 5; i++) {
        printf("Digite o valor do array [%d] ", i);
        scanf("%d", &a[i]);
    }
    for (i = 0; i < 5; i++) {
        printf("Digite o valor do array [%d] ", i);
        scanf("%d", &b[i]);
    }
    for (i = 0; i < 5; i++) {
        c[i] = a[i] + b[i];
        printf("\nO valor de c[%d] : %d ", i, c[i]);
    }








    return (EXIT_SUCCESS);
}

