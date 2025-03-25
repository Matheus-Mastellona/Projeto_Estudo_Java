package oo.composicao.desafios.tentativas.segundo;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    String nome;
        String matricula;
        List<Disciplina> disciplinas = new ArrayList<>();

        void adicionarDisciplina(Disciplina disciplina){
            this.disciplinas.add(disciplina);
        }

        double obterMediaFinal(){
            double total =0;
            for (Disciplina disciplina : disciplinas) {
                total+= disciplina.obterNotaFinal();
            }
            return total;
        }
}
