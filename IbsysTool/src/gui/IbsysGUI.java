package gui;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.bind.JAXB;

import application.Main;
import generated.Input;
import util.Utility;

public class IbsysGUI {

	private static final String PURCHASE_PLANNING = "Purchase Planning";
	private static final String CAPACITY_PLANNING = "Capacity Planning";
	private static final String MATERIAL_PLANNING = "Material Planning";
	private static final String SEQUENCE_PLANNING = "Sequence Planning";
	private static final String PROGNOSEN_PLANNING = "Prognosen";
	private JFrame frame;
	public static PurchasePlanning purchasePlanningObject;
	public static MaterialPlanning materialPlanningObject;
	public static CapacityPlanning capacityPlanningObject;
	public static JTabbedPane paneContainer;
	private SequencePlanningObject sequencePlanningObject;
	private PrognosenObject prognosenObject;

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

		paneContainer = new JTabbedPane(JTabbedPane.TOP);
		planningPanel.add(paneContainer);

		prognosenObject = new PrognosenObject();
		paneContainer.addTab(PROGNOSEN_PLANNING, null, PrognosenObject.prognosenPlanning(), null);

		materialPlanningObject = new MaterialPlanning();
		paneContainer.addTab(MATERIAL_PLANNING, null, MaterialPlanning.materialPlanning(), null);

		capacityPlanningObject = new CapacityPlanning();
		JTabbedPane capacityPlanningPane = capacityPlanningObject.capacityPlanning();
		paneContainer.addTab(CAPACITY_PLANNING, null, capacityPlanningPane, null);

		purchasePlanningObject = new PurchasePlanning();
		JPanel purchasePlanningPanel = purchasePlanningObject.purchasePlanning();
		paneContainer.addTab(PURCHASE_PLANNING, null, purchasePlanningPanel, null);

		sequencePlanningObject = new SequencePlanningObject();
		JPanel sequencePlanningPane = sequencePlanningObject.sequencePlanning();
		paneContainer.addTab(SEQUENCE_PLANNING, null, sequencePlanningPane, null);

		JPanel viewPanel = new JPanel();
		frame.getContentPane()
				.add(viewPanel, "name_588868208714905");

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnView = new JMenu("Data");
		menuBar.add(mnView);

		JMenuItem openDialog = new JMenuItem("Open XML Data ...");
		mnView.add(openDialog);

		JMenuItem saveData = new JMenuItem("Export data as .xml ...");
		mnView.add(saveData);

		JMenuItem closeApp = new JMenuItem("Close Program");
		closeApp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
		});
		mnView.add(closeApp);

		try {
			BufferedImage buttonIcon = ImageIO
					.read(new File("C://Users//dolsson//workspace2//IbsysTool//src//german.png"));
			ImageIcon imageIcon = new ImageIcon(buttonIcon);
			JLabel lblgerman = new JLabel(imageIcon);
			menuBar.add(lblgerman);
			JLabel lblspacer = new JLabel(" | ");
			menuBar.add(lblspacer);
			changeToGerman(lblgerman);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			BufferedImage buttonIcon = ImageIO
					.read(new File("C://Users//dolsson//workspace2//IbsysTool//src//english.png"));
			ImageIcon imageIcon = new ImageIcon(buttonIcon);
			JLabel lblEnglish = new JLabel(imageIcon);
			menuBar.add(lblEnglish);
			changeToEnglish(lblEnglish);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

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

		saveData.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter(".xml",
						"xml");
				chooser.addChoosableFileFilter(extensionFilter);
				try {
					int intValue = Main.results.getPeriod()
							.intValue();
					Date date = new Date(System.currentTimeMillis());
					String dateString = "" + date.getDay() + "_" + date.getMonth() + "_"
							+ (date.getYear() + 1900);
					chooser.setSelectedFile(
							new File("period_" + intValue + "_export_" + dateString + ".xml"));

					int showSaveDialog = chooser.showSaveDialog(null);
					if (showSaveDialog == JFileChooser.CANCEL_OPTION) {

					}
					if (showSaveDialog == JFileChooser.APPROVE_OPTION) {

						Input unmarshal = JAXB.unmarshal(
								Main.class.getResourceAsStream("input.xml"), Input.class);

						File selectedFile = chooser.getSelectedFile();
						String path = selectedFile.getPath();
						char charAt = path.charAt((path.length() - 4));
						if (path.charAt((path.length() - 4)) == '.'
								&& path.charAt((path.length() - 3)) == 'x'
								&& path.charAt((path.length() - 2)) == 'm'
								&& path.charAt((path.length() - 1)) == 'l') {

						} else {
							path += ".xml";
						}
						JAXB.marshal(unmarshal, path);

					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(new JFrame(),
							"No data inserted: Please import data first!", "Error",
							JOptionPane.ERROR_MESSAGE);

				}

			}
		});

	}

	public void changeToGerman(JLabel label) {
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paneContainer.setTitleAt(0, "Materialplanung");
				paneContainer.setTitleAt(1, "Kapazitätsplanung");
				paneContainer.setTitleAt(2, "Bestellplanung");
				MaterialPlanning.l1_salesorder.setText("German");
				MaterialPlanning.l1_followingperiod.setText("Folgende Periode");

			}
		});
	}

	public void changeToEnglish(JLabel label) {
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paneContainer.setTitleAt(0, "Materialplanning");
				paneContainer.setTitleAt(1, "Capacityplanning");
				paneContainer.setTitleAt(2, "Purchaseplanning");
				MaterialPlanning.l1_salesorder.setText("Salesorders");

			}
		});
	}

}
