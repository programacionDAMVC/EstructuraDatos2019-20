import java.util.Scanner;

public class Columnas {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//controlamos que el nº de columnas sea distinto de cero y positivo
		//controlamos que el número este comprendido entre 1 y 1000 (inclusive)
		int numeroColumnas = 0;
		int numero = 0;
		do {
			
			System.out.println("Introduce el nº de columnas (máximo 10)");
			numeroColumnas = sc.nextInt();
			System.out.println("Introduce el nº a imprimir (superior a 1 e inferior a 1000)");
			numero = sc.nextInt();
			
		} while ( numeroColumnas == 0 || numeroColumnas < 0 || numeroColumnas > 10
					|| numero < 1 || numero > 1000);
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

