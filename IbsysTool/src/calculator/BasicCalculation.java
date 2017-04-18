package calculator;

import generated.Input;
import generated.Input.Sellwish;
import model.Damenfahrrad;
import model.Herrenfahrrad;
import model.Kinderfahrrad;

/**
 * 
 * @author dolsson
 *
 */
public class BasicCalculation {

	public static String ben�tigteWaren(Input input) {
		Sellwish sellwish = input.getSellwish();
		int p1 = sellwish.getItem()
				.get(0)
				.getQuantity();
		int p2 = sellwish.getItem()
				.get(1)
				.getQuantity();
		int p3 = sellwish.getItem()
				.get(2)
				.getQuantity();

		return "F�r " + p1 + " von P1 werden folgende Teile ben�tigt:\n"
				+ new Kinderfahrrad().toString2(p1) + "\n" + "F�r " + p2
				+ " von P2 werden folgende Teile ben�tigt:\n" + new Damenfahrrad().toString2(p2)
				+ "\n" + "F�r " + p3 + " von P3 werden folgende Teile ben�tigt:\n"
				+ new Herrenfahrrad().toString2(p3) + "\n";
	}
}
