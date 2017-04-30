package DAL;

import java.util.Properties;
import javax.mail.MessagingException;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import java.util.Date;
import javax.mail.Transport;

public class SendingEmail {
    
    public void sendMail(String rec, String sub, String msg)throws  MessagingException{
        
        Properties property = new Properties(); // configuration for the gmail
        property.put("mail.smtp.host", "smtp.gmail.com");
        property.put("mail.smtp.port", "587");
        property.put("mail.smtp.auth", "true");
        property.put("mail.smtp.starttls.enable", "true");
       // property.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        property.put("mail.smtp.ssl.trust", "smtp.gmail.com");
 
       // props.put("mail.smtp.starttls.enable", "true"); 
        
//        try{
             Authenticator auth = new Authenticator(){
             public PasswordAuthentication getPasswordAuthentication(){
                
                 return new PasswordAuthentication("cpiri14@gmail.com" , "piriChristo14"); //id, pass
             }
        };
            Session session = Session.getInstance(property, auth);
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("cpiri14@gmail.com"));   // your email id
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(rec));   // recipient email id
            message.setSubject(sub);
            message.setSentDate(new Date());
            message.setText(msg);
            
            Transport.send(message);
            
//        }
//        catch(MessagingException ex)  
//        {
//            System.out.println("Error " + ex.getMessage());
//        
//        }
    }
}
