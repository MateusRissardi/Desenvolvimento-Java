package org.example;

import java.util.Scanner;

public class ContaBancaria {
    private String nome;
    private int NUMERO_CONTA;
    private double saldo;

    public ContaBancaria(String nome, int NUMERO_CONTA){
        this.nome = nome;
        this.NUMERO_CONTA = NUMERO_CONTA;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getNUMERO_CONTA() {
        return NUMERO_CONTA;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double saldo) {
        if(saldo<0 || saldo<getSaldo()){
            System.out.println("Saldo não registrado");
        }
        else{
            this.saldo = saldo;
        }
    }

    public void sacar(double saldo){
        try{
            if(saldo > getSaldo()){
                throw new SaldoInsuficienteException("Saldo para saque é maior do que o saldo atual da conta");
            }
            else{
                System.out.println("Saque realizado com sucesso!");
                this.saldo -= saldo;
            }
        }
        catch (SaldoInsuficienteException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static class SaldoInsuficienteException extends Exception{
        public SaldoInsuficienteException(String mensagem){
            super(mensagem);
        }
    }
}
