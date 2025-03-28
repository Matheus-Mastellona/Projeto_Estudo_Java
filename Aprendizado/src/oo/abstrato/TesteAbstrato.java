package oo.abstrato;

public class TesteAbstrato {
    public static void main(String[] args) {
        Animal a = new Cachorro();
        System.out.println(a.mover());
        Mamifero m = new Cachorro();
        System.out.println(m.mamar());
        Cachorro c = new Cachorro();
        System.out.println(c.respirar());
    }
}
