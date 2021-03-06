package modulo5.aula5.exercicio2;

import java.util.Comparator;

public class Celular implements Precedente<Celular> {
    private String numero;
    private String holder;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Celular() {}

    public Celular(String numero, String holder) {
        this.numero = numero;
        this.holder = holder;
    }

    @Override
    public int precedeA(Celular celular) {
        Comparator<Celular> comparaPeloNumero = Comparator.comparing(Celular::getNumero);
        return comparaPeloNumero.compare(this, celular);
    }

    @Override
    public String toString() {
        return String.format("Holder: %s - Numero: %s", this.holder, this.numero);
    }
}
