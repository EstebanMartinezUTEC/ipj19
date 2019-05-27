package presenciales.mayo21.Ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.println("");
		System.out.println("Ejercicio 1");
		System.out.println("");

		int a = 80;
		int b = 40;
		int x = 5;

		System.out.println("a = " + a);
		System.out.println("a++ = " + a++);
		System.out.println("a = " + a);
		System.out.println("++a = " + ++a);
		System.out.println("a = " + a);

		b--;
		b -= b + 1;

		a *= x++;
		b /= x;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}