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
import java.sql.SQLException;

/**
 *
 * @author Developer
 */
public class CursoDAO {
    
    
    public void salvar(Curso c){
       
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO disciplina (nomeDisciplina, cargaHoraria, cursoPertencente, numeroVagas, periodo) ");
        sql.append("VALUES (?, ?, ?, ?, ?, ?) ");
        
        try{
            Connection conexao = ConexaoFactory.getDB();
            PreparedStatement ps = conexao.prepareStatement(sql.toString());
            ps.setString(1, c.getNomeDisciplina());
            ps.setInt(2, c.getCargaHoraria());
            ps.setString(3, c.getCursoPertence());
            ps.setInt(4, c.getNumeroVagas());
            ps.setString(5, c.getPeriodo());
        }catch(SQLException e){
            
        }
        
    }
    
}
