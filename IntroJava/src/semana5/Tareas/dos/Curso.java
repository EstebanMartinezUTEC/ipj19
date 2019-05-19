package semana5.Tareas.dos;

public class Curso {

	public int codigo;
	public String nombre;
	private int duracion;
	private int matriculados;
	private int a_examen;

	public Curso() {
		this.codigo = 0;
		this.nombre = "";
		this.duracion = 0;
		this.matriculados = 0;
		this.a_examen = 0;
	}

	public Curso(int codigo, String nombre, int duracion, int matriculados, int a_examen) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.duracion = duracion;
		this.matriculados = matriculados;
		this.a_examen = a_examen;
	}

	public void porc_a_examen() {
		System.out.print("El porcentaje de alumnos a examen es " + this.a_examen * 100 / this.matriculados + " %.");
	}

	public int getDuracion() {
		return duracion;
	}

	public int getMatriculados() {
		return matriculados;
	}

	public int getA_examen() {
		return a_examen;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public void setMatriculados(int matriculados) {
		this.matriculados = matriculados;
	}

	public void setA_examen(int a_examen) {
		this.a_examen = a_examen;
	}
}