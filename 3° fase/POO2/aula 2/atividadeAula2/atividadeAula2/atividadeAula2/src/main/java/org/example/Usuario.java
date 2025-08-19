package org.example;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int idade;
    private ArrayList<Emprestimo> emprestimo;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.emprestimo = new ArrayList<Emprestimo>();
    }

    public void addEmprestimo(Emprestimo umEmp){
        this.emprestimo.add(umEmp);
    }

    public void removeEmprestimo(Emprestimo umEmp){
        for(Emprestimo emp1 : this.emprestimo){
            if(emp1.getCodigo() == umEmp.getCodigo()){
                this.emprestimo.remove(umEmp);
                break;
            }
        }
    }

    public ArrayList<Emprestimo> getEmprestimo(){
        return this.emprestimo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void imprimirEmprestimo(){
        for(Emprestimo umEmp : this.emprestimo){
            if(umEmp.getUsuario().getNome().equals(this.nome) ){
                System.out.println("Nome do Usuario: "+ this.nome +"\n" + umEmp.imprimirLivroEmprestimo());
            }
            else if(this.emprestimo == null){
                System.out.println("O usuário não possui empréstimos");
            }
        }

    }

}


