/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 10 de Setembro de 2017, 20:00
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    int a, b, c, resp;
    printf("TRIANGULO - LADO ESQUERDO : \n");
    scanf("%d", &a);
    
    printf("TRIANGULO - LADO DIREITO : \n");
    scanf("%d", &b);
    
    printf("TRIANGULO - BASE : \n");
    scanf("%d", &c);
    
    
    if( (a == b && b == c) || (b == a && a == c) || (c == a && a == b)){
        printf("TRINAGULO - EQUILATERO");
    }else if((a == b && b != c) || (b == a && a != c) || (c == a && a != b) ){
         printf("TRINAGULO - ISOSCELES");
    }else{
         printf("TRINAGULO - ESCALENO");
    }

    return (EXIT_SUCCESS);
}

