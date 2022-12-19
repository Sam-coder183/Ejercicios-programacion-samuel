package unidad_4;

public class condicionales {
	public static void main(String[] args) {
		char caracter = 'a';
		if (((int) caracter == 241 || (int) caracter == 209) || ((int) caracter >= 65 && (int) caracter <= 122)) {
			System.out.println("true");
		}
		else {
			System.out.println((int) caracter);
		}
	}
}
