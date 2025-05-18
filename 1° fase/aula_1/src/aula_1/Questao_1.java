package aula_1;

import java.util.Scanner;

/**
 * @author 04404465033
 *
 */
public class Questao_1 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter your weight");
	    
	    float peso = N.nextFloat();
	    
	    System.out.println("Enter your height");
	    
	    float altura = N.nextFloat();
	    
	   float number = peso/(altura*altura);
	    
	    if (number < 18.5) {
	    	System.out.println("Magreza");
	    	
	    }
	    else if (number >= 18.5 && number <= 24.9 ) {
	    	System.out.println("Normal");
	    	
	    }
	    else if (number >= 25.0 && number <= 29.9) {
	    	System.out.println("Sobrepeso");
	    	
	    }
	    else if (number >= 30.0 && number <= 34.9) {
	    	System.out.println("Obesidade I");
	    }
	    else if (number >=35.0 && number <= 39.9) {
	    	System.out.println("Obesidade II");
	    
	    }
	    else if (number >= 40.0) {
	    	System.out.println("Obesidade III");
	    }
	}

}

