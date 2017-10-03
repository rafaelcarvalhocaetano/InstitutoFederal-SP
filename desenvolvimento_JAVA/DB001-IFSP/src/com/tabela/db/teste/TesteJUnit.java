package com.tabela.db.teste;

import com.tabela.db.bean.Cliente;
import com.tabela.db.dao.TabelaDAO;
import java.sql.SQLException;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class TesteJUnit {

    public static void main(String[] args) {
       /*
        
        // SALVAR
        
        Cliente c = new Cliente();
        TabelaDAO dao = new TabelaDAO();
        
        
        c.setNome("Rafael");
        c.setSobreNome("Carvalho Caetano");
       
        Date data = new Date("11/11/2011");
       
        c.setDataNascimento(data);
        dao.salvar(c);

        System.out.println("SALVO COM SUCESSO");

        */
       
       /*
       
       // LISTAR SIMPLES
       
       TabelaDAO dao = new TabelaDAO();
       
        try {
            for(Cliente c : dao.listar()){
                
                System.out.println("ID : "+c.getId());
                System.out.println("NOME : "+c.getNome());
                System.out.println("SNOME : "+c.getSobreNome());
                System.out.println("DATA : "+c.getDataNascimento());
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar ..."+ex);
        }
        
        // LISTAR POR ID
       
        TabelaDAO dao = new TabelaDAO();
       
        try {
            for(Cliente c : dao.listarPorID("1")){
                
                System.out.println("ID : "+c.getId());
                System.out.println("NOME : "+c.getNome());
                System.out.println("SNOME : "+c.getSobreNome());
                System.out.println("DATA : "+c.getDataNascimento());
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar ..."+ex);
        }
        */
       

    }
    
    
}
