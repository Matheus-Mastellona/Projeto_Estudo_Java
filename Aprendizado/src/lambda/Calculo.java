package lambda;

@FunctionalInterface // faz com que a interface aceite apenas um metodo, vantagens no quesito da
                     // lambida .... metodo default/static segue normalmente
public interface Calculo {

    public abstract double execeutar(double a, double b);

    default String legal() {
        return "legal";
    }

    static String muitoLegal() { // está ligado diretamente a interface e não estâncias
        return "muito legal";
    }

}
