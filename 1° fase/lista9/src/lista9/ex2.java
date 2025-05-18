package lista9;
import java.util.*;
public class ex2 {
static Scanner N = new Scanner(System.in);
public static int[][] fazerMatriz(){
	int[][] matriz = new int[5][5];
	for(int i = 0; i<5; i++) {
		for(int c = 0; c<5; c++) {
			System.out.println("Digite um valor");
			matriz[i][c] = N.nextInt();  
		}
	}
	return matriz;
}
public static int[][] soma(int[][] matrizA, int[][] matrizB) {
	int[][] soma = new int [5][5];
	for(int i = 0; i<5; i++) {
		for(int c = 0; c<5; c++) {
			soma[i][c] = matrizA[i][c] + matrizB[i][c];  
		}
	}
	return soma;
}

public static void lerMatriz(int[][] matriz) {
	for(int i = 0; i<5; i++) {
		for(int c = 0; c<5; c++) {
			System.out.println(matriz[i][c]);
		}
		System.out.printf("\n");
	}
}
	public static void main(String[] args) {
		int[][] matrizA = fazerMatriz();
		int[][] matrizB = fazerMatriz();
		lerMatriz(soma(matrizA, matrizB));
	}

}