package com.tabela.db.dao;

import com.tabela.db.bean.Cliente;
import com.tabela.db.factory.ConexaoFactory;
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
public class TabelaDAO {

    public void salvar(Cliente c) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO cliente (nome, sobreNome, dataNascimento) VALUES (?, ?, ?) ");

        try {
            Connection con = ConexaoFactory.getConnection();
            PreparedStatement ps = con.prepareStatement(sql.toString());

            ps.setString(1, c.getNome());
            ps.setString(2, c.getSobreNome());
            ps.setString(3, c.getDataNascimento());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("ERRO EM SALVAR ..." + ex);
        }

    }

    public List<Cliente> listar() throws SQLException {

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT c.id, c.nome, c.sobreNome, c.dataNascimento FROM cliente c ");

        Connection con = ConexaoFactory.getConnection();

        PreparedStatement ps = con.prepareStatement(sql.toString());

        ResultSet rs = ps.executeQuery();

        ArrayList<Cliente> itens = new ArrayList<>();

        while (rs.next()) {

            Cliente c = new Cliente();
            
            c.setId(rs.getInt("c.id"));
            c.setNome(rs.getString("c.nome"));
            c.setSobreNome(rs.getString("c.sobreNome"));
            c.setDataNascimento(rs.getString("c.dataNascimento"));

            itens.add(c);
        }
        return itens;
    }
    
    public List<Cliente> listarPorID(String ca) throws SQLException{
        
        StringBuilder sql = new StringBuilder();
        Cliente c = null;
        
        sql.append("SELECT c.nome, c.sobreNome, c.dataNascimento FROM cliente c WHERE nome = ? ");

        Connection con = ConexaoFactory.getConnection();

        PreparedStatement ps = con.prepareStatement(sql.toString());
        ps.setString(1, ca);
        ResultSet rs = ps.executeQuery();

        ArrayList<Cliente> itens = new ArrayList<>();
        
        while(rs.next()){
            c = new Cliente();
            
            c.setNome(rs.getString("c.nome"));
            c.setSobreNome(rs.getString("c.sobreNome"));
            c.setDataNascimento(rs.getString("c.dataNascimento"));
            
            itens.add(c);
        }
        return itens;        
    }
    
    public void excluir(Cliente ca){
        
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM cliente WHERE id = ? ");
        
        try {
            Connection con = ConexaoFactory.getConnection();
            PreparedStatement ps = con.prepareStatement(sql.toString());
            
            ps.setInt(1, ca.getId());
            ps.executeUpdate();
            
            System.out.println("EXCLUIR");
        } catch (SQLException ex) {
            System.out.println("Erro no excluir"+ex);
        }
        
        
        
        

       
    }

}
