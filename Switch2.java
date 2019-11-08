public class Switch2 {
	
	public static void main (String[] args) {
		
		int diaFuturo = 1_000_000;
		int diaActual = 2;
		int resto = (diaFuturo + diaActual) % 7;
		String dia = calcularDiaDeSemana(resto);
		System.out.printf("Dentro de %d días, será %s%n", diaFuturo, dia);
		System.out.printf("Dentro de %d días, será %s%n",
			3_724, calcularDiaDeSemana((3_724 + 2) % 7));
	}
	
	public static String calcularDiaDeSemana(int valor) {
		String dia ="";
		switch ( valor ) {  //empezamos en domingo
			case 0 :
				dia = "Domingo";
				break;
			case 1 :
				dia = "Lunes";
				break;
			case 2 :
				dia = "Martes";
				break;
			case 3 :
				dia = "Miércoles";
				break;
			case 4 :
				dia = "Jueves";
				break;
			case 5 :
				dia = "Viernes";
				break;
			default :
				dia = "Sábado";
		}
		return dia;
	}
}
