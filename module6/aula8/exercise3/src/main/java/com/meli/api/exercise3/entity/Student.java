package com.meli.api.exercise3.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private long id;
    private String nome;
    private List<Subject> materias = new ArrayList<>();

    public long getId() {
        return id;
    }

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

    public Student(long id, String nome, List<Subject> materias) {
        this.id = id;
        this.nome = nome;
        this.materias = materias;
    }
}
