package br.com.mastelloni.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

    private static final Memoria instancia = new Memoria();

    private final List<MemoriaObservador> observadores = new ArrayList<>();

    private String textoAutal = "";

    private Memoria() {

    }

    public static Memoria getInstancia() {
        return instancia;
    }

    public void adicionarObservador(MemoriaObservador observador) {
        observadores.add(observador);
    }

    public String getTextoAtual() {
        return textoAutal.isEmpty() ? "0" : textoAutal;
    }

    public void processarComando(String valor) {

        if ("AC".equals(valor)) {
            textoAutal = "";
        } else {
            textoAutal += valor;
        }
        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
    }
}
