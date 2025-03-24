package classe.desafio;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Joana", 70);
        Comida c1 = new Comida("Frango", 0.150);
        Comida c2 = new Comida("Arroz", 0.250);
        Comida c3 = new Comida("Feijão", 0.100);

        System.out.println(p1.apresentar());
        
        p1.comer(c1);
        p1.comer(c2);
        p1.comer(c3);

        System.out.println(p1.apresentar());
    }
}
