
package Model;

import domain.Combo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class ComboDAO {
    
    
    
    public void salvar(Combo c ){
        
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO tabela (nome, idade) VALUES (?, ?) ");
        
        Connection con;
        try {
            con = ConexaoFactory.getCon();
            PreparedStatement ps = con.prepareStatement(sql.toString());
            
            Date hj = c.getData();
            
            ps.setString(1, c.getNome());
            ps.setDate(2, new java.sql.Date(hj.getTime()));
            
            ps.executeUpdate();
            System.out.println("SALVO COM SUCESSO");            
            
        } catch (SQLException ex) {
            System.out.println("ERRO NO SALVAR");
        }
    }
    
    public List<Combo> listar() throws SQLException{
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT nome, idade FROM tabela ");
        
        Connection con = ConexaoFactory.getCon();
        PreparedStatement ps = con.prepareStatement(sql.toString());
        
        ResultSet rs = ps.executeQuery();
        
        ArrayList<Combo> itens = new ArrayList<>();
        
        while(rs.next()){
            Combo c = new Combo();
            
            c.setNome(rs.getString("nome"));
            c.setData(rs.getDate("idade"));
            
            itens.add(c);
        }
            
        return itens;
    }
    
    public void excluir(Combo c ){
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM tabela WHERE idade = ? ");
        
        try {
            Connection con = ConexaoFactory.getCon();
            PreparedStatement ps = con.prepareStatement(sql.toString());
            
            ps.setDate(1, (java.sql.Date) c.getData());
            ps.executeUpdate();
            
            System.out.println("EXCLUIRDO NO DAO");
            
        } catch (SQLException e) {
            System.out.println("ERRO NO EXCLUIR DAO");
        }
    }
    
}
