package classe.desafio;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();

       // d1.dia = 1;
       // d1.ano = 1000;
       // d1.mes = 1;

        Data d2 = new Data(2,2000,2);
       // d2.dia = 2;
       // d2.ano = 2000;
       // d2.mes = 2;

        // System.out.println(d1.dia);
        // System.out.println(d1.ano);
        System.out.printf(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }
}
