package semana2.MétodosProcedimientosFunciones;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		int suma = sumar (a, b);
		
		System.out.println(suma);
		
		int suma2 = sumar (5, 6);
		System.out.println(suma2);
		
	}

	public static int sumar (int numero1, int numero2) {
		return numero1 + numero2;
	}
}
