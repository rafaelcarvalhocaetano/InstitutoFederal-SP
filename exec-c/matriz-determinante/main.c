/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 11 de Setembro de 2017, 21:09
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    int a[2][2];
    
    int i, j;
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 2; j++) {
            printf("ARRAY - [%d][%d] : ", i, j);
            scanf("%d", &a[i][j]);
        }
    }
    int det = a[0][0] * a[1][1] - (a[1][0] * a[0][1]);
    printf("O determinante da MATRIZ EH : %d ", det);
    


    
    
    
    
    return (EXIT_SUCCESS);
}

