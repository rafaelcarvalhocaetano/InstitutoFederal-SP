
package com.tabela.db.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class ConexaoFactory {
    
    
     private static final String PASS = "q1w2e3r4";
    private static final String USER = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/tabelaifsp";
    
    
    public static Connection getConnection() throws SQLException{
        
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
          
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        
        return con;
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
