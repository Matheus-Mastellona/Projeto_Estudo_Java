package oo.polimorfismo;

public class Pessoa {

    private double peso;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Pessoa(double peso) {
        setPeso(peso);
    }

    public void comer(Comida comida) {
        this.peso += comida.getPeso();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0)
            this.peso = peso;
    }

    public String toString() {
        return "O seu peso atual é: " + getPeso();
    }

}
