package lista9;
import java.util.*;
public class ex1 {
static Scanner N = new Scanner(System.in);
	public static void main(String[] args) {
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int[][] matriz = new int[5][5];
		for(int i = 0; i<5; i++) {
			for(int c = 0; c<5; c++) {
				System.out.println("Digite um valor");
				matriz[i][c] = N.nextInt();  
			}
		}
		for(int i = 0; i<5; i++) {
			for(int c = 0; c<5; c++) {
				if(matriz[i][c]>maior) {
					maior = matriz[i][c];
				}
				else if(matriz[i][c]<menor) {
					menor = matriz[i][c];
				}
			}
		}
		System.out.println(maior);
		System.out.println(menor);

	}

}
