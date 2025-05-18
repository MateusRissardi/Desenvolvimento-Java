package lista2;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner N = new Scanner(System.in);
		System.out.println("Digite a idade em dias: ");
		int dias = N.nextInt();
		if (dias<0) {
			System.out.println("Algum valor deu menor que zero");
			return;
			
		}
		int anos = dias / 365;
		int meses = (dias % 365) / 30;
		dias = (dias % 365) % 30;
		System.out.printf("%d ano(s), %d mês(es), %d", anos, meses, dias);
		N.close();
	}
}