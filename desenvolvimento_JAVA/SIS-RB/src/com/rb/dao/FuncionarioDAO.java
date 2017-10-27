package com.rb.dao;

import com.rb.conexao.ConexaoFactory;
import com.rb.domain.FuncionariosRB;
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
public class FuncionarioDAO {
    
    
    public void create(FuncionariosRB c) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO ");
        sql.append("funcionarios (nome, modelo, data, entrada, saida, obs) ");
        sql.append("VALUES (?,?,?,?,?,?) ");
        
        try {
            
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            
            ps.setString(1, c.getNome());
            ps.setString(2, c.getModelo());
            ps.setString(3, c.getData());
            ps.setString(4, c.getEntrada());
            ps.setString(5, c.getSaida());
            ps.setString(6, c.getObs());
            
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no SALVAR", "ERRO no BANCO DE DADOS", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
               

    }    
    public void delete(FuncionariosRB c){
        
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM funcionarios WHERE id = ? ");
        
        try {
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setInt(1, c.getId());
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
            
        
    }
    public void update(FuncionariosRB c){
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE veiculoLeve SET ");
        sql.append("nome=?, modelo=?, entrada=?, saida=?, obs=? ");
        sql.append("WHERE id = ? ");
        
        try {
            
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            
            ps.setString(1, c.getNome());
            ps.setString(2, c.getModelo());
            ps.setString(3, c.getEntrada());
            ps.setString(4, c.getSaida());
            ps.setString(5, c.getObs());
            ps.setInt(6, c.getId());   
            
            ps.executeUpdate();
            
            System.out.println("UPDATE DAO OK");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no SALVAR", "ERRO no BANCO DE DADOS", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    public List<FuncionariosRB> listar() throws SQLException{
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM funcionarios ");
      
        Connection conexao = ConexaoFactory.db();
        PreparedStatement ps = conexao.prepareStatement(sql.toString());
        ResultSet rs = ps.executeQuery();
        
        ArrayList<FuncionariosRB> itens = new ArrayList<>();
        
        while(rs.next()){
            FuncionariosRB r = new FuncionariosRB();
            
            r.setId(rs.getInt("id"));
            r.setNome(rs.getString("nome"));
            r.setModelo(rs.getString("modelo"));
            r.setData(rs.getString("data"));
            r.setEntrada(rs.getString("entrada"));
            r.setSaida(rs.getString("saida"));
            r.setObs(rs.getString("obs"));
            
            itens.add(r);
        }
        return itens;
    }
    
}
