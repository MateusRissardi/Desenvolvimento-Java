package lista3;
import java.util.*;
public class ex10 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		int sel = 0, com = 0, ind = 0, inc = 0, ini = 0, apc = 0, api = 0;
		for (int i = 0; i<4; i++) {
			System.out.printf("Digite a área do empregado %d ('1' para comércio, '2' para industria):", i);
			sel = N.nextInt();
			if(sel!=1 && sel!=2) {
				System.out.println("Valor inválido");
				return;
			}
			else if(sel==1) {
				sel = 0;
				System.out.println("Essa pessoa reside na cidade há pelo menos um ano? ('1' para sim, '0' para não)");
				if(N.nextInt()==1) {
					sel = 1;
				}
				System.out.println("Essa pessoa tem segundo grau completo? ('1' para sim, '0' para não)");
				if(N.nextInt()==1) {
					sel = sel + 1;
				}
				System.out.println("Essa pessoa tem experiência comprovada? ('1' para sim, '0' para não)");
				if(N.nextInt()==1) {
					sel = sel + 1;
				}
				com = com + 1;
				if (sel==3) {
					System.out.println("Candidato apto!");
					apc = apc + 1;
				}
				else {
					System.out.println("Candidato inapto!");
					inc = inc + 1;
				}
			}
			else if(sel==2){
				sel = 0;
				System.out.println("Essa pessoa reside na cidade há pelo menos um ano? ('1' para sim, '0' para não)");
				if(N.nextInt()==1) {
					sel = 1;
				}
				System.out.println("Essa pessoa tem segundo grau completo? ('1' para sim, '0' para não)");
				if(N.nextInt()==1) {
					sel = sel + 1;
				}
				System.out.println("Essa pessoa tem experiência comprovada? ('1' para sim, '0' para não)");
				if(N.nextInt()==1) {
					sel = sel + 1;
				}
				ind = ind + 1;
				if (sel==3) {
					System.out.println("Candidato apto!");
					api = api + 1;
				}
				else {
					System.out.println("Candidato inapto!");
					ini = ini + 1;
				}
			}
		}
		N.close();
		inc = (inc*100)/com;
		ini = (ini*100)/ind;
		System.out.printf("Quantidade de candidato de comércio e industria respectivamente: %d, %d\n", com, ind);
		System.out.printf("Percentual de candidato inapto de comércio e industria respectivamente: %d, %d\n", inc, ini);
		System.out.printf("Quantidade de candidato apto de comércio e industria respectivamente: %d, %d\n", apc, api);

	}

}
