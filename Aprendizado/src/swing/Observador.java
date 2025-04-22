package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");

        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200); // tamanho das dimensões da janela
        janela.setLayout(new FlowLayout()); // loyaute do botão ao centro
        janela.setLocationRelativeTo(null); // Centraliza a janela na tela ao abrir

        JButton botao = new JButton("Clicar");
        janela.add(botao);

        botao.addActionListener(e -> {
            System.out.println("Evento Ocorreu!!!");
        });

        /*
         * botao.addActionListener(new ActionListener() {
         * public void actionPerformed(ActionEvent e) {
         * System.out.println("Evento ocorreu!");
         * }
         * });
         */

        janela.setVisible(true);
    }
}
