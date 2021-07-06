package com.meli.api.exercise5.dao;

import com.meli.api.exercise5.entity.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {
    private static List<Pedido> pedidos = new ArrayList<>();

    public List<Pedido> getList() {
        return pedidos;
    }

    public Pedido getPedido(long pedidoId) {
        return pedidos.stream().filter(p -> p.getId() == pedidoId).findFirst().orElse(null);
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
}
