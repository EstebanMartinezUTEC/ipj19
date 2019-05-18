package Cuestionarios;

public class Programa1 {

	public static void main(String[] args) {
		int acumulado = 34;
		int count=0;
		
		for (int i=30;i<60;i++) {
			System.out.println(count++);
			acumulado = acumulado + 10;
		}
System.out.println(acumulado);
	}

}
