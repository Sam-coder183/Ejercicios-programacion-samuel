package unidad_4;

import entrada.Teclado;

public class Actividad_1x02 {
	public static boolean esLetra(Character caracter) {
		if ((int) caracter >= 65 && (int) caracter <= 122) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean esLetraMayuscula(Character mayuscula) {
			if (Character.toUpperCase(mayuscula) == mayuscula) {
				return true;
			} else {
				return false;
			}
		
	}

	public static void main(String[] args) {
		char input = Teclado.leerCaracter("¿caracter? ");
		if (esLetra(input)) {
			if (esLetraMayuscula(input)) {
				System.out.println("el caracter " + input + " es mayuscula");
			} else {
				System.out.println("el caracter " + input + " es minuscula");
			}
		} else {
			System.out.println("el caracter " + input + " no es una letra");
		}
	}
}
