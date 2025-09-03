package org.example;

public class Main {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria("Marcelo", 123123);
        conta.depositar(100);

        conta.sacar(50);
        conta.sacar(50);
        conta.sacar(50);
    }
}
