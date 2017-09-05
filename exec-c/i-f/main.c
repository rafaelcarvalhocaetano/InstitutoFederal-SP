/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho 
 *
 * Created on 5 de Setembro de 2017, 20:45
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main() {
    
    int a, resp;
    
    printf("INFORME UM NUMERO PARA SER APRESENTADO O SEU SUCESSOR E ANTECESSOR\n\n");
    scanf("%d", &a);
    int b = (a - 1);
    int c = (a + 1);
    printf("ANTECESSOR %d ATUAL %d SUCESSOR %d ", b, a, c);
   

    return 0;
}

