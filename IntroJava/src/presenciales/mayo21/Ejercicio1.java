package presenciales.mayo21;

public class Ejercicio1 {

	public static void main(String[] args) {

		int a = 80;
		int b = 40;
		int x = 5;

		System.out.println(a);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a);

		b--;
		b -= b + 1;

		a *= x++;
		b /= x;

		System.out.println(a);
		System.out.println(b);
	}

}
