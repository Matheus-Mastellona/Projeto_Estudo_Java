package generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<>();
        caixaA.aguardar("Segredo!");
        String coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}
