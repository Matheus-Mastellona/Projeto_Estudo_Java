package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class OficinaTestte {
    public static void main(String[] args) {

        Concerto c1 = new Concerto("João", "Peugeot", 2500.99, true);
        Concerto c2 = new Concerto("Jose", "BMW", 10000.54, false);
        Concerto c3 = new Concerto("Camile", "Mercedes", 15000.32, true);
        Concerto c4 = new Concerto("Lucas", "Fiat", 500.53, false);

        List<Concerto> concertos = Arrays.asList(c1, c2, c3, c4);

        Predicate<Concerto> valeAPena = v -> v.getPrecoConcerto() >= 10000;
        Predicate<Concerto> cliente = c -> c.isBomCliente();
        Function<Concerto, String> iremosConcertar = c -> "Olá " + c.getNome()
                + ", estamos com tempo na agenda para lhe atender!";

        concertos.stream()
                .filter(valeAPena)
                .filter(cliente)
                .map(iremosConcertar)
                .forEach(System.out::println);
    }
}
