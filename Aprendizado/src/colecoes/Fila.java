package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> Adicionam elementos na fila
        // Diferença é o comportamento que ocorre quando a fila está cheia
        // .add() lançará uma exceção caso a fila esteja cheia.
        // .offer() retorna falso caso a fila esteja cheia.

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> obter o próximo elemento da fial (sem remover)
        System.out.println(fila.peek()); // lança exceção
        System.out.println(fila.element()); // retorna false

        // fila.size()
        // fila.clear();
        // fila.isEmpty()
        
        System.out.println(fila.poll()); // retorna null
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // Lança uma exceção

    }
}
