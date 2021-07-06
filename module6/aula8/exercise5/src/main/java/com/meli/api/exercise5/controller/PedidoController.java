package com.meli.api.exercise5.controller;

import com.meli.api.exercise5.dao.ClienteDAO;
import com.meli.api.exercise5.dao.PedidoDAO;
import com.meli.api.exercise5.dao.ProdutoDAO;
import com.meli.api.exercise5.dto.PedidoDTO;
import com.meli.api.exercise5.dto.ProdutoDTO;
import com.meli.api.exercise5.entity.Cliente;
import com.meli.api.exercise5.entity.Pedido;
import com.meli.api.exercise5.entity.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    ClienteDAO clienteDAO = new ClienteDAO();
    PedidoDAO pedidoDAO = new PedidoDAO();
    ProdutoDAO produtoDAO = new ProdutoDAO();

    @PostMapping
    public ResponseEntity<Pedido> createPedido(@RequestBody PedidoDTO pedidoDTO, UriComponentsBuilder uriBuilder) {
        Pedido novoPedido = PedidoDTO.converter(pedidoDTO, pedidoDAO);
        Cliente cliente = clienteDAO.getCliente(novoPedido.getClienteId());

        pedidoDAO.addPedido(novoPedido);
        cliente.addPedido(novoPedido);

        URI uri = uriBuilder.path("pedidos/{id}").buildAndExpand(novoPedido.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/{id}")
    public PedidoDTO getPedido(@PathVariable long id) {
        Pedido pedido = pedidoDAO.getPedido(id);

        return PedidoDTO.converter(pedido);
    }

    @GetMapping
    public List<PedidoDTO> getAllPedidos() {
        List<Pedido> pedidos = pedidoDAO.getList();

        return PedidoDTO.converter(pedidos);
    }

    @PostMapping("/{id}/addProduto/{produtoId}")
    public PedidoDTO addProduto(@PathVariable long id, @PathVariable long produtoId) {
        Pedido pedido = pedidoDAO.getPedido(id);

        Produto produto = produtoDAO.getProduto(produtoId);

        pedido.addProduto(produto);

        return PedidoDTO.converter(pedido);
    }
}
