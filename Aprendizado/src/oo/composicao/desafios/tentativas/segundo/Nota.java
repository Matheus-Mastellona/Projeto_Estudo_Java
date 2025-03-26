package oo.composicao.desafios.tentativas.segundo;

public class Nota {
    private double notaProva, notaTrabalho;

    public Nota(double notaProva, double notaTrabalho) {
        this.notaProva = notaProva;
        this.notaTrabalho = notaTrabalho;
    }

    double calcularNotaFinal() {
        return (notaProva + notaTrabalho) / 2;
    }

}
