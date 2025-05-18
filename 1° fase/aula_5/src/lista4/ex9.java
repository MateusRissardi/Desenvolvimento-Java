package lista_5;
import java.util.*;
public class ex3 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.println("Digite dois numeros: ");
		int num1 = N.nextInt();
		int num2 = N.nextInt();
		int i = 0;
		int n = 0;
		while (i<20) {
			if(i % 2 == 0) {
				n = num1 - num2;
			}
			else {
				n = num1 + num2;
			}
			i++;
			num1 = num2;
			num2 = n;
			System.out.println(n);
		}
		System.out.println("Acabou ;)");
	}

}
