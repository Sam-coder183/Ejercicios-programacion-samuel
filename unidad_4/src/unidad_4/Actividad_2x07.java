package unidad_4;

import entrada.Teclado;

public class Actividad_2x07 {

		public static void main(String[] args) {
			String frase,inversion = "";
			char caracter;
			
			frase = Teclado.leerCadena("¿frase? ");
			int longitud = frase.length();
			if (frase.length() >= 2 && frase.length() <= 40) {
				System.out.println("rotaciones a la derecha");
				inversion = frase;
				for (int i=longitud-1; i>0; i--) {
					caracter = inversion.charAt(longitud-1);
					inversion = inversion.substring(0, longitud-1);
					inversion = caracter + inversion;
					System.out.println(inversion);
				}
				System.out.println("rotaciones a la izquierda");
				inversion = frase;
				for (int i=2; i<=longitud; i++) {
					caracter = inversion.charAt(0);
					inversion = inversion.substring(1, longitud);
					inversion = inversion + caracter;
					System.out.println(inversion);
				}
				
			}
	}
}
