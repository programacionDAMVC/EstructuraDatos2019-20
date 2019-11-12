import java.util.Scanner;

public class LeerNombreLinea {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		String nombre = leerNombre();
		String direccion = leerDireccion();
		int edad = leerEdad();
		System.out.printf("nombre: %S%nedad:%d%ndirección: %s%n", nombre, edad, direccion);
		sc.close();
	}
	
	
	public static String leerNombre() {
	
		System.out.println("Introduce nombre"); 
		String nombre = sc.nextLine();
		return nombre;
		
	}
	
	public static int leerEdad() {
		
		System.out.println("Introduce la edad");
		int edad = sc.nextInt();
		return edad;
		
	}
	
	public static String leerDireccion() {
		
		System.out.println("Introduce dirección");
		String direccion = sc.nextLine();
		return direccion;
		
	}
	
}

