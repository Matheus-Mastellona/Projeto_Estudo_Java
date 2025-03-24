package controle.desafio;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um dia da semana: ");
        String dia = entrada.nextLine();

        if (dia.equalsIgnoreCase("Domingo")) {
            System.out.println("1");
        } else if (dia.equalsIgnoreCase("Segunda")) {
            System.out.println("2");
        } else if (dia.equalsIgnoreCase("Terça") || dia.equalsIgnoreCase("Terca")) {
            System.out.println("3");
        } else if (dia.equalsIgnoreCase("Quarta")) {
            System.out.println("4");
        } else if (dia.equalsIgnoreCase("Quinta")) {
            System.out.println("5");
        } else if (dia.equalsIgnoreCase("Sexta")) {
            System.out.println("6");
        } else if (dia.equalsIgnoreCase("Sábado") || dia.equalsIgnoreCase("Sabado")) {
            System.out.println("7");
        } else {
            System.out.println("Inválido");
        }
        entrada.close();
    }
}
