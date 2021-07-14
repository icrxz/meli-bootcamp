package com.meli.api.diplomatests.dto.mapper;

import com.meli.api.diplomatests.dto.StudentDTO;
import com.meli.api.diplomatests.entity.Student;
import com.meli.api.diplomatests.form.StudentForm;

public class StudentMapper {
    public static Student convert(StudentForm studentForm) {
        Student student = new Student();

        student.setName(studentForm.getName());
        student.setSubjects(SubjectMapper.convertSubjectFormListToEntity(studentForm.getSubjects()));

        return student;
    }

    public static StudentDTO convert(Student student) {
        return new StudentDTO(student);
    }
}
