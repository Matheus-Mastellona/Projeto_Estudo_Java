package oo.composicao.desafios.tentativas.segundo;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    private String nome;
    private String matricula;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Estudante(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    double obterMediaFinal() {
        double total = 0;
        for (Disciplina disciplina : disciplinas) {
            total += disciplina.obterNotaFinal();
        }
        return total / disciplinas.size();
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    
}

