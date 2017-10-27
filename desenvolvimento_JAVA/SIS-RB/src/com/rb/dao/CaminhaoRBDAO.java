package com.rb.dao;

import com.rb.conexao.ConexaoFactory;
import com.rb.domain.CaminhaoRB;
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
public class CaminhaoRBDAO {
    
    
    public void create(CaminhaoRB c) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO ");
        sql.append("caminhaoRB (cavalo, carreta, nome, data, saida, comosaida, entrada, comoentrada, destino, lacre) ");
        sql.append("VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
        
        try {
            
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            
            ps.setString(1, c.getCavalo());
            ps.setString(2, c.getCarreta());
            ps.setString(3, c.getNome());
            ps.setString(4, c.getData());
            ps.setString(5, c.getSaida());
            ps.setString(6, c.getComosaida());
            ps.setString(7, c.getEntrada());
            ps.setString(8, c.getComoentrada());
            ps.setString(9, c.getDestino());
            ps.setString(10, c.getLacre());
            
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no SALVAR", "ERRO no BANCO DE DADOS", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
               

    }    
    public void delete(CaminhaoRB c){
        
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM caminhaoRB WHERE id = ? ");
        
        try {
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setInt(1, c.getId());
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
            
        
    }
    public void update(CaminhaoRB c){
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE caminhaoRB SET ");
        sql.append("cavalo=?, carreta=?, nome=?, data=?, saida=?, comosaida=?, entrada=?, comoentrada=?, destino=?, lacre=? ");
        sql.append("WHERE id = ? ");
        
        try {
            
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setInt(1, c.getId());            
            
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no SALVAR", "ERRO no BANCO DE DADOS", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    public List<CaminhaoRB> listar() throws SQLException{
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM caminhaoRB ");
      
        Connection conexao = ConexaoFactory.db();
        PreparedStatement ps = conexao.prepareStatement(sql.toString());
        ResultSet rs = ps.executeQuery();
        
        ArrayList<CaminhaoRB> itens = new ArrayList<>();
        
        while(rs.next()){
            CaminhaoRB r = new CaminhaoRB();
            
            r.setId(rs.getInt("id"));
            r.setCavalo(rs.getString("cavalo"));
            r.setCarreta(rs.getString("carreta"));
            r.setNome(rs.getString("nome"));
            r.setData(rs.getString("data"));
            r.setSaida(rs.getString("saida"));
            r.setComosaida(rs.getString("comosaida"));
            r.setEntrada(rs.getString("entrada"));
            r.setComoentrada(rs.getString("comoentrada"));
            r.setDestino(rs.getString("destino"));
            r.setLacre(rs.getString("lacre"));
            
            itens.add(r);
        }
        return itens;
    }
    
}
