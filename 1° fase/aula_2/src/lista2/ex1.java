package lista2;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.println("Digite três notas de um aluno: ");
		float nota1 = N.nextFloat();
		float nota2 = N.nextFloat();
		float nota3 = N.nextFloat();
		
		if (nota1<0 || nota2<0 || nota3<0) {
			System.out.println("Nota inválida!");
			return;
		}
		
		System.out.println("Digite o tipo de média (1 para aritmética, 2 para ponderada): ");
		int num = N.nextInt();
		
		if (num == 1) {
			float media = (nota1+nota2+nota3)/3;
			System.out.println("A média do aluno foi de " + media);
		}
		else if (num == 2) {
			System.out.println("Digite o peso de cada nota: ");
			float p1 = N.nextFloat();
			float p2 = N.nextFloat();
			float p3 = N.nextFloat();
				if(p1<=0 || p2 <= 0 || p3 <= 0) {
					System.out.println("Peso invalido");
					return;
				}
			float somaPesos = p1 + p2 + p3;
			float media = ((nota1*p1)+(nota2*p2)+(nota3*p3))/somaPesos;
			System.out.printf("A média do aluno foi de %.2f", media);
			return;
		}
		else if (num>2 || num<1) {
			System.out.println("Tipo não reconhecido!");
			return;
		}
	}

}
