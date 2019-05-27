package presenciales.mayo21.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		System.out.println("");
		System.out.println("Ejercicio 2");
		System.out.println("");

		// a)
		String var1 = "Hola Mundo";
		String var2 = "Hola mundo";

		int[] vector = new int[] { 8, 1, 2, 3, 4, 7, 6 };
		int[] cedula = new int[8];
		int resultado = 0;

		System.out.println("El largo de la var 1 es " + var1.length());
		System.out.println("El largo de la var 2 es " + var2.length());

		if (var1.equals(var2)) {
			System.out.println("Las variables var1 y var2 Son iguales");
		} else {
			System.out.println("Las variables var1 y var2 no son iguales");
		}

		if (var1.equalsIgnoreCase(var2)) {
			System.out.println("Las variables var1 y var2 dicen lo mismo");
		} else {
			System.out.println("Las variables var1 y var2 no dicen lo mismo");
		}

		// b)
		try {
			System.out.println("");
			// String var3 = "Esteban.Martinez.38";
			System.out.println("Ingrese nombre.apellido.edad");
			Scanner sc = new Scanner(System.in);
			String var3 = sc.next();
			String nombre;
			String apellido;
			String edad;
			String ci;

			String[] n = var3.split("\\.");
			nombre = n[0];
			apellido = n[1];
			edad = n[2];

			System.out.println("Nombre: " + nombre);
			System.out.println("Apellido: " + apellido);
			System.out.println("Edad: " + edad);
			System.out.println("Nombre.Edad: " + nombre + "." + edad);

			// c)
			System.out.println("");
			// String ci = "3.811.974-6";
			System.out.println("Ingrese su Cedula de Identidad con puntos y guion ");
			ci = sc.next();

			ci = ci.replace(".", "");
			ci = ci.replace("-", "");

			System.out.println("CI sin puntos ni guiones " + ci);

			for (int i = 0; i < 8; i++) {
				cedula[i] = Character.getNumericValue(ci.charAt(i));

			}

			for (int j = 0; j < vector.length; j++) {
				resultado = vector[j] * cedula[j] + resultado;
			}
			resultado = resultado % 10;

			if (cedula[7] == resultado) {

				System.out.println("Numero de documento verificado.");
			} else {
				System.out.println("ERROR: Cedula Invalida.");
			}
		} catch (Exception e) {
			System.out.println("ERROR:  " + e);
		}
	}
}