package com.meli.api.diplomatests.dto;

public class DegreeDTO {
    private String message;
    private Double average;
    private StudentDTO student;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public StudentDTO getStudent() {
        return student;
    }

    public void setStudent(StudentDTO student) {
        this.student = student;
    }

    public DegreeDTO() {
    }

    public DegreeDTO(String message, Double average, StudentDTO student) {
        this.message = message;
        this.average = average;
        this.student = student;
    }
}
