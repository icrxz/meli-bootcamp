package com.meli.api.exercise4.controller;

import com.meli.api.exercise4.dao.PratoDAO;
import com.meli.api.exercise4.dto.PratoDTO;
import com.meli.api.exercise4.entity.Pedido;
import com.meli.api.exercise4.entity.Prato;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/pratos")
public class PratoController {
    PratoDAO pratoDAO = new PratoDAO();

    @PostMapping
    public ResponseEntity<Pedido> createPrato(@RequestBody PratoDTO pratoDTO, UriComponentsBuilder uriBuilder) {
        Prato prato = PratoDTO.converter(pratoDTO, pratoDAO);
        pratoDAO.create(prato);

        URI uri = uriBuilder.path("/pratos/{id}").buildAndExpand(prato.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @RequestMapping("/{id}")
    public PratoDTO getPrato(@PathVariable long id) {
        Prato prato = pratoDAO.get(id);
        PratoDTO pratoDTO = PratoDTO.converter(prato);

        return pratoDTO;
    }
}
