package lista3;
import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		int fat = 0;
		Scanner N = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = N.nextInt();
		N.close();
		if (num<0) {
			System.out.println("O numero é menor que zero!");
			return;
		}
		for (int i=num-1; i>0; i--) {
			if (i == num-1) {
				fat = num*i;
			}
			else {
				fat = fat*i;
			}
		}
		System.out.println("O fatorial desse numero é " + fat);
	}

}
