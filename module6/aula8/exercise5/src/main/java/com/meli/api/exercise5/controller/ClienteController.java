package com.meli.api.exercise5.controller;

import com.meli.api.exercise5.dao.ClienteDAO;
import com.meli.api.exercise5.dto.ClienteDTO;
import com.meli.api.exercise5.dto.PedidoDTO;
import com.meli.api.exercise5.entity.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    ClienteDAO clienteDAO = new ClienteDAO();

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody ClienteDTO clienteDTO, UriComponentsBuilder uriBuilder) {
        Cliente novoCliente = ClienteDTO.converter(clienteDTO, clienteDAO);

        clienteDAO.addCliente(novoCliente);

        URI uri = uriBuilder.path("clientes/{id}").buildAndExpand(novoCliente.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/{id}")
    public ClienteDTO getCliente(@PathVariable long id) {
        Cliente cliente = clienteDAO.getCliente(id);

        return ClienteDTO.converter(cliente);
    }

    @GetMapping
    public List<ClienteDTO> getAllClientes() {
        List<Cliente> clientes = clienteDAO.getList();

        return ClienteDTO.converter(clientes);
    }

    @GetMapping("/{id}/pedidos")
    public List<PedidoDTO> getClientePedidos(@PathVariable long id) {
        Cliente cliente = clienteDAO.getCliente(id);

        return PedidoDTO.converter(cliente.getPedidos());
    }
}
