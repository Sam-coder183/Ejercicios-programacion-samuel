package unidad_4;
import entrada.Teclado;

public class Actividad_2x05 {
	
	public static void dibujarmenu() {
		System.out.println("0)salir del programa"
				+ "\n1) convertir todos los caracteres de una frase a letras mayusculas"
				+ "\n2) convertir todos los caracteres de una frase a letras minusculas");
	}
	public static void main(String[] args) {
		int opcion=1;
		String frase="";
		
		while(opcion != 0) {
			dibujarmenu();
			opcion=Teclado.leerEntero("¿opcion?");
			
			if (opcion !=0) {
				frase = Teclado.leerCadena("¿frase?");
			}
			
			switch(opcion) {
				case 0:
					break;
				case 1:
					System.out.println(frase.toUpperCase());
					break;
				case 2:
					System.out.println(frase.toLowerCase());
				case 3:
					System.out.println("introduzaca una opcion valida");
					break;	
			}
			
		} 
	}
}
