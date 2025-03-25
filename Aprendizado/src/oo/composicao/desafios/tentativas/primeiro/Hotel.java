package oo.composicao.desafios.tentativas.primeiro;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    List<Hospede> hospedes = new ArrayList<>();
    List<Reserva> reservas = new ArrayList<>();


    public void adicionarHospede(Hospede hospede){
        this.hospedes.add(hospede);
    }

    public void adicionarReserva(Reserva  reserva){
        this.reservas.add(reserva);
    }
}
