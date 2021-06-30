package modulo5.laChiqui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evento {
    private List<Convidado> convidados = new ArrayList<>();
    private Map<Integer, List<FogoArtificio>> fogos = new HashMap<>();
    private Integer fogosCounter = 0;

    public void adicionarConvidado(Convidado convidado) {
        convidados.add(convidado);
    }

    public void adicionarFogos(FogoArtificio fogo) {
        List<FogoArtificio> listaFogos = new ArrayList<>();
        listaFogos.add(fogo);

        fogos.put(fogosCounter, listaFogos);
        fogosCounter++;
    }

    public void adicionarFogos(List<FogoArtificio> listaFogos) {
        fogos.put(fogosCounter, listaFogos);
        fogosCounter++;
    }

    public Map<Integer, List<FogoArtificio>> getFogos() {
        return fogos;
    }

    public void apagarVelas() {
        estourarFogos();
        System.out.println();
        distribuirBolo();
    }

    private void estourarFogos() {
        System.out.println("Estourando fogos");

        fogos.values().forEach(listaF -> listaF.forEach(FogoArtificio::estourar));
    }

    private void distribuirBolo() {
        System.out.println("Servindo bolos");

        convidados.forEach(c -> {
            c.comerBolo();

            if (c instanceof ConvidadoMeli)
                System.out.println(c.getNome() + " gritou: Viva la Chiqui!!");
        });
    }
}
