package Ambas;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DividirCadenas {
	public void conTokenizer(String cadena) {
		StringTokenizer str;
		str = new StringTokenizer(cadena);
		System.out.println("la cadena str tiene " + str.countTokens() + " elementos");
		while (str.hasMoreTokens())
			System.out.print(str.nextToken() + " ");
		System.out.println("");
	}

	public void conSplit(String cadena) {
		String[] str = cadena.split(" ");
		System.out.println("la cadena str tiene " + str.length + " elementos");
		for (int i = 0; i < str.length; i++)
			System.out.print(str[i] + " ");
		System.out.println("");
	}

	public static void main(String[] args) {
		// Inicialización
		String miEjemplo = "Uno dos tres perico de los_palotes";
		DividirCadenas programa = new DividirCadenas();
		Scanner in = new Scanner(System.in);
		System.out.println("1. StringTokenizer" + "\n2.Método Split");
		int opcion = in.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Estamos utilizando la clase StringTokenizer:" + "\n");
			// Método 1: Con String Tokenizer
			programa.conTokenizer(miEjemplo);
			System.out.println();
			break;
		case 2:
			System.out.println("Estamos utilizando el método split:" + "\n");
			// Método 2: Con Split
			programa.conSplit(miEjemplo);
		default:
			break;
		}

	}
}
