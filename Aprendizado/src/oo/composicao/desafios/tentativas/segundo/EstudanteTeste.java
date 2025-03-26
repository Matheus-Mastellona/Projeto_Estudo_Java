package oo.composicao.desafios.tentativas.segundo;


public class EstudanteTeste {
    public static void main(String[] args) {
        // Criando um estudante
        Estudante estudante = new Estudante("Carlos Silva", "20231234");

        // Criando disciplinas com notas
        Disciplina matematica = new Disciplina("Matemática", 8.5, 7.0);
        Disciplina portugues = new Disciplina("Português", 9.0, 8.0);
        Disciplina historia = new Disciplina("História", 7.5, 6.5);

        // Adicionando disciplinas ao estudante
        estudante.adicionarDisciplina(matematica);
        estudante.adicionarDisciplina(portugues);
        estudante.adicionarDisciplina(historia);

        // Exibindo as notas finais de cada disciplina
        System.out.println("Notas finais do estudante:");
        for (Disciplina d : estudante.getDisciplinas()) {
            System.out.println(d.getNome() + ": " + d.obterNotaFinal());
        }

        // Calculando e exibindo a média final do estudante
        System.out.println("Média final do estudante: " + estudante.obterMediaFinal());
    }
}
