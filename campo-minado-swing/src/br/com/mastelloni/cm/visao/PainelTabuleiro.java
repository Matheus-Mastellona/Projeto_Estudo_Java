package br.com.mastelloni.cm.visao;

import java.awt.GridLayout;

import javax.swing.JPanel;

import br.com.mastelloni.cm.modelo.Tabuleiro;

public class PainelTabuleiro extends JPanel {

    public PainelTabuleiro(Tabuleiro tabuleiro) {
        setLayout(new GridLayout(
                tabuleiro.getLinhas(), tabuleiro.getColunas()));

        tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));

        tabuleiro.registrarObservador(e -> {
            // TODO mostrar resultado pro usuário!
        });
    }
}
