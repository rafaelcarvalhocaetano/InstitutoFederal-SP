/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 5 de Setembro de 2017, 20:23
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main() {

    int a, b, c, resp;
    
    printf("CALCULANDO DE UM LOSANGO \n\n");
    
    printf("Informe a diagonal maior do losango : \n");
    scanf("%d", &a);
    
    printf("Informe a diagonal menor do losango : \n");
    scanf("%d", &b);
       
    
    resp = (a * b) / 2;
    printf("A AREA DO TRAPEZIO : %d", resp);
    

    return 0;
}

