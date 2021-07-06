package com.meli.api.starwars.dto;

import com.meli.api.starwars.entity.Persona;

import java.util.List;
import java.util.stream.Collectors;

public class PersonaDTO {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonaDTO() {
    }

    public PersonaDTO(Persona persona) {
        this.name = persona.getName();
    }

    public static List<PersonaDTO> converter(List<Persona> personas) {
        return personas.stream().map(PersonaDTO::new).collect(Collectors.toList());
    }
}
