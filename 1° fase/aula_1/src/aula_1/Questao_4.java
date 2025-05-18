package aula_1;

import java.util.Scanner;

public class Questao_4 {
	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Sua idade:");
	    
	    int idade = N.nextInt();
	    
	    if (idade < 16) {
	    	System.out.println("Não eleitor.");
	    }
	    else if (idade >= 18 && idade <= 65) {
	    	System.out.println("Eleitor obrigatório");
	    }
	    else if (idade >= 16 && idade <= 17 || idade >65 ) {
	    	System.out.println("Eleitor facultativo");
	    	
	    }
	}
}
