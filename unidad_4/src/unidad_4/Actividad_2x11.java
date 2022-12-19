package unidad_4;

import entrada.Teclado;

public class Actividad_2x11 {
	public static int numeroEspacios(String frase) {
		int numeroEspacios = 0;

		for (int i = 0; i <= frase.length() - 1; i++) {
			if (frase.charAt(i) == ' ') {
				numeroEspacios++;
			}
		}
		return numeroEspacios;
	}
	
	public static String invertirpalabra(String palabra) {
		String salida="";
		for (int i=palabra.length()-1; i >= 0; i--) {
			salida += palabra.charAt(i);
		}
		
		return salida;
	}
	
	public static void main(String[] args) {
		String input = "";
		
		input = Teclado.leerCadena("¿palabra?");
		
		while (numeroEspacios(input) != 0) {
			System.out.println("La palabra no debe contener ningún espacio en blanco.");
			input = Teclado.leerCadena("¿palabra?");
		}
		
		if (input.equals(invertirpalabra(input))) {
			System.out.println("La palabra " + input + " es palindroma");
		} else {
			System.out.println("La palabra " + input + " no es palindroma");
		}
		System.out.println(invertirpalabra(input));
		
	}
}
