package lambda;

public class Multiplicar implements Calculo{
    
    @Override
    public double execeutar(double a, double b) {
        return a * b;
    }

}
