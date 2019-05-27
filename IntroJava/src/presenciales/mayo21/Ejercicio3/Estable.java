package presenciales.mayo21.Ejercicio3;

public class Estable extends Empleado {

	public Estable(int id, String nombre, String apellido, int hijos, boolean activo, String fecNac) {
		super(id, nombre, apellido, hijos, activo, fecNac);

	}

	public Estable(int id, String nombre, String apellido, int hijos, boolean activo, String fecNac, int salario,
			int antigŁedad) {
		super(id, nombre, apellido, hijos, activo, fecNac);
		this.salario = salario;
		this.antigŁedad = antigŁedad;
	}

	int salario = 0;
	int antigŁedad;

	public int obtenerSalario() {
		return salario;
	}

}
