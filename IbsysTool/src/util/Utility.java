package util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JTextField;

import application.Main;
import gui.CapacityPlanning;
import gui.MaterialPlanning;

public class Utility {

	public static void initializeValues(MaterialPlanning materialPlanningObject,
			CapacityPlanning capacityPlanningObject)
			throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Main.main();

		int[][] p1Prod = Main.p1Prod;

		for (int i = 0; i < p1Prod.length; i++) {
			for (int j = 0; j < p1Prod[i].length - 1; j++) {
				String methodName = null;
				if (i == 0 && j == 1) {

				} else {

					if (i < 9) {
						methodName = "getTf1_0" + (j + 1) + "0" + (i + 1);

					} else {
						methodName = "getTf1_0" + (j + 1) + "" + (i + 1);
					}
					Method method = materialPlanningObject.getClass()
							.getMethod(methodName);
					if (method != null) {
						JTextField invoke = (JTextField) method.invoke(methodName);
						invoke.setText("" + p1Prod[i][j + 1]);
					}

				}

			}

		}

	}

}
