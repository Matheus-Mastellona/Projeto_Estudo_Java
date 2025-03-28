package lambda;

public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo calculo = (x, y) -> {
            return x + y;
        };
        System.out.println(calculo.execeutar(2, 3));

        calculo = (x, y) -> x * y;
        System.out.println(calculo.execeutar(2, 3));
        System.out.println(calculo.legal());
        System.out.println(calculo.legal());
        System.out.println(Calculo.muitoLegal());
    }
}