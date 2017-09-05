/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael Carvalho
 *
 * Created on 4 de Setembro de 2017, 21:10
 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/*
 * 
 */
int main(int argc, char** argv) {
    
    
    
    char op;
    int n1, n2, resInt;
    float f1, f2, respFloat;
    
    printf("ESCOLHA UMA OPERACAO MATEMATICA ....(- | + | * | / )");
    scanf("%c", &op);
    
    if(op == '-'){
        printf("Informe o primeiro numero : ");
        scanf("%d", &n1);
        printf("Informe o segundo numero : ");
        scanf("%d", &n2);
        resInt = n1 - n2;
        printf("O resultado de %d %c %d = %d", n1, op, n2, resInt);
    }else if(op == '+'){
        printf("Informe o primeiro numero : ");
        scanf("%d", &n1);
        printf("Informe o segundo numero : ");
        scanf("%d", &n2);
        resInt = n1 + n2;
        printf("O resultado de %d %c %d = %d", n1, op, n2, resInt);
    }else if(op == '*'){
        printf("Informe o primeiro numero : ");
        scanf("%f", &f1);
        printf("Informe o segundo numero : ");
        scanf("%f", &f2);
        respFloat = f1 * f2;
        printf("O resultado de %f %c %f = %f", f1, op, f2, respFloat);
    }else if(op == '/'){
        printf("Informe o primeiro numero : ");
        scanf("%f", &f1);
        printf("Informe o segundo numero : ");
        scanf("%f", &f2);
        respFloat = f1 / f2;
        printf("O resultado de %f %c %f = %f", f1, op, f2, respFloat);
    }
    
    
    

    return 0;
}

