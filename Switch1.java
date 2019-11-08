public class Switch1 {
	
	public static void main (String[] args) {
		int diaFuturo = 1_000_000;
		int diaActual = 2;
		int resto = (diaFuturo + diaActual) % 7;
		String dia ="";
		switch ( resto ) {  //empezamos en domingo
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
		System.out.printf("Dentro de %d días, será %s%n", diaFuturo, dia);
	}
}

