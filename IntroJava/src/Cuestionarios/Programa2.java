package Cuestionarios;

public class Programa2 {

	public static void main(String[] args) {
		int acumulado = 34;
		double dividendo = 350;
		int count=1;
		
		for (int i=35;i<52;i=i+3) {
			System.out.println(count++);
			acumulado = acumulado + 10 + i;
			dividendo = dividendo / 2;
		}
		if (acumulado == 378) {
			System.out.println("Ejecute la primera condicion");
		}
		else if (acumulado == 3490) {
			System.out.println("Ejecute la segunda condicion");
		}
		else {
			System.out.println("Ejecute el else");
		}
		System.out.println(acumulado);
		System.out.println(dividendo);
		
	}
	
	
	

}
