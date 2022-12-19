package unidad_4;
import entrada.Teclado;
public class Actividad_2x06 {
	public static void main(String[] args) {
		String frase = Teclado.leerCadena("¿frase? ");
		if (frase.length() >= 5 && frase.length() <= 40) {
			for (int i=1; i<=frase.length(); i++) {
				System.out.println(frase.substring(0, i));
			} 
		}else {
			System.out.println("La frase debe tener 5 caracteres como minimo"
					+ "La frase debe tener 40 caracteres como maximo.");
		}
	}
}
