package modulo5.aula5.exercicio3.Armas;

import static java.lang.System.out;

public class Adaga extends Arma {
    public Adaga(String nome, RaridadeArma raridade, double danoBasico) {
        super(nome, raridade, danoBasico);
    }

    @Override
    public void atacar() {
        out.println("Ataque rapid: Dano " + this.getDanoBasico() * 2);
    }
}
