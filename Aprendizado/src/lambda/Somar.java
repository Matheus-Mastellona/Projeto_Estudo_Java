package lambda;

public class Somar implements Calculo {
    
    @Override
    public double execeutar(double a, double b) {
        return a + b;
    }

}
