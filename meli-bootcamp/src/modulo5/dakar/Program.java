package modulo5.dakar;

public class Program {
    public static void main(String[] args) {
        Corrida corrida = new Corrida(10.7, "Paris-Dakar", 175000, 5);

        corrida.registrarCarro(7.9, 4.5, 3.2, "ABC-1234");
        corrida.registrarCarro(6.9, 6.8, 8.7, "QWE-1234");
        corrida.registrarCarro(8.3, 4.6, 4.4, "ABC-5678");
        corrida.registrarMoto(9.9, 2.6, 5.3, "QWE-1567");
        corrida.registrarMoto(8.9, 4.4, 1.6, "ZXC-1234");
        corrida.registrarMoto(10.9, 4.6, 2.5, "KLJ-54738");

        corrida.removerVeiculoPorPlaca("ZXC-1234");

        corrida.socorrerCarro("ABC-1234");
        corrida.socorrerMoto("QWE-1567");

        Veiculo vencedor = corrida.defineVencedor();

        System.out.println("Vencedor: " + vencedor.toString());
    }
}
