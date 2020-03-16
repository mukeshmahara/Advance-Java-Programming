/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mail_Sending;


import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author Dell
 */
public class SendEmail {
    public static void main(String[] args) {

	    final String username = "sub.prakash@hotmail.com";
	    final String password = "Abbrose1@345";

	    Properties props = new Properties();
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.host", "smtp.live.com");
	    props.put("mail.smtp.port", "587");

	    Session session = Session.getInstance(props,
	      new javax.mail.Authenticator() {
	        protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(username, password);
	        }
	      });

	    try {

	        Message message = new MimeMessage(session);
	        message.setFrom(new InternetAddress("sub.prakash@hotmail.com"));
	        message.setRecipients(Message.RecipientType.TO,
	            InternetAddress.parse("dizprakash@gmail.com"));
	        message.setSubject("Testing Subject");
	        message.setText("Dear Mail Crawler,"
	            + "\n\n No spam to my email, please!");

	        Transport.send(message);

	        System.out.println("Done");

	    } catch (MessagingException e) {
	        throw new RuntimeException(e);
	    }
	}
    
}
