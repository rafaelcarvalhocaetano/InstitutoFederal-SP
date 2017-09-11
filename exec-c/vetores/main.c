/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 11 de Setembro de 2017, 20:04
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    
    int numero[8];
    int i;
    int ocorrencia = 0;
    int valor;
    
    
    printf("Digite um numero : \n");
    scanf("%d", &valor);
    
    //recebe
    for(i=0; i<8; i++){
        printf("Digite o valor do ARRAY [%d]: ", i);
        scanf("%d", &numero[i]);
    }
    
    //imprime e soma mais um na ocorrencia
    for(i=0; i<8; i++){
        if(numero[i] == valor){
            ocorrencia ++;
        }
    }
    
    printf("Exite(m) %d ocorrencias \n", ocorrencia);
    
    
    
    /*
     
    // recebe os números
    for(cont=0; cont<8; cont++){
        printf("Digite o valor [%d] : \n", cont);
        scanf("%d", &numero[cont]);
    }
    
    //imprime os números
    for(cont=0; cont<8; cont++){
        printf("numeros [%d] : %d \n",cont, numero[cont] );
    }
     
    */
    /*
    
    numero[0] = 1;
    numero[1] = 2;
    numero[2] = 3;
    
    printf("OS VALORES SAO %d %d %d", numero[0], numero[1], numero[2]);
     
     */
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    return (EXIT_SUCCESS);
}

