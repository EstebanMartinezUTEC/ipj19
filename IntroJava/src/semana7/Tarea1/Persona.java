package semana7.Tarea1;

public class Persona {

	private String nombre;
	private String ci;
	private String credencial;
	private String pais;
	private boolean habilitado;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getCredencial() {
		return credencial;
	}

	public void setCredencial(String credencial) {
		this.credencial = credencial;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	public Persona(String nombre, String ci, String credencial, String pais, boolean habilitado) {
		this.nombre = nombre;
		this.ci = ci;
		this.credencial = credencial;
		this.pais = pais;
		this.habilitado = habilitado;
	}

	public void puedeVotar() throws NoVotaException {
		if (!this.habilitado) {
			throw new NoVotaException("No puede votar: No esta habilitado por el BPS");
		} else {
			if (this.pais.equalsIgnoreCase("Uruguay") && this.credencial.isEmpty()) {
				throw new NoVotaException("No puede votar: Es de uruguay y no tiene credencia");
			} else {
				if (!this.pais.equalsIgnoreCase("Uruguay") && this.ci.isEmpty()) {
					throw new NoVotaException("No puede votar: No es de uruguay y no tiene ci");
				}
			}
		}
		throw new NoVotaException("Puede votar");
	}
}
