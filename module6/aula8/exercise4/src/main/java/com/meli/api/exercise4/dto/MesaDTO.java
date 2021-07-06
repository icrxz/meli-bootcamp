package com.meli.api.exercise4.dto;

import com.meli.api.exercise4.dao.MesaDAO;
import com.meli.api.exercise4.entity.Mesa;
import com.meli.api.exercise4.entity.Pedido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MesaDTO {
    private BigDecimal valorTotal;
    private List<Pedido> pedidos = new ArrayList<>();

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public MesaDTO() {
    }

    public MesaDTO(Mesa mesa) {
        this.pedidos = new ArrayList<>(mesa.getPedidos());
        this.valorTotal = mesa.getValorTotal();
    }

    public static Mesa converter(MesaDTO mesaDTO, MesaDAO mesaDAO) {
        return new Mesa(mesaDAO.getList().size() + 1, mesaDTO.pedidos);
    }

    public static MesaDTO converter(Mesa mesa) {
        return new MesaDTO(mesa);
    }
}
