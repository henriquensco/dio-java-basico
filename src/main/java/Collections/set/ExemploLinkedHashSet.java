package Collections.set;

import java.util.LinkedHashSet;
import java.util.Iterator;


public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        sequenciaNumerica.remove(4);

        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer sequencia: sequenciaNumerica) {
            System.out.println(sequencia);
        }

    }

}
