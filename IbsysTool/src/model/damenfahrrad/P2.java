package model.damenfahrrad;

/**
 * P1 - Kinderfahrrad Diese Klassen enthalten jeweils sich selber und man sollte
 * die Member über die Get-Properties aufrufen.
 * 
 * So erhält man mit gete26 die Anzahl der verbauten E26 in P1.
 * 
 * @author dolsson
 *
 */
public class P2 {

	public static final int k22 = 1;
	public static final int k24 = 1;
	public static final int k27 = 1;

	public static final E26 e26 = new E26();
	public static final E56 e56 = new E56();

	public static int getE26() {
		return E26.getE26();
	}

	public static int getE56() {
		return E56.getE56();
	}

	public static int getk22() {
		return k22;
	}

	public static int getK24() {
		return k24;
	}

	public static int getK27() {
		return k27;
	}

}
