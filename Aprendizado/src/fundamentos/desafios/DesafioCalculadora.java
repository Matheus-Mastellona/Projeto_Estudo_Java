package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o 1° número desejado: ");
        double num1 = entrada.nextDouble();
        
        System.out.print("\nInforme o 2° número desejado: ");
        double num2 = entrada.nextDouble();

        System.err.println("\nInforme a operação desejada, sendo: + ou - ou * ou %");
        String opcao = entrada.next();

        double conta1 = num1 + num2;
        double conta2 = num1 - num2;
        double conta3 = num1 * num2;
        double conta4 = num1 % num2;

        System.out.println(
                "O resultado é: " + (opcao.equals("+") ? conta1
                        : opcao.equals("-") ? conta2 : opcao.equals("*") ? conta3 : conta4));

        entrada.close();
    }
}
