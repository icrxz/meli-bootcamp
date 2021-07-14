package com.meli.api.diplomatests.dto.mapper;

import com.meli.api.diplomatests.dto.SubjectDTO;
import com.meli.api.diplomatests.entity.Subject;
import com.meli.api.diplomatests.form.SubjectForm;

import java.util.List;
import java.util.stream.Collectors;

public class SubjectMapper {
    public static SubjectDTO convert(Subject subject) {
        return new SubjectDTO(subject);
    }

    public static List<SubjectDTO> convertSubjectListToDTO(List<Subject> subjects) {
        return subjects.stream().map(SubjectDTO::new).collect(Collectors.toList());
    }

    public static List<Subject> convertSubjectFormListToEntity(List<SubjectForm> subjectsForm) {
        return subjectsForm.stream().map(subjectForm -> {
            Subject subject = new Subject();
            subject.setSubject(subjectForm.getSubject());
            subject.setNote(subjectForm.getNote());

            return subject;
        }).collect(Collectors.toList());
    }
}
