package com.meli.api.exercise5.controller;

import com.meli.api.exercise5.dao.ProdutoDAO;
import com.meli.api.exercise5.dto.ProdutoDTO;
import com.meli.api.exercise5.entity.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    ProdutoDAO produtoDAO = new ProdutoDAO();

    @PostMapping
    public ResponseEntity<Produto> createProduto(@RequestBody ProdutoDTO produto, UriComponentsBuilder uriBuilder) {
        Produto novoProduto = ProdutoDTO.converter(produto, produtoDAO);

        produtoDAO.addProduto(novoProduto);

        URI uri = uriBuilder.path("produtos/{id}").buildAndExpand(novoProduto.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/{id}")
    public ProdutoDTO getProduto(@PathVariable long id) {
        Produto produto = produtoDAO.getProduto(id);

        return ProdutoDTO.converter(produto);
    }

    @GetMapping
    public List<ProdutoDTO> getAllProdutos() {
        List<Produto> produtos = produtoDAO.getList();

        return ProdutoDTO.converter(produtos);
    }
}
