package arrays;

public class Foreach {
    public static void main(String[] args) {
        double[] notas = { 1, 1, 1, 1 };

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        double total = 0;
        for (double calc : notas) {
            total += calc;
        }
        System.out.println("\n" + total / 4);
    }
}
