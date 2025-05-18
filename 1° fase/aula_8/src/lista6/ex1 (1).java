package lista6;
import java.util.*;
public class ex1 {
	public static double volume(double raio) {
		double volume = (4*Math.PI*Math.pow(raio, 3))/3;
		System.out.println(volume);
		return volume;
	}

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.println("Digite o raio: ");
		double raio = N.nextDouble();
		N.close();
		volume(raio);
	}

}
