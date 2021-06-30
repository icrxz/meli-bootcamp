package modulo5.laChiqui;

public class FogoArtificio {
    private String barulhoExplosao;

    public String getBarulhoExplosao() {
        return barulhoExplosao;
    }

    public void setBarulhoExplosao(String barulhoExplosao) {
        this.barulhoExplosao = barulhoExplosao;
    }

    public FogoArtificio(String barulhoExplosao) {
        this.barulhoExplosao = barulhoExplosao;
    }

    public void estourar() {
        System.out.println(this.getBarulhoExplosao());
    }
}
