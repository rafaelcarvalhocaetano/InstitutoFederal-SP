/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Developer
 */
public class EnviandoEmail {
    
    
    public static void main(String[] args) {
        try {
            enviando();
            JOptionPane.showMessageDialog(null,"OK");
        } catch (EmailException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public static void enviando() throws EmailException{
        
        SimpleEmail email = new SimpleEmail();
        System.out.println("1");
        email.setHostName("smtp.gmail.com");
        System.out.println("2");
        email.setSmtpPort(465);
        System.out.println("3");
        email.setFrom("rapha.pse@gmail.com", "Teste");
        System.out.println("4");
        email.addTo("rapha.pse@gmail.com", "Teste");
        System.out.println("5");
        email.setSubject("Teste de envio de email");
        System.out.println("6");
        email.setMsg("Eu estou com sono e dor na barriga");
        System.out.println("7");
        email.setSSL(true);
        System.out.println("8");
        email.setAuthentication("rapha.pse@gmail.com", "senha");
        System.out.println("9");
        email.send();
        
    }
    
}
