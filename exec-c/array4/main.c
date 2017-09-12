/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 11 de Setembro de 2017, 20:45
 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/*
 * 
 */
int main(int argc, char** argv) {

    int a[5];
    int i;
    int x;
    
    for (i = 0; i < 5; i++) {
        printf("Digite o elemento do v[%d]: ", i );
        scanf("%d", &a[i]);
    }
    printf("Digite um valor X : ");
    scanf("%d", &x);
  
    for (i = 0; i < 5; i++) {
        if(x == a[i]){
            printf("Indice a : %d \n", i);
        }

    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    return (EXIT_SUCCESS);
}

