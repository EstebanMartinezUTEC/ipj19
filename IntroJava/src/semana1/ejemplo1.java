package semana1;

public class ejemplo1 {

	public static void main(String[] args) {
		
		String texto = "aaaaaaaaaaaa";
		String nuevoTexto = "";
		
		
		while (!nuevoTexto.equals(texto)) {
			nuevoTexto = nuevoTexto+"a";
					System.out.println(nuevoTexto);
					System.out.println(texto);
					System.out.println(nuevoTexto.equals(texto));
					}
		System.out.println("afuera del while nuevoTexto "+ nuevoTexto);
		System.out.println("afuera del while texto "+ texto);
	}

}
