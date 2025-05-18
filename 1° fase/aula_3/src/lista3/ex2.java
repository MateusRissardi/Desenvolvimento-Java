package lista3;
import java.util.*;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i<5 ; i++) {
			System.out.println("Digite um numero: ");
			int temp = N.nextInt();
			num.add(temp);
		}
		N.close();
		System.out.println("Verificação dos numeros, aguarde...\n");
		int c = 0;
		for (int i = 0; i<num.size() ; i++) {
			if (num.get(i)<0){
				System.out.printf("O numero %d é menor que zero\n", num.get(i));
				c++;
			}
		}
		System.out.printf("Há %d numero(s) abaixo de zero", c);
	}

}
