package presenciales.mayo21.Ejercicio3;

public class Principal {

	public static void main(String[] args) {

		Empleado emp1 = new Zafral(1, "Juan", "Perez", 0, true, "15/04/1975", 29, 100);
		Empleado emp2 = new Estable(1, "Esteban", "Martinez", 1, true, "31/07/1980", 30000, 5);

		System.out.println(emp1.obtenerEdad());
		System.out.println(emp1.obtenerSalario());
		System.out.println(emp1.getHijos());
		emp1.agregarHijo();
		System.out.println(emp1.getHijos());

		System.out.println(emp2.obtenerEdad());
		System.out.println(emp2.obtenerSalario());
		System.out.println(emp2.getHijos());
		emp2.agregarHijo();
		System.out.println(emp2.getHijos());
	}
}