package lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        /*
         * Java não permite conversão direta, seu não passar no apply o valor double,
         * sendo real, com "." ele não converte;
         * NÃO: int -> Double
         * double -> Double
         */

        BinaryOperator<Double> calculo = (x, y) -> {
            return x + y;
        };
        System.out.println(calculo.apply(2.0, 3.0)); // Alterado de 1 para 1.0

        calculo = (x, y) -> x * y;
        System.out.println(calculo.apply(2.0, 3.0)); // Alterado de 1 para 1.0

        BinaryOperator<Integer> calculo1 = (x, y) -> {
            return x + y;
        };
        System.out.println(calculo1.apply(2, 3));

        calculo1 = (x, y) -> x * y;
        System.out.println(calculo1.apply(2, 3));

        /*
         * System.out.println(calculo.legal());
         * System.out.println(calculo.legal());
         * System.out.println(Calculo.muitoLegal());
         */
    }
}
