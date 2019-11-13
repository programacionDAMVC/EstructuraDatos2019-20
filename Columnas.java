import java.util.Scanner;

public class Columnas {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nº de columnas");
		int numeroColumnas = sc.nextInt();
		System.out.println("Introduce el nº a imprimir");
		int numero = sc.nextInt();
		sc.close();
		
		System.out.println("Imprimiendo nº en columnas");
		for (int i = 1; i <= numero; i ++) {
			System.out.printf("%5d",i);  
			if (i % numeroColumnas == 0) {
				System.out.println();
			} 
		} 
	}
}

