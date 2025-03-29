package oo.polimorfismo;

public class Comida {
    private double peso;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Comida(double peso) {
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
