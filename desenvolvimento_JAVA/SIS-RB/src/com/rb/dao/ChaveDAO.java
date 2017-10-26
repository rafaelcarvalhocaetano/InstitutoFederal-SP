
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
        sql.append("INSERT INTO chave (nome, setor, dataretirada, hretirada, hentrada, datadevolucao, vigilante) VALUES (?,?,?,?,?,?,?) ");
        
        try {
            Connection con = ConexaoFactory.db();
            PreparedStatement ps = con.prepareStatement(sql.toString());
            
            ps.setString(1, c.getNome());
            ps.setString(2, c.getSetor());
            //ps.setString(3, c.getDataretirada());
           // ps.setString(4, c.getHsaida());
            //ps.setString(5, c.getHentrada());
            //ps.setString(6, c.getDataDevolucao());
            //ps.setString(7, c.getVigilante());
            
            ps.executeUpdate();
            
            System.out.println("SQL OK ... ");
            
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
          //  c.setDataretirada(rs.getString("dataretirada"));
          //  c.setHsaida(rs.getString("hretirada"));
          //  c.setHentrada(rs.getString("hentrada"));
          //  c.setDataDevolucao(rs.getString("datadevolucao"));
            c.setVigilante(rs.getString("vigilante"));
            
            itens.add(c);
        }
        return itens;
        
    }
    
}
