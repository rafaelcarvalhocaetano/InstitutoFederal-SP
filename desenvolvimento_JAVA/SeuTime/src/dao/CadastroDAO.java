
package dao;

import bean.Cadastro;
import factory.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class CadastroDAO {
    
    
    public void salvar(Cadastro c ){
        
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO jogadores (nome, sobreNome, time, numeroCamisa, cpf, dataNascimento) VALUES (?, ?, ?, ?, ?, ?) ");
        
        try {
            Connection con = ConexaoFactory.getConection();
            PreparedStatement ps = con.prepareStatement(sql.toString());
            
            ps.setString(1, c.getNome());
            ps.setString(2, c.getSobreNome());
            ps.setString(3, c.getTime());
            ps.setString(4, c.getNumeroCamisa());
            ps.setString(5, c.getCpf());
            ps.setString(6, c.getDataNascimento());
            ps.executeUpdate();
            System.out.println("SALVO COM SUCESSO ...");
            
        } catch (SQLException ex) {
            System.out.println("Erro NO salvar");
           // ex.printStackTrace();
        }
        
    }
    
    public List<Cadastro> listar(){
        
        
        
        return null;
    }
    
    
}
