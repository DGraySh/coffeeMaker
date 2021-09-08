package com.dgraysh.coffeemaker.exceptions;

public class DrinkNotFoundException extends RuntimeException {
    public DrinkNotFoundException(String message) {
        super(message);
    }
}
