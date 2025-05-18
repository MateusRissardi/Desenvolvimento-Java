package lista3;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = N.nextInt();
		N.close();
		System.out.println("Tabuada do numero " + num);
		for (int i = 0; i<10 ; i++) {
			int multi = (i+1) * num;
			System.out.printf("%d x %d = %d\n", i+1, num, multi);
		}
	}

}
