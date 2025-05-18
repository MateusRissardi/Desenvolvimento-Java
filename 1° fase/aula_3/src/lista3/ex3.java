package lista3;
import java.util.*;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		int c = 0;
		int x = 0;
		int media = 0;
		Scanner N = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i<10 ; i++) {
			System.out.println("Digite um numero: ");
			int temp = N.nextInt();
			num.add(temp);
			media+=temp;
		}
		media = media/num.size();
		N.close();
		System.out.println("Verificação dos numeros, aguarde...\n");
		for (int i = 0; i<num.size() ; i++) {
			if (num.get(i)<0){
				System.out.printf("O numero %d é menor que zero\n", num.get(i));
				c++;
			}
		}
		for (int i = 0; i<num.size() ; i++) {
			if (num.get(i)<=50 && num.get(i)>=5){
				System.out.printf("O numero %d está no intervalo de 5 a 50\n", num.get(i));
				x++;
			}
		}
		System.out.printf("A média dos numeros é %d\n", media);
		System.out.printf("Há %d numero(s) abaixo de zero\n", c);
		System.out.printf("Há %d numero(s) no intervalo de 5 a 50", x);
	}

}
