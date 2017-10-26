package com.rb.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class ConexaoFactory {
    
    Connection con = null;
    
    public static Connection db() throws SQLException{
        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:C:\\dev\\ifsp\\desenvolvimento_JAVA\\SIS-RB\\src\\com\\rb\\sqlite\\chave.db";
            Connection con = DriverManager.getConnection(url);
            
            return con;
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro na conexao");
            ex.printStackTrace();
            return null;
        }
    }
    
    
    
            
            
    
}
