package main;

/**
 * Classe GiuriClass </br>
 * <u>4AI</u></br>
 * <italic>13/05/2020</italic>
 * 
 * @author <bold>Giuri</bold>
 * 
 */
public class GiuriClass {

	/**
	 * Costruttore della classe GiuriClass
	 */
	public GiuriClass() {
	}

	/**
	 * 
	 * @param b valore intero 1
	 * @param e valore intero 2
	 * @return valore 1
	 */
	public float giuriMet(int b, int e) {
		int val1 = 1;
		for (int i = 1; i <= b; i++) {
			val1 = val1 * b;
		}
		return val1;
	}

	/**
	 * Test di classe main
	 * @param args parametro main
	 */
	public static void main(String[] args) {
		GiuriClass g = new GiuriClass();
		System.out.println(g.giuriMet(2, 3));
		System.out.println(g.giuriMet(4, 5));
	}

}
