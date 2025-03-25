package oo.composicao.desafios.tentativas.primeiro;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    List<ItemReserva> itensReserva = new ArrayList<>();

    void adicionarItem(Quarto quarto, int noites) {
        this.itensReserva.add(new ItemReserva(quarto, noites));
    }

    double obterValorTotal() {
        double total = 0;
        for (ItemReserva itemReserva : itensReserva) {
            total += itemReserva.noites * itemReserva.quarto.precoPorNoite;
        }
        return total;
    }
}
