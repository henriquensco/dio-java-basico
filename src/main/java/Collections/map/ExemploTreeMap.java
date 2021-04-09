package Collections.map;

import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> capitais = new TreeMap<>();

        capitais.put("MA", "São Luis");
        capitais.put("PI", "Teresina");
        capitais.put("CE", "Fortaleza");
        capitais.put("BA", "Salvador");

        System.out.println(capitais);

        // Retorna a primeira capital no topo da árvore
        System.out.println(capitais.firstKey());

        // Retorna a ultima capital no final da árvore
        System.out.println(capitais.lastKey());

        // Retorna a primeira capital no topo parametrizada
        System.out.println(capitais.higherKey("MA"));

    }

}
