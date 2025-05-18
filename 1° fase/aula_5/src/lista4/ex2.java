package lista4;
import java.util.*;
public class ex2 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		float faren = 50;
		float cent = 0;
		N.close();
		while (faren <= 150) {
			cent = (5.0f/9.0f)*(faren-32);
			System.out.printf("%.1f farenheit: %.2f celsius\n", faren, cent);
			faren++;
		}
	}

}
