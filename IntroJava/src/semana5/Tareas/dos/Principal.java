package semana5.Tareas.dos;

public class Principal {

	public static void main(String[] args) {

		Curso c1 = new Curso();

		String nombre_c1 = c1.nombre;

		Curso c2 = new Curso(02, "FPOO", 2, 52, 5);

		String nombre_c2 = c2.nombre;
		int matriculados = c2.getMatriculados();

		System.out.println("El nombre del curso1 es: " + nombre_c1);
		System.out.println("El nombre del curso2 es: " + nombre_c2);
		System.out.println("Hay " + matriculados + " alumnos matriculados.");

		c2.porc_a_examen();
	}
}