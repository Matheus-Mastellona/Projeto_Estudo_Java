package oo.composicao.desafios.tentativas.primeiro;

import java.util.ArrayList;
import java.util.List;

public class Hospede {
    String nome;
    List<Reserva> reservas = new ArrayList<>();

    public Hospede(String nome) {
        this.nome = nome;
    }

    void adicionarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    double obterTotalGasto() {
        double total = 0;
        for (Reserva reserva : reservas) {
            total += reserva.obterValorTotal();
        }
        return total;
    }

}
