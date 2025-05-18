package lista2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ex5 {
	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		System.out.println("Digite 3 numeros: ");
		int num1 = N.nextInt();
		int num2 = N.nextInt();
		int num3 = N.nextInt();
		
		lista.add(num1);
		lista.add(num2);
		lista.add(num3);
		
		System.out.println("Deseja ordenar esses numero em ordem crescente ou descrescente? (1 para crescente, 2 para decrescente): ");
		int ordem = N.nextInt();
		N.close();
		
		switch(ordem) {
		case 1:
			Collections.sort(lista);
			for(int i : lista) {
				System.out.println(i);
			}
			break;
		case 2:
			Collections.sort(lista, Collections.reverseOrder());
			for(int i : lista) {
				System.out.println(i);
			}
			break;
		}

	}

}
