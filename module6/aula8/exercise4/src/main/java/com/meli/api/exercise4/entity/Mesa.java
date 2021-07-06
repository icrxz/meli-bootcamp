package com.meli.api.exercise4.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private long id;
    private List<Pedido> pedidos = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getValorTotal() {
        return this.pedidos.stream().map(Pedido::getValorTotal).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public Mesa() {
    }

    public Mesa(long id, List<Pedido> pedidos) {
        this.id = id;
        this.pedidos = pedidos;
    }
}
