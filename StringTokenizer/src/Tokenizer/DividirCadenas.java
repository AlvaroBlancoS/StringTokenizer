package Tokenizer;

import java.util.StringTokenizer;

public class DividirCadenas {

	public static void main(String[] args) {
		String cadena = "Hola amigos que tal";
		StringTokenizer str;
		str = new StringTokenizer(cadena);
		System.out.println("la cadena str tiene " + str.countTokens() + " elementos");
		while (str.hasMoreTokens())
			System.out.print(str.nextToken() + " ");
		System.out.println("");
	}

}
