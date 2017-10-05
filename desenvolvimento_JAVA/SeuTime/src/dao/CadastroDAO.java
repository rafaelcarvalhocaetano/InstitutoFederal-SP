
package dao;

import bean.Cadastro;
import factory.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class CadastroDAO {
    
    
    public void salvar(Cadastro c ){
        
        
        String sql = "INSERT INTO (nome, sobreNome, time, numeroCamisa, cpf, dataNascimento) VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            Connection con = ConexaoFactory.getConection();
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, c.getNome());
            ps.setString(2, c.getSobreNome());
            ps.setString(3, c.getTime());
            ps.setString(4, c.getNumeroCamisa());
            ps.setString(5, c.getCpf());
            ps.setString(6, c.getDataNascimento());
            
            ps.executeUpdate();
            System.out.println("SALVO COM SUCESSO ...");
            
        } catch (SQLException ex) {
            System.out.println("Erro NO salvar");
        }
        
    }
    
    
}
