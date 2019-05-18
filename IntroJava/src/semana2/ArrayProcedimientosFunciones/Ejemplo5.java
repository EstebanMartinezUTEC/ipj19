package semana2.ArrayProcedimientosFunciones;

public class Ejemplo5 {

	public static void main(String[] args) {
	
		int[] arrayDeInt = {45,6,12,88,96,103,75,0,23};
		
		int numero=75;
		boolean encontre = false;
		
		for (int i=0; i<arrayDeInt.length;i++) {
			if (arrayDeInt[i]==numero) {
				encontre = true;
			}
		}
		System.out.print(encontre);
	}

}
