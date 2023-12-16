package com.ecommerce.backend.Controllers;

import com.ecommerce.backend.Services.EmailServices;
import com.ecommerce.backend.Utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
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
    public ResponseMessage contactUs() {
        emailService.contactUs("resoshubham2002@gmail.com", "This is a test email from Spring Boot", "Spring Boot");

        return new ResponseMessage("Email sent successfully", HttpStatus.OK);
    }

}
