package com.meli.api.exercise3.controller;

import com.meli.api.exercise3.dao.StudentDAO;
import com.meli.api.exercise3.dto.StudentDTO;
import com.meli.api.exercise3.entity.Degree;
import com.meli.api.exercise3.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/students")
public class StudentController {
    StudentDAO dao = new StudentDAO();

    @RequestMapping("/{id}")
    public StudentDTO getStudent(@PathVariable long id) {
        Student student = dao.get(id);

        StudentDTO studentDTO = StudentDTO.converter(student);

        return studentDTO;
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody StudentDTO studentDTO, UriComponentsBuilder uriBuilder) {
        Student student = StudentDTO.converter(studentDTO, dao);
        dao.create(student);

        URI uri = uriBuilder.path("/casas/{id}").buildAndExpand(student.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @RequestMapping("/{id}/getDiploma")
    public Degree getDiploma(@PathVariable long id) {
        Student student = dao.get(id);

        StudentDTO studentDTO = StudentDTO.converter(student);

        Degree diploma = new Degree(studentDTO.getMedia(), studentDTO.getNome());

        return diploma;
    }
}
