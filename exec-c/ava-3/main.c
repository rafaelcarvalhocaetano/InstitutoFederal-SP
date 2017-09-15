/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 15 de Setembro de 2017, 10:27
 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/*
 * 
 */
int main(int argc, char** argv) {
    
    int i, n;
    int v[5];
    
    printf("Informe o valor do vetor:\n");
    for(i=0; i<5; i++){
        scanf("%d", &v[i]);
    }
    
    printf("RESULTADO : \n");
    for(i=5-1; i>=0; i--){
        printf("%d", v[i]);
    }

    return (EXIT_SUCCESS);
}

