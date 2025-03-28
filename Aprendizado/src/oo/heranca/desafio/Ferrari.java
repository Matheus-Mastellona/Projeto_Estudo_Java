package oo.heranca.desafio;


public class Ferrari extends Carro implements Esportivo, Luxo {
    @Override
    public void acelerar() {
        velocidadeAtual += 15;
    }

    @Override
    public void ligarTurbo() {
        velocidadeAtual += 40;
    };
    
    @Override
    public void desligarTurbo() {
        velocidadeAtual -= 40;
    };

    @Override
    public void ligarAr() {
        velocidadeAtual -=0;
    };
    @Override
    public void desligaAr() {
        velocidadeAtual -=0;
    };
}
