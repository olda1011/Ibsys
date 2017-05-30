package gui;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import application.Main;
import util.Utility;

public class IbsysGUI {

	private JFrame frame;
	public static PurchasePlanning purchasePlanningObject;
	public static MaterialPlanning materialPlanningObject;
	public static CapacityPlanning capacityPlanningObject;

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

		materialPlanningObject = new MaterialPlanning();
		PaneContainer.addTab("Material Planning", null, MaterialPlanning.materialPlanning(), null);

		capacityPlanningObject = new CapacityPlanning();
		JTabbedPane capacityPlanningPane = capacityPlanningObject.capacityPlanning();
		PaneContainer.addTab("Capacity Planning", null, capacityPlanningPane, null);

		purchasePlanningObject = new PurchasePlanning();
		JPanel purchasePlanningPanel = purchasePlanningObject.purchasePlanning();
		PaneContainer.addTab("PurchasePlanning", null, purchasePlanningPanel, null);

		JPanel viewPanel = new JPanel();
		frame.getContentPane()
				.add(viewPanel, "name_588868208714905");

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnView = new JMenu("Data");
		menuBar.add(mnView);

		JMenuItem openDialog = new JMenuItem("Open XML Data ...");
		mnView.add(openDialog);

		JMenuItem closeApp = new JMenuItem("Close Program");
		closeApp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
		});
		mnView.add(closeApp);
		openDialog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				int showOpenDialog = chooser.showOpenDialog(null);

				if (showOpenDialog == JFileChooser.APPROVE_OPTION) {

					String path = chooser.getSelectedFile()
							.getPath();
					try {
						if (Main.loadXmlData(path)) {
							JOptionPane.showMessageDialog(new JFrame(),
									"Please choose a valid file which is not empty!", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else {
							try {
								Utility.initValues();
								MaterialPlanning.enableEditable();

							} catch (NoSuchMethodException | SecurityException
									| IllegalAccessException | IllegalArgumentException
									| InvocationTargetException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					} catch (Exception e) {
						e.printStackTrace();
						JOptionPane.showMessageDialog(new JFrame(),
								"Please choose a valid file! The file has to be a .xml file!",
								"Error", JOptionPane.ERROR_MESSAGE);

					}

				}
			}
		});

	}

}
