package Collections.map;

import java.util.Hashtable;

public class ExemploHashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Henrique", 10);
        estudantes.put("Julia", 8);
        estudantes.put("Francisca", 9);

        System.out.println(estudantes);

    }

}
