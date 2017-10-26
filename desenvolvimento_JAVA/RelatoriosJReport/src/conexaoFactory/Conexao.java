/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaoFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Developer
 */
public class Conexao {
    
    
    private static final String USER = "root";
    private static final String PASS = "q1w2e3r4";
    private static final String URL = "jdbc:mysql://localhost:3306/pdf";
    
    
    
    public static Connection db () throws SQLException{
        
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());            
            Connection c = DriverManager.getConnection(URL, USER, PASS);
            
            return c;
    }
    
    
    
}
