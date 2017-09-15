/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 15 de Setembro de 2017, 10:12
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    
    
    float valorQualquer;
    float v[10];
    int i;
    
    for(i=0; i<10; i++){
        printf("Entre com o valor %i do vetor ", i + 1);
        scanf("%f", &v[i]);
    }
    
    valorQualquer = v[0];
    for(i=0; i<10; i++){
        if(v[i] > valorQualquer){
            valorQualquer = v[i];
        }
    }
    printf("O valor encoontrado acima eh: %.1f ", valorQualquer);
    
    return 0;
}

