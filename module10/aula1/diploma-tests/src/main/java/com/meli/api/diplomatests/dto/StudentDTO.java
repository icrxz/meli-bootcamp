package com.meli.api.diplomatests.dto;

import com.meli.api.diplomatests.dto.mapper.SubjectMapper;
import com.meli.api.diplomatests.entity.Student;

import java.util.List;

public class StudentDTO {
    private String name;
    private List<SubjectDTO> subjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubjectDTO> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectDTO> subjects) {
        this.subjects = subjects;
    }

    public StudentDTO() {
    }

    public StudentDTO(Student student) {
        this.name = student.getName();
        this.subjects = SubjectMapper.convertSubjectListToDTO(student.getSubjects());
    }
}
