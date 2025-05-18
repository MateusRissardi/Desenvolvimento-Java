package lista3;
import java.util.*;
import java.util.Scanner;
public class ex5 {

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
			if ((num.get(i)%2!=0 && num.get(i)%3!=0 && num.get(i)%5!=0 && num.get(i)%7!=0) || (num.get(i)==2 || num.get(i)==3 || num.get(i)==5 || num.get(i)==7)){
				System.out.printf("O numero %d é primo\n", num.get(i));
				c++;
			}
		}
		System.out.printf("Há %d numero(s) primos", c);
	}

}