package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", "Carlos", -30);
        p1.setIdade(200);
        System.out.println(p1.toString());
        System.out.println("Nome: " + p1.getNomeCompleto());
    }
}
