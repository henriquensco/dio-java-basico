package Collections.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExemplo {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Henrique", 19));
        estudantes.add(new Estudante("Pedro", 23));
        estudantes.add(new Estudante("João", 17));

        System.out.println("---- ordem de inserçao ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("--- ordem natural dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("--- ordem reversa dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("--- ordem reversa dos números - idade --- (Method reference)");
        System.out.println(estudantes);

        Collections.sort(estudantes);
        System.out.println("--- ordem natural dos números - idade --- (Interface Comparable)");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemReversaComparator());
        System.out.println("--- ordem reversa dos números - idade --- (Interface comparator)");
        System.out.println(estudantes);

    }

}
