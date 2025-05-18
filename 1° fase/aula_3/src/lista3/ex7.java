package lista3;
import java.util.*;
public class ex7 {

	public static void main(String[] args) {
		int neg = 0;
		int pos = 0;
		Scanner N = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		System.out.println("Digite um numero: ");
		for (int i=0; i<20; i++) {
			lista.add(N.nextInt());
			if (lista.get(i)<0 ) {
				neg = neg+1;
			}
			else {
				pos = pos+1;
			}
		}
		neg = (neg*100)/20;
		pos = (pos*100)/20;
		System.out.println("O percentual de numeros positivos é de " + pos);
		System.out.println("O percentual de numeros negativos é de " + neg);
		N.close();
	}

}
