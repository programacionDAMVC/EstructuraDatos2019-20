import java.util.Scanner;

/**
 * Clase para explicar el funcionamiento del método nextLine() de la clase Scanner
 * @author Manuel Molino
 * @version 0.1
 * */
public class LeerNombreLinea {
	
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		String nombre = leerNombre();
		String direccion = leerDireccion();
		int edad = leerEdad();
		System.out.printf("nombre: %S%nedad:%d%ndirección: %s%n", nombre, edad, direccion);
		sc.close();
	}
	
	/**
	 * Método que solicita el nombre de una persona y lo retorna
	 * @return el String que contiene el nombre completo de la persona
	 */
	public static String leerNombre() {
	
		System.out.println("Introduce nombre"); 
		String nombre = sc.nextLine();
		return nombre;
		
	}
	/**
	 * Método que solicita la edad de una persona y la retorna
	 * @return el int que contiene la edad de la persona
	 */
	public static int leerEdad() {
		
		System.out.println("Introduce la edad");
		int edad = sc.nextInt();
		return edad;
		
	}
	
	/**
	 * Método que solicita la dirección de una persona y la retorna
	 * @return el String que contiene la dirección de la persona
	 */
	public static String leerDireccion() {
		
		System.out.println("Introduce dirección");
		String direccion = sc.nextLine();
		return direccion;
		
	}
	
}

