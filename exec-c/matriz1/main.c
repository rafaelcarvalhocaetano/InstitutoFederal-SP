/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 11 de Setembro de 2017, 20:53
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    
    int m[3][2];
       
    int i, j;
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 2; j++) {
            printf("m[%d] : [%d]\n", i, j);
            scanf("%d", &m[i][j]);
        }
    }
    
    //imprime
     for (i = 0; i < 3; i++) {
        for (j = 0; j < 2; j++) {
            printf("m[%d] [%d] : %d \n", i, j, m[i][j]);
        }
    }
    

    
    
    
    
    
    
    
    
    

    return (EXIT_SUCCESS);
}

