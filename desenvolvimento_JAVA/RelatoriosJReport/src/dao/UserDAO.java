/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexaoFactory.Conexao;
import domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Developer
 */
public class UserDAO {
    
    
    public void salvar(Usuario u){
        
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO tabela (nome, placa, local) VALUES (?,?,?) ");
        try {
            Connection c = Conexao.db();
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ps.setString(1, u.getNome());
            ps.setString(2, u.getPlaca());
            ps.setString(3, u.getLocal());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro no SALVAR");
        }
    }
    public List<Usuario> listar() throws SQLException{
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT id, nome, placa, local FROM tabela");
        
        Connection c = Conexao.db();
        
        PreparedStatement ps = c.prepareStatement(sql.toString());
        
        ResultSet rs = ps.executeQuery();
        
        ArrayList<Usuario> itens = new ArrayList<>();
        while(rs.next()){
            Usuario u = new Usuario();
            
            u.setId(rs.getInt("id"));
            u.setNome(rs.getString("nome"));
            u.setPlaca(rs.getString("placa"));
            u.setLocal(rs.getString("local"));
            itens.add(u);
            
        }
        return itens;
    }
    public void excluir(Usuario u){
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM tabela WHERE id = ? ");
        try {
            Connection c = Conexao.db();
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ps.setInt(1, u.getId());
            ps.executeUpdate();
            System.out.println("EXCLUIR COM SUCESSO");
            
        } catch (SQLException ex) {
            System.out.println("Erro no excluir");
        }
    }
     public void atualizar(Usuario u){
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE tabela ");
        sql.append("SET nome = ?, placa = ?, local = ? ");
        sql.append("WHERE id = ? ");
        try {
            Connection c = Conexao.db();
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ps.setInt(1, u.getId());
            ps.setString(2, u.getNome());
            ps.setString(3, u.getPlaca());
            ps.setString(4, u.getLocal());
            
            ps.executeUpdate();
            System.out.println("UPDATE COM SUCESSO");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
}
