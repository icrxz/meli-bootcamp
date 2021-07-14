package com.meli.api.diplomatests.dto;

public class ExceptionDTO {
    private String field;
    private String message;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ExceptionDTO() {
    }

    public ExceptionDTO(String field, String message) {
        this.field = field;
        this.message = message;
    }
}
