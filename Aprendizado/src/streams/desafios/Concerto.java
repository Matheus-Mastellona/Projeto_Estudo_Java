package streams.desafios;

public class Concerto {

    private String carro, nome;
    private double precoConcerto;
    private boolean bomCliente;

    public Concerto(String nome, String carro, double precoConcerto, boolean bomCliente) {
        this.carro = carro;
        this.nome = nome;
        this.precoConcerto = precoConcerto;
        this.bomCliente = bomCliente;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoConcerto(double precoConcerto) {
        this.precoConcerto = precoConcerto;
    }

    public void setBomCliente(boolean bomCliente) {
        this.bomCliente = bomCliente;
    }

    public String getCarro() {
        return carro;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoConcerto() {
        return precoConcerto;
    }

    public boolean isBomCliente() {
        return bomCliente;
    }

}
