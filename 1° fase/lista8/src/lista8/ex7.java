package lista8;
import java.util.*;
public class ex7 {
static Scanner N = new Scanner (System.in);
	
	public static int[] preenchaLista (int[] a, int[] b, int c[]) {
		int cont = 0;
		a = fazerLista(a);
		b = fazerLista(b);
		for (int i = 0; i<40; i++) {
			if(i%2==0) {
				c[i] = a[cont];
			}
			else {
				c[i] = b[cont];
				cont++;
			}
		}
		return c;
	}
	
	public static int[] fazerLista (int[] lista){
		for(int i = 0; i<20; i++) {
			System.out.println("Digite um numero " + (i+1));
			lista[i] = N.nextInt();
		}
		return lista;
	}
	
	public static void main (String arg[]) {
		int a[] = new int [20];
		int b[] = new int [20];
		int c[] = new int [40];
		System.out.println(Arrays.toString(preenchaLista(a, b, c)));
	}

}
