package com.meli.api.exercise5.dto;

import com.meli.api.exercise5.dao.ProdutoDAO;
import com.meli.api.exercise5.entity.Produto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutoDTO {
    private String descricao;
    private String cor;
    private int quantidade;
    private BigDecimal preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public ProdutoDTO(String descricao, String cor, int quantidade, BigDecimal preco) {
        this.descricao = descricao;
        this.cor = cor;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public ProdutoDTO(Produto p) {
        this.descricao = p.getDescricao();
        this.cor = p.getCor();
        this.quantidade = p.getQuantidade();
        this.preco = p.getPreco();
    }

    public static ProdutoDTO converter(Produto produto) {
        return new ProdutoDTO(produto);
    }

    public static Produto converter(ProdutoDTO produtoDTO, ProdutoDAO dao) {
        return new Produto(dao.getList().size() + 1, produtoDTO.descricao, produtoDTO.cor, produtoDTO.quantidade, produtoDTO.preco);
    }

    public static List<ProdutoDTO> converter(List<Produto> produtos) {
        return produtos.stream().map(ProdutoDTO::new).collect(Collectors.toList());
    }
}
