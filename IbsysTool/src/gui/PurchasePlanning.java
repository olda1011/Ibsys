/**
 * 
 */
package gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author D069948
 *
 */

public class PurchasePlanning {
	public static JTable table;
	public static JPanel purchasePlanningPanel;

	/**
	 * 
	 */
	public PurchasePlanning() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public JPanel purchasePlanning() {

		purchasePlanningPanel = new JPanel();
		purchasePlanningPanel.setLayout(new BorderLayout(0, 0));

		DefaultTableModel model = new DefaultTableModel(
				new Object[][] { { "21", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "22", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "23", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "24", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "25", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "27", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "28", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "32", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "33", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "34", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "35", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "36", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "37", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "38", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "39", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "40", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "41", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "42", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "43", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "44", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "45", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "46", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "47", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "48", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "52", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "53", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "57", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "58", null, null, null, null, null, null, null, null, null, null, null, null },
						{ "59", null, null, null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "ID", "Inventory", "Di", "Mi", "Do", "Fr", "Mo(N+1)", "N", "N+1", "N+2", "N+3",
						"Bestellungen", "Eil" });

		table = new JTable(model) {
			private static final long serialVersionUID = 1L;

			@Override
			public Class getColumnClass(int column) {
				switch (column) {
				case 0:
					return String.class;
				case 1:
					return String.class;
				case 2:
					return String.class;
				case 3:
					return String.class;
				case 4:
					return String.class;
				case 5:
					return String.class;
				case 6:
					return String.class;
				case 7:
					return String.class;
				case 8:
					return String.class;
				case 9:
					return String.class;
				case 10:
					return String.class;
				case 11:
					return String.class;
				case 12:
					return Boolean.class;
				case 13:
					return Boolean.class;
				default:
					return Boolean.class;
				}
			}

		};

		table.setDefaultRenderer(Object.class, new CellRenderer());

		purchasePlanningPanel.add(new JScrollPane(table));

		return purchasePlanningPanel;
	}

	public static JTable getTable() {
		return table;
	}

}
