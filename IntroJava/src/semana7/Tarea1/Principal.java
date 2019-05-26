package semana7.Tarea1;

public class Principal {

	public static void main(String[] args) {

		Persona p1 = new Persona("María Perez", "44024677", "", "Uruguay", true);
		Persona p2 = new Persona("Santiago Diaz", "", "", "Chile", true);
		Persona p3 = new Persona("Jose Martin", "33786754", "AZA34579", "Uruguay", false);
		Persona p4 = new Persona("Juan Rodriguez", "24568976", "CPA57564", "Uruguay", false);

		try {
			p1.puedeVotar();
		} catch (NoVotaException e) {
			System.out.println(p1.getNombre() + ": " + e.getMessage());
		}

		try {
			p2.puedeVotar();
		} catch (NoVotaException e) {
			System.out.println(p2.getNombre() + ": " + e.getMessage());
		}

		try {
			p3.puedeVotar();
		} catch (NoVotaException e) {
			System.out.println(p3.getNombre() + ": " + e.getMessage());
		}

		try {
			p4.puedeVotar();
		} catch (NoVotaException e) {
			System.out.println(p4.getNombre() + ": " + e.getMessage());
		}

	}
}
