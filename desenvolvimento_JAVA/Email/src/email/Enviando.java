/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;

/**
 *
 * @author Developer
 */
public class Enviando {
    
    public static void main(String[] args) {
        
        NewEmail e = new NewEmail();
        try {
            e.sendMail();
        } catch (MessagingException ex) {
            ex.printStackTrace();
            System.out.println("erro");
        }
        
    }
    
}
