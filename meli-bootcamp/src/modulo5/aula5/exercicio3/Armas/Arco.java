package modulo5.aula5.exercicio3.Armas;

import modulo5.aula5.exercicio3.PersonaClasses;
import modulo5.aula5.exercicio3.Personagem;

import static java.lang.System.out;

public class Arco extends Arma {
    private double danoDistancia;

    public double getDanoDistancia() {
        return danoDistancia;
    }

    public void setDanoDistancia(double danoDistancia) {
        this.danoDistancia = danoDistancia;
    }

    public Arco(String nome, RaridadeArma raridade, double danoBasico, double danoDistancia) {
        super(nome, raridade, danoBasico);
        this.danoDistancia = danoDistancia;
    }

    public void ataqueDistancia(Personagem p) {
        double multiplicador = p.getClasse() == PersonaClasses.ARQUEIRO ? 1.5 : 1;

        out.println("Ataque a distancia: Dano " + danoDistancia * multiplicador);
    }
}
