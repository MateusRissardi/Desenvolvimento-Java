package org.example;

import java.util.Scanner;

public class ExcecoesPersonalizadas01 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Começo de programa");
        validacaoIdade06();
        System.out.println("Fim de programa");
    }

    public static void validacaoIdade06(){
        try {
            System.out.println("Digite a sua idade: ");
            if(sc.nextInt()<18){
                throw new IdadeInvalidaException("Essa pessoa é menor de idade");
            }
            System.out.println("Essa pessoa é maior de idade");
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

    public static class IdadeInvalidaException extends Exception{
        public IdadeInvalidaException(String mensagem){
            super(mensagem);
        }
    }
}
