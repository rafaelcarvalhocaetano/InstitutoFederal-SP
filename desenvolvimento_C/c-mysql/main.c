#include  <stdio.h>
#include  <stdlib.h>
#include <mysql.h>

using namespace std;

int main(void)
{
 MYSQL DBCon; // Vairiavel de conexão
 MYSQL_RES *result; //variável que recebe o resultado
 MYSQL_ROW dados; //variável que recebe os dados

 int ID; // Converter para integer

 // Inicia a variável DBCon
 mysql_init(&DBCon);

 //Conecta com o banco de dados
 if ( mysql_real_connect(&DBCon, "127.0.0.1", "root", "q1w2e3r4", "conectandoc", 0, NULL, 0) )
 {
       printf("Conectado!\n\n");
  }
  else
  {
       //Escreve o erro que ocorreu
       printf("Erro n %d : %s\n", mysql_errno(&DBCon), mysql_error(&DBCon));
   cin.get();  //Espera o usuário pressionar uma tecla
   cin.get();
   return 1;
  }

// Executa a consulta
if(mysql_query(&DBCon,"select * from usuarios"))
{
printf("Erro n %d : %s\n",mysql_errno(&DBCon),mysql_error(&DBCon));
cin.get();
cin.get();
return 1;
}

// Recebe os dados da cunsulta
result = mysql_store_result(&DBCon);

// Se consultou (sem erros)
if (result)
{
// Enquanto receber dados vai escrevendo
while ((dados=mysql_fetch_row(result)) != NULL)
{
 // Escreve os dados formatados sende estes a ID e o NOME

 istringstream buffer(dados[0]); // Cria a variável que recebera a string a ser convertida para int
 buffer >> ID; // Convert a string para int
 printf("%02d     %s\n",ID,dados[1]); // Escreve formatado
}

// Limpa da memória
mysql_free_result(result);

}
else
{
printf("Erro n %d : %s\n", mysql_errno(&DBCon), mysql_error(&DBCon));
cin.get();
cin.get();
return 1;
}
printf("\n");
// Fecha a conexão ...
mysql_close(&DBCon);

return 0;
}
