package com.meli.api.exercise4.dto;

import com.meli.api.exercise4.dao.PedidoDAO;
import com.meli.api.exercise4.entity.Mesa;
import com.meli.api.exercise4.entity.Pedido;
import com.meli.api.exercise4.entity.Prato;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoDTO {
    private long mesaId;
    private BigDecimal valorTotal;
    private List<Prato> pratos;

    public long getMesaId() {
        return mesaId;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public PedidoDTO() {
    }

    public PedidoDTO(Pedido pedido) {
        this.mesaId = pedido.getMesa();
        this.valorTotal = pedido.getValorTotal();
        this.pratos = pedido.getPratos();
    }

    public static PedidoDTO converter(Pedido pedido) {
        return new PedidoDTO(pedido);
    }

    public static Pedido converter(PedidoDTO pedidoDTO, PedidoDAO pedidoDAO) {
        return new Pedido(pedidoDAO.getList().size() + 1, pedidoDTO.getMesaId(), pedidoDTO.getPratos());
    }

    public static List<PedidoDTO> converter(List<Pedido> pedidos) {
        return pedidos.stream().map(ent -> new PedidoDTO(ent)).collect(Collectors.toList());
    }
}
