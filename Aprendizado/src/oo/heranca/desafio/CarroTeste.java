package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.velocidadeAtual = 100;
        c1.acelerar();

        BMW c2 = new BMW();

        c2.velocidadeAtual = 100;
        c2.acelerar();

        Ferrari c3 = new Ferrari();

        c3.velocidadeAtual = 100;
        c3.acelerar();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        c1.frear();
        c2.frear();
        c3.frear();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        Carro c4 = new Carro();
        c4.velocidadeAtual = 6;
        c4.frear();
        c4.frear();
        System.out.println(c4.toString());

    }
}
