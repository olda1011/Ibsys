package util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JTable;
import javax.swing.JTextField;

import application.Main;
import gui.CapacityPlanning;
import gui.IbsysGUI;
import gui.PurchasePlanning;

public class Utility {

	public static void calculateAfterChange() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		// Produktionsprogramm berechnen

		Main.p1Prod = Main.calculateProduction(Main.p1Prod, 1);
		Main.p2Prod = Main.calculateProduction(Main.p2Prod, 2);
		Main.p3Prod = Main.calculateProduction(Main.p3Prod, 3);

		// Kaufteilbedarf errechnen

		Main.p1KaufteileVerwendung = Main.generiereKaufteileVerwendung(1, Main.p1Prod);
		Main.p2KaufteileVerwendung = Main.generiereKaufteileVerwendung(2, Main.p2Prod);
		Main.p3KaufteileVerwendung = Main.generiereKaufteileVerwendung(3, Main.p3Prod);
		Main.kaufteileVerwendungMerged = Main.mergeKautfteileVerwendung(Main.p1KaufteileVerwendung,
				Main.p2KaufteileVerwendung, Main.p3KaufteileVerwendung);

		fillValues();
	}

	public static void initValues() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Main.main();
		fillValues();
	}

	public static void fillValues() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

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
					Method method = IbsysGUI.materialPlanningObject.getClass().getMethod(methodName);
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
					Method method = IbsysGUI.materialPlanningObject.getClass().getMethod(methodName);
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
					Method method = IbsysGUI.materialPlanningObject.getClass().getMethod(methodName);
					if (method != null) {
						JTextField invoke = (JTextField) method.invoke(methodName);
						invoke.setText("" + p3Prod[i][j + 1]);
					}

				}
			}
		}

		// Purchase Planning init

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

		// Capacity Planning init

		// p1
		for (int i = 0; i <= 11; i++) {
			int productvalue = p1Prod[i][7];
			int productid = p1Prod[i][0];
			for (int j = 1; j <= 15; j++) {
				String methodName = null;
				methodName = "getCptf" + j + "_" + productid;
				System.out.println(methodName);
				Method method = null;
				try {
					method = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodName);
				} catch (Exception e) {

				}
				if (method != null) {
					JTextField invoke = (JTextField) method.invoke(methodName);
					if ((productid == 16 || productid == 17 || productid == 26)) {

					} else {
						invoke.setText("" + productvalue);
					}
				}
			}
		}

		// p2
		for (int i = 0; i <= 11; i++) {
			int productvalue = p2Prod[i][7];
			int productid = p2Prod[i][0];
			for (int j = 1; j <= 15; j++) {
				String methodName = null;
				methodName = "getCptf" + j + "_" + productid;
				System.out.println(methodName);
				Method method = null;
				try {
					method = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodName);
				} catch (Exception e) {

				}
				if (method != null) {
					JTextField invoke = (JTextField) method.invoke(methodName);
					if ((productid == 16 || productid == 17 || productid == 26)) {

					} else {
						invoke.setText("" + productvalue);
					}
				}
			}
		}

		// p3
		for (int i = 0; i <= 11; i++) {
			int productvalue = p3Prod[i][7];
			int productid = p3Prod[i][0];
			for (int j = 1; j <= 15; j++) {
				String methodName = null;
				methodName = "getCptf" + j + "_" + productid;
				System.out.println(methodName);
				Method method = null;
				try {
					method = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodName);
				} catch (Exception e) {

				}
				if (method != null) {
					JTextField invoke = (JTextField) method.invoke(methodName);
					if ((productid == 16 || productid == 17 || productid == 26)) {
					} else {
						invoke.setText("" + productvalue);
					}
				}
			}
		}

		// 16 17 26
		int e16 = p3Prod[3][7] + p2Prod[3][7] + p1Prod[3][7];
		int e17 = p3Prod[4][7] + p2Prod[4][7] + p1Prod[4][7];
		int e26 = p3Prod[1][7] + p2Prod[1][7] + p1Prod[1][7];
		CapacityPlanning.getCptf14_16().setText("" + e16);
		CapacityPlanning.getCptf6_16().setText("" + e16);
		CapacityPlanning.getCptf15_17().setText("" + e17);
		CapacityPlanning.getCptf7_26().setText("" + e26);
		CapacityPlanning.getCptf15_26().setText("" + e26);

	}

}
