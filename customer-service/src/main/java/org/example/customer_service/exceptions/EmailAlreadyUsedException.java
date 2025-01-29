package org.example.customer_service.exceptions;

public class EmailAlreadyUsedException extends Exception{
    public EmailAlreadyUsedException(String message) {
        super(message);
    }
}
