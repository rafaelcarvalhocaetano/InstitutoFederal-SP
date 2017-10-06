
package dao;

import domain.Data;
import factory.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Carvalho
 */
public class DataDAO {
    
    
    public void salvar(Data d){
        
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO timestamp (data) VALUES (?)");
        
        Connection con;
        try {
            con = ConexaoFactory.getConection();
            PreparedStatement ps = con.prepareStatement(sql.toString());
            
            Date hj = d.getData();
            ps.setDate(1, new java.sql.Date(hj.getTime()));
            
            ps.executeUpdate();
            //JOptionPane.showMessageDialog(null, "SALVAR no DAO");
        } catch (SQLException ex) {
            System.out.println("Erro no DAO");
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR");
            ex.printStackTrace();
            
        }
    }
    
    public List<Data> listar() throws SQLException{
        
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT data FROM timestamp");
       
        Connection con = ConexaoFactory.getConection();
        PreparedStatement ps = con.prepareStatement(sql.toString());
        
        ResultSet rs = ps.executeQuery();
        ArrayList<Data> lista = new ArrayList<>();
        
        while(rs.next()){
        
            Data d = new Data();
            d.setData(rs.getDate("data"));
            lista.add(d);
        }
        return lista;
    }
    
    public void excluir(Data d){
        
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM timestamp WHERE data = ? ");
        
        Connection con;
        try {
            con = ConexaoFactory.getConection();
            PreparedStatement ps = con.prepareStatement(sql.toString());
            ps.setDate(1, new java.sql.Date(d.getData().getTime()));
            ps.executeUpdate();
            
            //JOptionPane.showMessageDialog(null, "EXCLUIDO COM SUCESSO");
        } catch (SQLException ex) {
            System.out.println("erro no excluir");
        }
        
    }
}
