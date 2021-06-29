package modulo5.aula4.exercicio4;

import java.math.BigDecimal;

public abstract class CLT extends Funcionario {
    protected int metaBatida;
    protected double bonificacao;
    protected Cargos cargo;

    public int getMetaBatida() {
        return metaBatida;
    }

    public void setMetaBatida(int metaBatida) {
        this.metaBatida = metaBatida;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public void pagarSalario() {
        BigDecimal salarioCalculado = BigDecimal.valueOf(this.salarioBase + (this.bonificacao * this.metaBatida * this.salarioBase));

        System.out.println(String.format("Devera ser pago R$%.2f para o %s", salarioCalculado, this.nome));
    }
}
