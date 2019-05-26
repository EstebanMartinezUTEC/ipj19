package semana7.Tarea2;

public class Empleado {

	private String nombre;
	private String apellido;
	private int numBps;
	private int numFun;
	private String direccion;
	private String telefono;

	public Empleado(String nombre, String apellido, int numBps, int numFun, String direccion, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numBps = numBps;
		this.numFun = numFun;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumBps() {
		return numBps;
	}

	public void setNumBps(int numBps) {
		this.numBps = numBps;
	}

	public int getNumFun() {
		return numFun;
	}

	public void setNumFun(int numFun) {
		this.numFun = numFun;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public double getSueldo(Empleado e) {
		double sueldo = 0;
		if (e.getClass().getName().contains("EmpMensual")) {
			sueldo = ((EmpMensual) e).getSalario();
		} else {
			sueldo = ((EmpJornalero) e).getHorasMes() * ((EmpJornalero) e).getValHora();
		}

		return sueldo;
	}
}
