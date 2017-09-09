/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 9 de Setembro de 2017, 10:07
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    int a, b, c;
    
    printf("INFORME 3 VALORES PARA COLOCA-LO EM ORDEM CRESCENTE\n\n");
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);
    
    printf("ORDEM CRESCENTE\n");
    if(a < b && b < c){
        printf("%d %d %d", a, b, c);
    }else if(a < c && c < b){
         printf("%d %d %d", a, c, b);
    }else if(b < a && a < c){
        printf("%d %d %d", b, a, c);
    }else if(b < c && c < a ){
        printf("%d %d %d", b, c, a);
    }else if(c < a && a < b){
         printf("%d %d %d", c, a, b);
    }else if(c < b && b < a){
         printf("%d %d %d", c, b, a);
    }
    
    return (EXIT_SUCCESS);
}

