package modulo5.saveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private Map<Integer, List<Vestuario>> dictionary = new HashMap<>();
    private static int counter = 1;

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        dictionary.put(counter, listaDeVestuario);
        counter++;

        return counter - 1;
    }

    public void mostrarVestuarios() {
        if (dictionary.size() == 0) {
            System.out.println("Guarda roupa está vazio");
            return;
        }

        for (Map.Entry<Integer, List<Vestuario>> lista: dictionary.entrySet()) {
            System.out.println("Lista de vestiario " + lista.getKey());

            lista.getValue().forEach(v -> System.out.println(v.toString()));
            System.out.println();
        }
    }

    public List<Vestuario> devolverVestuario(Integer id) {
        return dictionary.remove(id);
    }
}
