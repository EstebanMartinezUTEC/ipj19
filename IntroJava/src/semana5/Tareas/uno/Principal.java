package semana5.Tareas.uno;

public class Principal {

	public static void main(String[] args) {

		int[] mi_array_enteros = { 5, 10, 15, 6, 8, 44 };
		String[] mi_array_string = { "azul", "amarillo", "rosado", "verde", "naranja" };

		sumaEnteros(mi_array_enteros);
		imprimirColores(mi_array_string);

	}

	public static void sumaEnteros(int[] arrayEntero) {
		for (int i = 0; i < arrayEntero.length - 1; i++) {
			if (arrayEntero[i] > 11) {
				System.out.println(arrayEntero[i]);
				int suma = 0;
				for (int j = 0; j < arrayEntero.length; j++) {
					suma = suma + arrayEntero[j];
				}
				System.out.println(suma);
			}
		}
	}

	public static void imprimirColores(String[] arrayString) {
		for (int i = 0; i < arrayString.length - 1; i++) {
			if (arrayString[i].startsWith("v") || arrayString[i].contains("l")) {
				System.out.println(arrayString[i]);
			}
		}

	}
}