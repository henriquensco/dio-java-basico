package Collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExempleList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Henrique");
        nomes.add("Carlos");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("Anderson");
        nomes.add("João");

        nomes.set(2, "Larissa");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        String nome = nomes.get(2);

        System.out.println(nome);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Anderson");

        System.out.println(temAnderson);

        //nomes.clear();

        boolean listaEstaVazia = nomes.isEmpty();

        System.out.println(listaEstaVazia);

        for (String nomeDoItem: nomes) {

            System.out.println("==>" + nomeDoItem);

        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {

            System.out.println("===>" + iterator.next());

        }

    }

}
