package org.example;

public class Livro {
    private int codigo;
    private String nome;
    private String autor;
    private int anoLancamento;
    private String editora;
    private int copias;

    public Livro(int codigo, String nome, String autor, int anoLancamento, String editora, int copias){
        this.codigo = codigo;
        this.nome = nome;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.editora = editora;
        this.copias = copias;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getNome(){

        return this.nome;
    }
    public String getAutor(){

        return this.autor;
    }
    public int getAnoLancamento(){

        return this.anoLancamento;
    }
    public String getEditora(){

        return this.editora;
    }
    public boolean setCopias(int copias){
        if(copias >= 0){
            this.copias = copias;
            return true;
        }
        else{
            return false;
        }
    }

    public int getCopias(){

        return this.copias;
    }

    public String toString(){
        return "Nome do Livro: " + this.nome + ", Codigo: " + this.codigo + ", Autor: " + this.autor;
    }
}
