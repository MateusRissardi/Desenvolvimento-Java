package lista9;
import java.util.*;
public class ex4 {
static Scanner N = new Scanner(System.in);
	
	public static int numPrimo(int[][] num) {
		int numPrimo = 0;
		int maior = Integer.MIN_VALUE;
		int par = 0;
		int tresDigitos = 0;
		for(int i = 0; i<3; i++) {
			for(int c = 0; c<3; c++) {
				if(((num[i][c]%2!=0) && (num[i][c]%3!=0) && (num[i][c]%5!=0) && (num[i][c]%7!=0)) || ((num[i][c]==2) || (num[i][c]==3) || (num[i][c]==5) || (num[i][c]==7))) {
					numPrimo++;
					if(Math.abs(num[i][c])>=100) {
						tresDigitos++;
					}
				}
				else {
					if(num[i][c]>maior) {
						maior = num[i][c];
					}
					if(num[i][c]%2==0) {
						par+=1;
					}
				}
			}
		}
		System.out.println("Maior numero não primo: " + maior);
		System.out.println("Numeros não primos pares: " + par);
		System.out.println("Numeros primos com três digitos: " + tresDigitos);
		return numPrimo;
	}
	
	public static void lerMatriz(int[][] matriz) {
		for(int i = 0; i<3; i++) {
			for(int c = 0; c<3; c++) {
				System.out.println(matriz[i][c]);
			}
			System.out.printf("\n");
		}
	}
	
	public static int[][] gerarMatriz(){
		int[][] matriz = new int[3][3];
		for(int i = 0; i<3; i++) {
			for(int c = 0; c<3; c++) {
				System.out.println("Digite um numero" + i + " " + c);
				matriz[i][c] = N.nextInt();
			}
		}
		return matriz;
	}
		
	public static void main(String[] args) {
		int[][] matriz = gerarMatriz();
		lerMatriz(matriz);
		System.out.println(numPrimo(matriz));
	}

}
