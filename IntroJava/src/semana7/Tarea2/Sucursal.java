package semana7.Tarea2;

import java.util.LinkedList;

public class Sucursal {

	private String nombre;
	private int id;
	private String direccion;
	private String telefono;
	private String rut;
	private LinkedList<Empleado> listaEmpleados = new LinkedList<>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public LinkedList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(LinkedList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public Sucursal(String nombre, int id, String direccion, String telefono, String rut) {
		this.nombre = nombre;
		this.id = id;
		this.direccion = direccion;
		this.telefono = telefono;
		this.rut = rut;
	}

	public void agregarEmp(Empleado emp) {
		this.listaEmpleados.add(emp);
	}
}