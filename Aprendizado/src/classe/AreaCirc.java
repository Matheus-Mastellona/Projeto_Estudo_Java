package classe;

public class AreaCirc {
    double raio;
    static final double PI = 3.14;

    public AreaCirc() {
    }

    public AreaCirc(double raio) {
        this.raio = raio;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }

    static double area (double raio){
        return PI * Math.pow(raio, 2);
    }

}
