package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import java.awt.GridLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

public class IbsysGUI {

	private JFrame frame;
	
	

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
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
		frame.setBounds(100, 100, 890, 826);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel planningPanel = new JPanel();
		frame.getContentPane().add(planningPanel, "name_588858563580255");
		planningPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane PaneContainer = new JTabbedPane(JTabbedPane.TOP);
		planningPanel.add(PaneContainer);
		
		PaneContainer.addTab("Material Planning", null, new MaterialPlanning().materialPlanning(), null);
		
		
		
		
		
		
		
		PaneContainer.addTab("Capacity Planning", null, new CapacityPlanning().capacityPlanning(), null);
		
		JTabbedPane tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
		PaneContainer.addTab("Purchase Planning", null, tabbedPane_5, null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		PaneContainer.addTab("Direct Sales", null, tabbedPane, null);
		
		JPanel viewPanel = new JPanel();
		frame.getContentPane().add(viewPanel, "name_588868208714905");
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenuItem mntmPlanning = new JMenuItem("Planning");
		mnView.add(mntmPlanning);
		
		JMenuItem mntmRessources = new JMenuItem("Ressources");
		mnView.add(mntmRessources);
	}
}
