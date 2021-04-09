package Collections.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String, Integer> campeonatoMundialFifa = new HashMap<>();

        campeonatoMundialFifa.put("Brasil", 5);
        campeonatoMundialFifa.put("Alemanha", 4);
        campeonatoMundialFifa.put("Itália", 4);
        campeonatoMundialFifa.put("Uruguai", 2);
        campeonatoMundialFifa.put("Argentina", 2);
        campeonatoMundialFifa.put("França", 6);

        System.out.println(campeonatoMundialFifa);

        // Atualiza o valor para a chave Brasil
        campeonatoMundialFifa.put("Brasil", 6);

        System.out.println(campeonatoMundialFifa);

        // Retorna a Argentina
        System.out.println(campeonatoMundialFifa.get("Argentina"));

        // Remove o campeão França
        campeonatoMundialFifa.remove("França");

        System.out.println(campeonatoMundialFifa);

        // Retorna se existe ou não um campeão França
        System.out.println(campeonatoMundialFifa.containsKey("França"));

        // Navega nos registros do map
        for (Map.Entry<String, Integer> entry: campeonatoMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }

        // Navega nos registros do map
        for (String key: campeonatoMundialFifa.keySet()) {
            System.out.println(key + " --- " + campeonatoMundialFifa.get(key));
        }

    }

}
