package unidad_4;

import entrada.Teclado;

public class Actividad_3x01 {
	public static boolean esValido(String codigo) {
		int cuatroDigitos;
		int digitoCinco;
		char caracterSeis;

		try {
			cuatroDigitos = Integer.parseInt(codigo.substring(0, 4));
			digitoCinco = Integer.parseInt(codigo.substring(4, 5));
			caracterSeis = codigo.charAt(5);
		} catch (Exception e) {
			return false;
		}

		if (codigo.length() == 6) {
			if (cuatroDigitos >= 1990 && cuatroDigitos <= 1995) {

				if (digitoCinco == 1 || digitoCinco == 2) {

					if (caracterSeis == 'H' || caracterSeis == 'M') {

						return true;
					}
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
		String input = "";
		int valido = 0, hombres_primero = 0, mujeres_primero = 0, hombres_segundo = 0, mujeres_segundo = 0;
		
		while (input.equals("000000") != true) {
			input = Teclado.leerCadena("¿Codigo del alumno ('000000' para salir)?");

			if (esValido(input)) {
				System.out.println("El codigo del alumno es valido");
				int digitoCinco = Integer.parseInt(input.substring(4, 5));
				char caracterSeis = input.charAt(5);
				valido++;

				if (digitoCinco == 1) {
					if (caracterSeis == 'M') {
						mujeres_primero++;
					} else {
						hombres_primero++;
					}
				} else {
					if (caracterSeis == 'M') {
						mujeres_segundo++;
					} else {
						hombres_segundo++;
					}
				}

			} else {
				System.out.println("El codigo del alumno no es valido");
			}

		}
		System.out.println("Codigos validos: " + valido);
		System.out.println("alumnos hombres en primero: " + hombres_primero);
		System.out.println("alumnas mujeres en primero: " + mujeres_primero);
		System.out.println("alumnos hombres en segundo: " + hombres_segundo);
		System.out.println("alumnos mujeres en segundo: " + mujeres_segundo);
	}
}
