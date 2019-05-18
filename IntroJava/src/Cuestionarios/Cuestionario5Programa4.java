package Cuestionarios;

public class Cuestionario5Programa4 {

	public static void main(String[] args) {
		int[] valores = { 200, 501, 58, 19, 56, 7, 103, 499, 102, 0 };
		algoritmo();
		System.out.print("Termine!");

	}

	public static void algoritmo() {
		int j = 50;
		int p = 78;

		int suma = sumaleDiez(j + p);
		System.out.println(suma);

	}

	public static int sumaleDiez(int numero) {
		return numero + 10;

	}

}
