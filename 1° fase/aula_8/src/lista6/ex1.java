package lista6;

public class ex1 {

	public static int soma(int v1, int v2) {
		return v1+v2;
	}
	
	public static void soma2(int v3, int v4) {
		System.out.println("Soma2: " + (v3+v4));
	}
	
	public static boolean par(int num1) {
		return num1%2==0;
	}
	public static String decToBin(int num) {
		String sequenciaBin = " ";
		while(num>=2) {
			sequenciaBin = (num%2)+sequenciaBin;
			num = num/2;
		}
		sequenciaBin = num + sequenciaBin;
		return sequenciaBin;
	}
	
	public static int format(String seqBin) {
		int bytes = seqBin.length()/8;
		return seqBin;
	}
	
	public static void main(String[] args) {
		int val1 = 10;
		int val2 = 19;
		soma2(7,3);
		
		int result = soma(8,4);
		System.out.println("Soma: " + result);
		
		if (par(soma(8,4))){
			System.out.println("É par");
		}
		else {
			System.out.println("É impar");
		}
		System.out.println("Equivalente binário " + decToBin(soma(val1,val2)));
		System.out.println("Qquivalente binário " + format(decToBin(soma(val1,val2))));
	}

}
