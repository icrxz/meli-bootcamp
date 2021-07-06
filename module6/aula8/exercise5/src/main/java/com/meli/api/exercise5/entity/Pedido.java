package com.meli.api.exercise5.entity;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {
    private long id;
    private long clienteId;
    private List<Produto> produtos;

    public long getId() {
        return id;
    }

    public long getClienteId() {
        return clienteId;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public BigDecimal getValorTotal() {
        return this.produtos.stream().map(Produto::getPreco).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public Pedido() {
    }

    public Pedido(long id, long clienteId, List<Produto> produtos) {
        this.id = id;
        this.clienteId = clienteId;
        this.produtos = produtos;
    }
}
