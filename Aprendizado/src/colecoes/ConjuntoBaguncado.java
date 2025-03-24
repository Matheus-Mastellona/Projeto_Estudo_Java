package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        HashSet conjunto = new HashSet(); // não aceita repetção

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); // int -> Integer
        conjunto.add('x');

        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        conjunto.add("teste");
        conjunto.add("Teste");
        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove('x'));
        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        System.out.println(conjunto.contains("teste"));
        System.out.println(conjunto.contains('x'));
        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        // conjunto.addAll(nums); // União entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}