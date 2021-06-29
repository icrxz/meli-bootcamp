package modulo5.aula4.exercicio4;

import java.math.BigDecimal;

public class PJ extends Funcionario {
    public PJ() {}

    public PJ(String nome, double salarioBase, int horasTrabalhadas) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasSemanais = horasTrabalhadas;
    }

    @Override
    public void pagarSalario() {
        BigDecimal salarioCalculado = BigDecimal.valueOf(this.salarioBase * this.horasSemanais);

        System.out.println(String.format("Devera ser pago R$%.2f para o %s", salarioCalculado, this.nome));
    }
}
