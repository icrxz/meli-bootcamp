package com.meli.api.exercise4.dao;

import com.meli.api.exercise4.entity.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {
    private static List<Pedido> pedidos = new ArrayList<>();

    public List<Pedido> getList() {
        return pedidos;
    }

    public void create(Pedido pedido) {
        pedidos.add(pedido);
    }

    public Pedido get(long id) {
        return pedidos.stream().filter(ent -> ent.getId() == id).findFirst().orElse(null);
    }
}
