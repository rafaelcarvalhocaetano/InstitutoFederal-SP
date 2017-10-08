
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Rafael Carvalho Caetano
 */
public class ConexaoFactory {
    
    
    private static Connection con = null;
    
    public static Connection db() throws SQLException{
        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:C:\\dev\\ifsp\\desenvolvimento_JAVA\\T-SQLite\\src\\sql\\sqlitejava.db";
            //String url = "jdbc:sqlite:sqlitejava.sqlite";
            
            Connection cc = DriverManager.getConnection(url);
            System.out.println("CONECTADO");
            return cc;
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro conexao");
          return null;
        }
    }
}
