package gui;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import util.Utility;

public class IbsysGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					IbsysGUI window = new IbsysGUI();
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IbsysGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 890, 581);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane()
				.setLayout(new CardLayout(0, 0));

		JPanel planningPanel = new JPanel();
		frame.getContentPane()
				.add(planningPanel, "name_588858563580255");
		planningPanel.setLayout(new GridLayout(0, 1, 0, 0));

		JTabbedPane PaneContainer = new JTabbedPane(JTabbedPane.TOP);
		planningPanel.add(PaneContainer);

		MaterialPlanning materialPlanningObject = new MaterialPlanning();
		JTabbedPane materialPlanningPane = materialPlanningObject.materialPlanning();
		PaneContainer.addTab("Material Planning", null, materialPlanningPane, null);

		CapacityPlanning capacityPlanningObject = new CapacityPlanning();
		JTabbedPane capacityPlanningPane = capacityPlanningObject.capacityPlanning();
		PaneContainer.addTab("Capacity Planning", null, capacityPlanningPane, null);
		
		PurchasePlanning purchasePlanningObject = new PurchasePlanning();
		JPanel purchasePlanningPanel = purchasePlanningObject.purchasePlanning();
		PaneContainer.addTab("PurchasePlanning", null, purchasePlanningPanel , null);

		JTabbedPane tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
		PaneContainer.addTab("Purchase Planning", null, tabbedPane_5, null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		PaneContainer.addTab("Direct Sales", null, tabbedPane, null);

		JPanel viewPanel = new JPanel();
		frame.getContentPane()
				.add(viewPanel, "name_588868208714905");

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);

		JMenuItem mntmPlanning = new JMenuItem("Planning");
		mnView.add(mntmPlanning);

		JMenuItem mntmRessources = new JMenuItem("Ressources");
		mnView.add(mntmRessources);

		try {
			Utility.initializeValues(materialPlanningObject, capacityPlanningObject);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
