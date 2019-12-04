package Split;

public class DividirCadenas2 {

	// El metodo split se utiliza la expresion regular

	public static void main(String[] args) {
		String str2 = "Qué * tal / estás"; // La expresión regular indica que es " *// " ó " / "
		String[] partes2 = str2.split(" [*/] ");

		for (int i = 0; i < partes2.length; i++) {
			System.out.println(partes2[i]);
		}
	}

}
