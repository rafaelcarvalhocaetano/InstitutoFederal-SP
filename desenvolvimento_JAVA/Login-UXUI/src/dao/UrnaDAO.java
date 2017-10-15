package dao;

import conexao.ConexaoFactory;
import domain.Urna;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class UrnaDAO {
    
    
    
    public void salvar(Urna u){
        
        StringBuilder sql = new StringBuilder();
        sql.append(" EM BRANCO ");
        
        try {
            Connection con = ConexaoFactory.db();
            PreparedStatement ps = con.prepareStatement(sql.toString());
            /*
            ps.setString(1, x);
            ps.setString(2, x);
            ps.setString(3, x);
            ps.setString(4, x);
            ps.setString(5, x);
            */
            
            ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Erro");
        }
        
        
    }
    public void excluir(Urna u){
        StringBuilder sql = new StringBuilder();
        sql.append(" EM BRANCO ");
        
        try {
            Connection c = ConexaoFactory.db();
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro");
        }
    }
    public List<Urna> listar() throws SQLException{
        StringBuilder sql = new StringBuilder();
        sql.append(" EM BRANCO ");
        
        Connection c = ConexaoFactory.db();
        PreparedStatement ps = c.prepareStatement(sql.toString());
        ResultSet rs = ps.executeQuery();
        
        ArrayList<Urna> itens = new ArrayList<>();
        while (rs.next()) {
            Urna u = new Urna();
            
            /*
            u.setId(rs.getString("c");
            ...
            ...
            ...
            */
            itens.add(u);
            
        }
        return itens;
    }
    public void update(){
        
    }
    
    
    
    
}
