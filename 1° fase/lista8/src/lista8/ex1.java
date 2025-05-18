package lista8;

import java.util.Scanner;

public class ex1 {
	static Scanner N = new Scanner(System.in);
	
	public static void preencherVetor(int[] arr) {
		for(int i = 0; i<arr.length; i++){
			System.out.println("Informe o valor " + (i+1));
			arr[i] = N.nextInt();
		}
	}
	
	public static void imprimeVetor(int arr[]) {
		for(int i = 0; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int descubraMaior(int arr[]) {
		int maior = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>maior) {
				maior = arr[i];
			}
		}
		return maior;
	}
	
	public static void inverteLista(int arr[]) {
		int i = 0;
		int temp = 0;
		int temp1 = 0;
		while(i!=4) {
			 temp = arr[i];
			 temp1 = arr[i+4];
			 arr[i+4] = temp;
			 arr[i] = temp1;
			 i++;
		}
		imprimeVetor(arr);
	}
	
	public static void alteraValor(int arr[]) {
		
		for(int i = 0; i<=i; i++) {
			System.out.println("Informe uma posição do índice para trocar");
			int ind = N.nextInt();
			if(ind<0 || ind>=10) {
				System.out.println("Indice invalido");
				ind = N.nextInt();
			}
			else {
				System.out.println("Digite o valor");
				arr[ind] = N.nextInt();
				System.out.println("Deseja digitar outro valor?");
				ind = N.nextInt();
				if(ind>=10 || ind<0) {
					break;
				}
			}
		}
		
		imprimeVetor(arr);
	}
	
	public static void main(String[] args) {
		int[] lista = new int[10];
		preencherVetor(lista);
		imprimeVetor(lista);
		System.out.println(descubraMaior(lista));
		alteraValor(lista);
		inverteLista(lista);
	}

}
