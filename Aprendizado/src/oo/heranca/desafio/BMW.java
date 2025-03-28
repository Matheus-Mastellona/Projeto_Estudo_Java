package oo.heranca.desafio;

public class BMW extends Carro implements Luxo {
    @Override
    public void acelerar() {
        velocidadeAtual += 10;
    }
    @Override
    public void ligarAr() {
        velocidadeAtual -= 0;
    };
    @Override
    public void desligaAr() {
        velocidadeAtual -= 0;
    };
}
