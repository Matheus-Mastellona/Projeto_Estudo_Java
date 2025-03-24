package controle.desafio;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double soma = 0;
        int contador = 0;
        double nota = 0;

        while (nota != -1) {
            System.out.print("Informe a nota (ou -1 para sair): ");
            nota = entrada.nextDouble();
            if (nota <= 10 && nota >= 0) {
                soma += nota;
                contador++;
            } else if (nota != -1)
                System.out.println("Nota inválida!");
        }
        double media = soma / contador;
        System.out.println("A media é: " + media);
        entrada.close();
    }
}
