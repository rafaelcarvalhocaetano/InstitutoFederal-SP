package com.rb.dao;

import com.rb.conexao.ConexaoFactory;
import com.rb.domain.Visitante;
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
public class VisitanteDAO {
    
    
    
    public void create(Visitante v) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO ");
        sql.append("visitantes (placa, modelo, nome, rg, empresa, data, entrada, saida) ");
        sql.append("VALUES (?,?,?,?,?,?,?,?) ");
        
        try {
            
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            
            ps.setString(1, v.getPlaca());
            ps.setString(2, v.getModelo());
            ps.setString(3, v.getNome());
            ps.setString(4, v.getRg());
            ps.setString(5, v.getEmpresa());
            ps.setString(6, v.getData());
            ps.setString(7, v.getEntrada());
            ps.setString(8, v.getSaida());
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no SALVAR", "ERRO no BANCO DE DADOS", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
               

    }    
    public void delete(Visitante v){
        
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM visitantes WHERE id = ? ");
        
        try {
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setInt(1, v.getId());
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
            
        
    }
    public void update(Visitante v){
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE visitantes SET ");
        sql.append("placa=?, modelo=?, nome=?, rg=?, empresa=?, entrada=?, saida=? ");
        sql.append("WHERE id = ? ");
        
        try {
            
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
           
            ps.setString(1, v.getPlaca());
            ps.setString(2, v.getModelo());
            ps.setString(3, v.getNome());
            ps.setString(4, v.getRg());
            ps.setString(5, v.getEmpresa());
            ps.setString(6, v.getEntrada());
            ps.setString(7, v.getSaida());
            ps.setInt(8, v.getId());   
            
            ps.executeUpdate();
            System.out.println("UPDATE DAO OK");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no SALVAR", "ERRO no BANCO DE DADOS", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    public List<Visitante> listar() throws SQLException{
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM visitantes ");
      
        Connection conexao = ConexaoFactory.db();
        PreparedStatement ps = conexao.prepareStatement(sql.toString());
        ResultSet rs = ps.executeQuery();
        
        ArrayList<Visitante> itens = new ArrayList<>();
        
        while(rs.next()){
            Visitante v = new Visitante();
            
            v.setId(rs.getInt("id"));
            v.setPlaca(rs.getString("placa"));
            v.setModelo(rs.getString("modelo"));
            v.setNome(rs.getString("nome"));
            v.setRg(rs.getString("rg"));
            v.setEmpresa(rs.getString("empresa"));
            v.setData(rs.getString("data"));
            v.setEntrada(rs.getString("entrada"));
            v.setSaida(rs.getString("saida"));
            
            itens.add(v);
        }
        return itens;
    }
    public List<Visitante> listarData(Visitante v) throws SQLException{
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM visitantes  WHERE data = ? ");
      
        Connection conexao = ConexaoFactory.db();
        PreparedStatement ps = conexao.prepareStatement(sql.toString());
        ps.setString(1, v.getData());
        ResultSet rs = ps.executeQuery();
        
        ArrayList<Visitante> itens = new ArrayList<>();
        
        while(rs.next()){
           
            v.setId(rs.getInt("id"));
            v.setPlaca(rs.getString("placa"));
            v.setModelo(rs.getString("modelo"));
            v.setNome(rs.getString("nome"));
            v.setRg(rs.getString("rg"));
            v.setEmpresa(rs.getString("empresa"));
            v.setData(rs.getString("data"));
            v.setEntrada(rs.getString("entrada"));
            v.setSaida(rs.getString("saida"));
            
            itens.add(v);
        }
        return itens;
    }
    
    
}
