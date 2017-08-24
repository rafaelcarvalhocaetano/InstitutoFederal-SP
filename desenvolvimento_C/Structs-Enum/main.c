#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    //lista de ordem crescente
    enum semana{
        domingo,
        segunda,
        terca,
        quarta,
        quinta,
        sexta,
        sabado
    };

    int diasemana = segunda; //segunda
    if(diasemana == domingo || diasemana == sabado){
        printf("Dia de Folga ..");
    }else{
    printf("Dia de trabalho");
    }

    struct TipoAluno{
        int Notas;
        char Nomes[30];
    };

    struct TipoAluno Alunos[25];

    Alunos[0].Notas = 10;
    strcpy(Alunos[0].Nomes, "Rafael");

    Alunos[1].Notas = 1;
    strcpy(Alunos[1].Nomes, "Rose");

    int i = 0;
    for(i=0; i<5; i++){
        printf("Aluno: %s  - Notas: %d \n\n", Alunos[i].Nomes, Alunos[i].Notas);
    }


    system("pause");
    return 0;
}
