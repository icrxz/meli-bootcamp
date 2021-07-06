package com.meli.api.exercise5.dto;

import com.meli.api.exercise5.dao.ClienteDAO;
import com.meli.api.exercise5.entity.Cliente;
import com.meli.api.exercise5.entity.Pedido;

import java.util.List;
import java.util.stream.Collectors;

public class ClienteDTO {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private List<Pedido> pedidos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ClienteDTO() {
    }

    public ClienteDTO(Cliente cliente) {
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.nome = cliente.getNome();
        this.telefone = cliente.getTelefone();
        this.pedidos = cliente.getPedidos();
    }

    public static Cliente converter(ClienteDTO clienteDTO, ClienteDAO clienteDAO) {
        return new Cliente(
                clienteDAO.getList().size() + 1,
                clienteDTO.nome,
                clienteDTO.cpf,
                clienteDTO.email,
                clienteDTO.telefone,
                clienteDTO.pedidos
        );
    }

    public static ClienteDTO converter(Cliente cliente) {
        return new ClienteDTO(cliente);
    }

    public static List<ClienteDTO> converter(List<Cliente> clientes) {
        return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
    }
}
