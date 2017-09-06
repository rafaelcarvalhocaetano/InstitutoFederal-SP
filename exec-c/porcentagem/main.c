/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 5 de Setembro de 2017, 20:51
 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/*
 * 
 */
int main() {
    
    float a, b, resp;
    
    printf("INFORME O VALOR DO PRODUTO PARA RECEBER O DESCONTO DE 9 PORCENTO\n");
    scanf("%f", &a);
    
    b = (a * 9) / 100;
    resp = a - b;

    printf("O VALOR DO PRODUTO COM DESCONTO FOI PARA : %.2f ", resp);
    return 0;
}

