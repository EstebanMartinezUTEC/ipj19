package semana5.ejComplementarios;

public class Paciente {

	public String nombre;
	public String ci;

	public String getNombre() {
		return nombre;
	}

	public String getCi() {
		return ci;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public Paciente(String nombre, String ci) {
		this.nombre = nombre;
		this.ci = ci;
	}

}
