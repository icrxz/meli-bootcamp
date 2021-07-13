package com.meli.api.linktracker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class APIExceptionHandler {
    @ExceptionHandler(LinkNotFoundException.class)
    public ResponseEntity<?> invalidLinkExceptionHandler(LinkNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new LinkNotFoundException(e.getMessage()));
    }
}
