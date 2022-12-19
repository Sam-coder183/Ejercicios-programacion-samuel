package unidad_4;

import entrada.Teclado;

public class actividad_2x08 {
	// indica el numero de espacios que tiene una frase
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
		int i = 1, num_nombres = 1, posicion_espacio_nombre = 0, posicion_espacio_apellido = 3, k=0;
		String input, nombres = "", nombre_reemplazado = "";
		
		
		num_nombres = Teclado.leerEntero("¿numero de parejas de nombres?");
		
		
		while (i <= num_nombres * 2) {
			input = Teclado.leerCadena("¿nombre completo " + k + "?");
			if (numeroEspacios(input) == 1) {
				nombres += input + " ";
				if (k < 2) {
					k++;
				} else {
					k = 1;
					System.out.println("pareja " + i / 2);
				}
				i++;
			} else {
				System.out.println("El nombre completo debe tener 1 espacio en blanco"
						+ "\nEl nombre completo no debe comenzar con un espacio en blanco"
						+ "\nEl nombre completo no debe terminar con un espacio en blanco");
			}
		}
		
		/*para calcular las parejas de nombres con apellidos invertidos coje la posicion del espacio del nombree (primera posicion 0 y despues suma 2)
		 * con la posicion del espacio del apellido (primera posicion 3 y despues suma 2), y cuando no queden mas apellidos a la derecha (es decir, que solo queda 
		 * el apellido del primer nombre) coje la posicion del espacio de nombre (el ultimo nombre) con la posicion del espacio del primer apellido*/
		
		for (int j = 1; j < i; j++) {
			if (posicion_espacio_apellido <= numeroEspacios(nombres)) {
				nombre_reemplazado = "";
				nombre_reemplazado = nombres.substring(posicionNumeroEspacio(posicion_espacio_nombre, nombres),
						posicionNumeroEspacio(posicion_espacio_nombre + 1, nombres))
						+ nombres.substring(posicionNumeroEspacio(posicion_espacio_apellido, nombres),
								posicionNumeroEspacio(posicion_espacio_apellido + 1, nombres));
				posicion_espacio_nombre += 2;
				posicion_espacio_apellido += 2;
				
			} else {
				nombre_reemplazado = "";
				nombre_reemplazado = nombres.substring(posicionNumeroEspacio(posicion_espacio_nombre, nombres),
						posicionNumeroEspacio(posicion_espacio_nombre + 1, nombres))
						+ nombres.substring(posicionNumeroEspacio(1, nombres), posicionNumeroEspacio(2, nombres));
			}
			System.out.println(nombre_reemplazado);
		}
	}
}
