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

    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + " km";
    }

}
