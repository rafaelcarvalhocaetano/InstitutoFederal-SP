/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 8 de Setembro de 2017, 11:47
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    
    int n = 0;
    int somatorio=0;
    while (n>=0){
    printf ("Digite um numero: ");
    scanf ("%d", &n);

    if (n>=0)
      somatorio = somatorio + n;

  }
    printf ("O somatorio eh: %d", somatorio);

    return 0;
}

