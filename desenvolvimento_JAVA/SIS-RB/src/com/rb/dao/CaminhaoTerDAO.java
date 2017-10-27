package com.rb.dao;

import com.rb.conexao.ConexaoFactory;
import com.rb.domain.CaminhaoT;
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
public class CaminhaoTerDAO {
    
    
    public void create(CaminhaoT c) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO ");
        sql.append("caminhaoTerceiro (cavalo, carreta, nome, data, entrada, comoentrou, saida, comosaida, empresa, rg) ");
        sql.append("VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
        
        try {
            
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            
            ps.setString(1, c.getCavalo());
            ps.setString(2, c.getCarreta());
            ps.setString(3, c.getNome());
            ps.setString(4, c.getData());
            ps.setString(7, c.getEntrada());
            ps.setString(8, c.getComoentrada());
            ps.setString(5, c.getSaida());
            ps.setString(6, c.getComosaida());
            ps.setString(9, c.getEmpresa());
            ps.setString(10, c.getRg());
            
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no SALVAR", "ERRO no BANCO DE DADOS", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
               

    }    
    public void delete(CaminhaoT c){
        
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM caminhaoTerceiro WHERE id = ? ");
        
        try {
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setInt(1, c.getId());
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
            
        
    }
    public void update(CaminhaoT c){
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE CaminhaoTerceiro SET ");
        sql.append("cavalo=?, carreta=?, nome=?, entrada=?, comoentrou=?, saida=?, comosaida=?,  empresa=?, rg=? ");
        sql.append("WHERE id = ? ");
        
        try {
            
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
           
            ps.setString(1, c.getCavalo());
            ps.setString(2, c.getCarreta());
            ps.setString(3, c.getNome());
            ps.setString(4, c.getEntrada());   
            ps.setString(5, c.getComoentrada());
            ps.setString(6, c.getSaida());
            ps.setString(7, c.getComosaida());
            ps.setString(8, c.getEmpresa());
            ps.setString(9, c.getRg());
            ps.setInt(10, c.getId());   
            
            ps.executeUpdate();
            System.out.println("UPDATE DAO OK");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no SALVAR", "ERRO no BANCO DE DADOS", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    public List<CaminhaoT> listar() throws SQLException{
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM CaminhaoTerceiro ");
      
        Connection conexao = ConexaoFactory.db();
        PreparedStatement ps = conexao.prepareStatement(sql.toString());
        ResultSet rs = ps.executeQuery();
        
        ArrayList<CaminhaoT> itens = new ArrayList<>();
        
        while(rs.next()){
            CaminhaoT r = new CaminhaoT();
            
            r.setId(rs.getInt("id"));
            r.setCavalo(rs.getString("cavalo"));
            r.setCarreta(rs.getString("carreta"));
            r.setNome(rs.getString("nome"));
            r.setData(rs.getString("data"));
            r.setEntrada(rs.getString("entrada"));
            r.setComoentrada(rs.getString("comoentrou"));
            r.setSaida(rs.getString("saida"));
            r.setComosaida(rs.getString("comosaida"));            
            r.setEmpresa(rs.getString("empresa"));
            r.setRg(rs.getString("rg"));
            
            itens.add(r);
        }
        return itens;
    }
    
}
