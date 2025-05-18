package aula_1;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Questao_6 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.println("Insira o valor");
		float numero1 = N.nextFloat();
		System.out.println("Insira o valor");
		float numero2 = N.nextFloat();
		System.out.println("Insira o valor");
		float numero3 = N.nextFloat();
		System.out.println("Insira o valor");
		float numero4 = N.nextFloat();
		System.out.println("Insira o valor");
		float numero5 = N.nextFloat();
		
		List<Float> lista = new ArrayList<>();
		lista.add(numero1);
		lista.add(numero2);
		lista.add(numero3);
		lista.add(numero4);
		lista.add(numero5);
		
		
		float media = (numero1 + numero2 + numero3 + numero4 + numero5)/5;
		
		System.out.println(media);
		
		for (int i = 0; i < 5; i++) {
			if (lista.get(i) > media) {
				System.out.println(lista.get(i));
			}
		}
	}

}
