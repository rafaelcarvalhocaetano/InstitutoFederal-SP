/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael Carvalho
 */
public class ConexaoFactory {
    
    
    private static final String URL = "jdbc:mysql://localhost:3306/data";
    private static final String PASS = "q1w2e3r4";
    private static final String USER = "root";
    
    
    public static Connection getConection() throws SQLException{
        
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        
        return con;
    }
    
    
}
