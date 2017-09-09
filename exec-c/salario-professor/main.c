/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Rafael
 *
 * Created on 9 de Setembro de 2017, 09:05
 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/*
 * 
 */
int main() {

    float a, b, resp;
    
    printf("INFORME O VALOR DA HORA TRABALHADA : \n");
    scanf("%f", &a);
    
    printf("INFORME A QUANTIDADE DE DIAS TRABALHADO : \n");
    scanf("%f", &b);
      
    resp = (b * 8) * a;
    //printf("%.3f ",resp);
    
    if(resp <= 900 || resp >= 1600){
        printf("QUANTIDADE DE HORAS TRABALHADA : %.0f\n", (b * 8));
        
        float resposta;
        resposta = (resp * 9) / 100;
        
        printf("DESCONTO DO INSS : %.0f \n", resposta );
        printf("SALARIO BRUTO : %.0f\n", resp);
        
        float liquido;
        liquido = resp - resposta;
        
        printf("SALARIO LIQUIDO : %4.f\n", liquido );
        
    }else  if(resp <= 1600 || resp >= 2600){
        printf("QUANTIDADE DE HORAS TRABALHADA : %.0f\n", (b * 8));
        
        float resposta;
        resposta = (resp * 11) / 100;
        
        printf("DESCONTO DO INSS : %.0f \n", resposta );
        printf("SALARIO BRUTO : %.0f\n", resp);
        
        float liquido;
        liquido = resp - resposta;
        
        printf("SALARIO LIQUIDO : %4.f\n", liquido );
        
    }else  if(resp > 3.600){
        printf("QUANTIDADE DE HORAS TRABALHADA : %.0f\n", (b * 8));
        
        float resposta;
        resposta = (resp * 13) / 100;
        
        printf("DESCONTO DO INSS : %.0f \n", resposta );
        printf("SALARIO BRUTO : %.0f\n", resp);
        
        float liquido;
        liquido = resp - resposta;
        
        printf("SALARIO LIQUIDO : %4.f\n", liquido );
        
    }
    
    
    
    return 0;
}

