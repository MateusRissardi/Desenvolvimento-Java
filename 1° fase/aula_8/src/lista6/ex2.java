package lista6;
import java.util.*;
public class ex2 {
	static Scanner N = new Scanner(System.in);
	public static float media(float n1, float n2, float n3, String mediaTipo) {
		float media = 0;
		if(mediaTipo.equalsIgnoreCase("P")) {
			media = ((n1*5) + (n2*3) + (n3*2))/(5+3+2);
		}
		else if (mediaTipo.equalsIgnoreCase("a")) {
			media = (n1+n2+n3)/3;
		}
		return media;
	}

	public static void main(String[] args) {
		
		System.out.println("Digite a nota 1, 2, e 3(a cada nota clique Enter): ");
		float n1 = N.nextFloat();
		float n2 = N.nextFloat();
		float n3 = N.nextFloat();
		
		System.out.println("Selecione o tipo de média (A para aritmética, P para ponderada): ");
		String mediaTipo = N.next();
		System.out.println(media(n1,n2,n3, mediaTipo));
		N.close();
		

	}

}
