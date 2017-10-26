package com.rb.conexaodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class ConexaoFactory {
    
    public Connection db() throws SQLException{
        try {
            Class.forName("org.sqlite.JDBC");
            String url = "  C:\\dev\\ifsp\\desenvolvimento_JAVA\\Controle de Acesso RB\\src\\com\\rb\\sqlite\\chave.db";
            Connection con = DriverManager.getConnection(url);
            
            return con;
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro na conexao");
            return null;
        }
    }
    
    
    
            
            
    
}
