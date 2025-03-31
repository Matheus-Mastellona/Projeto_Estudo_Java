package lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional...");
        for (String string : aprovados) {
            System.out.println(string);
        }

        System.out.println("\nLambda #01...");
        aprovados.forEach((nome) -> System.out.println(nome + "!!!"));

        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println);
    }
}