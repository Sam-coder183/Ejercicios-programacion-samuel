package unidad_4;

import entrada.Teclado;

public class Actividad_2x03 {
	public static boolean esVocal(char vocal) {
		String vocales = "aeiou";
		
		if (vocales.indexOf(vocal) != -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String frase, vocales = "";
		String Consonantes = "";
		int numVocales=0, numConsonantes=0;
		
		frase = Teclado.leerCadena("¿frase? ");
		while (frase.length() > 60) {
			System.out.println("La frase debe tener 60 caracteres como maximo");
			frase = Teclado.leerCadena("¿frase? ");
		}

		for (int i = 0; i < frase.length(); i++) {
			char caracter = frase.charAt(i);
			if (((int) caracter == 241 || (int) caracter == 209) || ((int) caracter >= 65 && (int) caracter <= 122)) {
				if (esVocal(caracter)) {
					numVocales++;
					vocales += caracter;
				} else {
					numConsonantes++;
					Consonantes += caracter;				}
			}
		}
	}
}
