/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 9 de Setembro de 2017, 09:58
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    int a, b;
    
    printf("INFORME UM VALOR PARA VERIFICAR SE EH PAR OU IMPAR\n\n");
    scanf("%d", &a);
    
    b = a % 2;
    
    if(b == 0){
        printf("O VALOR %d EH PAR ", a);
    }else{
        printf("O VALOR %d EH IMPAR", a);
    }
    return 0;
}

