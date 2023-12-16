package com.ecommerce.backend.Services;

import com.ecommerce.backend.Utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServices {

    @Autowired
    private JavaMailSender emailSender;

    public ResponseMessage contactUs(String toEmail, String body, String subject) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("aishwarytutorial@gmail.com");
        message.setTo(toEmail);
        message.setSubject(subject);
        message.setText(body);
        try {

            emailSender.send(message);

            return new ResponseMessage("Mail sent successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseMessage("Mail not sent", HttpStatus.BAD_REQUEST);
        }
    }
}
