package com.meli.api.diplomatests.form;

import javax.validation.constraints.*;

public class SubjectForm {
    @NotNull
    @Size(min = 8, max = 50)
    @Pattern(regexp = "^([a-zA-Z]+[\\s]*)+$", message = "Nome só pode conter caracteres")
    private String subject;
    @NotNull
    @Digits(fraction = 0, integer = 2)
    @Min(value = 0)
    @Max(value = 10)
    private Integer note;

    public String getSubject() {
        return subject;
    }

    public Integer getNote() {
        return note;
    }

    public SubjectForm() {
    }

    public SubjectForm(String subject, Integer note) {
        this.subject = subject;
        this.note = note;
    }
}
