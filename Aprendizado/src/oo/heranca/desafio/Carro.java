package oo.heranca.desafio;

public class Carro {
    public int velocidadeAtual;

    public void acelerar() {
        velocidadeAtual += 5;
    }

    public void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

    @Override
    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + " km";
    }

    public String toStringFerrari() {
        return "Velocidade atual da Ferrari é = " + velocidadeAtual + " km";
    }

    public String toStringBMW() {
        return "Velocidade atual da BMW é = " + velocidadeAtual + " km";
    }

}
