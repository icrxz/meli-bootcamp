package modulo5.aula4.exercicio4;

public class Analista extends CLT{
    public Analista() {
        this.cargo = Cargos.ANALISTA;
        this.horasSemanais = 44;
        this.bonificacao = 0.08;
        this.salarioBase = 4000.00;
    }

    public Analista(String nome, int metas) {
        this();
        this.metaBatida = metas;
        this.nome = nome;
    }
}
