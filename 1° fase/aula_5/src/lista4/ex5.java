package lista4;
import java.util.*;
public class ex5 {

	public static void main(String[] args) {
	Scanner N = new Scanner(System.in);
	String cons = "";
	int maxkw = Integer.MIN_VALUE;
	int minkw = Integer.MAX_VALUE;
	int media = 0;
	int res = 0; int com = 0; int ind = 0; int cont = 0;
	while (1>0) {
		System.out.println("Digite o nome do consumidor: ");
		cons = N.next();
		if (cons.equalsIgnoreCase("x")) {
			break;
		}
		System.out.println("Digite o preço Kw/h: ");
		int kw = N.nextInt();
		System.out.println("Digite o numero do consumidor: ");
		int numC = N.nextInt();
		System.out.println("Digite o numero de Kw/h consumidos durante o mês: ");
		int kwC = N.nextInt();
		System.out.println("Digite o código do tipo de consumidor (1 residencial, 2 comercial, 3 industrial): ");
		int cod = N.nextInt();
		switch(cod) {
		case 1:
			res = kwC + res;
		case 2:
			com = kwC + com;
		case 3:
			ind = kwC + ind;
		}
		if(kwC>maxkw) {
			maxkw = kwC;
		}
		else if(kwC<minkw) {
			minkw = kwC;
		}
		media = kwC + media;
		int soma = kw*kwC;
		System.out.println("Numero do cliente: " + numC);
		System.out.println("Total a pagar: " + soma);
		cont = 1+cont;
		media = media/cont;
	}
	media = media/cont;
	System.out.println("Maior consumo: " + cons);
	System.out.println("Menor consumo: " + cons);
	System.out.println("Consumo tipo 1: " + res);
	System.out.println("Consumo tipo 2: " + com);
	System.out.println("Consumo tipo 3: " + ind);
	System.out.println("Media de consumo" + media);
	N.close();

	}

}
