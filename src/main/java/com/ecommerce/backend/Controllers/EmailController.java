package com.ecommerce.backend.Controllers;

import com.ecommerce.backend.Requests.ContactUsRequest;
import com.ecommerce.backend.Services.EmailServices;
import com.ecommerce.backend.Utils.ResponseMessage;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailController {
    @Autowired
    private final EmailServices emailService;
    public EmailController(EmailServices emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public ResponseMessage contactUs(@RequestBody ContactUsRequest contactUsRequest) throws MessagingException {
        System.out.println(contactUsRequest.getEmail());
        System.out.println(contactUsRequest.getMessage());
        System.out.println(contactUsRequest.getSubject());
        System.out.println(contactUsRequest.getName());
        emailService.contactUs(contactUsRequest.getEmail(), contactUsRequest.getName(), contactUsRequest.getSubject(), contactUsRequest.getMessage());
//        emailService.contactUs(contactUsRequest.getEmail(), contactUsRequest.getMessage(), contactUsRequest.getSubject());
////        emailService.contactUs("resoshubham2002@gmail.com", "This is a test email from Spring Boot", "Spring Boot");

        return new ResponseMessage("Email sent successfully", HttpStatus.OK);
    }

}
