package semana5.ejComplementarios;

public class Consultorio {

	private String numConsultorio;
	private String direccion;
	private String doctor;
	private String[] pacientes = new String[100];

	public String getNumConsultorio() {
		return numConsultorio;
	}

	public void setNumConsultorio(String numConsultorio) {
		this.numConsultorio = numConsultorio;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String[] getPacientes() {
		return pacientes;
	}

	public void setPacientes(String[] pacientes) {
		this.pacientes = pacientes;
	}

	public Consultorio(String numConsultorio, String direccion, String doctor) {
		this.numConsultorio = numConsultorio;
		this.direccion = direccion;
		this.doctor = doctor;
	}

	public void agregarPaciente(String paciente) {
		// pacientes.add(paciente);
		// pacientes=add(pacientes,paciente);
		System.out.println("Se agrego  ultimo paciente " + this.pacientes);
	}

	public void listarPacientes() {
		System.out.println(this.pacientes);
	}

}
