/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 7 de Setembro de 2017, 21:00
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    int a, b, resp;
      
    printf("Calculando sua idade \n Informe sua data de nescimento : ");
    scanf("%d", &a);
    printf("Informe a data atual : ");
    scanf("%d", &b);
    resp = b - a;
    printf("Sua idade é %d anos\n", resp);
    
    return 0;         
    
}

