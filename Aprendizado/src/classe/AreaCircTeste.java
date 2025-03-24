package classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a = new AreaCirc(5.6);

        // a.pi = 0;

        // AreaCirc.pi = 3.1415;

        System.out.println("A área é: " + a.area());
        System.out.println("A área é: " + AreaCirc.area(100));
    }
}
