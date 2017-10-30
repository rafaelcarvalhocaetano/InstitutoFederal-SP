package com.rb.dao;

import com.rb.conexao.ConexaoFactory;
import com.rb.domain.VeiculosLeveRB;
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
public class VeiculoLeveDAO {
    
    
    public void create(VeiculosLeveRB c) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO ");
        sql.append("veiculoLeve (nome, destino, data, saida, kmsaida, entrada, kmentrada, aut, obs) ");
        sql.append("VALUES (?,?,?,?,?,?,?,?,?) ");
        
        try {
            
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            
            ps.setString(1, c.getNome());
            ps.setString(2, c.getDestino());
            ps.setString(3, c.getData());
            ps.setString(4, c.getSaida());
            ps.setString(5, c.getKmsaida());
            ps.setString(6, c.getEntrada());
            ps.setString(7, c.getKmentrada());
            ps.setString(8, c.getAut());
            ps.setString(9, c.getObs());
            
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no SALVAR", "ERRO no BANCO DE DADOS", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
               

    }    
    public void delete(VeiculosLeveRB c){
        
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM veiculoLeve WHERE id = ? ");
        
        try {
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setInt(1, c.getId());
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
            
        
    }
    public void update(VeiculosLeveRB c){
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE veiculoLeve SET ");
        sql.append("nome=?, destino=?, saida=?, kmsaida=?, entrada=?, kmentrada=?, aut=?, obs=? ");
        sql.append("WHERE id = ? ");
        
        try {
            
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            
            ps.setString(1, c.getNome());
            ps.setString(2, c.getDestino());
            ps.setString(3, c.getSaida());
            ps.setString(4, c.getKmsaida());
            ps.setString(5, c.getEntrada());
            ps.setString(6, c.getKmentrada()); 
            ps.setString(7, c.getAut());
            ps.setString(8, c.getObs());
            ps.setInt(9, c.getId());   
            
            ps.executeUpdate();
            System.out.println("UPDATE DAO OK");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no SALVAR", "ERRO no BANCO DE DADOS", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    public List<VeiculosLeveRB> listar() throws SQLException{
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM veiculoLeve ");
      
        Connection conexao = ConexaoFactory.db();
        PreparedStatement ps = conexao.prepareStatement(sql.toString());
        ResultSet rs = ps.executeQuery();
        
        ArrayList<VeiculosLeveRB> itens = new ArrayList<>();
        
        while(rs.next()){
            VeiculosLeveRB r = new VeiculosLeveRB();
            
            r.setId(rs.getInt("id"));
            r.setNome(rs.getString("nome"));
            r.setDestino(rs.getString("destino"));
            r.setData(rs.getString("data"));
            r.setSaida(rs.getString("saida"));
            r.setKmsaida(rs.getString("kmsaida"));
            r.setEntrada(rs.getString("entrada"));
            r.setKmentrada(rs.getString("kmentrada"));
            r.setAut(rs.getString("aut"));
            r.setObs(rs.getString("obs"));
            
            itens.add(r);
        }
        return itens;
    }
    public List<VeiculosLeveRB> listarData(VeiculosLeveRB r) throws SQLException{
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM veiculoLeve WHERE data = ? ");
      
        Connection conexao = ConexaoFactory.db();
        PreparedStatement ps = conexao.prepareStatement(sql.toString());
        ps.setString(1, r.getData());
        ResultSet rs = ps.executeQuery();
        
        ArrayList<VeiculosLeveRB> itens = new ArrayList<>();
        
        while(rs.next()){
            
            r.setId(rs.getInt("id"));
            r.setNome(rs.getString("nome"));
            r.setDestino(rs.getString("destino"));
            r.setData(rs.getString("data"));
            r.setSaida(rs.getString("saida"));
            r.setKmsaida(rs.getString("kmsaida"));
            r.setEntrada(rs.getString("entrada"));
            r.setKmentrada(rs.getString("kmentrada"));
            r.setAut(rs.getString("aut"));
            r.setObs(rs.getString("obs"));
            
            itens.add(r);
        }
        return itens;
    }
    
}
