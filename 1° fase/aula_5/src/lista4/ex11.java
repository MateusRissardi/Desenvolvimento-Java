package lista4;

public class ex11 {

	public static void main(String[] args) {
		int i = 1;
		while(i<=500) {
			if(i%5==0) {
				System.out.printf("O numero %d é multiplo de 5\n", i);
			}
			if(i%3==0) {
				System.out.printf("O numero %d é multiplo de 3\n", i);
			}
			i = i+1;
		}
	}

}
