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
import java.sql.SQLException;
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
    
    
    
    
}
