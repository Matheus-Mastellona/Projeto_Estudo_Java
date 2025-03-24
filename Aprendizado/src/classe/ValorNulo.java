package classe;

public class ValorNulo {
    public static void main(String[] args) {
        String s1 = "";
        System.out.println(s1.concat("!!!!"));

        String s2 = Math.random() > 0.5 ? "Opa" : null;
        System.out.println(s2.concat("????"));
    }
}
