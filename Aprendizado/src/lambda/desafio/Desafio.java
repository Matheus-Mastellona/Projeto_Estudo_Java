package lambda.desafio;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import lambda.Produto;

public class Desafio {
    public static void main(String[] args) {

        /*
         * 1. A partir do produto calcular o preco real (com desconto )
         * 2. Imposto Municipal: >= 2500 (8.5%) / < 2500 (Isento)
         * 3. Frete: >= 3000 (100)/ 3000 (50)
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar: R$1234,56
         */

        BinaryOperator<Double> valoProduto = (n1, n2) -> n1 * (1 - n2);

        Function<Double, Double> impostoMunicipal = n1 -> {
            if (n1 >= 2500) {
                return n1 + (n1 * 0.085);
            } else {
                return n1;
            }
        };

        Function<Double, Double> frete = n1 -> {
            if (n1 >= 3000) {
                return n1 + 100;
            } else {
                return n1 + 50;
            }
        };
        
        Produto p = new Produto("iPad", 3235.89, 0.50);

        double resultado = valoProduto.andThen(impostoMunicipal).andThen(frete).apply(p.getPreco(), p.getDesconto());

        System.out.printf("O gasto total é: R$%.2f", resultado);
    }
}
