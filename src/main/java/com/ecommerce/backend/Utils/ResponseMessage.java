package com.ecommerce.backend.Utils;
import org.springframework.http.HttpStatus;
public class ResponseMessage {
    private final String message;
    private HttpStatus status = null;
    public ResponseMessage(String message, HttpStatus badGateway) {
        this.message = message;
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public HttpStatus getStatus() {
        return status;
    }
}