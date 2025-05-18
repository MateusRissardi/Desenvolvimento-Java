package lista3;
import java.util.*;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int media = 0;
		Scanner N = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i<10 ; i++) {
			System.out.println("Digite um numero: ");
			int temp = N.nextInt();
			if(temp<0) {
				System.out.println("O numero não pode ser negativo");
				break;
			}
			num.add(temp);
			media+=temp;
		}
		media = media/num.size();
		N.close();
		System.out.println("Verificação dos numeros, aguarde...\n");
		for (int i = 0; i<num.size() ; i++) {
			if (num.get(i)<menor){
				menor = num.get(i);
			}
			else if (num.get(i)>maior) {
				maior = num.get(i);
			}
		}
		System.out.printf("A média dos numeros é %d\n", media);
		System.out.printf("O maior numero é %d\n", maior);
		System.out.printf("O menor numero é %d", menor);
	}

}