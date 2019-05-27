package presenciales.mayo21.Ejercicio3;

public class Zafral extends Empleado {

	public Zafral(int id, String nombre, String apellido, int hijos, boolean activo, String fecNac) {
		super(id, nombre, apellido, hijos, activo, fecNac);
	}

	public Zafral(int id, String nombre, String apellido, int hijos, boolean activo, String fecNac, int horasMes,
			int valHora) {
		super(id, nombre, apellido, hijos, activo, fecNac);
		this.horasMes = horasMes;
		this.valHora = valHora;
	}

	int horasMes;
	int valHora;

	int salario = 0;

	public int getValHora() {
		return valHora;
	}

	public void setValHora(int valHora) {
		this.valHora = valHora;
	}

	public void setHorasMes(int horasMes) {
		this.horasMes = horasMes;
	}

	public int getHorasMes() {
		return horasMes;
	}

	public int obtenerSalario() {
		salario = this.horasMes * this.valHora;
		return salario;
	}

}
