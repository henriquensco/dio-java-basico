package Collections.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handbol");

        //Altera o valor da posição 2 do vetor
        esportes.set(2, "Ping Pong");

        //Remove o esporte da posição 2 | por indice
        esportes.remove(2);

        //Remove o esporte Handbol do vetor | por nome
        esportes.remove("Handbol");

        //Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        //Navega nos esportes
        for (String esporte: esportes) {
            System.out.println(esporte);
        }

    }

}
