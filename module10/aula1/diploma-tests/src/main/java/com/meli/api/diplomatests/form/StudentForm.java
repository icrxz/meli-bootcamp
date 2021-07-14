package com.meli.api.diplomatests.form;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

public class StudentForm {
    @NotNull
    @Size(min = 8, max = 50)
    @Pattern(regexp = "^([a-zA-Z]+[\\s]*)+$", message = "Nome só pode conter caracteres")
    private String name;
    @NotNull
    @NotEmpty
    @Valid
    private List<SubjectForm> subjects;

    public String getName() {
        return name;
    }

    public List<SubjectForm> getSubjects() {
        return subjects;
    }

    public StudentForm() {
    }

    public StudentForm(String name, List<SubjectForm> subjects) {
        this.name = name;
        this.subjects = subjects;
    }
}
