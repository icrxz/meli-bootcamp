package com.meli.api.starwars.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.api.starwars.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Repository
public class PersonaRepository {
    private static final File FILE = new File("src/main/resources/starwars.json");
    private final ObjectMapper mapper;

    @Autowired
    public PersonaRepository(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public List<Persona> getList() {
        List<Persona> personas = new ArrayList<>();

        try {
            FileInputStream is = new FileInputStream(FILE);

            TypeReference<List<Persona>> typeReference = new TypeReference<>() {};

            personas = mapper.readValue(is, typeReference);

            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personas;
    }

    public List<Persona> getPersonaByName(String name) {
        List<Persona> personas = getList();

        return personas.stream().filter(persona -> persona.getName().toLowerCase().contains(name)).collect(Collectors.toList());
    }
}
