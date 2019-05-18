package Cuestionarios;

public class Cuestionario5Programa3 {

	public static void main(String[] args) {
		int[] valores = { 200, 501, 58, 19, 56, 7, 103, 499, 102, 0 };
		int salida = algoritmo(valores);

		System.out.print(salida);

	}

	public static int algoritmo(int[] listaEnteros) {
		int resultado = 0;
		for (int n = 0; n < listaEnteros.length; n++) {

			if (listaEnteros[n] > resultado) {
				resultado = listaEnteros[n];
			}
		}
		return resultado;
	}

}
