/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 11 de Setembro de 2017, 20:26
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    
    int num[8];
    int valor;
    int i;
    int ocorrencia = 0;
    
    
    printf("INFORME UM NUMERO INTEIRO : ");
    scanf("%d", &ocorrencia);
    
    for (i = 0; i <8; i++) {
        printf("INFORME UM NUMERO INTEIRO PARA A POSICAO [%d] : ", i);
        scanf("%d", &num[i]);

    }

    for (i = 0; i < 8; i++) {
        if(valor == num[i]){
            ocorrencia ++;
           
        }
    }
    printf("Existe %d ocorrencias de %d para o array ", ocorrencia, valor);


    
    
    
    
    
    
    
    
    
    return (EXIT_SUCCESS);
}

