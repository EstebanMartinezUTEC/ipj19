package semana6.ejComplementarios;

public class Principal {

	public static void main(String[] args) {

		Empleado e1;
		e1 = new Empleado("E01", "Jose", "332156845");
		int[] horas = { 8, 9, 12, 10, 5 };
		e1.cargarHorasMes(100, horas);
	}
}