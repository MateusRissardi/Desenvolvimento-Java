package lista8;
import java.util.*;
public class ex10 {
static Scanner N = new Scanner(System.in);

	public static String[] preencheLista() {
		String[] lista = new String [5];
		for (int i = 0; i<5; i++) {
			System.out.println("Digite um caractere: ");
			lista[i] = N.next();
		}
		return lista;
	}

	public static String padrãodeLista(String[] lista1, String[] lista2) {
		String resposta = "";
		int cont = 0;
		for(int i = 0; i<5; i++) {
			for(int c = 0; c<5; c++) {
				if(lista1[i].equalsIgnoreCase(lista2[c])) {
					cont++;
					break;
				}
			}
			
		}
		if(cont == 5) {
				resposta = "A lista é igual";
			}
			else {
				resposta = "A lista não é igual";
			}
		return resposta;
	}
	
	public static void main(String[] args) {
		String[] lista1 = preencheLista();
		String[] lista2 = preencheLista();
		System.out.println(padrãodeLista(lista1, lista2));
	}

}
