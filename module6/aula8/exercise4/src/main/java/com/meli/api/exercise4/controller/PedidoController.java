package com.meli.api.exercise4.controller;

import com.meli.api.exercise4.dao.MesaDAO;
import com.meli.api.exercise4.dao.PedidoDAO;
import com.meli.api.exercise4.dao.PratoDAO;
import com.meli.api.exercise4.dto.PedidoDTO;
import com.meli.api.exercise4.entity.Mesa;
import com.meli.api.exercise4.entity.Pedido;
import com.meli.api.exercise4.entity.Prato;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RequestMapping("/pedidos")
@RestController
public class PedidoController {
    MesaDAO mesaDAO = new MesaDAO();
    PedidoDAO pedidoDAO = new PedidoDAO();
    PratoDAO pratoDAO = new PratoDAO();

    @PostMapping
    public ResponseEntity<Pedido> createPedido(@RequestBody PedidoDTO pedidoDTO, UriComponentsBuilder uriBuilder) {
        Pedido pedido = PedidoDTO.converter(pedidoDTO, pedidoDAO);
        pedidoDAO.create(pedido);

        Mesa mesa = mesaDAO.get(pedido.getMesa());
        mesa.adicionarPedido(pedido);

        URI uri = uriBuilder.path("/pedidos/{id}").buildAndExpand(pedido.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PostMapping("/{id}/addPrato/{pratoId}")
    public ResponseEntity<Pedido> addPrato(@PathVariable long pratoId, @PathVariable long id) {
        Prato prato = pratoDAO.get(pratoId);
        Pedido pedido = pedidoDAO.get(id);

        pedido.addPrato(prato);

        return ResponseEntity.ok(pedido);
    }

    @RequestMapping("/{id}")
    public PedidoDTO getPedido(@PathVariable long id) {
        Pedido pedido = pedidoDAO.get(id);
        PedidoDTO pedidoDTO = PedidoDTO.converter(pedido);

        return pedidoDTO;
    }
}
