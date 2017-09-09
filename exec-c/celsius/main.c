/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 9 de Setembro de 2017, 09:54
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    
    float a, resp;
    
    printf("CONVERSAO DE CELSIUS PARA FAHRENHEIT\n\n");
    
    printf("INFORME O VALOR DA TEMPERATURA EM CELSIUS\n");
    scanf("%d", &a);
    
    resp = (a / 1.8) + 32;
    
    printf("O VALOR DA CONVERSAO EH : %.2f", resp);

    return 0;
}

