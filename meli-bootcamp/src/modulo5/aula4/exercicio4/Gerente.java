package modulo5.aula4.exercicio4;

public class Gerente extends CLT{
    public Gerente() {
        this.cargo = Cargos.GERENTE;
        this.horasSemanais = 40;
        this.bonificacao = 0.125;
        this.salarioBase = 6000.00;
    }

    public Gerente(String nome, int metas) {
        this();
        this.metaBatida = metas;
        this.nome = nome;
    }
}
