package com.rb.dao;

import com.rb.conexao.ConexaoFactory;
import com.rb.domain.CaminhaoRB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        
    }
    public void update(CaminhaoRB c){
        
    }
    public List<CaminhaoRB> listar(){
        
        return null;
    }
    
}
