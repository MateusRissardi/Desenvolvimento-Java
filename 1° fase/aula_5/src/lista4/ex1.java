package lista4;
import java.util.*;
public class ex1 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.println("Digite um numero");
		int num = N.nextInt();
		String bin = "";
		N.close();
		while (num>0) {
			int resto = num%2;
			bin = resto + bin;
			num = num/2;
		}
		System.out.println("O valor binário é " + bin);
	}

}
