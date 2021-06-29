package modulo5.aula5.exercicio2;

public class Pessoa implements Precedente<Pessoa> {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa() {}

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public int precedeA(Pessoa pessoa) {
        return this.cpf.compareTo(pessoa.getCpf());
    }

    @Override
    public String toString() {
        return String.format("Nome: %s - CPF: %s", this.nome, this.cpf);
    }
}
