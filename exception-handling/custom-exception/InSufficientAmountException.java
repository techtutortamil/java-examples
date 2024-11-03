package com.techtutor.exceptionhandling;

public class InSufficientAmountException extends Exception {
    public InSufficientAmountException(String message) {
        super(message);
    }
}
