
package com.rb.dao;

import com.rb.conexao.ConexaoFactory;
import com.rb.domain.Chave;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Rafael Carvalho Caetano
 */
public class ChaveDAO {
    
    
    public void salvar(Chave c){
        
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO chave (nome, setor, data, saida, entrada, datadevolucao, vigilante) ");
        sql.append(" VALUES (?,?,?,?,?,?,?) ");
        
        try {
            Connection con = ConexaoFactory.db();
            PreparedStatement ps = con.prepareStatement(sql.toString());
            ps.setString(1, c.getNome());
            ps.setString(2, c.getSetor());
            ps.setString(3, c.getData());
            ps.setString(4, c.getSaida());
            ps.setString(5, c.getEntrada());
            ps.setString(6, c.getDatadevolucao());
            ps.setString(7, c.getVigilante());           
            
            ps.executeUpdate();
            
            System.out.println("SQL OK ... ");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void update(Chave c){
        
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE chave  SET nome=?, setor=?, data=?, saida=?, entrada=?, datadevolucao=?, vigilante=? ");
        sql.append("WHERE id = ?");
        
        try {
            Connection con = ConexaoFactory.db();
            PreparedStatement ps = con.prepareStatement(sql.toString());
            
            ps.setString(1, c.getNome());
            ps.setString(2, c.getSetor());
            ps.setString(3, c.getData());
            ps.setString(4, c.getSaida());
            ps.setString(5, c.getEntrada());
            ps.setString(6, c.getDatadevolucao());            
            ps.setString(7, c.getVigilante());
            ps.setInt(8, c.getId());
            
            ps.executeUpdate();
            
            System.out.println("SQL OK ... ");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void delete(Chave c){
        
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM chave WHERE id = ? ");
        
        try {
            Connection con = ConexaoFactory.db();
            PreparedStatement ps = con.prepareStatement(sql.toString());
            ps.setInt(1, c.getId());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public List<Chave> listar() throws SQLException{
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM chave ");
        
        Connection con = ConexaoFactory.db();
        PreparedStatement ps = con.prepareStatement(sql.toString());
        
        ArrayList<Chave> itens = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            
            Chave c = new Chave();
            
            c.setId(rs.getInt("id"));
            c.setNome(rs.getString("nome"));
            c.setSetor(rs.getString("setor"));
            c.setData(rs.getString("data"));
            c.setSaida(rs.getString("saida"));
            c.setEntrada(rs.getString("entrada"));
            c.setDatadevolucao(rs.getString("datadevolucao"));            
            c.setVigilante(rs.getString("vigilante"));
            
            itens.add(c);
        }
        return itens;
        
    }
    public List<Chave> listarUS(Chave c) throws SQLException{
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM chave WHERE data = ? ");
        
        Connection con = ConexaoFactory.db();
        PreparedStatement ps = con.prepareStatement(sql.toString());
        ps.setString(1, c.getData());
        
        ArrayList<Chave> itens = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            
            c.setId(rs.getInt("id"));
            c.setNome(rs.getString("nome"));
            c.setSetor(rs.getString("setor"));
            c.setData(rs.getString("data"));
            c.setSaida(rs.getString("saida"));
            c.setEntrada(rs.getString("entrada"));
            c.setDatadevolucao(rs.getString("datadevolucao"));            
            c.setVigilante(rs.getString("vigilante"));
            
            itens.add(c);
        }
        return itens;
        
    }
    
}
