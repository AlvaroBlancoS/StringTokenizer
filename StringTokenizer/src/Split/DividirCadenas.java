package Split;

import java.util.Scanner;

public class DividirCadenas {
	public static void main(String[] args) {
		String str1 = "Hola amigo mio"; // La expresión regular indica que es " "
		String[] partes1 = str1.split(" ");
		for (int i = 0; i < partes1.length; i++) {
			System.out.println(partes1[i]);
		}
	}
}
