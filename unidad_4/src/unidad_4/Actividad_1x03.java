package unidad_4;
import entrada.Teclado;
public class Actividad_1x03 {
	public static boolean esSignoPuntuacion(char caracter) {
		String signospuntuacion = ".,;:-\'\"()[]{}¿?!¡";
		if (signospuntuacion.indexOf(caracter) != -1) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		char input = Teclado.leerCaracter("¿caracter? ");
		
		if(esSignoPuntuacion(input)) {
			System.out.println("El caracter " + input + " es un signo de puntuacion");
			
		} else {
			System.out.println("El caracter " + input + " no es un signo de puntuacion");

		}
	}
}
