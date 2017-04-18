package model.kinderfahrrad;

/**
 * P1 - Kinderfahrrad Diese Klassen enthalten jeweils sich selber und man sollte
 * die Member über die Get-Properties aufrufen.
 * 
 * So erhält man mit gete26 die Anzahl der verbauten E26 in P1.
 * 
 * @author dolsson
 *
 */
public class P1 {

	public static final int k21 = 1;
	public static final int k24 = 1;
	public static final int k27 = 1;

	public static final E26 e26 = new E26();
	public static final E51 e51 = new E51();

	public static int getE26() {
		return E26.getE26();
	}

	public static int getE51() {
		return E51.getE51();
	}

	public static int getK21() {
		return k21;
	}

	public static int getK24() {
		return k24;
	}

	public static int getK27() {
		return k27;
	}

}
