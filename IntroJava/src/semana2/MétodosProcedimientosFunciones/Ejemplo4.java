package semana2.MétodosProcedimientosFunciones;

public class Ejemplo4 {

	public static void main(String[] args) {
		// aca iria el codigo que llama a mi funcion
		int[] array = {10,11,89,-56,32,16,99};
		int integer=16;
		
		boolean esta1 = estaPresente(integer, array); 
		
		System.out.println("esta1 " +esta1);
		
		
		boolean esta2 = estaPresente(6, new int[] {1} ); 
				
				System.out.println("esta2 " + esta2);
		
		
		boolean esta3 = estaPresente(6, new int [] {3,5,6}); 
				
				System.out.println("esta3 " +esta3);
		
		
		int [] array3 = new int [3];	
		boolean esta4 = estaPresente(0, array3); 
				
				System.out.println("esta4 " +esta4);
				
		int num4 = 4;
		int [] array4 = new int [] {5,10,35,67,88};
		boolean esta5 = estaPresente(num4, array4); 
				
				System.out.println("esta5 " +esta5);
		
		
			}
	public static boolean estaPresente(int numero, int [] arregloEnteros) {
		boolean esta = false;
		
		for (int i=0; i<arregloEnteros.length;i++) {
			if (arregloEnteros[i]==numero) {
				esta = true;
			}
		
		}
		return esta;	}

}
