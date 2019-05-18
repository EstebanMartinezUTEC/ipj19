package Cuestionarios;

public class programa3 {

	public static void main(String[] args) {
	boolean ejecutar = true;
	double operacion = 10;
	int acumulador = 0;
	int count=1;

	while (ejecutar) {
		System.out.println(acumulador);
		if (acumulador ==18) {
			ejecutar = false;
			acumulador = 78;
			System.out.println("abajo" + acumulador);
		}
		
		operacion= operacion * acumulador;
		acumulador++;
		}
	System.out.println("sali " + acumulador);
	System.out.println("operacion " + operacion);
	System.out.println(operacion);
	
	}

}
