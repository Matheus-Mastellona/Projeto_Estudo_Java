package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> listaAprovado = new HashSet<>();
        listaAprovado.add("Ana");
        listaAprovado.add("Carlos");
        listaAprovado.add("Luca");
        listaAprovado.add("Pedro");

        for (String candidato : listaAprovado) {
            System.out.println(candidato);
        }

        System.out.println();

        // ordenado

        Set<String> listaReprovados = new TreeSet<>();
        listaReprovados.add("Bruna");
        listaReprovados.add("Joao");
        listaReprovados.add("Matheus");
        listaReprovados.add("Pedro");

        for (String candidato : listaReprovados) {
            System.out.println(candidato);
        }

        System.out.println(); // garantindo ordem de inserção ... SortedSet também serve como ordenação,
                              // podendo substituir no "Set"

        SortedSet<String> lista = new TreeSet<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");

        for (String letras : lista) {
            System.out.println(letras);
        }

    }
}
