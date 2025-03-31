package lambda;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
        Produto produto = new Produto("Notbook", 3893.89, 0.85);
        System.out.println("O produto: " + produto.nome + ", é caro? " + isCaro.test(produto) + "!");
    }
}