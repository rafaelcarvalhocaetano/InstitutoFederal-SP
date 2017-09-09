/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 9 de Setembro de 2017, 09:49
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main() {
    
    float a, resp;
    
    printf("CONVERSAO DE FAHRENHEIT PARA CELSIUS\n\n");
    printf("INFORME A TEMPERATURA EM GRAUS FAHRENHEIT : \n");
    scanf("%a", &a);
    
    resp = (a - 32) / 1.8;
    
    printf("O VALOR DA CONVERSAO PARA CELSIUS EH : %.2f\n", resp);

    return 0;
}

