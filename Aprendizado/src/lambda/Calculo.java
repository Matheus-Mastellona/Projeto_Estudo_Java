package lambda;

@FunctionalInterface // faz com que a interface aceite apenas um metodo, vantagens no quesito da lambida
public interface Calculo {

    public abstract double execeutar(double a, double b);

}
