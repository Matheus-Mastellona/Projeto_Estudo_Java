package oo.heranca.teste;

import oo.heranca.desafio.BMW;
import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.velocidadeAtual = 100;
        c1.acelerar();
        System.out.println(c1.toString());
        c1.frear();
        System.out.println(c1.toString());

        BMW c2 = new BMW();

        c2.velocidadeAtual = 100;
        c2.acelerar();
        System.out.println(c2.toStringBMW());
        c2.frear();
        System.out.println(c2.toStringBMW());

        Ferrari c3 = new Ferrari();

        c3.velocidadeAtual = 100;
        c3.ligarTurbo();
        System.out.println(c3.toStringFerrari());
        c3.desligarTurbo();
        System.out.println(c3.toStringFerrari());

        Carro c4 = new Carro();
        
        c4.velocidadeAtual = 6;
        c4.frear();
        c4.frear();
        System.out.println(c4.toString());

    }
}
