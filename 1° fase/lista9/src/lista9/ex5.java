package lista9;
import java.util.*;
public class ex5 {
static Scanner N = new Scanner(System.in);
	
	public static void inverMatriz(int[][] matriz) {
		int temp = 0;
		for(int i = 0; i<5; i++) {
			for(int c = i+1; c<5; c++) {
				temp = matriz[i][c];
                matriz[i][c] = matriz[c][i];
                matriz[c][i] = temp;
				}
			}
		imprimirMatriz(matriz);
		}
	
	public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[i][c] + "\t");
            }
            System.out.println();
        }
    }
	
	public static int[][] gerarMatriz(){
		int[][] matriz = new int[5][5];
		for(int i = 0; i<5; i++) {
			for(int c = 0; c<5; c++) {
				System.out.println("Digite um numero" + i + " " + c);
				matriz[i][c] = N.nextInt();
			}
		}
		return matriz;
	}
		
	public static void main(String[] args) {
		int[][] matrizA = gerarMatriz();
		imprimirMatriz(matrizA);
		inverMatriz(matrizA);
	}

}
