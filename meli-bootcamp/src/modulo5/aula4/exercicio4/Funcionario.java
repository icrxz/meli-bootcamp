package modulo5.aula4.exercicio4;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;
    protected int horasSemanais;

    public int getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void pagarSalario() {
        System.out.println(String.format("Devera ser pago R$%.2f para o %s", this.salarioBase, this.nome));
    };
}
