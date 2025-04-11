package generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<>();
        caixaA.aguardar("Segredo!");

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.aguardar(3.1415);

        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);

        // String coisaA = caixaA.abrir();
        // System.out.println(coisaA);
    }
}
