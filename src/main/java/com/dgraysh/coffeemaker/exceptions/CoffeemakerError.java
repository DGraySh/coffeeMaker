package com.dgraysh.coffeemaker.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class CoffeemakerError {
    private int status;
    private String message;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = "Europe/Moscow")
    private Date timestamp;

    public CoffeemakerError(int status, String message) {
        this.status = status;
        this.message = message;
        this.timestamp = new Date();
    }
}
