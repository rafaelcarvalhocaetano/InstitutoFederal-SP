/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 9 de Setembro de 2017, 10:03
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    int a, b, c;
    
    printf("INFORME O PRIMEIRO VALOR : ");
    scanf("%d", &a);
    printf("INFORME O SEGUNDO VALOR : ");
    scanf("%d", &b);
    
    if(a < b){
        printf("VALOR1 -> %d E VALOR2 -> %d", a,b);
    }else if(b < a){
        printf("VALOR2 -> %d E VALOR1 -> %d", b, a);
    }
    
    return (EXIT_SUCCESS);
}

