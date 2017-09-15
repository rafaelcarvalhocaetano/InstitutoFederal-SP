/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 15 de Setembro de 2017, 10:38
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    
    int a[5], i;
    
    a[0] = 2;
    a[1] = 6;
    a[2] = 7;
    a[3] = 9;
    a[4] = 11;
    
    for(i=0; i<5; i++){
        if(a[i] % 2 == 0){
            printf("%d\n", a[i]);
        }
    }
            

    return (EXIT_SUCCESS);
}

