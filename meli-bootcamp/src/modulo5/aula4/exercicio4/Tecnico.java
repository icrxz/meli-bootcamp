package modulo5.aula4.exercicio4;

public class Tecnico extends CLT{
    public Tecnico() {
        this.cargo = Cargos.TECNICO;
        this.horasSemanais = 40;
        this.bonificacao = 0.05;
        this.salarioBase = 3200.00;
    }

    public Tecnico(String nome, int metas) {
        this();
        this.metaBatida = metas;
        this.nome = nome;
    }
}
