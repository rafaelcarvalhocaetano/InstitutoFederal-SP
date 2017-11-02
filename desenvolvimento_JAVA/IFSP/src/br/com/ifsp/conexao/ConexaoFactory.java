//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Rafael Carvalho Caetano
//******************************************************
package br.com.ifsp.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class ConexaoFactory {
    
    //variavél responsável por conter o usuário do mysql
    private static final String USER = "root";
    
    //variavél responsável por conter a senha do mysql
    private static final String PASS = "q1w2e3r4";
    
    //variavél responsável por conter o endereço do banco de dados mysql
    private static final String URL = "jdbc:mysql://localhost:3306/cursos";
    
    //Responsável por abrir uma conexão com banco mysql
    public static Connection getDB(){
        
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            return con;
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex);
            throw new RuntimeException("Erro na Conexao");
        }
    }
    //Responsável por fechar a conexão com banco mysql
   public static void fechaConexao(Connection c){
       if(c != null){
           try {
               c.close();
           } catch (SQLException e) {
               JOptionPane.showConfirmDialog(null, e);
               throw new RuntimeException("Erro na Conexao");
           }
       }
   }
    
}
