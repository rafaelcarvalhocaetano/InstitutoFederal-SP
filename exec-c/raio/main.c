/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 5 de Setembro de 2017, 20:27
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main() {

    int a, b, c, resp;
    
    printf("CALCULANDO RAIO \n\n");
    
    printf("Informe o valor do raio do circulo : \n");
    scanf("%d", &a);
    
    resp = (a * a);
    printf("DIAMETRO DO CIRCULO : %d\n", resp);
    
    resp = (2 * 3.1415) * a;
    printf("COMPRIMENTO DO CIRCULO : %d\n", resp);
    
    resp = 3.1415 * (a * a);
    printf("A AREA DO CIRCULO : %d", resp);
    

    return 0;
}

