package Collections.set;

import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Belo Horizonte");
        treeCapitais.add("São Paulo");

        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        // Retorna a última capital no final da árvore
        System.out.println(treeCapitais.last());

        // Retorna a primeira capital abaixo na árvore parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        // Retorna a primeira capital acima na árvore parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        // Retorna a primeira capital no topo da árvore, removendo-o do set
        System.out.println(treeCapitais.pollFirst());

        // Retorna a primeira capital no final da árvore, removendo-o do set
        System.out.println(treeCapitais.pollLast());

        // Exibe todas as capitais no console
        System.out.println(treeCapitais);

    }

}
