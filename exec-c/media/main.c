/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 5 de Setembro de 2017, 20:40
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main() {
    
    int a, b, resp;
    printf("MEDIA ARITMETICA DE DOIS NUMEROS\n\n");
    printf("INFORME O PRIMEIRO NUMERO : \n");
    scanf("%d", &a);
    printf("INFORME O SEGUNDO NUMERO : \n");
    scanf("%d", &b);
    
    resp = (a + b) / 2;
    printf("A MEDIA ARITMETICA DE %d e %d : %d",a,b, resp);

    return 0;
}

