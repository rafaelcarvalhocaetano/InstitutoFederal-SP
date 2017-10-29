/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rb.pdf;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Developer
 */
public class Teste {
    
    public static void main(String[] args) {
        new File("C:\\Controle de Acesso").mkdir();
        
       String nome = null;
       nome = JOptionPane.showInputDialog(null, "Qual o seu Nome?", "Pergunta", JOptionPane.PLAIN_MESSAGE);
        System.out.println(nome+".pdf");
    }
    
}
