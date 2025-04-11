package br.com.mastelloni.cm;

import br.com.mastelloni.cm.modelo.Tabuleiro;
import br.com.mastelloni.cm.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);

        new TabuleiroConsole (tabuleiro);

        // tabuleiro.abrir(3, 3);
        // tabuleiro.abrir(4, 4);
        // tabuleiro.abrir(4, 5);

        // System.out.println(tabuleiro);
    }
}
