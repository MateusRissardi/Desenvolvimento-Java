package aula_1;

import java.util.Scanner;

public class Questao_2 {
	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Digite o seu saldo médio no último ano");
	    
	    float saldo_medio = N.nextFloat();
	    
	    if (saldo_medio < 0) {
	    	System.out.println("Erro. Saldo negativo.");
	    }
	    else if (saldo_medio >= 0 && saldo_medio <= 500) {	    	
	    	double valor_credito = saldo_medio * 0.3; 
	    	String mensagem = String.format("Valor do saldo = %.2f, e o valor do crédito = %.2f.", saldo_medio, valor_credito);
	    	System.out.println(mensagem);
	    }
	    else if (saldo_medio >= 1001 && saldo_medio <= 3000) {	    	
	    	double valor_credito = saldo_medio * 0.4; 
	    	String mensagem = String.format("Valor do saldo = %.2f, e o valor do crédito = %.2f.", saldo_medio, valor_credito);
	    	System.out.println(mensagem);
	    }
	    else if (saldo_medio >= 3001) {	    	
	    	double valor_credito = saldo_medio * 0.5; 
	    	String mensagem = String.format("Valor do saldo = %.2f, e o valor do crédito = %.2f.", saldo_medio, valor_credito);
	    	System.out.println(mensagem);
	    }
	}
}
	
