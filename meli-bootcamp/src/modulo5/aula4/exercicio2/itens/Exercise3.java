package modulo5.aula4.exercicio2.itens;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

class Book {
    private String titulo;
    private String autor;
    private String codigo;
    private int quantidade;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void devolver() {
        this.quantidade++;
    }

    public void emprestimo() {
        if (quantidade > 0)
            this.quantidade--;
        else
            out.println("Não ha livros disponiveis para emprestimo");
    }

    public Book() {}

    public Book(String titulo, String autor, String codigo, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", titulo, codigo, autor);
    }
}

public class Exercise3 {
    public static void exec() {
        Scanner scanner = new Scanner(in);

        out.println("Digite o titulo: ");
        String titulo = scanner.nextLine();

        out.println("Digite o autor: ");
        String autor = scanner.nextLine();

        out.println("Digite o codigo: ");
        String codigo = scanner.nextLine();

        out.println("Digite a quantidade de livros: ");
        int quantidade = scanner.nextInt();

        Book b1 = new Book(titulo, autor, codigo, quantidade);

        out.println(b1.toString());

        b1.emprestimo();

        out.println(b1.getQuantidade());
    }
}
