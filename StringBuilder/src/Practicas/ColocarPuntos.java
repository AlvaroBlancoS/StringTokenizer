package Practicas;

public class ColocarPuntos {

	public static void main(String[] args) {
		String s = "1234567890";
		StringBuilder p = new StringBuilder(s);
		p.reverse();

		for (int i = 3; i <= p.length(); i += 4) {
			p.insert(i, ".");
		}

		p.reverse();
		System.out.println(p);

	}

}
