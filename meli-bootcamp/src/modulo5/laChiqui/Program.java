package modulo5.laChiqui;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Evento evento = new Evento();

        evento.adicionarConvidado(new ConvidadoStandard("Jorge"));
        evento.adicionarConvidado(new ConvidadoStandard("Manoel"));
        evento.adicionarConvidado(new ConvidadoMeli("Igor"));
        evento.adicionarConvidado(new ConvidadoStandard("Douglas"));
        evento.adicionarConvidado(new ConvidadoMeli("Joao"));
        evento.adicionarConvidado(new ConvidadoMeli("Matheus"));
        evento.adicionarConvidado(new ConvidadoStandard("Lucas"));
        evento.adicionarConvidado(new ConvidadoMeli("Luis"));

        evento.adicionarFogos(new FogoArtificio("Kabum"));
        evento.adicionarFogos(new FogoArtificio("Catapum"));
        evento.adicionarFogos(new FogoArtificio("Bloooow"));

        List<FogoArtificio> fogos = new ArrayList<>();
        fogos.add(new FogoArtificio("Psiuuuuu"));
        fogos.add(new FogoArtificio("Pow pow pow"));
        fogos.add(new FogoArtificio("Pa Pum"));

        evento.adicionarFogos(fogos);

        evento.apagarVelas();
    }
}
