/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 5 de Setembro de 2017, 20:33
 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/*
 * 
 */
int main() {
    
    float a;
    printf("INFORME UM NUMERO REAL\n");
    scanf("%f", &a);
    
    printf("NUMERO REAL SEM FORMATACAO : %f\n", a);
    printf("NUMERO REAL COM DUAS CASAS DECIMAIS : %.2f\n", a);
    printf("NUMERO REAL COM 3 CASAS DECIMAIS : %.3f\n", a);
   

    return 0;
}

