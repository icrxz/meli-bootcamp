package com.meli.api.exercise5.dao;

import com.meli.api.exercise5.entity.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private static List<Produto> produtos = new ArrayList<>();

    public List<Produto> getList() {
        return this.produtos;
    }

    public void addProduto(Produto p) {
        produtos.add(p);
    }

    public Produto getProduto(long produtoId) {
        return produtos.stream().filter(p -> p.getId() == produtoId).findFirst().orElse(null);
    }
}
