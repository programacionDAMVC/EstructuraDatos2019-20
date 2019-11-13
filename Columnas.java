import java.util.Scanner;

public class Columnas {
	
	static Scanner sc = new Scanner(System.in);  //visible en todos lo métodos
	
	public static void main (String[] args) {
		// leer las columnas, deben ser distinto de cero y positivo
		int numeroColumnas = leerColumnas();
		//leer un número este comprendido entre 1 y 1000 (inclusive)
		int numero = leerNumero();
		//mostrar números
		mostrarNumeros(numeroColumnas, numero);
		sc.close();
	}
	
	public static int leerColumnas() {
		int numeroColumnas = 0;
		do {
			System.out.println("Introduce el nº de columnas (máximo 10)");
			numeroColumnas = sc.nextInt();
		} while ( numeroColumnas <= 0  || numeroColumnas > 10 );	
		return numeroColumnas;
	}
	
	public static int leerNumero() {
		int numero = 0;
		do {
			System.out.println("Introduce el nº a imprimir (superior a 1 e inferior a 1000)");
			numero = sc.nextInt();
		} while (numero < 1 || numero > 1000);
		return numero;
	}
	
	public static void mostrarNumeros(int numeroColumnas, int numero){
					
		System.out.println("Imprimiendo nº en columnas");
		for (int i = 1; i <= numero; i ++) {
			System.out.printf("%5d",i);  
			if (i % numeroColumnas == 0) {
				System.out.println();
			} 
		} 
	}
}

