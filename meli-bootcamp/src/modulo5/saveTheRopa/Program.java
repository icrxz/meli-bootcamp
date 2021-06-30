package modulo5.saveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        GuardaRoupa guardaRoupa = new GuardaRoupa();

        List<Vestuario> vestuarios1 = new ArrayList<>();
        vestuarios1.add(new Vestuario("Prada", "Camiseta"));
        vestuarios1.add(new Vestuario("Gucci", "Jaqueta"));
        vestuarios1.add(new Vestuario("Louis Vuitton", "Calca"));

        List<Vestuario> vestuarios2 = new ArrayList<>();
        vestuarios2.add(new Vestuario("Puma", "Camiseta"));
        vestuarios2.add(new Vestuario("Nike", "Jaqueta"));
        vestuarios2.add(new Vestuario("Nike", "Tenis"));

        Integer id1 = guardaRoupa.guardarVestuarios(vestuarios1);
        Integer id2 = guardaRoupa.guardarVestuarios(vestuarios2);

        guardaRoupa.mostrarVestuarios();

        System.out.println("----------------------------------------------------------------");

        List<Vestuario> v1 = guardaRoupa.devolverVestuario(id1);

        guardaRoupa.mostrarVestuarios();

        System.out.println("----------------------------------------------------------------");

        List<Vestuario> v2 = guardaRoupa.devolverVestuario(id2);

        guardaRoupa.mostrarVestuarios();

        System.out.println("----------------------------------------------------------------");

        v1.stream().forEach(v -> System.out.println(v.toString()));

        System.out.println("----------------------------------------------------------------");

        v2.stream().forEach(v -> System.out.println(v.toString()));
    }
}
