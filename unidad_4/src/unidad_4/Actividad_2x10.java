package unidad_4;
import entrada.Teclado;

public class Actividad_2x10 {
	public static int numeroEspacios(String frase) {
		int numeroEspacios = 0;

		for (int i = 0; i <= frase.length() - 1; i++) {
			if (frase.charAt(i) == ' ') {
				numeroEspacios++;
			}
		}
		return numeroEspacios;
	}
	
	public static void main(String[] args) {
		String input="";
		
		input = Teclado.leerCadena("¿frase? ");
		while (input.length() < 10 || input.length() > 60) {
			System.out.println("La frase debe tener 10 caracteres como minimo"
					+ "\nLa frase debe tener 60 caracteres como maximo");
			input = Teclado.leerCadena("¿frase? ");
		} 
		
		System.out.println("La frase tiene " + (numeroEspacios(input) + 1) + " palabras");
		
		
	}
}
