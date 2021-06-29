package modulo5.aula5.exercicio2;

public class Program {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Igor", "111.111.111-11");
        Pessoa p2 = new Pessoa("Matheus", "444.444.444-44");
        Pessoa p3 = new Pessoa("Isabela", "222.222.222-22");
        Pessoa p4 = new Pessoa("Luis", "666.666.666-66");
        Pessoa p5 = new Pessoa("Douglas", "333.333.333-33");
        Pessoa p6 = new Pessoa("Andre", "555.555.555-55");

        Pessoa[] pessoas = {p1, p2, p3, p4, p5, p6};

        SortUtil.sort(pessoas);

        for (Pessoa p: pessoas) {
            System.out.println(p.toString());
        }

        System.out.println();

        Celular c1 = new Celular("(83)98523-2740", "Diego");
        Celular c2 = new Celular("(14)3753-8982", "João");
        Celular c3 = new Celular("(12)98145-9264", "Isabela");
        Celular c4 = new Celular("(65)98962-6371", "Leticia");
        Celular c5 = new Celular("(65)98290-0862", "Igor");

        Celular[] celulares = {c1, c2, c3, c4, c5};

        SortUtil.sort(celulares);

        for (Celular c: celulares) {
            System.out.println(c.toString());
        }
    }
}
