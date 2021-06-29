package modulo5.aula4.exercicio2;

import java.util.Scanner;
import static java.lang.System.*;
import modulo5.aula4.exercicio2.itens.*;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        out.println("1 - Conta Corrente");
        out.println("2 - Contador");
        out.println("3 - Livros");
        out.println("4 - Fração");
        out.println("5 - Datas");
        out.println("6 - String utils");
        out.println("0 - Sair");
        out.println();

        while (true) {
            out.print("Digite qual exercicio voce quer: ");

            int option = scan.nextInt();

            switch (option) {
                case 1:
                    new Exercise1().exec();
                    break;
                case 2:
                    Exercise2.exec();
                    break;
                case 3:
                    Exercise3.exec();
                    break;
                case 4:
                    Exercise4.exec();
                    break;
                case 5:
                    Exercise5.exec();
                    break;
                case 6:
                    Exercise6.exec();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opcao nao encontrada");
            }

            out.println();
        }
    }
}
