import java.util.Scanner;

public class TestEcuacion {
	/*
	 * a·x+b·y=e
	 * c·x+d·y=f
	 */
	 
	public static void main (String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Introduce el valor de x de la primera ecuación") ;
	  int a = sc.nextInt();
	  // ..............
	  sc.close();
	  System.out.println("Resolviendo sistema de ecuaciones siguiente:");
	  // ecuación1: 1 · x + -5 · y = 15
	  // ecuacion2: -3 . x + 1 · y = 0
	  
	  //llamamos al método que nos dice que es resoluble o no
	  if ( esResoluble
	  //si no es decimos que no se puede resolver
	  //si se puede resolver la resolvemos llamando a los método calcularX y calcularY
  	}
  	
  	public static boolean esResoluble(int a, int b, int c, int d) {
		//logica
		return false;
		
	}
}

