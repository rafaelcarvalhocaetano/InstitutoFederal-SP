/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 9 de Setembro de 2017, 10:25
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    float a;
    
    printf("INFORME UM NUMERO REAL SE > 20 -divide- CASO CONTRARIO -triplica-\n");
    scanf("%f", &a);
    
    if(a >= 20){
        float b;
        b = a / 2;
        printf("O VALOR EH %.0f", b);
    }else {
        float triplo;
        triplo = a * 3;
        printf("O TRIPO DO VALOR EH %.0f", triplo);
    }
    
    return (EXIT_SUCCESS);
}

