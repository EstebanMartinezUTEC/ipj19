package semana2.MétodosProcedimientosFunciones;

public class Ejemplo2 {

	public static void main(String[] args) {
	 String a = "hola";
	 String b = " mundo";
	 
	 String ayb = concatenar(a, b);
	 System.out.println(ayb);
	 
	 String var1 = concatenar("como", "estas");
	 System.out.println(var1);
	 
	 String var2 = concatenar(var1, "?");
	 System.out.println(var2);

	// String var3 = concatenar(3, "ee");
	// System.out.print(var3);
	 
	}

	public static String concatenar (String primero, String segundo) {
		
		String concatenacion = primero + segundo;
		return concatenacion;
		
	}
}
