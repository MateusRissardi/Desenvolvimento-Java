package aula_5;
import java.util.*;
public class ex8 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.println("Diga até quando vai a série Fibonacci: ");
		int num = N.nextInt();
		N.close();
		int numAt = 1; int numAnt = 0;
		while(num>0) {
			int soma = numAnt+numAt;
			numAnt = numAt;
			numAt = soma;
			num--;
			System.out.println(soma);
		}
	}
	

}
