package com.rb.dao;

import com.rb.conexao.ConexaoFactory;
import com.rb.domain.Login;
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
public class LoginDAO {
    
    
    
    public List<Login> listar() throws SQLException {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM login");
      
        Connection conexao = ConexaoFactory.db();
        PreparedStatement ps = conexao.prepareStatement(sql.toString());

        ResultSet rs = ps.executeQuery();

        ArrayList<Login> itens = new ArrayList<>();
        while (rs.next()) {
            Login l = new Login();
            l.setId(rs.getInt("id"));
            l.setUser(rs.getString("user"));
            l.setPass(rs.getString("pass"));

            itens.add(l);
        }
        return itens;
    }
    public List<Login> listarL(String a, String b){
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM login WHERE  user=? AND pass=?");
        
        try {
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setString(1, a);
            ps.setString(2, b);
            ResultSet rs = ps.executeQuery();

            ArrayList<Login> itens = new ArrayList<>();
            while (rs.next()) {

                Login l = new Login();

                l.setUser(rs.getString("user"));
                l.setPass(rs.getString("pass"));

                itens.add(l);
            }
            return itens;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha Errado ", "Erro ao Logar", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public void create(Login l){
        
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO login (user, pass) VALUES (?,?)");
        
        try {
            Connection conexao = ConexaoFactory.db();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setString(1, l.getUser());
            ps.setString(2, l.getPass());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

  
}
