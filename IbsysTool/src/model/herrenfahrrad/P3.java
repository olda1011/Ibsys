package model.herrenfahrrad;

/**
 * P1 - Kinderfahrrad Diese Klassen enthalten jeweils sich selber und man sollte
 * die Member über die Get-Properties aufrufen.
 * 
 * So erhält man mit gete26 die Anzahl der verbauten E26 in P1.
 * 
 * @author dolsson
 *
 */
public class P3 {

	public static final int k23 = 1;
	public static final int k24 = 1;
	public static final int k27 = 1;

	public static final E26 e26 = new E26();
	public static final E31 e31 = new E31();

	public static int getE26() {
		return E26.getE26();
	}

	public static int getE31() {
		return E31.getE31();
	}

	public static int getk23() {
		return k23;
	}

	public static int getK24() {
		return k24;
	}

	public static int getK27() {
		return k27;
	}

}
