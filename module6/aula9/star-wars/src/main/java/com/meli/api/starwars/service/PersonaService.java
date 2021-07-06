package com.meli.api.starwars.service;

import com.meli.api.starwars.dto.PersonaDTO;
import com.meli.api.starwars.entity.Persona;
import com.meli.api.starwars.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaService {
    final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> getPersonas() {
        return personaRepository.getList();
    }

    public List<String> searchPersonas(String name) {
        List<Persona> foundPersonas = personaRepository.getPersonaByName(name.toLowerCase());

        return foundPersonas.stream().map(persona -> persona.getName()).collect(Collectors.toList());
    }
}
