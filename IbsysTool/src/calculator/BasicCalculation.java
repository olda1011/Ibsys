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

	public static String benötigteWaren(Input input) {
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

		return "Für " + p1 + " von P1 werden folgende Teile benötigt:\n"
				+ new Kinderfahrrad().toString2(p1) + "\n" + "Für " + p2
				+ " von P2 werden folgende Teile benötigt:\n" + new Damenfahrrad().toString2(p2)
				+ "\n" + "Für " + p3 + " von P3 werden folgende Teile benötigt:\n"
				+ new Herrenfahrrad().toString2(p3) + "\n";
	}
}
