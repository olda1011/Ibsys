/**
 * 
 */
package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;
import java.awt.BorderLayout;

/**
 * @author D069948
 *
 */



public class PurchasePlanning {
	private JTable table;

	/**
	 * 
	 */
	public PurchasePlanning() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public JPanel purchasePlanning(){
		
	JPanel purchasePlanningPanel = new JPanel();
	purchasePlanningPanel.setLayout(new BorderLayout(0, 0));
	table = new JTable(new DefaultTableModel(
		new Object[][] {
			{"K21", null, null, null, null, null},
			{"K22", null, null, null, null, null},
			{"K23", null, null, null, null, null},
			{"K24", null, null, null, null, null},
			{"K25", null, null, null, null, null},
			{"K27", null, null, null, null, null},
			{"K28", null, null, null, null, null},
			{"K32", null, null, null, null, null},
			{"K33", null, null, null, null, null},
			{"K34", null, null, null, null, null},
			{"K35", null, null, null, null, null},
			{"K36", null, null, null, null, null},
			{"K37", null, null, null, null, null},
			{"K38", null, null, null, null, null},
			{"K39", null, null, null, null, null},
			{"K40", null, null, null, null, null},
			{"K41", null, null, null, null, null},
			{"K42", null, null, null, null, null},
			{"K43", null, null, null, null, null},
			{"K44", null, null, null, null, null},
			{"K45", null, null, null, null, null},
			{"K46", null, null, null, null, null},
			{"K47", null, null, null, null, null},
			{"K48", null, null, null, null, null},
			{"K52", null, null, null, null, null},
			{"K53", null, null, null, null, null},
			{"K57", null, null, null, null, null},
			{"K58", null, null, null, null, null},
			{"K59", null, null, null, null, null},
		},
		new String[] {
			"Kaufteile", "Lager", "Bedarf N", "Bedarf N+1", "Bedarf N+2", "Bedarf N+3"
		}
	));
	
	table.setDefaultRenderer(Object.class, new CellRenderer());
	
	purchasePlanningPanel.add(new JScrollPane(table));
	
	return purchasePlanningPanel;
	}

}
