package lista4;
import java.util.*;
public class ex6 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.println("Digite um numero inteiro positivo");
		int num = N.nextInt();
		N.close();
		if(num<0) {
			System.out.println("Numero negativo");
			return;
		}
		int cont = 0;
		int neg = 1;
		while(num>0) {
			num = num - neg;
			neg = neg+2;
			cont ++;
		}
		if(num==0) {
			System.out.println("Raiz exata: " + cont);
		}
		else if(num<0) {
			System.out.println("Raiz Aproximada: " + cont);
		}
	}

}
