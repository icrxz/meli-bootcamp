package com.meli.api.exercise3.dao;

import com.meli.api.exercise3.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private static List<Student> students = new ArrayList<>();

    public List<Student> getList() {
        return students;
    }

    public void create(Student casa) {
        students.add(casa);
    }

    public Student get(long id) {
        return students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }
}
