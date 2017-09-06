/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 5 de Setembro de 2017, 20:18
 */

#include <stdio.h>
#include <stdlib.h>


int main(int argc, char** argv) {

    int a, b, c, resp;
    
    printf("CALCULANDO DE UM TRAPEZIO \n\n");
    
    printf("Informe a base MAIOR : \n");
    scanf("%d", &a);
    
    printf("Informe a BASE MENOR : \n");
    scanf("%d", &b);
    
    printf("Informe a ALTURA : \n");
    scanf("%d", &c);
    
    
    resp = (c * (a + b)) / 2;
    printf("A AREA DO TRAPEZIO : %d", resp);
    

    return 0;
}

