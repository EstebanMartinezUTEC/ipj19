package semana7.Tarea2;

public class EmpMensual extends Empleado {

	public EmpMensual(String nombre, String apellido, int numBps, int numFun, String direccion, String telefono,
			double salario, String regimen) {
		super(nombre, apellido, numBps, numFun, direccion, telefono);
		this.salario = salario;
		this.regimen = regimen;
	}

	public EmpMensual(String nombre, String apellido, int numBps, int numFun, String direccion, String telefono) {
		super(nombre, apellido, numBps, numFun, direccion, telefono);

	}

	private double salario;
	private String regimen;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRegimen() {
		return regimen;
	}

	public void setRegimen(String regimen) {
		this.regimen = regimen;
	}

}