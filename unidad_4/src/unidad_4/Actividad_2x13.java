package unidad_4;
import entrada.Teclado;

public class Actividad_2x13 {
	public static int contarApariciones(char letra, String frase){
		int aparicion=0;
		for (int i = 0; i< frase.length(); i++) {
			if (frase.charAt(i) == letra) {
				aparicion++;
			}
		}
		return aparicion;
	}
	
	public static void main(String[] args) {
		String input="";
		
		input = Teclado.leerCadena("¿frase?");
		
		while (input.equals(input.toUpperCase()) == false) {
			System.out.println("La frase no debe contener ninguna letra minúscula.");
			input = Teclado.leerCadena("¿frase?");
		}
		
		for (int i=65; i<=91; i++) {
			if (i==91) {
				contarApariciones('Ñ', input);
				System.out.println("La letra Ñ" + " aparece " + contarApariciones('Ñ', input) + " veces"); 

			} else {
				System.out.println("La letra " + (char) i + " aparece " + contarApariciones((char) i, input) + " veces");
			}
		}
		
	}
}
