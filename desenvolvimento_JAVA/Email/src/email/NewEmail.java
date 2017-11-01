/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import static com.oracle.jrockit.jfr.Transition.From;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author Developer
 */
public class NewEmail {
    
    
    private String mailSMTPServer;
    private String mailSMTPServerPort;
    private String mailSenha;
    private String send;
    private String destino;
    
    
    public void sendMail() throws MessagingException{
        
        Properties props = new Properties();
        
        
        
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
                
        
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                 
                    @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(send,mailSenha);
                }
            });
        
        session.setDebug(true);
       
        Message msg = new MimeMessage(session);
        
        try {
            Address [] toUser = InternetAddress.parse("rapha.pse@outlook.com");
            msg.setRecipients(Message.RecipientType.TO, toUser);
            msg.setSubject("Teste");
            msg.setContent("Enviando mensagem de teste","text/html");
            
            Transport.send(msg);
            
            JOptionPane.showMessageDialog(null, "OK");
        } catch (Exception ex) {
            ex.printStackTrace();
             JOptionPane.showMessageDialog(null, ex); 
        }
    }
    
}
