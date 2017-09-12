//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M2LPBA
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Rafael Carvalho Caetano
//******************************************************

/* 
 * File:   main.c
 * Author: Rafael Carvalho Caetano
 *
 * Created on 11 de Setembro de 2017, 19:57
 */

#include <stdio.h>
#include <stdlib.h>

void multiplicar(int c){
    //Apresenta o valor da soma do vetor
    printf("\nO VALOR DA MULTIPLICACAO EH : %d\n", c);
    //condição que verificará se o valor da multiplicação é positivo ou negativo
    if(c > 0){
        printf("O VALOR DA MULTIPLICACAO EH POSITIVO\n");
    }else{
        printf("O VALOR DA MULTIPLICACAO EH NEGATIVO\n"); 
    }
}
void somar(int c){
    //Apresenta o valor da soma do vetor
    printf("\nO VALOR DA SOMA EH : %d\n", c);
    //condição que verificará se o valor da soma é positivo ou negativo
    if(c > 0){
        printf("O VALOR DA SOMA EH POSITIVO\n");
    }else{
        printf("O VALOR DA SOMA EH NEGATIVO\n");
    }
}
int main() {

    int vetor[5];  //vetor com 5 posições
    int soma = 0;  //variável de nome soma, que somará os valores do vetor, inicializand com 0
    int mult = 1;  //variável de nome mult, que multiplicará os valores do vetor, inicializa com 1, pois com zero, o resultado sempre permanecerá 0
    int i;         //variável que será usada para o loop for
    
    //Este loop for, solicita e armazena dentro do vetor os número inteiros fornecidos pelo usuário
    for(i=0; i<5; i++){
        printf("\nINFORME UM VALOR INTEIRO PARA A POSICAO [%d] : ", i);
        scanf("%d", &vetor[i]);
    }
    //Este loop for, realiza a multiplicação dos valores do vetor e também a soma
    for (i = 0; i < 5; i++) {
        mult *= vetor[i];
        soma += vetor[i];
       
    }
    //Chamando a função que somará os valores do vetor, que está fora do método principal
    somar(soma);
    //Chamando a função que multiplicará os valores do vetor, que está fora do método principal
    multiplicar(mult);
   
    return 0;
}

