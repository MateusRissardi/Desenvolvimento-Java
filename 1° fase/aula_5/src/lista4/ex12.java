package lista4;

public class ex12 {
	
	public static void main(String[] args) {
		int i = 25; int soma = 0;
		while (i<200) {
			if(i%2==0) {
				soma = soma + i;
			}
			i++;
		}
		System.out.println("A soma de todos os pares entre 25 e 200 é de " + soma);
	}
}
