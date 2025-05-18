package aula_1;

import java.util.Scanner;

public class Questao_5 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.println("Digite seu prato, 1 - Vegetariano, 2 - Peixe, 3 - Frango e 4 - Carne");
		
		int prato = N.nextInt();
		int cal_prato = 0;
		
		if (prato == 1) {
			cal_prato = 180;
		}
		else if (prato == 2) {
			cal_prato = 230;
		}
		else if (prato == 3) {
			cal_prato = 250;
		}
		else if (prato == 4) {
			cal_prato = 350;
		}
		System.out.println("Digite sua sobremesa, 1 - Abacaxi, 2 - Sorvete diet, 3 - Mouse diet, 4 - Mouse chocolate");
		
		int sobremesa = N.nextInt();
		
		if (sobremesa == 1) {
			cal_prato =cal_prato+ 75;
		}
		else if (sobremesa == 2) {
			cal_prato =cal_prato+ 110;
		}
		else if (sobremesa == 3) {
			cal_prato =cal_prato+ 170;
		}
		else if (sobremesa == 4) {
			cal_prato =cal_prato+ 200;
		}
		System.out.println("Digite sua bebida, 1 - Chá, 2 - Suco de Laranja, 3 - Suco de melão, 4 - Refrigerante diet");
		
		int bebida = N.nextInt();
		
		if (bebida == 1) {
			cal_prato =cal_prato+ 20;
		}
		else if (bebida == 2) {
			cal_prato =cal_prato+ 70;
		}
		else if (bebida == 3) {
			cal_prato =cal_prato+ 100;
		}
		else if (bebida == 4) {
			cal_prato =cal_prato+ 65;
		}
	System.out.println("Sua refeição tem essa quantidade de calorias:" + cal_prato);
	}
}
