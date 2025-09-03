package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FundamentosExcecoes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Início de programa");
        divSegura01();
        textoNulo02("pasta");
        arrayForaDoLimite03();
        leituraArquivoInexistente04();
        calculadoraSegura();
        System.out.println("Fim do programa");
    }

    public static void divSegura01(){
        try {
            System.out.println("Digite um numero");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("A divisão de a e b resulta em : " + a/b);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void textoNulo02(String texto){
        try {
            System.out.println("O comprimento do seu texto é de " + texto.length() + " caracteres");
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void arrayForaDoLimite03(){
        try{
            int [] numeros = {10, 20, 30, 40, 50};
            int i = 4;
            System.out.println("O numero na posição " + (i+1) + " é: " + numeros[i]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void leituraArquivoInexistente04(){
        try{
            FileReader fr = new FileReader("texto.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void calculadoraSegura(){
        try{
            System.out.println("Digite os primeiros 2 numeros: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            double c = 0;

            System.out.println("Digite o valor do operador desejado (1 para +, 2 para -, 3 para *, 4 para /): ");
            switch (sc.nextInt()){
                case 1:
                    c = a + b;
                    break;
                case 2:
                    c = a - b;
                    break;
                case 3:
                    c = a * b;
                    break;
                case 4:
                    if (b == 0) {
                        throw new ArithmeticException("Divisão por zero");
                    }
                    c = a / b;
                    break;
            }
            System.out.println("A operação entre " + a + " e " + b + " resulta em: " + c);
        }
        catch (InputMismatchException e){
            System.out.println("Erro: " + e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}