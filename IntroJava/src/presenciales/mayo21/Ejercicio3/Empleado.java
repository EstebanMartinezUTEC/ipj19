package presenciales.mayo21.Ejercicio3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Empleado {

	private int id;
	private String nombre;
	private String apellido;
	private int hijos;
	private boolean activo;
	private String fecNac; // dd/mm/aaaa

	int edad = 0;
	int salario = 0;
	int hijo = 0;

	LocalDate hoy = LocalDate.now();

	public Empleado(int id, String nombre, String apellido, int hijos, boolean activo, String fecNac) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.hijos = hijos;
		this.activo = activo;
		this.fecNac = fecNac;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getFecNac() {
		return fecNac;
	}

	public void setFecNac(String fecNac) {
		this.fecNac = fecNac;
	}

	public int obtenerSalario() {
		return salario;
	}

	public void agregarHijo() {
		hijos++;
	}

	public long obtenerEdad() {
		String[] values = fecNac.split("/");
		int dia = Integer.parseInt(values[0]);
		int mes = Integer.parseInt(values[1]);
		int año = Integer.parseInt(values[2]);
		LocalDate start = LocalDate.of(año, mes, dia);
		LocalDate end = hoy;
		long edad = ChronoUnit.YEARS.between(start, end);
		return edad;
	}

}
