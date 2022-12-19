package unidad_4;

import entrada.Teclado;

public class Actividad_2x01 {
	public static void main(String[] args) {
		String frase, minusculas = "", mayusculas = "";
		int numMinusculas = 0, numMayusculas = 0;
		frase = Teclado.leerCadena("¿frase? ");
		while (frase.length() > 60) {
			System.out.println("La frase debe tener 60 caracteres como maximo");
			frase = Teclado.leerCadena("¿frase? ");
		}

		for (int i = 0; i < frase.length(); i++) {
			char caracter = frase.charAt(i);
			if (((int) caracter == 241 || (int) caracter == 209) || ((int) caracter >= 65 && (int) caracter <= 122)) {
				if (Character.isUpperCase(caracter)) {
					numMayusculas++;
					mayusculas += caracter;
				} else {
					numMinusculas++;
					minusculas += caracter;				}
			}
		}
		
		System.out.println("La frase tiene " + numMayusculas + " letras mayusculas");
		System.out.println("Letras mayusculas: " + mayusculas);
		System.out.println("La frase tiene " + numMinusculas + " letras minusculas");
		System.out.println("Letras minusculas: " + minusculas);
		
	}
}

//comprobar numero letras mayusculas y minusculas y contatenar a una cadena