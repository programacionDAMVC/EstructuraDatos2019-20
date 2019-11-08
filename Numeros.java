public class Numeros {

	public static void main(String [] args) {
		imprimirNumerosWhile();
		separador();
		imprimirNumerosFor();
		separador();
		imprimir100a50();
		separador();
		int numero = 65;
		if ( numero > 0 ){
			int sumaN = sumar1aN(numero);
			System.out.printf(
				"Suma de 1 a %d vale %d%n", numero, sumaN);
			separador();
			int sumaN2 = sumar1aN2(numero);
			System.out.printf(
				"Suma de los cuadrados de 1 a %d vale %d%n", numero, sumaN2);
			separador();
			sumarParesEImpares(numero);
			
		} else {
			System.out.println(numero + " no es un nº natural");
		}
	}	
	
	public static void separador() {
		System.out.println("******************");
	}
	
	public static void imprimirNumerosWhile() {
		
		int contador = 1;
		
		while(contador <= 10) {
			System.out.println("Número: " + contador);
			contador++;
		}
	}
	
	public static void imprimirNumerosDoWhile() {
		
		int contador = 1;
		
		do {
			System.out.println("Número: " + contador);
			contador++;
		} while( contador <= 10);
	}
	
	public static void imprimirNumerosFor() {
		
		for(int contador = 1; contador <= 10; contador++) {
			System.out.println("Número: " + contador);
		}
		
	}
	
	public static void imprimir20a80() {
		int numero = 20;
		
		while (numero <= 80) {
			System.out.println("Número: " + numero);
			numero += 5;
		}
	}
	
	public static void imprimir20a80Divisores() {
		int numero = 20;
		
		while (numero <= 80) {
			if (numero % 5 == 0) {
				System.out.println("Número: " + numero);
			}
			numero++;
		}
	}
	//Devuelva la siguiente serie: 100 98 96 94 . . . 56 54 52 50
	public static void imprimir100a50(){
		for (int i = 100 ; i >= 50 ; i -= 2 ) { // i = i -2
			System.out.println("Número: " + i);
		}
	}
	//Devuelva la suma de los números enteros del 1 a N
	public static int sumar1aN(int numero) {
		int suma = 0;
		for (int i = 1; i <= numero; i++) {
			suma += i;
		}
		return suma;
	}
	//Devuelva la suma de los números enteros del 1² + 2² + ... + N²
	public static int sumar1aN2(int numero) {
		int suma = 0;
		for (int i = 1; i <= numero; i++) {
			suma += i * i;
		}
		return suma;
	}
	//suma de los pares e impares comprendidos entre 1 y N
	public static void sumarParesEImpares(int numero) {
		int sumaPares   = 0;
		int sumaImpares = 0;
		for (int i = 1; i <= numero; i++) {
			if ( i % 2 == 0) { //i es nº par
				sumaPares += i;
			} else {  //i es impar
				sumaImpares += i;
			}
		}
		System.out.println("La suma de los  pares  vale: " + sumaPares);
		System.out.println("La suma de los impares vale: " + sumaImpares); 
 
	}
	
	
	
	
	
	
}
