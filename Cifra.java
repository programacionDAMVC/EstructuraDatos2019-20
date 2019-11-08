import java.util.Scanner;

public class Cifra {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un nº comprendido entre 100 y 999 inclusive");
			int numero = in.nextInt();
			if (numero > 99 && numero < 1000) {
			int cifra1 = numero / 100;
			int cifra2 = (numero % 100) / 10;
			int cifra3 = (numero % 100) % 10;
			System.out.printf("El nº %d tiene como primera cifra %d, segunda cifra %d y tercera %d%n"
								, numero, cifra1, cifra2, cifra3);
		} else 
			System.out.printf("El nº %d tiene mas de tres cifras o menos de tres cifras\n", numero);
		in.close();
	}
}

