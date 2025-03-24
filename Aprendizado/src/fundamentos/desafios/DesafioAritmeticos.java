package fundamentos.desafios;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        double express1 = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
        double express2 = Math.pow(((1 - 5) * (2 - 7) / 2), 2);
        double express3 = Math.pow((express1 - express2), 3) / Math.pow(10, 3);

        System.out.println((int) express3);
    }

}
