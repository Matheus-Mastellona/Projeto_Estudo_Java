package oo.composicao.desafios.tentativas.segundo;

public class Disciplina {
    String nome;
    Nota notaFinal;

    public Disciplina(String nome, double notaProva, double notaTrabalho) {
        this.nome = nome;
        this.notaFinal = new Nota(notaProva, notaTrabalho);
    }

    public double obterNotaFinal(){
        return notaFinal.calcularNotaFinal();
    }

    public String getNome() {
        return nome;
    }
    
}
