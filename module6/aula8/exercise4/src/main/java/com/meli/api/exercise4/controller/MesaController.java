package com.meli.api.exercise4.controller;

import com.meli.api.exercise4.dao.MesaDAO;
import com.meli.api.exercise4.dao.RestauranteDAO;
import com.meli.api.exercise4.dto.MesaDTO;
import com.meli.api.exercise4.dto.PedidoDTO;
import com.meli.api.exercise4.entity.Mesa;
import com.meli.api.exercise4.entity.Pedido;
import com.meli.api.exercise4.entity.Restaurante;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.math.BigDecimal;
import java.net.URI;
import java.util.List;


@RequestMapping("/mesas")
@RestController
public class MesaController {
    MesaDAO mesaDAO = new MesaDAO();
    RestauranteDAO restauranteDAO = new RestauranteDAO();

    @PostMapping
    public ResponseEntity<Mesa> createMesa(@RequestBody MesaDTO mesaDTO, UriComponentsBuilder uriBuilder) {
        Mesa mesa = MesaDTO.converter(mesaDTO, mesaDAO);
        mesaDAO.create(mesa);

        restauranteDAO.getRestaurante().adicionarMesa(mesa);

        URI uri = uriBuilder.path("/mesas/{id}").buildAndExpand(mesa.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @RequestMapping("/{id}")
    public MesaDTO getMesa(@PathVariable long id) {
        Mesa mesa = mesaDAO.get(id);
        MesaDTO mesaDTO = MesaDTO.converter(mesa);

        return mesaDTO;
    }

    @RequestMapping("/{id}/pedidos")
    public List<PedidoDTO> getMesaPedidos(@PathVariable long id) {
        Mesa mesa = mesaDAO.get(id);

        return PedidoDTO.converter(mesa.getPedidos());
    }

    @RequestMapping("/{id}/fechar")
    public String fecharMesa(@PathVariable long id) {
        Restaurante restaurante = restauranteDAO.getRestaurante();
        Mesa mesa = mesaDAO.get(id);

        BigDecimal valorMesa = mesa.getValorTotal();

        restaurante.setCaixaTotal(restaurante.getCaixaTotal().add(valorMesa));

        mesa.getPedidos().clear();

        return String.format("Valor da mesa: R$%.2f\nValor do caixa: R$%.2f", valorMesa, restaurante.getCaixaTotal());
    }

}
