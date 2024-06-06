package com.desplas.foobarquix.api.exceptions;

public class InvalidInputException extends RuntimeException {
    public InvalidInputException(String input) {
        super(input);
    }
}
