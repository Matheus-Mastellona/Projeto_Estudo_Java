package br.com.mastelloni.calc.modelo;

public class Memoria {

    private static final Memoria instancia = new Memoria();

    private String textoAutal = "";

    private Memoria() {

    }

    public static Memoria getInstancia() {
        return instancia;
    }

    public String getTextoAtual() {
        return textoAutal.isEmpty() ? "0" : textoAutal;
    }
}
