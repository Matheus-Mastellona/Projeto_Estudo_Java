package br.com.mastelloni.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Calculadora extends JFrame {

    public Calculadora() {

        organizarLayout();

        setSize(320, 500); // tamanho da janela, no caso da calculadora
        // setUndecorated(true); retirar a barra de fechar/minimizar/restore
        setDefaultCloseOperation(EXIT_ON_CLOSE); // ao clicar em fechar janela, ela irá parar a aplicação
        setLocationRelativeTo(null); // ao abrir a aplicação a janela abrir no meio da tela
        setVisible(true); // criação de uma tela

    }

    private void organizarLayout() {
        setLayout(new BorderLayout());

        Display display = new Display();
        display.setPreferredSize(new Dimension(233,60));
        add(display, BorderLayout.NORTH);

        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
