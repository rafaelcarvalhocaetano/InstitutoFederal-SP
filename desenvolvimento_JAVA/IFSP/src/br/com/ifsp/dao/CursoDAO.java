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
        sql.append("VALUES (?, ?, ?, ?, ?) ");
        
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
    //metodo responsável por excluir o item selecionado
    public void excluir(Curso c){
        
        //classe StringBuilder é capaz de armazenar muitas informações, apenas usando o metodo append para concatenas as string.
        StringBuilder sql = new StringBuilder();
         //SQL de armazenamento no banco de dados
        sql.append("DELETE FROM disciplina WHERE  nomeDisciplina = ? ");
        
        try{
            conexao = ConexaoFactory.getDB(); //abri a conexão com o meu banco
            //prepara a conexao e recebe a string convertida para executar o comando sql
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            //setando os atributos responsavél por informar ao banco o que será buscado para excluir
            ps.setString(1, c.getNomeDisciplina());
            //executa o comando informado na através da string
            ps.executeUpdate();
             //informa através de uma mensagem que as informações foram excluído
            JOptionPane.showConfirmDialog(null, "Excluído com sucesso", "EXCLUÍDO", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException e){
            //mensagem de erro
            JOptionPane.showConfirmDialog(null, "Erro ao excluir - "+e, "excluir", JOptionPane.ERROR_MESSAGE);
        }finally{
            //fecha a conexão
           ConexaoFactory.fechaConexao(conexao);
        }
        
    }
    //método responsável por atualizar o as informações no banco de dados
    public void atualizar(Curso c){
       
        //classe que armazena muitos caracteres
        StringBuilder sql = new StringBuilder();
        //método da classe stringbuilder que concatena as string
        sql.append("UPDATE disciplina SET ");
        sql.append("(nomeDisciplina = ?, cargaHoraria = ?, cursoPertencente = ?, numeroVagas = ?, periodo = ?) ");
        sql.append("WHERE id = ? ");
        
        try{
            //abre conexão com meu banco
            conexao = ConexaoFactory.getDB();
            //prepara a conexao com o comando informado na string para executar
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            //atributos que serão atualizados no banco de dados
            ps.setString(1, c.getNomeDisciplina());
            ps.setInt(2, c.getCargaHoraria());
            ps.setString(3, c.getCursoPertence());
            ps.setInt(4, c.getNumeroVagas());
            ps.setString(5, c.getPeriodo());
            ps.setInt(6, c.getId());
            
            //executa o comando informado na preparação da conexão juntamente com os atributos informados
            ps.executeUpdate();
            //mensagem de sucesso
            JOptionPane.showConfirmDialog(null, "Atualizado com sucesso", "UPDATE", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            //mensagem de erro
            JOptionPane.showConfirmDialog(null, "Erro ao atualizar - "+e, "UPDATE", JOptionPane.ERROR_MESSAGE);
        }finally{
            //fecha a conexão com meu banco
            ConexaoFactory.fechaConexao(conexao);
        }
        
    }
    //método responsável por listar todos os itens no meu banco de dados
    public List<Curso> listar() throws SQLException{
        //classe stringbuilder capaz de armazenar muitos caracteres
        StringBuilder sql = new StringBuilder();
        //string em forma de comando sql
        sql.append("SELECT * FROM disciplina ");
        
        //abri a conexão com meu banco
        conexao = ConexaoFactory.getDB();
        //prepara a conexão para receber o comando informado na string
        PreparedStatement ps = conexao.prepareStatement(sql.toString());
        //uma tabela de dados que representa um conjunto no banco de dados
        ResultSet rs = ps.executeQuery();
        //informa-se um array para receber as informações do bloco while que passará o resultado do banco
        ArrayList<Curso> itens = new ArrayList<>();

        //loop responsável por verificar se existe algo na tabela do resultset
        while (rs.next()) {
            Curso c = new Curso();

            c.setId(rs.getInt("id"));
            c.setNomeDisciplina(rs.getString("nomeDisciplina"));
            c.setCargaHoraria(rs.getInt("cargaHoraria"));
            c.setCursoPertence(rs.getString("cursoPertencente"));
            c.setNumeroVagas(rs.getInt("numeroVagas"));
            c.setPeriodo(rs.getString("periodo"));

            //método responsável por adicionar as informações acima no array
            itens.add(c);
        }
        //retorna o resultado do banco no Array
        return itens;
    }
    
    
}
