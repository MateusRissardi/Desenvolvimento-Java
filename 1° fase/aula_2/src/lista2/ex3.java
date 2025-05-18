package lista2;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner N = new Scanner(System.in);
		System.out.println("Digite a idade em anos, meses e dias (cada 'prompt' tem que ser clicado um enter no final): ");
		int anos = N.nextInt();
		int meses = N.nextInt();
		int dias = N.nextInt();
		if (anos<0 || meses<0 || dias<0) {
			System.out.println("Algum valor deu menor que zero");
			return;
		}
		else if(meses>12 || dias>365) {
			System.out.println("Algum dos valores passou do limite");
			return;
		}
		dias += (meses * 30) + (anos * 365);
		System.out.printf("A quantidade em dias que essa pessoa viveu é de %d dias", dias);
	}

}
