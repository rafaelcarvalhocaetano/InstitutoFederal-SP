/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 15 de Setembro de 2017, 10:21
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    int soma =0;
    int v[10];
    int i;
    
    for(i=0; i<10; i++){
        printf("Entre com o valor na posicao %i do vetor ", i + 1);
        scanf("%d", &v[i]);
        
    }
    for(i=0; i<10; i++){
        soma = soma + v[i];        
    }
    printf("O valor da soma eh %d ", soma);
    
    return (EXIT_SUCCESS);
}

