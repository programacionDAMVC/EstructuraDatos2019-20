import java.util.Scanner;

public class LeerNombre {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre completo:");
		String nombre = sc.nextLine();
		System.out.printf("Hola %s%n", nombre);
		sc.close();
	}
}

