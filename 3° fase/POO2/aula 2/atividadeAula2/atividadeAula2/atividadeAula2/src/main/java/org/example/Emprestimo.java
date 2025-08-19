package org.example;

import java.util.ArrayList;

public class Emprestimo {
    private int codigo;
    private String dataEmprestimo;
    private String descricao;
    private Usuario usuario;
    private ArrayList<Livro> carrinhoLivro;
    private ArrayList<Livro> livrosEmprestados;

    public Emprestimo(int codigo, String dataEmprestimo, String descricao, Usuario usuario) {
        this.codigo = codigo;
        this.dataEmprestimo = dataEmprestimo;
        this.descricao = descricao;
        this.usuario = usuario;
        this.carrinhoLivro = new ArrayList<Livro>();
        this.livrosEmprestados = new ArrayList<Livro>();
    }

    public int getCodigo(){
        return this.codigo;
    }

    public boolean setDataEmprestimo(String dataEmprestimo){
        if(dataEmprestimo != null){
            this.dataEmprestimo = dataEmprestimo;
            return true;
        }
        else{
            return false;
        }
    }

    public String getDataEmprestimo(){
        return this.dataEmprestimo;
    }

    public boolean setDescricao(String descricao){
        if(descricao != null){
            this.descricao = descricao;
            return true;
        }
        else{
            return false;
        }
    }

    public String getDescricao(){
        return this.descricao;
    }

    public Usuario getUsuario(){

        return this.usuario;
    }

    public void addLivroCarrinho(Livro umLivro) {

        this.carrinhoLivro.add(umLivro);
    }

    public ArrayList<Livro> getCarrinhoLivro(){

        return this.carrinhoLivro;
    }

    public ArrayList<Livro> getLivrosEmprestados(){

        return this.livrosEmprestados;
    }

    public void limparCarrinho(){

        this.carrinhoLivro.clear();
    }

    public void realizarEmprestimo() {
        for(Livro umLivro : this.carrinhoLivro) {
            if(umLivro.getCopias()>0){
                umLivro.setCopias(umLivro.getCopias()-1);
                this.livrosEmprestados.add(umLivro);
                System.out.println("Emprestimo realizado com sucesso!");
            }
            else{
                System.out.println("Emprestimo não sucedido!");
            }
        }
        this.carrinhoLivro.clear();
        this.usuario.addEmprestimo(this);
    }

    public void realizarDevolucao(Livro umLivro){
        for(Livro livro : this.livrosEmprestados){
            if(livro.getCodigo() == umLivro.getCodigo()){
                this.livrosEmprestados.remove(livro);
                System.out.println("Devolução realizado com sucesso!");
                livro.setCopias(livro.getCopias()+1);
                this.usuario.removeEmprestimo(this);
                break;
            }
        }
    }

    public String imprimirCarrinhoLivro(){
        String carrinho = "Livros em carrinho: \n";
        for(Livro umLivro : this.carrinhoLivro){
            carrinho += umLivro.toString() + "\n";
        }
        return carrinho;
    }

    public String imprimirLivroEmprestimo(){
        String emprestimo = "Livros em emprestimo: \n";
        for(Livro umLivro : this.livrosEmprestados){
            emprestimo += umLivro.toString() + "\n";
        }
        return emprestimo;
    }

    public String toString(){
        String texto = "Codigo: " + this.codigo + ", Usuario do Emprestimo: " + this.usuario.getNome() +
                ", Data do emprestimo: " + this.dataEmprestimo + ", Descrição: " + this.descricao + "\n" +
                imprimirCarrinhoLivro() + imprimirLivroEmprestimo();
        return texto;
    }

}
