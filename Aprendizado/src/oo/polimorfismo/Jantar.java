package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(62);

        Arroz ingrediente1 = new Arroz(0.250);
        Feijao ingrediente2 = new Feijao(0.150);
        Sorvete ingrediente3 = new Sorvete(0.500);
        
        System.out.println(p1.toString());

        p1.comer(ingrediente1);
        p1.comer(ingrediente2);
        p1.comer(ingrediente3);
        
        System.out.println(p1.toString());

    }
}
