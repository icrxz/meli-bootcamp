package com.meli.api.exercise3.dto;

import com.meli.api.exercise3.dao.StudentDAO;
import com.meli.api.exercise3.entity.Student;
import com.meli.api.exercise3.entity.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDTO {
    private String nome;
    private List<Subject> materias;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Subject> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Subject> materias) {
        this.materias = materias;
    }

    public double getMedia() {
        return media;
    }

    public StudentDTO() {
    }

    public StudentDTO(Student student) {
        this.nome = student.getNome();
        this.materias = new ArrayList<>(student.getMaterias());
        this.media = student.getMaterias().stream().map(Subject::getGrade).reduce(0.0, Double::sum) / student.getMaterias().size();
    }

    public static StudentDTO converter(Student student) {
        return new StudentDTO(student);
    }

    public static Student converter(StudentDTO studentDTO, StudentDAO studentDAO) {
        return new Student(studentDAO.getList().size() + 1, studentDTO.getNome(), studentDTO.getMaterias());
    }

    public static List<StudentDTO> converter(List<Student> students) {
        return students.stream().map(s -> new StudentDTO(s)).collect(Collectors.toList());
    }
}
