package semana6.ejComplementarios;

public class Empleado {

	public String codigo;
	public String nombre;
	public String ci;
	public double valorHora;
	public int[] horasPorMes;

	public Empleado() {
		this.codigo = "";
		this.nombre = "";
		this.ci = "";
		this.valorHora = 0;
		this.horasPorMes = null;
	}

	public Empleado(String codigo, String nombre, String ci) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.ci = ci;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCi() {
		return ci;
	}

	public double getValorHora() {
		return valorHora;
	}

	public int[] getHorasPorMes() {
		return horasPorMes;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public void setHorasPorMes(int[] horasPorMes) {
		this.horasPorMes = horasPorMes;
	}

	public void cargarHorasMes(double valorHora, int[] horasPorMes) {
		this.valorHora = valorHora;
		this.horasPorMes = horasPorMes;
		int sum = 0;
		for (int num : horasPorMes) {
			sum = sum + num;
			// debug System.out.println("The sum is " + sum);
		}

		System.out.println("El sueldo del trabajador " + this.nombre + " es de $ " + this.valorHora * sum);

	}

}
