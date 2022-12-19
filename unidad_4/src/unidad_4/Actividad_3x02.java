package unidad_4;

import entrada.Teclado;

public class Actividad_3x02 {
	public static boolean esValido(String codigo) {
		char categoria;
		int año;
		int estado;

		try {
			categoria = codigo.charAt(0);
			año = Integer.parseInt(codigo.substring(1, 5));
			estado = Integer.parseInt(codigo.substring(5, 6));
		} catch (Exception e) {
			return false;
		}

		if (codigo.length() == 8) {
			if (categoria == 'A' || categoria == 'B' || categoria == 'C') {
				
				if (año >= 1980 && año <= 2020) {

					if (estado == 0 || estado == 1) {

						return true;
					}
				}
			}
		}

		return false;
	}
	
	public static void main(String[] args) {
		int valido=0, A_Activo=0, A_Inactivo=0, B_Activo=0, B_Inactivo = 0, C_Activo=0, C_Inactivo = 0;
		char categoria;
		int año, estado;
		for (int i=1; i<=10; i++) {
			String input = Teclado.leerCadena("¿Codigo del producto " + i + "?");
			
			if (esValido(input)) {
				System.out.println("El codigo del producto es valido");
				valido++;
				categoria = input.charAt(0);
				año = Integer.parseInt(input.substring(1, 5));
				estado = Integer.parseInt(input.substring(5, 6));
				
				if (estado == 0) {
					if (categoria == 'A') {
						A_Inactivo++;
					} else if (categoria == 'B') {
						B_Inactivo++;
					} else {
						C_Inactivo++;
					}
				} else {
					if (categoria == 'A') {
						A_Activo++;
					} else if (categoria == 'B') {
						B_Activo++;
					} else {
						C_Activo++;
					}
				}
			} else {
				System.out.println("el codigo del producto no es valido.");
			}
		}
		
		System.out.println("Códigos validos: " + valido);
		System.out.println("productos activos en categoria A: " + A_Activo);
		System.out.println("productos activos en categoria B: " + B_Activo);
		System.out.println("productos activos en categoria C: " + C_Activo);
		System.out.println("productos inactivos en categoria A: " + A_Inactivo);
		System.out.println("productos inactivos en categoria B: " + B_Inactivo);
		System.out.println("productos inactivos en categoria C: " + C_Inactivo);
	}
}
