package modulo5.dakar;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Corrida {
    private double distancia;
    private String nome;
    private double premioEmDolares;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos = new ArrayList<>();
    private SocorristaCarro socorristaCarro = new SocorristaCarro();
    private SocorristaMoto socorristaMoto = new SocorristaMoto();

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPremioEmDolares() {
        return premioEmDolares;
    }

    public void setPremioEmDolares(double premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public int getQuantidadeVeiculosPermitidos() {
        return quantidadeVeiculosPermitidos;
    }

    public void setQuantidadeVeiculosPermitidos(int quantidadeVeiculosPermitidos) {
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public Corrida(double distancia, String nome, double premioEmDolares, int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.nome = nome;
        this.premioEmDolares = premioEmDolares;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    private boolean checarQuantidadeDeVeiculos() {
        if (listaVeiculos.size() >= this.quantidadeVeiculosPermitidos) {
            System.out.println("Não é possível adicionar mais veículos na corrida");

            return true;
        }

        return false;
    }

    public void registrarCarro(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        if (checarQuantidadeDeVeiculos()) return;

        listaVeiculos.add(new Carros(aceleracao, anguloDeGiro, placa, velocidade));
    }

    public void registrarMoto(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        if (checarQuantidadeDeVeiculos()) return;

        listaVeiculos.add(new Motos(aceleracao, anguloDeGiro, placa, velocidade));
    }

    public void removerVeiculo(Veiculo veiculo) {
        listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa) {
        listaVeiculos.removeIf(v -> v.getPlaca() == placa);
    }

    public Veiculo defineVencedor() {
        AtomicReference<Veiculo> vencedor = new AtomicReference<>();
        AtomicReference<Double> valorMaximo = new AtomicReference<>((double) 0);

        listaVeiculos.forEach(v -> {
            double veiculoValor = v.getVelocidade() * v.getAceleracao() / (v.getAnguloDeGiro() * (v.getPeso() - v.getRodas() * 100));

            if (veiculoValor > valorMaximo.get()) {
                valorMaximo.set(veiculoValor);
                vencedor.set(v);
            }
        });

        return vencedor.get();
    }

    private Veiculo encontraVeiculoPorPlaca(String placa) {
        return listaVeiculos
                .stream()
                .filter(v -> v.getPlaca() == placa)
                .findFirst()
                .orElse(null);
    }

    public void socorrerCarro(String documento) {
        Carros carroSocorrido = (Carros) encontraVeiculoPorPlaca(documento);

        this.socorristaCarro.socorrer(carroSocorrido);
    }

    public void socorrerMoto(String documento) {
        Motos motoSocorrida = (Motos) encontraVeiculoPorPlaca(documento);

        this.socorristaMoto.socorrer(motoSocorrida);
    }
}
