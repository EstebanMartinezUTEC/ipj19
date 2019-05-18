package Cuestionarios;

import java.util.Arrays;

public class Cuestionario5Programa2 {

	public static void main(String[] args) {
		int[] enteros = new int[15];
		double[] decimales = new double[30];

		for (int j = 0; j < 15; j++) {
			enteros[j] = j + 5;
			decimales[j + 15] = j;
		}

		for (int k = 0; k < 15; k++) {
			decimales[k] = 1.5 * (k + 1);
		}
		System.out.println(Arrays.toString(enteros));
		System.out.println(Arrays.toString(decimales));
	}

}
