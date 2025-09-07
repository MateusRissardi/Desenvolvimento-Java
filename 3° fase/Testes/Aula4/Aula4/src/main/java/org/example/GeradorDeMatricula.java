package org.example;

public class GeradorDeMatricula {
    public static String criarMatricula(Aluno umAluno){
        return umAluno.getNome().substring(0,3).toUpperCase() +
                umAluno.getCpf().substring(0,5);
    }
}
