/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabela.db.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class ConexaoFactory {
    
    
    private static final String URL = "jdbc:mysql://localhost:3306/tabelaifsp";
    private static final String PASS = "";
    private static final String USER = "root";
    
    
    public static Connection getConnection() throws SQLException{
        
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
          
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        
        return null;
   }
    public static void closeConnection(Connection c){
        if(c != null){
            try {
                c.close();
            } catch (SQLException e) {
                System.err.println("Erro no CLOSE CONNECTION ");
            }
        }
    }
    
}
