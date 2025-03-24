package arrays.desafio;

import java.util.Scanner;

public class CalcMediaAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas irá calcular: ");
        int quantidade = entrada.nextInt();

        double[] notas = new double[quantidade];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a " + (i + 1) + "° nota: ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;

        for (double nota : notas) {
            total += nota;
        }
        double media = total / notas.length;
        System.out.println("A sua media é: " + media + "!");
        entrada.close();
    }
}
