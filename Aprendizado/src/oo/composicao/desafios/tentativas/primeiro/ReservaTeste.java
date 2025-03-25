package oo.composicao.desafios.tentativas.primeiro;

public class ReservaTeste {
    public static void main(String[] args) {
        // Criar hóspede
        Hospede h1 = new Hospede("Carlos");

        // Criar quartos
        Quarto quarto1 = new Quarto("Luxo", 300);
        Quarto quarto2 = new Quarto("Standard", 150);

        // Criar reserva
        Reserva reserva1 = new Reserva();

        // Adicionar quartos à reserva
        reserva1.adicionarItem(quarto1, 3); // 3 noites no quarto Luxo
        reserva1.adicionarItem(quarto2, 2); // 2 noites no quarto Standard

        // Associar reserva ao hóspede
        h1.adicionarReserva(reserva1);

        System.out.println("O quarto reservado é do tipo: " + quarto1.getTipo());
        System.out.println("O quarto reservado é do tipo: " + quarto2.getTipo());

        // Exibir total gasto pelo hóspede
        System.out.println("Total gasto por " + h1.nome + ": R$" + h1.obterTotalGasto());
    }
}
