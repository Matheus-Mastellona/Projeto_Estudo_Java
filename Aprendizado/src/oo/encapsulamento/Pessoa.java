package oo.encapsulamento;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private int idade;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Pessoa(String nome, String sobreNome, int idade) {
        setNome(nome);
        setSobreNome(sobreNome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120)
            this.idade = novaIdade;
    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobreNome();
    }

    @Override
    public String toString() {
        return "Nome = " + nome + ", Sobre Nome = " + sobreNome + ", Idade = " + idade;
    }

}
