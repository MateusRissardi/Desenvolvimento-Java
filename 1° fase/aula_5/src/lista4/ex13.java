package lista4;

public class ex13 {

	public static void main(String[] args) {
		double cidA = 500; double cidB = 700; int anos = 0;
		while(cidA<cidB) {
			cidA += cidA * 0.03;
			cidB += cidB * 0.02;
			anos++;
		}
		System.out.printf("Vai demorar %d anos para a cidade A ser maior que a cidade B", anos);
	}

}
