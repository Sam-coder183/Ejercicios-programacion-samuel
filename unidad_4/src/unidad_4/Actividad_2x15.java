package unidad_4;

import entrada.Teclado;

public class Actividad_2x15 {
	public static int contarApariciones(char letra, String frase){
		int aparicion=0;
		String ocurrencia="", doble="";
		doble += Character.toString(letra) + Character.toString(letra);
		
		for (int i = 0; i< frase.length(); i++) {
			if (frase.charAt(i) == letra) {
				
				//la secuencia try devuelve el numero de ocurrencias en caso de que el metodo substring se salga de la cadena
				try {
				ocurrencia = frase.substring(i, i+2);
				} catch (Exception e) {
					return aparicion;
				}
				
				if (ocurrencia.equals(doble)) {
					aparicion++;
					
				}
			}
		}
		return aparicion;
	}
	
	public static void main(String[] args) {
		String input="";
		
		input = Teclado.leerCadena("¿frase?");
		input = input.toUpperCase();
		while (input.equals(input.toUpperCase()) == false) {
			System.out.println("La frase no debe contener ninguna letra minúscula.");
			input = Teclado.leerCadena("¿frase?");
		}
	}
	
}
