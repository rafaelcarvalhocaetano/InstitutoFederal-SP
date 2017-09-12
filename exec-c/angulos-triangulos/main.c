/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 10 de Setembro de 2017, 20:15
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    int a, b, c;
    int angulo = 90;

    printf("INFORME OS 3 ANGULOS DO TRIANGULO\n");
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);
    
    if((a==angulo || b ==angulo || c==angulo)){
        printf("Triangulo retangulo");
    }else if( (a > angulo || b > angulo || c > angulo)){
         printf("Triangulo obtusangulo");
    }else if( (a<angulo || b<angulo || c<angulo)){
        printf("Triangulo acutângulo");
    }
    return (EXIT_SUCCESS);
}

