package modulo5.aula4.exercicio2.itens;

class Fracao {
    private int divisor;
    private int dividendo;

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public static double soma(int divisor, int dividendo) {
        return 0;
    }

    public static double subtracao(int divisor, int dividendo) {
        return 0;
    }

    public static double multiplicacao(int divisor, int dividendo) {
        return 0;
    }

    public static double divisao(int divisor, int dividendo) {
        return 0;
    }

    public static double soma(int num) {
        return 0;
    }

    public static double subtracao(int num) {
        return 0;
    }

    public static double multiplicacao(int num) {
        return 0;
    }

    public static double divisao(int num) {
        return 0;
    }

    public Fracao() {}

    public Fracao(int divisor, int dividendo) {
        this.divisor = divisor;
        this.dividendo = dividendo;
    }
}

public class Exercise4 {
    public static void exec() {
        Fracao f1 = new Fracao(1, 2);
    }
}
