package oo.composicao.desafios.tentativas.segundo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    String nome;
    List<Estudante> estudantes = new ArrayList<>();
    List<Disciplina> disciplinas = new ArrayList<>();

    void adicionarEstudante(Estudante estudante) {
        this.estudantes.add(estudante);
    }

    void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

}
