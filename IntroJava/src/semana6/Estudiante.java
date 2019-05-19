package semana6;

public class Estudiante {

	public String codigo;
	public String nombre;
	public int cedulaIdentidad;
	public int añoDeNacimiento;

	public Estudiante() {
		this.codigo = "";
		this.nombre = "";
		this.añoDeNacimiento = 0;
		this.cedulaIdentidad = 0;
	}

	public Estudiante(String codigo, String nombre, int cedulaIdentidad, int añoDeNacimiento) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.añoDeNacimiento = añoDeNacimiento;
		this.cedulaIdentidad = cedulaIdentidad;
	}

	public int calcularEdad(int añoActual) {
		return añoActual - this.añoDeNacimiento;
	}
	/*
	 * public int calcularEdad() { Calendar cal = Calendar.getInstance();
	 * cal.setTime(date); int año = cal.get(Calendar.YEAR);
	 * 
	 * return año - this.añoDeNacimiento; }
	 */
}