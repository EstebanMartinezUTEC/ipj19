package semana7.Tarea2;

public class EmpJornalero extends Empleado {

	private double valHora;
	private double horasMes;

	public EmpJornalero(String nombre, String apellido, int numBps, int numFun, String direccion, String telefono) {
		super(nombre, apellido, numBps, numFun, direccion, telefono);

	}

	public EmpJornalero(String nombre, String apellido, int numBps, int numFun, String direccion, String telefono,
			double valHora, double horasMes) {
		super(nombre, apellido, numBps, numFun, direccion, telefono);
		this.valHora = valHora;
		this.horasMes = horasMes;
	}

	public double getValHora() {
		return valHora;
	}

	public void setValHora(double valHora) {
		this.valHora = valHora;
	}

	public double getHorasMes() {
		return horasMes;
	}

	public void setHorasMes(double horasMes) {
		this.horasMes = horasMes;
	}

}
