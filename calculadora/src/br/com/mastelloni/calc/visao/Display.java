package br.com.mastelloni.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.mastelloni.calc.modelo.Memoria;
import br.com.mastelloni.calc.modelo.MemoriaObservador;

public class Display extends JPanel implements MemoriaObservador {

    private final JLabel label;

    public Display() {
        Memoria.getInstancia().adicionarObservador(this);

        setBackground(new Color(46, 49, 50));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("SF Pro", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));

        add(label);
    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }
}
