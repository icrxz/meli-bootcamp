package modulo5.aula5.exercicio3;

import modulo5.aula5.exercicio3.Armas.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Igor", PersonaClasses.MAGO, 42);

        List<Arma> arsenal = new ArrayList<>();
        arsenal.add(new Arco("Arco do Legolas", RaridadeArma.LENDARIO, 7.1, 8.2));
        arsenal.add(new Cetro("Cetro de Gandalf", RaridadeArma.LENDARIO, 7.2, 9.4));
        arsenal.add(new Adaga("Adagas sombrias", RaridadeArma.RARO, 8.9));
        arsenal.add(new Espada("Espada quebrada", RaridadeArma.NORMAL, 4.7));

        Collections.sort(arsenal, new Comparator<Arma>() {
            @Override
            public int compare(Arma o1, Arma o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        arsenal.forEach(arma -> {
            p1.setArma(arma);

            System.out.println(p1.toString());

            p1.ataqueNormal();
            p1.ataqueEspecial();

            System.out.println();
        });
    }
}
