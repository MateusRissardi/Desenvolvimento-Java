package lista9;
import java.util.*;
public class ex3 {
static Scanner N = new Scanner(System.in);
public static int[][] fazerMatriz(){
	int[][] matriz = new int[3][3];
	for(int i = 0; i<3; i++) {
		for(int c = 0; c<3; c++) {
			System.out.println("Digite um valor");
			matriz[i][c] = N.nextInt();  
		}
	}
	return matriz;
}
public static void bin (int SS) {
	String bin = "";
	while (SS>0) {
		bin = (SS%2) + bin;
		SS = SS/2;
	}
	if(bin.length()==0) {
		bin =" 0";
	}
	System.out.println(bin);
}
public static int diag(int[][] matrizA) {
	int subt = 0;
	int SP = 0;
	int SS = 0;
	double media = 0;
	int quant = 0;
	for(int i = 0; i<3; i++) {
		SP = matrizA[i][i] + SP;
		SS = matrizA[(i)][(2-i)] + SS;
	}
	System.out.println("Soma da diagonal principal (SP): " + SP);
    System.out.println("Soma da diagonal secundária (SS): " + SS);
	bin(SS);
	subt = SS-SP;
	media = (SS+SP)/6;
	for(int i = 0; i<3; i++) {
		if(matrizA[i][i]<media){
			quant+=1;
		}
	}
	System.out.println("Houve " + quant + " ocorrências de um elemento ser menor q a média na SP");
	return subt;
}

public static void lerMatriz(int[][] matriz) {
	for(int i = 0; i<3; i++) {
		for(int c = 0; c<3; c++) {
			System.out.print(matriz[i][c] + " ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		int[][] matrizA = fazerMatriz();
		lerMatriz(matrizA);
		System.out.println("Diferença (SS - SP): " + diag(matrizA));
	}

}