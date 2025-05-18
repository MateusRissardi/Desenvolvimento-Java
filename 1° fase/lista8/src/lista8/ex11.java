package lista8;
import java.util.*;
public class ex11 {
static Scanner N = new Scanner(System.in);

public static int[] preencheLista() {
	int[] lista = new int [10];
	for (int i = 0; i<10; i++) {
		System.out.println("Digite um caractere: ");
		lista[i] = N.nextInt();
	}
	return lista;
}

	public static void valoresRepetidos(int[] lista) {
		String resposta = "";
		int cont = 0;
		for(int i = 0; i<10; i++) {
			cont = 0;
			for(int c = 0; c<10; c++) {
				if(lista[i] == lista[c]) {
					cont++;
				}
			}
			System.out.println("O numero " + lista[i] + " se repete " + (cont-1) + " vezes");;
		}
	}

	public static void main(String[] args) {
	int[] lista = preencheLista();	
	valoresRepetidos(lista);
	}
	
}
