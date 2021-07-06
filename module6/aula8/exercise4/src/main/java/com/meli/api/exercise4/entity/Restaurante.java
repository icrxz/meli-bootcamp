package com.meli.api.exercise4.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private BigDecimal caixaTotal = BigDecimal.ZERO;
    private List<Mesa> mesas;

    public BigDecimal getCaixaTotal() {
        return caixaTotal;
    }

    public void setCaixaTotal(BigDecimal caixaTotal) {
        this.caixaTotal = caixaTotal;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void adicionarMesa(Mesa mesa) {
        this.mesas.add(mesa);
    }

    public void adicionarCaixa(BigDecimal value) {
        this.caixaTotal.add(value);
    }

    public Restaurante() {
        mesas = new ArrayList<>();
    }
}
