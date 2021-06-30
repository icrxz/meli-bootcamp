package modulo5.dakar;

public class SocorristaCarro extends Carros{
    public void socorrer(Carros carro) {
        System.out.println("Socorrendo carro " + carro.getPlaca());
    }
}
