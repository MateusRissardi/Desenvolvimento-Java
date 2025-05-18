package lista2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 100 || idade <= 0) {
            System.out.println("Idade inválida");
            return; // Termina o programa se a idade for inválida
        }

        // Criando as listas com os números por extenso
        List<String> unidades = new ArrayList<>();
        unidades.add(""); // índice 0, não usado
        unidades.add("um");
        unidades.add("dois");
        unidades.add("três");
        unidades.add("quatro");
        unidades.add("cinco");
        unidades.add("seis");
        unidades.add("sete");
        unidades.add("oito");
        unidades.add("nove");

        List<String> dez_a_dezenove = new ArrayList<>();
        dez_a_dezenove.add("dez");
        dez_a_dezenove.add("onze");
        dez_a_dezenove.add("doze");
        dez_a_dezenove.add("treze");
        dez_a_dezenove.add("catorze");
        dez_a_dezenove.add("quinze");
        dez_a_dezenove.add("dezesseis");
        dez_a_dezenove.add("dezessete");
        dez_a_dezenove.add("dezoito");
        dez_a_dezenove.add("dezenove");

        List<String> dezenas = new ArrayList<>();
        dezenas.add(""); // índice 0, não usado
        dezenas.add("dez");
        dezenas.add("vinte");
        dezenas.add("trinta");
        dezenas.add("quarenta");
        dezenas.add("cinquenta");
        dezenas.add("sessenta");
        dezenas.add("setenta");
        dezenas.add("oitenta");
        dezenas.add("noventa");

        // Converte a idade para extenso
        String idadePorExtenso;

        if (idade < 10) {
            idadePorExtenso = unidades.get(idade);
        } else if (idade < 20) {
            idadePorExtenso = dez_a_dezenove.get(idade - 10);
        } else {
            int dezena = idade / 10;
            int unidade = idade % 10;

            if (unidade == 0) {
                idadePorExtenso = dezenas.get(dezena);
            } else {
                idadePorExtenso = dezenas.get(dezena) + " e " + unidades.get(unidade);
            }
        }

        // Exibe a idade por extenso
        System.out.println("Sua idade por extenso é: " + idadePorExtenso);

        scanner.close();
    }
}
