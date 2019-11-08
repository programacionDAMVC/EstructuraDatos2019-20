// java Calculadora suma 2 5
// java Calculadora args[], donde args[0] es suma
// args[1] es 2 y args[2] es 5
// a parte de suma, resta, division, multiplicacion
/**
 * Documentación javadoc
 */
 
public class Calculadora {
	
	public static void main (String[] argumentos) {
		if (argumentos.length < 3){
			System.out.println("Faltan argumentos");
			System.exit(2);
		}
		String operacion = argumentos[0].toLowerCase();
		double valor1    = Double.parseDouble(argumentos[1]); //parseo de String a double
		double valor2    = Double.parseDouble(argumentos[2]);
		double resultado = 0;
		boolean operacionValida = true;
		switch (operacion) {
			case "suma":
				resultado = valor1 + valor2;
				break;
			case "resta":
				resultado = valor1 - valor2;
				break;
			case "multiplicacion":
				resultado = valor1 * valor2;
				break;
			case "division":
				resultado = valor1 / valor2;
				break;
			default:
			operacionValida = false;
			System.out.println(operacion + " No permitida en nuestra calculadora");
		}
		if (operacionValida)
			System.out.printf("El resultado de la operación %S de los valores %.2f %.2f vale %.3f%n" ,
							operacion, valor1, valor2, resultado);
	}
}

