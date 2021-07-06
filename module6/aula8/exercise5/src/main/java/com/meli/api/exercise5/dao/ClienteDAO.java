package com.meli.api.exercise5.dao;

import com.meli.api.exercise5.entity.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private static List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getList() {
        return clientes;
    }

    public void addCliente(Cliente c) {
        clientes.add(c);
    }

    public Cliente getCliente(long clientId) {
        return clientes.stream().filter(c -> c.getId() == clientId).findFirst().orElse(null);
    }
}
