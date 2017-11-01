/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 *
 * @author Developer
 */
public class SimpleAuth extends Authenticator{
    
    
    public String username = null;
    public String pass = null;
    
    public SimpleAuth(String user, String pass){
        username = user;
        pass = pass;
    }
    
    
}
