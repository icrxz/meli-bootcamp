package com.meli.api.linktracker.exception;

public class LinkNotFoundException extends RuntimeException {
    public LinkNotFoundException(String message) {
        super(message);
    }

    public LinkNotFoundException(Exception e) {
        super(e);
    }
}
