import java.util.Scanner;

public class LeerConsola {
	
	public static void main (String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Introduce un token tipo cadena");
		 String token = sc.next();
		 System.out.printf("Introducido token %s%n", token);
		 while (sc.hasNext()) {
		    token = sc.next();
			System.out.printf("Introducido token %s%n", token);
			if (token.equalsIgnoreCase("FIN")) {
				break;
			}
		 }
		 System.out.println("Introduce un nº entero");
		 int numeroEntero = sc.nextInt();
		 System.out.printf("Introducido el valor %d%n", numeroEntero);
		 System.out.println("Introduce un nº real");
		 double numeroDouble = sc.nextDouble();
		 System.out.printf("Introducido el valor %.2f%n", numeroDouble);

		 sc.close(); //cierre del Scanner	
		
	}
}

