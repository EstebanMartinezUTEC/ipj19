package semana7.Tarea2;

public class Principal {

	public static void main(String[] args) {

		Sucursal suc1 = new Sucursal("Casa Central", 1, "Montevideo", "28082888", "259142368838");
		Sucursal suc2 = new Sucursal("Sucursal Durazno", 3, "Durazno", "25823698", "248648282536");

		Empleado EmpJornalero1 = new EmpJornalero("Juan", "Zabala", 328672, 68, "Durazno", "26223858", 215.5, 120);
		Empleado EmpJornalero2 = new EmpJornalero("Pedro", "Rosen", 669825, 30, "Montevideo", "2852639", 280, 100.5);
		Empleado EmpMensual1 = new EmpMensual("Romina", "Paito", 333458, 50, "Durazno", "2528655", 38000, "Comercial");
		Empleado EmpMensual2 = new EmpMensual("Lucas", "Manzi", 225698, 45, "Montevideo", "2887469", 38500,
				"Comercial");

		suc1.agregarEmp(EmpJornalero2);
		suc1.agregarEmp(EmpMensual2);
		suc2.agregarEmp(EmpJornalero1);
		suc2.agregarEmp(EmpMensual1);

		double pagar = 0;
		for (Empleado e : suc1.getListaEmpleados()) {
			pagar = e.getSueldo(e) + pagar;
		}
		System.out.println("Gastos por conceptos de Sueldo Sucursal 1 ­ " + pagar);

		pagar = 0;
		for (Empleado e : suc2.getListaEmpleados()) {
			pagar = e.getSueldo(e) + pagar;
		}
		System.out.println("Gastos por conceptos de Sueldo Sucursal 2 ­ " + pagar);
	}

}
