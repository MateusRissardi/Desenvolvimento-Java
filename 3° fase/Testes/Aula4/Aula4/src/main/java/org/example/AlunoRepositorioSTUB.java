package org.example;

import java.util.ArrayList;

public class AlunoRepositorioSTUB {
    private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    public boolean gravarAluno(Aluno umAluno){
        return alunos.add(umAluno);
    }

    public ArrayList<Aluno> getAlunos(){
        return alunos;
    }
}
