package semana6;

public class Estudiante {

	public String codigo;
	public String nombre;
	public int cedulaIdentidad;
	public int a�oDeNacimiento;

	public Estudiante() {
		this.codigo = "";
		this.nombre = "";
		this.a�oDeNacimiento = 0;
		this.cedulaIdentidad = 0;
	}

	public Estudiante(String codigo, String nombre, int cedulaIdentidad, int a�oDeNacimiento) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.a�oDeNacimiento = a�oDeNacimiento;
		this.cedulaIdentidad = cedulaIdentidad;
	}

	public int calcularEdad(int a�oActual) {
		return a�oActual - this.a�oDeNacimiento;
	}
	/*
	 * public int calcularEdad() { Calendar cal = Calendar.getInstance();
	 * cal.setTime(date); int a�o = cal.get(Calendar.YEAR);
	 * 
	 * return a�o - this.a�oDeNacimiento; }
	 */
}