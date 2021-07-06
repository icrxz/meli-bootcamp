package com.meli.api.exercise4.dto;

import com.meli.api.exercise4.dao.PratoDAO;
import com.meli.api.exercise4.entity.Prato;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class PratoDTO {
    private BigDecimal preco;
    private String descricao;
    private int quantidade;

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public PratoDTO() {
    }

    public PratoDTO(Prato p) {
        this.descricao = p.getDescricao();
        this.preco = p.getPreco();
        this.quantidade = p.getQuantidade();
    }

    public static PratoDTO converter(Prato prato) {
        return new PratoDTO(prato);
    }

    public static Prato converter(PratoDTO pratoDTO, PratoDAO pratoDAO) {
        return new Prato(pratoDAO.getList().size() + 1, pratoDTO.getPreco(), pratoDTO.getDescricao(), pratoDTO.getQuantidade());
    }

    public static List<PratoDTO> converter(List<Prato> pratos) {
        return pratos.stream().map(ent -> new PratoDTO(ent)).collect(Collectors.toList());
    }
}
