package modulo5.dakar;

public class Veiculo {
    private double aceleracao;
    private double anguloDeGiro;
    private double peso;
    private String placa;
    private int rodas;
    private double velocidade;

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(double anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public Veiculo() {}

    public Veiculo(double aceleracao, double anguloDeGiro, String placa, double velocidade) {
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return String.format("Placa: %s - Tipo: %s", this.placa, this instanceof Carros ? "Carro" : "Moto");
    }
}
