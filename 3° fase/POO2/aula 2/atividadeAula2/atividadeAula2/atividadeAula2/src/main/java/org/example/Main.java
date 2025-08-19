package org.example;

public class Main {
    public static void main(String[] args) {
        Usuario us1 = new Usuario("Joao", 20);
        Usuario us2 = new Usuario("Maria", 20);
        Usuario us3 = new Usuario("Pedro", 20);

        Livro liv1 = new Livro(1, "It", "Stephen King", 1980, "Qualquer", 3);
        Livro liv2 = new Livro(2, "Harry Potter", "Autora la", 1990, "alguma la", 2);
        Livro liv3 = new Livro(3, "Harry Potter 2", "Autora la", 1990, "alguma la", 0);

        Emprestimo emp1 = new Emprestimo(123, "12-09-2024", "Empréstimo curto", us1);
        emp1.addLivroCarrinho(liv1);
        emp1.addLivroCarrinho(liv2);
        emp1.addLivroCarrinho(liv3);

        System.out.println(emp1.imprimirCarrinhoLivro());

        emp1.realizarEmprestimo();

        System.out.println(emp1.imprimirCarrinhoLivro());

        System.out.println(emp1.toString());

        us1.imprimirEmprestimo();

        emp1.realizarDevolucao(liv2);

        System.out.println(emp1.imprimirLivroEmprestimo());
    }
}