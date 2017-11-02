/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifsp.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Developer
 */
public class ConexaoFactory {
    
    private static final String USUARIO = "root";
    private static final String SENHA = "q1w2e3r4";
    private static final String URL = "jdbc:mysql://localhost:3306/cursos";
    
    
    public static Connection getDB(){
        
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con = DriverManager.getConnection(URL, URL, USUARIO);  
            return con;
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex);
            throw new RuntimeException("Erro na Conexao");
        }
    }
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
