package br.com.mastelloni.cm.visao;

import java.util.Scanner;

import br.com.mastelloni.cm.excecao.ExplosaoException;
import br.com.mastelloni.cm.excecao.SairException;
import br.com.mastelloni.cm.modelo.Tabuleiro;

public class TabuleiroConsole {
    private Tabuleiro tabuleiro;
    private Scanner entrada = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;

        executarJogo();
    }

    private void executarJogo() {
        try {
            boolean continuar = true;
            while (continuar) {
                cicloDoJogo();
                System.out.println("Outra partida? (S/n)");
                String resposta = entrada.nextLine();
                if ("n".equalsIgnoreCase(resposta)) {
                    continuar = false;
                } else {
                    tabuleiro.reiniciar();
                }
            }
        } catch (SairException e) {
            System.out.println("Tchau!!!");
        } finally {
            entrada.close();
        }
    }

    private void cicloDoJogo() {
        try {
            while (!tabuleiro.objetivoAlcancado()) {
                System.out.println(tabuleiro);
                
                String 
            }
            System.out.println("Você ganhou!!!");
        } catch (ExplosaoException e) {
            System.out.println("Você perdeu!");
        }
    }

    private void capturarValorDigitado(String texto) {
        System.out.println(texto);
        String digitado = entrada.nextLine();
        
        if ("sair".equalsIgnoreCase(digitado)) {
            throw new SairException();
        }
    }

}
