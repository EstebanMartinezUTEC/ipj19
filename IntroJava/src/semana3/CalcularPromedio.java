package semana3;

public class CalcularPromedio {

	public static void main(String[] args) {

		int num1 = Integer.valueOf(args[0]);
		int num2 = Integer.valueOf(args[1]);
		int num3 = Integer.valueOf(args[2]);
		int result;
		int suma;
		
// de aquí para abajo, colocar la implementacion pedida
		
	result = (num1+num2+num3)/3;	
	
	if (result < 10) {
		System.out.println ("El promedio es " + result);
	}
	else {
			suma = result+num1+num2+num3;
			System.out.println ("La suma del promedio mas los valores de entrada es " + suma);
		}
	}
}