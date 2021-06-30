package modulo5.dakar;

public class Motos extends Veiculo {
    public Motos() {
        this.setPeso(300);
        this.setRodas(2);
    }

    public Motos(double aceleracao, double anguloDeGiro, String placa, double velocidade) {
        super(aceleracao, anguloDeGiro, placa, velocidade);
        this.setPeso(300);
        this.setRodas(2);
    }
}
