package com.dt.utility;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class SendMail {

    public void sendMail(String email) {
        final String username = "defect.tracker.app@gmail.com";
        final String password = "ssdi2016";

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("defect.tracker.app@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
            InternetAddress.parse(email));
            message.setSubject("Welcome To Defect Tracker");
            message.setText("Dear User,"
                + "\n\n Please login to defect tracker application with your email using below password"
            	+ "\n\n Password: abcd"	);

            Transport.send(message);
            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}