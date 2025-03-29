package oo.heranca.desafio;

public interface Luxo { // public ou abstratc cabe nas vairáveis
    void ligarAr();
    void desligaAr();
    default int velocidadeDoAr() { // default n obriga a realização do metodo
        return 1;
    }
}
