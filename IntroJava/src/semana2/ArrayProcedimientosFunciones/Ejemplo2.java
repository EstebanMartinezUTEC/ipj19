package semana2.ArrayProcedimientosFunciones;

public class Ejemplo2 {

	public static void main(String[] args) {
		
		int[] arrayDeInt = {45,6,12,88,96,103,75,0,23};
		
		arrayDeInt[4]= 501;
		arrayDeInt[1]= 501;
		
		for (int i = 0; i < arrayDeInt.length; i++) {
		System.out.print (arrayDeInt[i] + " ");
	}

	}
}