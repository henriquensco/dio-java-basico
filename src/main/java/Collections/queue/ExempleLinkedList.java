package Collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExempleLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Henrique");
        filaBanco.add("Roberto");
        filaBanco.add("Patrícia");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);

        //filaBanco.clear();

        String primeiroClienteErro = filaBanco.element();

        System.out.println(primeiroClienteErro);

        System.out.println(filaBanco);

        for (String cliente: filaBanco) {
            System.out.println(cliente);
        }

        Iterator<String> iteratorFilaBranco = filaBanco.iterator();

        while (iteratorFilaBranco.hasNext()) {
            System.out.println("==>" + iteratorFilaBranco.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());

        filaBanco.add("Henry");

        System.out.println(filaBanco);

    }

}
