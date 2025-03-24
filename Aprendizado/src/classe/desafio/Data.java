package classe.desafio;

public class Data {
    public int dia, mes, ano;

    public Data() {
        // dia = 1;
        // mes = 1;
        // ano = 1970;
        this(1, 1, 1970); // chamando o outro construtor utilizando o this()
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // String obterDataFormatada() {
    // return "Data %d/%d/%d \n";
    // }

    public String obterDataFormatada() {
        final String formato = "Data %d/%d/%d \n";
        return String.format(formato, dia, mes, ano);
    }
}
