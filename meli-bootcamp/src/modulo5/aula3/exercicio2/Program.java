package modulo5.aula3.exercicio2;

import java.util.Scanner;
import static java.lang.System.*;
import modulo5.aula3.exercicio2.itens.*;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        out.println("1 - Ordenacao de array");
        out.println("2 - Crescimento da empresa");
        out.println("3 - Cadastro de produtos");
        out.println("0 - Sair");
        out.println();

        while(true) {
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
                case 0:
                    return;
                default:
                    System.out.println("Opcao nao encontrada");
            }

            out.println();
        }
    }
}
