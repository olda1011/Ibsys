package util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JTable;
import javax.swing.JTextField;

import application.Main;
import gui.CapacityPlanning;
import gui.MaterialPlanning;
import gui.PurchasePlanning;

public class Utility {

	public static void initializeValues(MaterialPlanning materialPlanningObject,
			CapacityPlanning capacityPlanningObject, PurchasePlanning purchasePlanningObject)
			throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Main.main();

		int[][] p1Prod = Main.p1Prod;
		int[][] p2Prod = Main.p2Prod;
		int[][] p3Prod = Main.p3Prod;

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

		for (int i = 0; i < p2Prod.length; i++) {
			for (int j = 0; j < p2Prod[i].length - 1; j++) {
				String methodName = null;
				if (i == 0 && j == 1) {

				} else {
					if (i < 9) {
						methodName = "getTf2_0" + (j + 1) + "0" + (i + 1);

					} else {
						methodName = "getTf2_0" + (j + 1) + "" + (i + 1);
					}
					Method method = materialPlanningObject.getClass()
							.getMethod(methodName);
					if (method != null) {
						JTextField invoke = (JTextField) method.invoke(methodName);
						invoke.setText("" + p2Prod[i][j + 1]);
					}

				}
			}
		}

		for (int i = 0; i < p3Prod.length; i++) {
			for (int j = 0; j < p3Prod[i].length - 1; j++) {
				String methodName = null;
				if (i == 0 && j == 1) {

				} else {
					if (i < 9) {
						methodName = "getTf3_0" + (j + 1) + "0" + (i + 1);

					} else {
						methodName = "getTf3_0" + (j + 1) + "" + (i + 1);
					}
					Method method = materialPlanningObject.getClass()
							.getMethod(methodName);
					if (method != null) {
						JTextField invoke = (JTextField) method.invoke(methodName);
						invoke.setText("" + p3Prod[i][j + 1]);
					}

				}
			}
		}
		int[][] kaufteileVerwendungMerged = Main.kaufteileVerwendungMerged;
		JTable purchasePlanningTable = PurchasePlanning.getTable();

		for (int i = 0; i < kaufteileVerwendungMerged.length; i++) {
			for (int j = 0; j < kaufteileVerwendungMerged[i].length; j++) {
				if (j == 0) {

				} else {
					purchasePlanningTable.setValueAt(kaufteileVerwendungMerged[i][j], i, j);
				}
			}

		}
		// Purchase Planning init

	}

}
