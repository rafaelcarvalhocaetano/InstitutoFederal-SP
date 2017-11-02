///******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Rafael Carvalho Caetano
//******************************************************
package br.com.ifsp.dao;

import br.com.ifsp.conexao.ConexaoFactory;
import br.com.ifsp.domain.Curso;
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
public class CursoDAO {
    
    //Variável de conexao com mysql
    private Connection conexao = null;
    
    //Método responsável por abrir a conexão com o mysql e inserir as informações informadas
    public void salvar(Curso c){
       
        //classe StringBuilder é capaz de armazenar muitas informações, apenas usando o metodo append para concatenas as string.
        StringBuilder sql = new StringBuilder();
         //SQL de armazenamento no banco de dados
        sql.append("INSERT INTO disciplina (nomeDisciplina, cargaHoraria, cursoPertencente, numeroVagas, periodo) ");
        sql.append("VALUES (?, ?, ?, ?, ?, ?) ");
        
        try{
            //abri a conexão com o meu banco
            conexao = ConexaoFactory.getDB();
            //prepara a conexao e recebe a string convertida para executar o comando sql
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            //setando os atributos que serão armazenados no banco de dados
            ps.setString(1, c.getNomeDisciplina());
            ps.setInt(2, c.getCargaHoraria());
            ps.setString(3, c.getCursoPertence());
            ps.setInt(4, c.getNumeroVagas());
            ps.setString(5, c.getPeriodo());
            
            //executa o comando informado na através da string
            ps.executeUpdate();
            //informa através de uma mensagem que as informações foram salvas
            JOptionPane.showConfirmDialog(null, "Informações salvas com sucesso", "Salvo", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            //informa através de uma mensagem que as informações não foram salvas
            JOptionPane.showConfirmDialog(null, "Erro ao salvar - "+e, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            //fecha a conexão com meu banco de dados
            ConexaoFactory.fechaConexao(conexao);
        }
        
    }
    public void excluir(Curso c){
       
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM disciplina WHERE id = ? ");
        
        try{
            conexao = ConexaoFactory.getDB();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setInt(1, c.getId());
            
            ps.executeUpdate();
            
            JOptionPane.showConfirmDialog(null, "Excluído com sucesso", "EXCLUÍDO", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null, "Erro ao excluir - "+e, "excluir", JOptionPane.ERROR_MESSAGE);
        }finally{
           ConexaoFactory.fechaConexao(conexao);
        }
        
    }
    public void atualizar(Curso c){
       
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE disciplina SET ");
        sql.append("(nomeDisciplina = ?, cargaHoraria = ?, cursoPertencente = ?, numeroVagas = ?, periodo = ?) ");
        sql.append("WHERE id = ? ");
        
        try{
            conexao = ConexaoFactory.getDB();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setString(1, c.getNomeDisciplina());
            ps.setInt(2, c.getCargaHoraria());
            ps.setString(3, c.getCursoPertence());
            ps.setInt(4, c.getNumeroVagas());
            ps.setString(5, c.getPeriodo());
            ps.setInt(6, c.getId());
            
            ps.executeUpdate();
            
            JOptionPane.showConfirmDialog(null, "Atualizado com sucesso", "UPDATE", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null, "Erro ao atualizar - "+e, "UPDATE", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConexaoFactory.fechaConexao(conexao);
        }
        
    }
    public List<Curso> listar() throws SQLException{
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM disciplina ");
       
       
        conexao = ConexaoFactory.getDB();
        PreparedStatement ps = conexao.prepareStatement(sql.toString());
        ResultSet rs = ps.executeQuery();
        
        ArrayList<Curso> itens = new ArrayList<>();

        while (rs.next()) {
            Curso c = new Curso();

            c.setId(rs.getInt("id"));
            c.setNomeDisciplina(rs.getString("nomeDisciplina"));
            c.setCargaHoraria(rs.getInt("cargaHoraria"));
            c.setCursoPertence(rs.getString("cursoPertencente"));
            c.setNumeroVagas(rs.getInt("numeroVagas"));
            c.setPeriodo(rs.getString("periodo"));

            itens.add(c);
        }
        return itens;
    }
    
    
}
