package modulo5.aula5.exercicio3.Armas;

public abstract class Arma {
    private String nome;
    private RaridadeArma raridade = RaridadeArma.NORMAL;
    private double danoBasico;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RaridadeArma getRaridade() {
        return raridade;
    }

    public void setRaridade(RaridadeArma raridade) {
        this.raridade = raridade;
    }

    public double getDanoBasico() {
        return danoBasico;
    }

    public void setDanoBasico(double danoBasico) {
        this.danoBasico = danoBasico;
    }

    public Arma() {}

    public Arma(String nome, RaridadeArma raridade, double danoBasico) {
        this.nome = nome;
        this.raridade = raridade;
        this.danoBasico = danoBasico;
    }

    public void atacar() {
        System.out.println("Ataque Basico: Dano " + danoBasico);
    }
}
