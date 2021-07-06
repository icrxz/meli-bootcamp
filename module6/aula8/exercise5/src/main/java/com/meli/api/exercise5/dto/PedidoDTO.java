package com.meli.api.exercise5.dto;

import com.meli.api.exercise5.dao.PedidoDAO;
import com.meli.api.exercise5.entity.Pedido;
import com.meli.api.exercise5.entity.Produto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoDTO {
    private long clienteId;
    private BigDecimal valorTotal;
    private List<Produto> produtos;

    public long getClienteId() {
        return clienteId;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public PedidoDTO() {
    }

    public PedidoDTO(Pedido pedido) {
        this.valorTotal = pedido.getValorTotal();
        this.clienteId = pedido.getClienteId();
        this.produtos = pedido.getProdutos();
    }

    public static PedidoDTO converter(Pedido pedido) {
        return new PedidoDTO(pedido);
    }

    public static Pedido converter(PedidoDTO pedidoDTO, PedidoDAO pedidoDAO) {
        return new Pedido(pedidoDAO.getList().size() + 1, pedidoDTO.getClienteId(), pedidoDTO.getProdutos());
    }

    public static List<PedidoDTO> converter(List<Pedido> pedidos) {
        return pedidos.stream().map(ent -> new PedidoDTO(ent)).collect(Collectors.toList());
    }
}
