package com.meli.api.exercise4.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private long id;
    private long mesaId;
    private List<Prato> pratos = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMesa() {
        return mesaId;
    }

    public void setMesa(long mesaId) {
        this.mesaId = mesaId;
    }

    public BigDecimal getValorTotal() {
        return this.pratos.stream().map(Prato::getPreco).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }

    public void addPrato(Prato prato) {
        this.pratos.add(prato);
    }

    public Pedido() {
    }

    public Pedido(long id, long mesa, List<Prato> pratos) {
        this.id = id;
        this.mesaId = mesa;
        this.pratos = pratos;
    }
}
