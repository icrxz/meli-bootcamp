package com.meli.api.diplomatests.service;

import com.meli.api.diplomatests.dto.DegreeDTO;
import com.meli.api.diplomatests.dto.StudentDTO;
import com.meli.api.diplomatests.dto.SubjectDTO;
import com.meli.api.diplomatests.dto.mapper.StudentMapper;
import com.meli.api.diplomatests.entity.Student;
import com.meli.api.diplomatests.form.StudentForm;
import com.meli.api.diplomatests.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    private Double calcSubjectAverage(List<SubjectDTO> subjects) {
        return subjects
                .stream()
                .mapToDouble(SubjectDTO::getNote)
                .reduce(0.0, Double::sum) / subjects.size();
    }

    public StudentDTO createUser(StudentForm studentForm) {
        Student student = StudentMapper.convert(studentForm);

        studentRepository.save(student);

        return StudentMapper.convert(student);
    }

    public DegreeDTO analyzeNotes(StudentDTO student) {
        Double subjectAverage = calcSubjectAverage(student.getSubjects());
        String message = String.format("Sua média foi de %.1f", subjectAverage);

        return new DegreeDTO(message, subjectAverage, student);
    }
}
