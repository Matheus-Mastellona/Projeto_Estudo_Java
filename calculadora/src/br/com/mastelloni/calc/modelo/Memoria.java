package br.com.mastelloni.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

    private enum TipoComando {
        ZERAR, SINAL, PORCEN, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA
    };

    private static final Memoria instancia = new Memoria();

    private final List<MemoriaObservador> observadores = new ArrayList<>();

    private TipoComando ultimaOperacao = null;
    private boolean substituir = false;
    private String textoAutal = "";
    private String textoBuffer = "";

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

    public void processarComando(String texto) {

        TipoComando tipoComando = detectarTipoComando(texto);

        if (tipoComando == null) {
            return;
        } else if (tipoComando == TipoComando.ZERAR) {
            textoAutal = "";
            textoBuffer = "";
            substituir = false;
            ultimaOperacao = null;
        } else if (tipoComando == TipoComando.SINAL && textoAutal.contains("-")) {
            textoAutal = textoAutal.substring(1);
        } else if (tipoComando == TipoComando.SINAL && !textoAutal.contains("-")) {
            textoAutal = "-" + textoAutal;
        } else if (tipoComando == TipoComando.PORCEN) {
            textoAutal = calcularPorcentagem();
        } else if (tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA) {
            textoAutal = substituir ? texto : textoAutal + texto;
            substituir = false;
        } else {
            substituir = true;
            textoAutal = obterResultadoOperacao();
            textoBuffer = textoAutal;
            ultimaOperacao = tipoComando;
        }

        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
    }

    private String obterResultadoOperacao() {

        if (ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
            return textoAutal;
        }

        double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
        double numeroAtual = Double.parseDouble(textoAutal.replace(",", "."));

        double resultado = 0;

        if (ultimaOperacao == TipoComando.SOMA) {
            resultado = numeroBuffer + numeroAtual;
        } else if (ultimaOperacao == TipoComando.SUB) {
            resultado = numeroBuffer - numeroAtual;
        } else if (ultimaOperacao == TipoComando.MULT) {
            resultado = numeroBuffer * numeroAtual;
        } else if (ultimaOperacao == TipoComando.DIV) {
            resultado = numeroBuffer / numeroAtual;
        }

        String resultadoString = Double.toString(resultado).replace(".", ",");

        boolean inteiro = resultadoString.endsWith(",0");

        return inteiro ? resultadoString.replace(",0", "") : resultadoString;
    }

    private String calcularPorcentagem() {

        if (textoBuffer.isEmpty()) {
            return textoAutal;
        }
    
        double base = Double.parseDouble(textoBuffer.replace(",", "."));
        double percentual = Double.parseDouble(textoAutal.replace(",", "."));
    
        double resultado = base * (percentual / 100.0);

        String resultadoString = Double.toString(resultado).replace(".", ",");

        boolean inteiro = resultadoString.endsWith(",0");

        return inteiro ? resultadoString.replace(",0", "") : resultadoString;
    }
    

    private TipoComando detectarTipoComando(String texto) {

        if (textoAutal.isEmpty() && texto == "0") {
            return null;
        }

        try {
            Integer.parseInt(texto);
            return TipoComando.NUMERO;
        } catch (NumberFormatException e) {
            // Quando não for número...
            if ("AC".equals(texto)) {
                return TipoComando.ZERAR;
            } else if ("/".equals(texto)) {
                return TipoComando.DIV;
            } else if ("*".equals(texto)) {
                return TipoComando.MULT;
            } else if ("+".equals(texto)) {
                return TipoComando.SOMA;
            } else if ("-".equals(texto)) {
                return TipoComando.SUB;
            } else if ("=".equals(texto)) {
                return TipoComando.IGUAL;
            } else if ("±".equals(texto)) {
                return TipoComando.SINAL;
            } else if ("%".equals(texto)) {
                return TipoComando.PORCEN;
            } else if (",".equals(texto) && !textoAutal.contains(",")) {
                return TipoComando.VIRGULA;
            }
        }
        return null;
    }
}
