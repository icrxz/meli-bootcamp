package com.meli.api.starwars.controller;

import com.meli.api.starwars.dto.PersonaDTO;
import com.meli.api.starwars.entity.Persona;
import com.meli.api.starwars.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping
    public List<PersonaDTO> getAll() {
        List<Persona> personas = personaService.getPersonas();

        return PersonaDTO.converter(personas);
    }

    @GetMapping("/searchName/{name}")
    public List<String> getAll(@PathVariable String name) {
        return personaService.searchPersonas(name);
    }
}
