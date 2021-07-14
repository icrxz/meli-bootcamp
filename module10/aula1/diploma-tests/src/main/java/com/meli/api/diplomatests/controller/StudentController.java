package com.meli.api.diplomatests.controller;

import com.meli.api.diplomatests.dto.DegreeDTO;
import com.meli.api.diplomatests.dto.StudentDTO;
import com.meli.api.diplomatests.form.StudentForm;
import com.meli.api.diplomatests.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/analyzeNotes")
    public ResponseEntity<DegreeDTO> analyzeNotes(@RequestBody @Valid StudentForm studentForm) {
        StudentDTO studentDTO = studentService.createUser(studentForm);
        DegreeDTO degreeDTO = studentService.analyzeNotes(studentDTO);

        return new ResponseEntity(degreeDTO, HttpStatus.CREATED);
    }
}
