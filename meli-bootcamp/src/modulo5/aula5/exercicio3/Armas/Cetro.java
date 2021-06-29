package modulo5.aula5.exercicio3.Armas;

import modulo5.aula5.exercicio3.PersonaClasses;
import modulo5.aula5.exercicio3.Personagem;

import static java.lang.System.out;

public class Cetro extends Arma {
    private double danoMagico;

    public double getDanoMagico() {
        return danoMagico;
    }

    public void setDanoMagico(double danoMagico) {
        this.danoMagico = danoMagico;
    }

    public Cetro(String nome, RaridadeArma raridade, double danoBasico, double danoMagico) {
        super(nome, raridade, danoBasico);
        this.danoMagico = danoMagico;
    }

    public void ataqueMagico(Personagem p) {
        double multiplicador = p.getClasse() == PersonaClasses.MAGO ? 1.5 : 1;

        out.println("Ataque magico: Dano " + danoMagico * multiplicador);
    }
}
