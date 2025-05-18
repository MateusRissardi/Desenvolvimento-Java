package lista2;
public class ex6 {

	public static void main(String[] args) {
		int num = 999;
		while(num<9999) {
			num = num + 1;
			int div = num/100;
			int resto = num%100;
			int soma = (div+resto)*(div+resto);
			if(soma==num) {
				System.out.printf("O numero %d possui a propriedade\n", num);
			}
		}
	}

}