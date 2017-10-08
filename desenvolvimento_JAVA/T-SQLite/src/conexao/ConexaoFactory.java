
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Rafael Carvalho Caetano
 */
public class ConexaoFactory {
    
    
    public static Connection getCon(){
        try {
            DriverManager.registerDriver(new org.sqlite.JDBC());
            Connection con = DriverManager.getConnection("jdbc:sqlite:teste.sqlite");
            JOptionPane.showMessageDialog(null, "CONECTADO ... ");
            return con;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO NA CONEXAO", "ERRO",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
}
