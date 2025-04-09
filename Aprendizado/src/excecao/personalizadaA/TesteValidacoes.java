package excecao.personalizadaA;

import streams.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("", -7);
            Validar.aluno(aluno);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        }

        try {
            Aluno aluno1 = new Aluno("Ana", -7);
            Validar.aluno(aluno1);
        } catch (NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        }

        try {
            Validar.aluno(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Aluno aluno3 = new Aluno("", -7);
            Validar.aluno(aluno3);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim!");
    }
}
