package lista3;
import java.util.*;
public class ex8 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		int exc = 0,bt = 0, exp = 0;
		float media = 0;
		for (int i=0; i<5; i++) {
			System.out.println("Digite a nota do aluno " + (i+1));
			for (int c = 0; c<5; c++) {
				float temp = N.nextFloat();
				media = media+temp;
				if(temp >= 9 && temp <=9.9) {
					exc = exc + 1;
				}
			}
			media = media/5;
			System.out.printf("A media anual dele foi de %.2f\n", media);
			if ((media<=10 && media > 9) || exc>1) {
				System.out.println("Aluno exemplar!!! (2 ou mais notas iguais a 10)");
				exp = exp + 1;
			}
			else if (media<= 10 && media >= 9) {
				System.out.println("Aluno excelente!!");
			}
			else if (media < 9 && media >= 8) {
				System.out.println("Aluno ótimo!");
			}
			else if (media < 8 && media>= 7) {
				System.out.println("Aluno bom");
				bt = bt +1;
			}
			media = 0;
			exc = 0;
		}
		System.out.println("Quantidade de alunos que tiraram notas boas: " + bt);
		exp = (exp*100)/5;
		System.out.println("Porcentagem de alunos exemplares: " + exp);
		N.close();
	}

}