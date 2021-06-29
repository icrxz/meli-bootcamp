package modulo5.aula4.exercicio2.itens;

import java.util.Scanner;

import static java.lang.System.*;

class ContaCorrente {
    private String conta;
    private String agencia;
    private String titular;
    private double saldo;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        if (this.saldo - valor < 0) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }

    public void devolucao() {

    }

    public void transferencia(ContaCorrente destino, double valor) {
        if (this.saldo - valor < 0) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            destino.deposito(valor);
        }
    }

    public ContaCorrente() {}

    public ContaCorrente(String conta, String agencia, String titular, double saldo) {
        this.conta = conta;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente contaCopia) {
        this.conta = contaCopia.getConta();
        this.saldo = contaCopia.getSaldo();
        this.agencia = contaCopia.getAgencia();
        this.titular = contaCopia.getTitular();
    }
}

public class Exercise1 {
    public void exec() {
        ContaCorrente contaPrincipal = criaConta();
        ContaCorrente contaSecundaria = criaConta();

        contaPrincipal.deposito(200.50);
        contaPrincipal.deposito(50);
        out.println("Saldo Conta Principal: " + contaPrincipal.getSaldo());

        contaPrincipal.transferencia(contaSecundaria, 50.50);

        out.println("Saldo Conta Principal: " + contaPrincipal.getSaldo());
        out.println("Saldo Conta Secundaria: " + contaSecundaria.getSaldo());
    }

    private ContaCorrente criaConta() {
        Scanner scanner = new Scanner(in);

        out.println("Digite a agencia: ");
        String agencia = scanner.nextLine();

        out.println("Digite o numero da conta: ");
        String conta = scanner.nextLine();

        out.println("Digite o saldo: ");
        Double saldo = scanner.nextDouble();

        out.println("Digite o titular: ");
        String titular = scanner.nextLine();

        return new ContaCorrente(conta, agencia, titular, saldo);
    }
}
