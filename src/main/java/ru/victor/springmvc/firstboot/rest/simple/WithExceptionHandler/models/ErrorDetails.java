package ru.victor.springmvc.firstboot.rest.simple.WithExceptionHandler.models;

import org.jetbrains.annotations.NotNull;

public class ErrorDetails {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
