package Tokenizer;

import java.util.StringTokenizer;

public class DividirCadenas2 {

	public static void main(String[] args) {
		StringTokenizer str;
//		str = new StringTokenizer("Uno dos tres perico de los_palotes");
//		str = new StringTokenizer ("uno | dos| tres | perico" ," | ");
		str = new StringTokenizer ("uno dos tres perico" ,"s");
		System.out.println("la cadena str tiene " + str.countTokens() + " elementos");
		while (str.hasMoreTokens())//
			System.out.println(str.nextToken());

		// Sin embargo este es más recomendable que el anterior
//		String strNormal = "Uno dos tres de los_palotes";
//		StringTokenizer prueba = new StringTokenizer(strNormal);
//		System.out.println("La cadena str tiene "+ prueba.countTokens()+ "elementos");
//		while (prueba.hasMoreTokens()) {
//			System.out.println(prueba.nextToken());
//		}
	}

}
