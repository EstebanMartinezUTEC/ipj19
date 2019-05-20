package semana5.ejComplementarios;

import semana6.ejComplementarios.Empleado;

public class Ejercicio2 {

	public static void main(String[] args) {

		Empleado e1;
		e1 = new Empleado("1", "Juan", "35485555");
		int[] horasE1 = { 160, 140, 160, 150, 165, 170, 0, 0, 0, 0, 0, 0 };
		e1.cargarHorasMes(200.5, horasE1);

		Empleado e2;
		e2 = new Empleado("2", "Paula", "38887776");
		int[] horasE2 = { 165, 135, 170, 145, 160, 165, 0, 0, 0, 0, 0, 0 };
		e2.cargarHorasMes(250.5, horasE2);

	}

}
