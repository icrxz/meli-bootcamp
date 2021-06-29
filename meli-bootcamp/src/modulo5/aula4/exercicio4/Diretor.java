package modulo5.aula4.exercicio4;

import java.math.BigDecimal;

public class Diretor extends CLT{
    private double lucroEmpresa;

    public double getLucroEmpresa() {
        return lucroEmpresa;
    }

    public void setLucroEmpresa(double lucroEmpresa) {
        this.lucroEmpresa = lucroEmpresa;
    }

    public Diretor() {
        this.cargo = Cargos.DIRETOR;
        this.horasSemanais = 0;
        this.bonificacao = 0.03;
        this.salarioBase = 15000.00;
    }

    public Diretor(String nome, double lucroEmpresa) {
        this();
        this.nome = nome;
        this.lucroEmpresa = lucroEmpresa;
    }

    @Override
    public void pagarSalario() {
        BigDecimal salarioCalculado = BigDecimal.valueOf(this.salarioBase + (lucroEmpresa * this.bonificacao));

        System.out.println(String.format("Devera ser pago R$%.2f para o %s", salarioCalculado, this.nome));
    }
}
