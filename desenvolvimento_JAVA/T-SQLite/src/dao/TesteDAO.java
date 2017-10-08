
package dao;

import conexao.ConexaoFactory;
import domain.Teste;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class TesteDAO {
    
    
    public void salvar(Teste t ){
       
        String sql = "INSERT INTO pessoa (nome, idade) VALUES (?, ?)";

        try {
            Connection c = ConexaoFactory.db();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, t.getNome());
            ps.setInt(2, t.getIdade());
            
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO", "OK", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO NO SALVAR", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public List<Teste> listar() throws SQLException{
        
        String sql = "SELECT * FROM pessoa";

        Connection c = ConexaoFactory.db();
        PreparedStatement ps = c.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        ArrayList<Teste> itens = new ArrayList<>();
        while (rs.next()) {
            Teste t = new Teste();

            t.setId(rs.getInt("id"));
            t.setNome(rs.getString("nome"));
            t.setIdade(rs.getInt("idade"));
            itens.add(t);
        }
        return itens;
    }
    
}
