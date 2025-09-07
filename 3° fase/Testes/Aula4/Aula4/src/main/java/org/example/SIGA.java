package org.example;

import java.util.ArrayList;

public class SIGA {
    public String matricularAluno(Aluno umAluno){
        RepositorioAluno alunoRepositorio = new BancoDadosAluno();
        String matricula = GeradorDeMatricula.criarMatricula(umAluno);
        umAluno.setMatricula(matricula);
        alunoRepositorio.gravarAluno(umAluno);
        return matricula;
    }

    public ArrayList<Aluno> buscarAlunos(){
        AlunoRepositorioSTUB alunoRepositorio = new AlunoRepositorioSTUB();
        return alunoRepositorio.getAlunos();
    }
}
