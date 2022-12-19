package unidad_4;
import entrada.Teclado;

public class Actividad_2x09 {
	public static int numeroEspacios(String frase) {
		int numeroEspacios = 0;

		for (int i = 0; i <= frase.length() - 1; i++) {
			if (frase.charAt(i) == ' ') {
				numeroEspacios++;
			}
		}
		return numeroEspacios;
	}

	// indica la posicion del espacio desde el numero de espacio que se le indica
	public static int posicionNumeroEspacio(int numero_espacio, String frase) {
		int posicion = 0, num = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			posicion++;
			if (frase.charAt(i) == ' ') {
				num++;
				if (num == numero_espacio) {
					return posicion;
				}
			}
		}

		return 0;
	}
	
	public static void main(String[] args) {
		String input, nombre_estructurado="", iniciales="";
		
		input = Teclado.leerCadena("¿nombre completo?");
		
		if (numeroEspacios(input) == 2) {
			nombre_estructurado = input.substring(posicionNumeroEspacio(1, input), posicionNumeroEspacio(2, input)) + input.substring(posicionNumeroEspacio(2, input)) + ", " + input.substring(0, posicionNumeroEspacio(1, input)); 
			iniciales = input.substring(0, 1) + input.substring(posicionNumeroEspacio(1, input), posicionNumeroEspacio(1, input)+1) + input.substring(posicionNumeroEspacio(2, input), posicionNumeroEspacio(2, input)+1);
			System.out.println(nombre_estructurado);
			System.out.println(iniciales.toUpperCase());
		} else {
			System.out.println("El nombre completo debe tener 2 espacios en blanco.\r\n"
					+ "El nombre completo no debe comenzar con un espacio en blanco.\r\n"
					+ "El nombre completo no debe terminar con un espacio en blanco.");
		}
	}
}
