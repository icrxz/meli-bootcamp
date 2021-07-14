package com.meli.api.diplomatests.dto;

import com.meli.api.diplomatests.entity.Subject;

public class SubjectDTO {
    private String subject;
    private Integer note;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public SubjectDTO() {
    }

    public SubjectDTO(Subject subject) {
        this.note = subject.getNote();
        this.subject = subject.getSubject();
    }
}
