package Practicas;

public class Ejemplos {

	public static void main(String[] args) {
		StringBuilder texto3 = new StringBuilder("Otra prueba");

		texto3.append(" mas");
		System.out.println("Texto 3 es: " + texto3);
		texto3.insert(2, "1");
		System.out.println("Y ahora es: " + texto3);
//        texto3.reverse();
//        System.out.println( "Y ahora: " + texto3 );
// 
//        System.out.println( "En mayúsculas: " + texto3.toString().toUpperCase() );
	}

}
