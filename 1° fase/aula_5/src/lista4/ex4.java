package lista4;
import java.util.*;
public class ex4 {

	public static void main(String[] args) {
	Scanner N = new Scanner(System.in);
	String curso = "";
	while (1>0) {
		System.out.println("Digite o nome do curso: ");
		curso = N.next();
		if (curso.equalsIgnoreCase("x")) {
			break;
		}
		System.out.println("Digite o código do curso: ");
		int cod = N.nextInt();
		System.out.println("Digite o numero de vagas: ");
		int vagas = N.nextInt();
		System.out.println("Digite o numero de candidatos masculinos: ");
		int masc = N.nextInt();
		System.out.println("Digite o numero de candidatos femininos: ");
		int fem = N.nextInt();
		int cand = masc+fem;
		int porcM = (masc*100) / cand;
		int porcF = (fem*100) / cand;
		System.out.println("Curso: " + curso);
		System.out.printf("Há %d candidatos para %d vagas \n", cand, vagas);
		System.out.printf("Código do curso: %d \nPorcentagem de candidatas do sexo feminino %d \nPorcentagem de candidatos do sexo masculino %d\n", cod, porcF, porcM);
		curso = "";
	}
	N.close();

	}

}
