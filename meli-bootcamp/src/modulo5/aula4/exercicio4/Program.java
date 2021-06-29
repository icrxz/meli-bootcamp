package modulo5.aula4.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Tecnico("Jorge", 4));
        funcionarios.add(new Analista("Gabriel", 7));
        funcionarios.add(new Gerente("Lucas", 2));
        funcionarios.add(new Diretor("Manoel", 3000000.52));
        funcionarios.add(new PJ("João", 78.90, 160));

        funcionarios.forEach(f -> f.pagarSalario());
    }
}
