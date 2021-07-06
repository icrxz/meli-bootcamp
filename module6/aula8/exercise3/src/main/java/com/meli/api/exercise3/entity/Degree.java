package com.meli.api.exercise3.entity;

public class Degree {
    private String mensagem;
    private double media;
    private String aluno;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public Degree() {
    }

    public Degree(double media, String aluno) {
        this.mensagem = media < 9.0 ? "Voce esta formado" : "Parabens!! Aqui esta o seu diploma";
        this.media = media;
        this.aluno = aluno;
    }
}
