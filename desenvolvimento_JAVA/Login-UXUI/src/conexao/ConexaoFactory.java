package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class ConexaoFactory {
    
    private static final String URL = "jdbc:mysql://localhost:3306/urna";
    private static final String PASS = "q1w2e3r4";
    private static final String USER = "root";
    
    
    public static Connection db() throws SQLException{
        
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        
        return con;
    }
            
    
}
