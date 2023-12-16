package com.ecommerce.backend.Requests;

public class ContactUsRequest {
    private String name;
    private String email;
    private String message;
    private String subject;

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getMessage() {
        return message;
    }
    public String getSubject() {
        return subject;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email= email;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
