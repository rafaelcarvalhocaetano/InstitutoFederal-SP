/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 11 de Setembro de 2017, 21:01
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    int a[2][2], b[2][2], c[2][2];


    int i, j;
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 2; j++) {
            printf("INFORME matriz a-[%d][%d]", i, j);
            scanf("%d", &a[i][j]);            
        }
    }
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 2; j++) {
            printf("INFORME matriz b-[%d][%d]", i, j);
            scanf("%d", &b[i][j]);  
        
        }
    }
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 2; j++) {
            c[i][j] = a[i][j] + b[i][j];
            
            printf("O valor de [%d][%d] : %d\n", i, j, c[i][j]);
        
        }
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    return (EXIT_SUCCESS);
}

