
package com.rb.dao;

import com.rb.conexao.ConexaoFactory;
import com.rb.domain.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class AdminDAO {
    
    
    public void salvar(Admin a){
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO login (user, pass) VALUES (?, ?) ");
        
        Connection conexao;
        try {
            conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setString(1, a.getUser());
            ps.setString(2, a.getPass());
            
            ps.executeUpdate();     
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void delete(Admin a){
        
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM login WHERE id = ? ");
        
        Connection conexao;
        try {
            conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setInt(1, a.getId());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    public void update(Admin a){
        StringBuilder sql = new StringBuilder();
         sql.append("UPDATE login SET ");
        sql.append("user=?, pass=?");
        sql.append("WHERE id = ? ");
        
        Connection conexao;
        try {
            conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setString(1, a.getUser());
            ps.setString(2, a.getPass());
            
            ps.setInt(3, a.getId());
            
            ps.executeUpdate();            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
    }
    public List<Admin> listar() throws SQLException{
        
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM login");
        
        Connection conexao = ConexaoFactory.db();
        PreparedStatement ps = conexao.prepareStatement(sql.toString());
        ResultSet rs = ps.executeQuery();
        
        ArrayList<Admin> itens = new ArrayList<>();
        while(rs.next()){
            Admin a = new Admin();
            
            a.setId(rs.getInt("id"));
            a.setUser(rs.getString("user"));
            a.setPass(rs.getString("pass"));
            
            itens.add(a);
        }
        
        return itens;
    }
    
}
