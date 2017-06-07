package util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JLabel;
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

		// 16 17 26
		int e16 = p3Prod[3][7] + p2Prod[3][7] + p1Prod[3][7];
		int e17 = p3Prod[4][7] + p2Prod[4][7] + p1Prod[4][7];
		int e26 = p3Prod[1][7] + p2Prod[1][7] + p1Prod[1][7];
		CapacityPlanning.getCptf14_16().setText("" + e16);
		CapacityPlanning.getCptf6_16().setText("" + e16);
		CapacityPlanning.getCptf15_17().setText("" + e17);
		CapacityPlanning.getCptf7_26().setText("" + e26);
		CapacityPlanning.getCptf15_26().setText("" + e26);

		// p1 p2 p3
		for (int i = 0; i <= 11; i++) {
			int productvalue3 = p3Prod[i][7];
			int productid3 = p3Prod[i][0];
			int productvalue2 = p2Prod[i][7];
			int productid2 = p2Prod[i][0];
			int productvalue1 = p1Prod[i][7];
			int productid1 = p1Prod[i][0];
			capacityFill(productvalue1, productid1);
			capacityFill(productvalue2, productid2);
			capacityFill(productvalue3, productid3);
		}

		// calculate
		for (int j = 1; j <= 15; j++) {
			String methodNameK = "getCptf" + j + "_k";
			String methodNameR = "getCptf" + j + "_r";
			String methodNameT = "getCptf" + j + "_t";
			String methodNameA = "getCptf" + j + "_a";
			String methodNameU = "getCptf" + j + "_u";
			Method methodK = null;
			Method methodR = null;
			Method methodT = null;
			Method methodA = null;
			Method methodU = null;
			try {
				methodK = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameK);
				methodR = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameR);
				methodT = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameT);
				methodA = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameA);
				methodU = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameU);
			} catch (Exception e) {

			}
			if (methodK != null && methodR != null && methodT != null && methodU != null) {
				JTextField invokeK = (JTextField) methodK.invoke(methodNameK);
				JTextField invokeR = (JTextField) methodR.invoke(methodNameR);
				JTextField invokeT = (JTextField) methodT.invoke(methodNameT);
				JTextField invokeA = (JTextField) methodA.invoke(methodNameA);
				JTextField invokeU = (JTextField) methodU.invoke(methodNameU);
				int capacity = getCapacityOfWorkstation(j);
				int setuptime = getSetupTimeOfWorkstation(j);
				int capacityold = Main.timeneeded[j];
				// TEXTFIELD benennen und einfügen
				int totalcapacity = capacity + setuptime;
				int workload = totalcapacity * 100 / 2400;
				int overtime = (totalcapacity - 2400) > 0 ? totalcapacity - 2400 : 0;
				invokeK.setText("" + capacity);
				invokeR.setText("" + setuptime);
				invokeT.setText("" + totalcapacity);
				invokeA.setText("" + workload);
				invokeU.setText("" + overtime);

			}
		}

		// fill SequencePlanning
		int counter = 0;
		for (int i = 11; i >= 0; i--) {
			int p1PartID = p1Prod[i][0];
			int p2PartID = p2Prod[i][0];
			int p3PartID = p3Prod[i][0];
			int p1PartAmount = p1Prod[i][7];
			int p2PartAmount = p2Prod[i][7];
			int p3PartAmount = p3Prod[i][7];
			if ((p1PartID == 16 || p1PartID == 17 || p1PartID == 26)
					|| (p2PartID == 16 || p2PartID == 17 || p2PartID == 26)
					|| (p3PartID == 16 || p3PartID == 17 || p3PartID == 26)) {
				IbsysGUI.sequencePlanningObject.getSpt_table().setValueAt(p3PartAmount, counter + 2, 2);
				System.out.println("p1: " + p1PartID + " Menge: " + p1PartAmount + " p2: " + p2PartID + " Menge: "
						+ p2PartAmount + " p3: " + p3PartID + " Menge: " + p3PartAmount + " Counter:" + counter);
				IbsysGUI.sequencePlanningObject.getSpt_table().setValueAt(p1PartID, counter, 1);
				IbsysGUI.sequencePlanningObject.getSpt_table().setValueAt(p1PartAmount + p2PartAmount + p3PartAmount,
						counter, 2);
				counter++;
			} else {
				IbsysGUI.sequencePlanningObject.getSpt_table().setValueAt(p1PartID, counter, 1);
				IbsysGUI.sequencePlanningObject.getSpt_table().setValueAt(p2PartID, counter + 1, 1);
				IbsysGUI.sequencePlanningObject.getSpt_table().setValueAt(p3PartID, counter + 2, 1);
				IbsysGUI.sequencePlanningObject.getSpt_table().setValueAt(p1PartAmount, counter, 2);
				IbsysGUI.sequencePlanningObject.getSpt_table().setValueAt(p2PartAmount, counter + 1, 2);
				IbsysGUI.sequencePlanningObject.getSpt_table().setValueAt(p3PartAmount, counter + 2, 2);
				System.out.println("p1: " + p1PartID + " Menge: " + p1PartAmount + " p2: " + p2PartID + " Menge: "
						+ p2PartAmount + "p3: " + p3PartID + " Menge: " + p3PartAmount + " Counter:" + counter);
				counter = counter + 3;
			}

		}
	}

	private static int getCapacityOfWorkstation(int workstation)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		int capacity = 0;
		for (int i = 1; i <= 56; i++) {
			String methodName = "getCptfr" + workstation + "_" + i;
			Method method = null;

			try {
				method = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodName);
			} catch (Exception e) {

			}
			if (method != null) {
				JTextField invoke = (JTextField) method.invoke(methodName);
				capacity += Integer.parseInt(invoke.getText());
			}
		}
		return capacity;
	}

	private static int getSetupTimeOfWorkstation(int workstation)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		int setuptime = 0;
		for (int i = 1; i <= 56; i++) {
			String methodName = "getCptfr" + workstation + "_" + i;
			Method method = null;
			int value = 0;

			try {
				method = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodName);
			} catch (Exception e) {

			}
			if (method != null) {
				JTextField invoke = (JTextField) method.invoke(methodName);
				value = Integer.parseInt(invoke.getText());
				if (value > 0) {
					setuptime += Main.setuptime[workstation];
				}

			}
		}
		return setuptime;
	}

	private static void capacityFill(int productValue, int productId)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		for (int j = 1; j <= 15; j++) {
			String methodName = "getCptf" + j + "_" + productId;
			String methodNameMult = "getCpl" + j + "_" + productId;
			String methodNameResult = "getCptfr" + j + "_" + productId;
			Method method = null;
			Method methodMult = null;
			Method methodResult = null;
			int sharedValue = 0;
			int mult = 0;
			try {
				method = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodName);
				methodMult = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameMult);
				methodResult = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameResult);
			} catch (Exception e) {

			}
			if (method != null) {
				JTextField invoke = (JTextField) method.invoke(methodName);
				if ((productId == 16 || productId == 17 || productId == 26)) {
					sharedValue = Integer.parseInt(invoke.getText());
				} else {
					invoke.setText("" + productValue);
				}
			}

			if (methodMult != null) {
				JLabel invoke = (JLabel) methodMult.invoke(methodNameMult);
				mult = Integer.parseInt(invoke.getText().replaceAll("\\D", ""));
			}

			if (methodResult != null) {
				JTextField invoke = (JTextField) methodResult.invoke(methodNameResult);
				if ((productId == 16 || productId == 17 || productId == 26)) {
					invoke.setText("" + sharedValue * mult);
				} else {
					invoke.setText("" + productValue * mult);

				}

			}
		}
	}

}
