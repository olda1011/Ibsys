package util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import application.Main;
import generated.Input;
import generated.Input.Orderlist;
import generated.Input.Productionlist.Production;
import generated.Input.Qualitycontrol;
import generated.Input.Selldirect;
import generated.Input.Selldirect.Item;
import generated.Input.Sellwish;
import generated.Input.Workingtimelist;
import generated.Input.Workingtimelist.Workingtime;
import generated.Results.Inwardstockmovement.Order;
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

		// Warteschlangeholen

		Main.timeneeded = Main.timeneedfill();

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
				if (j < 2) {
					purchasePlanningTable.setValueAt(kaufteileVerwendungMerged[i][j], i, j);
				} else {
					int g = j + 5;
					purchasePlanningTable.setValueAt(kaufteileVerwendungMerged[i][j], i, g);
				}
			}

		}

		// Inwardstock
		System.out.println(Main.inwardstockmovement.size());
		for (Order o : Main.inwardstockmovement) {
			int time = o.getTime();
			int amount = o.getAmount();
			int tempcalc = (time % 7200) / 1440;
			int calctime = ((time % 7200) / 1440);
			if (calctime == 0) {
				calctime = 5;
			}
			int article = o.getArticle();
			System.out.println("Artikel: " + article + " calctime: " + calctime + "temcalctime: " + tempcalc);
			int row = 0;
			for (int i = 0; i < purchasePlanningTable.getRowCount(); i++) {
				if ((Integer) purchasePlanningTable.getValueAt(i, 0) == article) {
					if (purchasePlanningTable.getValueAt(i, calctime + 1) != null) {
						amount += (Integer) purchasePlanningTable.getValueAt(i, calctime + 1);
					}
					row = i;
				}
			}
			purchasePlanningTable.setValueAt(amount, row, calctime + 1);
		}

		// Orders
		for (int i = 0; i < purchasePlanningTable.getRowCount(); i++) {
			int ordertime = Main.ordertime[(Integer) purchasePlanningTable.getValueAt(i, 0)];
			int lager = (Integer) purchasePlanningTable.getValueAt(i, 1);
			int verbrauch = 0;
			switch (ordertime) {
			case 1:
				verbrauch += (Integer) purchasePlanningTable.getValueAt(i, 7);
				break;
			case 2:
				verbrauch += (Integer) purchasePlanningTable.getValueAt(i, 7)
						+ (Integer) purchasePlanningTable.getValueAt(i, 8);
				break;
			case 3:
				verbrauch += (Integer) purchasePlanningTable.getValueAt(i, 7)
						+ (Integer) purchasePlanningTable.getValueAt(i, 8)
						+ (Integer) purchasePlanningTable.getValueAt(i, 9);
				break;
			case 4:
				verbrauch += (Integer) purchasePlanningTable.getValueAt(i, 7)
						+ (Integer) purchasePlanningTable.getValueAt(i, 8)
						+ (Integer) purchasePlanningTable.getValueAt(i, 9)
						+ (Integer) purchasePlanningTable.getValueAt(i, 10);
				break;
			}
			int n = 0;
			int n1 = 0;
			int n2 = 0;
			int n3 = 0;
			int n4 = 0;
			if (purchasePlanningTable.getValueAt(i, 2) != null) {
				n = (Integer) purchasePlanningTable.getValueAt(i, 2);
			}
			if (purchasePlanningTable.getValueAt(i, 3) != null) {
				n1 = (Integer) purchasePlanningTable.getValueAt(i, 3);
			}
			if (purchasePlanningTable.getValueAt(i, 4) != null) {
				n2 = (Integer) purchasePlanningTable.getValueAt(i, 4);
			}
			if (purchasePlanningTable.getValueAt(i, 5) != null) {
				n3 = (Integer) purchasePlanningTable.getValueAt(i, 5);
			}
			if (purchasePlanningTable.getValueAt(i, 6) != null) {
				n4 = (Integer) purchasePlanningTable.getValueAt(i, 6);
			}

			int zugang = n + n1 + n2 + n3 + n4;

			if ((lager + zugang) < verbrauch) {
				System.out.println("lager: " + lager + "verbrauch: " + verbrauch);
				int bestell = verbrauch;
				purchasePlanningTable.setValueAt(bestell, i, 11);

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
			String methodNameV = "getCptf" + j + "_v";
			String methodNameR = "getCptf" + j + "_r";
			String methodNameT = "getCptf" + j + "_t";
			String methodNameA = "getCptf" + j + "_a";
			String methodNameC = "getCpcb" + j;
			String methodNameU = "getCptf" + j + "_u";
			Method methodK = null;
			Method methodV = null;
			Method methodR = null;
			Method methodT = null;
			Method methodA = null;
			Method methodC = null;
			Method methodU = null;
			try {
				methodK = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameK);
				methodV = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameV);
				methodR = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameR);
				methodT = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameT);
				methodA = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameA);
				methodC = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameC);
				methodU = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameU);
			} catch (Exception e) {
			}
			if (methodK != null && methodR != null && methodT != null && methodU != null && methodV != null
					&& methodC != null) {
				JTextField invokeK = (JTextField) methodK.invoke(methodNameK);
				JTextField invokeV = (JTextField) methodV.invoke(methodNameV);
				JTextField invokeR = (JTextField) methodR.invoke(methodNameR);
				JTextField invokeT = (JTextField) methodT.invoke(methodNameT);
				JTextField invokeA = (JTextField) methodA.invoke(methodNameA);
				JComboBox invokeC = (JComboBox) methodC.invoke(methodNameC);
				JTextField invokeU = (JTextField) methodU.invoke(methodNameU);
				int capacity = getCapacityOfWorkstation(j);
				int setuptime = getSetupTimeOfWorkstation(j);
				int capacityold;
				int shiftvalue = 0;

				if (j == 5) {
					capacityold = 0;
				} else {
					capacityold = Main.timeneeded[j];
				}
				if (capacityold != 0) {
					setuptime += Main.setuptime[j - 1];
				}
				int totalcapacity = capacity + setuptime + capacityold;

				if (totalcapacity > 0 && totalcapacity < 3866) {
					invokeC.setSelectedIndex(0);
					shiftvalue = 2400;
				} else if (totalcapacity > 3866 && totalcapacity < 6666) {
					invokeC.setSelectedIndex(1);
					shiftvalue = 4800;
				} else if (totalcapacity > 6666 && totalcapacity < 7200) {
					invokeC.setSelectedIndex(2);
					shiftvalue = 7200;
				} else if (totalcapacity > 7200) {
					invokeC.setSelectedIndex(2);
					shiftvalue = 7200;
					totalcapacity = 7200;
				}

				int workload = totalcapacity * 100 / shiftvalue;
				int overtime = (totalcapacity - shiftvalue) > 0 ? totalcapacity - shiftvalue : 0;
				System.out.println("workstation" + j + " " + overtime);
				overtime = overtime / 5;
				invokeK.setText("" + capacity);
				invokeV.setText("" + capacityold);
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
				// System.out.println("p1: " + p1PartID + " Menge: " +
				// p1PartAmount + " p2: "
				// + p2PartID + " Menge: " + p2PartAmount + " p3: " + p3PartID +
				// " Menge: "
				// + p3PartAmount + " Counter:" + counter);
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
				// System.out.println("p1: " + p1PartID + " Menge: " +
				// p1PartAmount + " p2: "
				// + p2PartID + " Menge: " + p2PartAmount + "p3: " + p3PartID +
				// " Menge: "
				// + p3PartAmount + " Counter:" + counter);
				counter = counter + 3;
			}

		}

	}

	public static void raiseSetupTime(int id)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (int j = 1; j <= 15; j++) {
			String methodNameID = "getCptf" + j + "_" + id;
			String methodNameR = "getCptf" + j + "_r";

			Method methodR = null;
			Method methodID = null;

			try {
				methodID = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameID);

				methodR = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameR);

			} catch (Exception e) {
			}
			if (methodR != null && methodID != null) {
				JTextField invokeID = (JTextField) methodID.invoke(methodNameID);
				JTextField invokeR = (JTextField) methodR.invoke(methodNameR);
				int setuptime = Main.setuptime[j - 1];
				int oldvalue = Integer.parseInt(invokeR.getText());
				int newvalue = setuptime + oldvalue;
				invokeR.setText("" + newvalue);
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
					setuptime += Main.setuptime[workstation - 1];
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

	public static Input generateInputXmlObject() {
		Input input = new Input();

		// Qualitycontrol
		Qualitycontrol qualitycontrol = new Qualitycontrol();
		qualitycontrol.setDelay(null);
		qualitycontrol.setLosequantity(null);
		qualitycontrol.setType(null);
		input.setQualitycontrol(qualitycontrol);

		// Selldirect
		Selldirect sellDirect = new Selldirect();
		Item i1 = new Item();
		i1.setArticle((byte) 1);
		i1.setPenalty(null);
		i1.setPrice(null);
		i1.setQuantity(null);
		sellDirect.getItem().add(i1);
		Item i2 = new Item();
		i2.setArticle((byte) 2);
		i2.setPenalty(null);
		i2.setPrice(null);
		i2.setQuantity(null);
		sellDirect.getItem().add(i2);
		Item i3 = new Item();
		i3.setArticle((byte) 3);
		i3.setPenalty(null);
		i3.setPrice(null);
		i3.setQuantity(null);
		sellDirect.getItem().add(i3);
		input.setSelldirect(sellDirect);

		// Sellwish
		Sellwish sellWish = new Sellwish();
		Input.Sellwish.Item iSW1 = new Input.Sellwish.Item();
		iSW1.setArticle((byte) 1);
		iSW1.setQuantity(null);
		sellWish.getItem().add(iSW1);
		Input.Sellwish.Item iSW2 = new Input.Sellwish.Item();
		iSW2.setArticle((byte) 1);
		iSW2.setQuantity(null);
		sellWish.getItem().add(iSW2);
		Input.Sellwish.Item iSW3 = new Input.Sellwish.Item();
		iSW3.setArticle((byte) 1);
		iSW3.setQuantity(null);
		sellWish.getItem().add(iSW3);
		input.setSellwish(sellWish);

		// Order hinzufügen
		generated.Input.Orderlist.Order order = new generated.Input.Orderlist.Order();
		order.setArticle((byte) 0);
		order.setModus((byte) 5);
		order.setQuantity((short) 10);
		input.setOrderlist(new Orderlist());
		input.getOrderlist().getOrder().add(order);

		// Productionlist
		Input.Productionlist productionsList = new Input.Productionlist();
		input.setProductionlist(productionsList);
		Production p1 = new Production();
		p1.setArticle((byte) 1);
		p1.setQuantity((short) 1);

		input.getProductionlist().getProduction().add(p1);

		// Workingtime
		input.setWorkingtimelist(new Workingtimelist());
		Workingtime w1 = new Workingtime();
		w1.setStation((byte) 1);
		w1.setShift((byte) 0);
		w1.setOvertime((short) 0);
		input.getWorkingtimelist().getWorkingtime().add(w1);

		return input;
	}

	public static void calculateOvertime()
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (int j = 1; j <= 15; j++) {

			String methodNameA = "getCptf" + j + "_a";
			String methodNameC = "getCpcb" + j;
			String methodNameU = "getCptf" + j + "_u";

			Method methodA = null;
			Method methodC = null;
			Method methodU = null;
			try {
				methodA = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameA);
				methodC = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameC);
				methodU = IbsysGUI.capacityPlanningObject.getClass().getMethod(methodNameU);
			} catch (Exception e) {
			}
			if (methodA != null && methodC != null && methodU != null) {

				JTextField invokeA = (JTextField) methodA.invoke(methodNameA);
				JComboBox invokeC = (JComboBox) methodC.invoke(methodNameC);
				JTextField invokeU = (JTextField) methodU.invoke(methodNameU);
				int capacity = getCapacityOfWorkstation(j);
				int setuptime = getSetupTimeOfWorkstation(j);
				int capacityold;
				int shiftvalue = 0;

				if (j == 5) {
					capacityold = 0;
				} else {
					capacityold = Main.timeneeded[j];
				}
				int totalcapacity = capacity + setuptime + capacityold;

				if (totalcapacity > 7200) {
					totalcapacity = 7200;
				}

				if (invokeC.getSelectedIndex() == 0) {
					shiftvalue = 2400;
				} else if (invokeC.getSelectedIndex() == 1) {
					shiftvalue = 4800;
				} else if (invokeC.getSelectedIndex() == 2) {
					shiftvalue = 7200;
				}
				int workload = totalcapacity * 100 / shiftvalue;
				int overtime = (totalcapacity - shiftvalue) > 0 ? totalcapacity - shiftvalue : 0;
				overtime = overtime / 5;
				invokeA.setText("" + workload);
				invokeU.setText("" + overtime);
			}
		}
	}

}
