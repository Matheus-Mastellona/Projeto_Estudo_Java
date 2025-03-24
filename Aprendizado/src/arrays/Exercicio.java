package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunosA = new double[4];
        // double notasAlunosA[] = new double[3]; double []notasAlunosA = new double[3];
        // também válidos
        notasAlunosA[0] = 7.9;
        notasAlunosA[1] = 8;
        notasAlunosA[2] = 6.7;
        notasAlunosA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunosA));

        double totalAlunoA = 0;

        for (int i = 0; i < 3; i++) {
            totalAlunoA += notasAlunosA[i];
        }

        System.out.println(totalAlunoA / 3);

        for (int i = 0; i < notasAlunosA.length; i++) {
            totalAlunoA += notasAlunosA[i];
        }

        System.out.println(totalAlunoA / notasAlunosA.length);

        final double notaArmazenada = 5.5;

        double[] notasAlunosB = { 6.9, 8.9, notaArmazenada, 10 };

        double totalAlunoB = 0;

        for (int i = 0; i < notasAlunosB.length; i++) {
            totalAlunoB += notasAlunosB[i];
        }

        System.out.println(totalAlunoB / notasAlunosA.length);
    }
}
