package unidad_4;
import entrada.Teclado;

public class Actividad_1x01 {
	public static boolean esNumeroArabigo(char caracter) {
		String cero = "0123456789";
		
		if (cero.indexOf(caracter) != -1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	

	public static void main(String[] args) {
		char input = Teclado.leerCaracter("¿caracter? ");
		
		if (esNumeroArabigo(input)) {
			System.out.println("es arabigo");
		} else {
			System.out.println("no es arabigo");
		}
	}
}
