
public class Hora {
	
	public static void main (String[] args) {
		
		//controlamos el nº de argumentos 
		if (args.length < 3){
			System.out.println("Falta argumentos");
			System.exit(1);
		}
		
		//leemos desde los argumentos
		String sHora     = args[0]; 
		String sMinutos  = args[1];
		String sSegundos = args[2];
		
		//convertimos a int
		int iHora     = Integer.parseInt(sHora);
		int iMinutos  = Integer.parseInt(sMinutos);
		int iSegundos = Integer.parseInt(sSegundos);
		
		//comprobar hora, minutos y segundos válidos
		if ( iHora >= 0 && iHora < 24 && iMinutos >= 0 && iMinutos < 60 && iSegundos >= 0 && iSegundos < 60) 
			System.out.println("Hora válida");
		else
			System.out.println("Hora no válida");
			
	}
}

