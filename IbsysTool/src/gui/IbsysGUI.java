package gui;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.bind.JAXB;

import application.Main;
import generated.Input;
import util.Utility;

public class IbsysGUI {

	public static String ERROR = "Error";
	private static String NO_DATA_INSERTED_PLEASE_IMPORT_DATA_FIRST = "No data inserted: Please import data first!";
	private static String PLEASE_CHOOSE_A_VALID_FILE_THE_FILE_HAS_TO_BE_A_XML_FILE = "Please choose a valid file! The file has to be a .xml file!";
	private static String PLEASE_CHOOSE_A_VALID_FILE_WHICH_IS_NOT_EMPTY = "Please choose a valid file which is not empty!";
	private static String PLEASE_FILL_IN_VALUES_FIRST = "Please fill in values first! And press calculate";
	private static final String PURCHASE_PLANNING = "Purchase Planning";
	private static final String CAPACITY_PLANNING = "Capacity Planning";
	private static final String MATERIAL_PLANNING = "Material Planning";
	private static final String SEQUENCE_PLANNING = "Sequence Planning";
	private static final String PROGNOSEN_PLANNING = "Forecast";
	protected static Object WERTE_WURDEN_GELADEN = "Werte wurden geladen!";
	protected static final String INFO = "Information";
	private JFrame frmSupplyChainManager;
	public static PurchasePlanning purchasePlanningObject;
	public static MaterialPlanning materialPlanningObject;
	public static CapacityPlanning capacityPlanningObject;
	public static JTabbedPane paneContainer;
	public static SequencePlanningObject sequencePlanningObject;

	private static JMenuBar menuBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					IbsysGUI window = new IbsysGUI();
					window.frmSupplyChainManager.setVisible(true);

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

		frmSupplyChainManager = new JFrame();
		frmSupplyChainManager.setTitle("Supply Chain Manager v1.0");
		frmSupplyChainManager.setBounds(100, 100, 890, 581);
		frmSupplyChainManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSupplyChainManager.getContentPane().setLayout(new CardLayout(0, 0));
		frmSupplyChainManager.setIconImage(new ImageIcon(Main.class.getResource("Icon.png")).getImage());
		JPanel planningPanel = new JPanel();

		frmSupplyChainManager.getContentPane().add(planningPanel, "name_588858563580255");

		planningPanel.setLayout(new GridLayout(0, 1, 0, 0));

		paneContainer = new JTabbedPane(JTabbedPane.TOP);
		planningPanel.add(paneContainer);

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

		frmSupplyChainManager.getContentPane().add(viewPanel, "name_588868208714905");

		menuBar = new JMenuBar();
		frmSupplyChainManager.setJMenuBar(menuBar);

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
				frmSupplyChainManager.dispatchEvent(new WindowEvent(frmSupplyChainManager, WindowEvent.WINDOW_CLOSING));
			}
		});
		mnView.add(closeApp);

		ImageIcon imageIcon = new ImageIcon(Main.class.getResource("german.png"));

		JLabel lblgerman = new JLabel(imageIcon);
		menuBar.add(lblgerman);
		JLabel lblspacer = new JLabel(" | ");
		menuBar.add(lblspacer);
		changeToGerman(lblgerman);
		changeToGermanByClick();

		ImageIcon imageIcon2 = new ImageIcon(Main.class.getResource("english.png"));
		JLabel lblEnglish = new JLabel(imageIcon2);
		menuBar.add(lblEnglish);
		changeToEnglish(lblEnglish);

		openDialog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (Main.prognosen[0][1] == 0 && Main.prognosen[1][1] == 0 && Main.prognosen[2][1] == 0) {
					JOptionPane.showMessageDialog(new JFrame(), PLEASE_FILL_IN_VALUES_FIRST, "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}

				JFileChooser chooser = new JFileChooser();
				int showOpenDialog = chooser.showOpenDialog(null);

				if (showOpenDialog == JFileChooser.APPROVE_OPTION) {

					String path = chooser.getSelectedFile().getPath();
					try {
						if (Main.loadXmlData(path)) {
							JOptionPane.showMessageDialog(new JFrame(), PLEASE_CHOOSE_A_VALID_FILE_WHICH_IS_NOT_EMPTY,
									ERROR, JOptionPane.ERROR_MESSAGE);
						} else {
							try {
								Utility.initValues();
								MaterialPlanning.enableEditable();
								JOptionPane.showMessageDialog(new JFrame(), WERTE_WURDEN_GELADEN, INFO,
										JOptionPane.INFORMATION_MESSAGE);

							} catch (NoSuchMethodException | SecurityException | IllegalAccessException
									| IllegalArgumentException | InvocationTargetException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					} catch (Exception e) {
						e.printStackTrace();
						JOptionPane.showMessageDialog(new JFrame(),
								PLEASE_CHOOSE_A_VALID_FILE_THE_FILE_HAS_TO_BE_A_XML_FILE, ERROR,
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		saveData.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter(".xml", "xml");
				chooser.addChoosableFileFilter(extensionFilter);
				try {
					int intValue = Main.results.getPeriod().intValue();
					Date date = new Date(System.currentTimeMillis());
					@SuppressWarnings("deprecation")
					String dateString = "" + date.getDay() + "_" + date.getMonth() + "_" + (date.getYear() + 1900);
					chooser.setSelectedFile(new File("period_" + intValue + "_export_" + dateString + ".xml"));

					int showSaveDialog = chooser.showSaveDialog(null);
					if (showSaveDialog == JFileChooser.CANCEL_OPTION) {

					}
					if (showSaveDialog == JFileChooser.APPROVE_OPTION) {

						File selectedFile = chooser.getSelectedFile();
						String path = selectedFile.getPath();
						if (path.charAt((path.length() - 4)) == '.' && path.charAt((path.length() - 3)) == 'x'
								&& path.charAt((path.length() - 2)) == 'm' && path.charAt((path.length() - 1)) == 'l') {

						} else {
							path += ".xml";
						}

						Input input = Utility.generateInputXmlObject();

						JAXB.marshal(input, path);

					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(new JFrame(), NO_DATA_INSERTED_PLEASE_IMPORT_DATA_FIRST, ERROR,
							JOptionPane.ERROR_MESSAGE);
					ex.printStackTrace();

				}

			}
		});
	}

	public static void changeToGerman(JLabel label) {
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeToGermanByClick();
			}

		});
	}

	public static void changeToGermanByClick() {
		paneContainer.setTitleAt(0, "Prognosen");
		paneContainer.setTitleAt(1, "Materialplanung");
		paneContainer.setTitleAt(2, "Kapazitätsplanung");
		paneContainer.setTitleAt(3, "Bestellplanung");
		paneContainer.setTitleAt(4, "Reihenfolgeplanung");
		MaterialPlanning.l1_warehousestock.setText("Lagerbestand");
		MaterialPlanning.l1_salesorder.setText("Vertriebsauftrag");
		MaterialPlanning.l1_followingperiod.setText("Folgende Periode");
		MaterialPlanning.l1_passedperiod.setText("Vorherige Periode");
		MaterialPlanning.l1_productionorders.setText("Produktionsaufträge");
		MaterialPlanning.l1_waitingqueue.setText("Warteschlange");
		MaterialPlanning.l1_workinprogress.setText("In Bearbeitung");

		MaterialPlanning.l2_warehousestock.setText("Lagerbestand");
		MaterialPlanning.l2_salesorders.setText("Vertriebsauftrag");
		MaterialPlanning.l2_follwingperiod.setText("Folgende Periode");
		MaterialPlanning.l2_passedperiod.setText("Vorherige Periode");
		MaterialPlanning.l2_productionorders.setText("Produktionsaufträge");
		MaterialPlanning.l2_waitingqueue.setText("Warteschlange");
		MaterialPlanning.l2_workinprogress.setText("In Bearbeitung");

		MaterialPlanning.l3_warehousestock.setText("Lagerbestand");
		MaterialPlanning.l3_salesorders.setText("Vertriebsauftrag");
		MaterialPlanning.l3_followingperiod.setText("Folgende Periode");
		MaterialPlanning.l3_passedperiod.setText("Vorherige Periode");
		MaterialPlanning.l3_productionorders.setText("Produktionsaufträge");
		MaterialPlanning.l3_waitingqueue.setText("Warteschlange");
		MaterialPlanning.l3_workinprogress.setText("In Bearbeitung");

		CapacityPlanning.cpl1_capacityrequirements.setText("Kapazitätsbedarf");
		CapacityPlanning.cpl1_frontwheelcomplete.setText("Vorderrad Komplett");
		CapacityPlanning.cpl1_overtime.setText("Überstunden pro Tag (min)");
		CapacityPlanning.cpl1_setuptime.setText("Rüstzeit + Rüstzeit Vorperiode");
		CapacityPlanning.cpl1_totalcapacity.setText("Totale Kapazität");
		CapacityPlanning.cpl1_workload.setText("Auslastung %");
		CapacityPlanning.cpl1_workstation.setText("Arbeitsplatz");
		CapacityPlanning.cpl1_c.setText("K");
		CapacityPlanning.cpl1_l.setText("D");
		CapacityPlanning.cpl1_m.setText("H");

		CapacityPlanning.cpl2_capacityrequirements.setText("Kapazitätsbedarf");
		CapacityPlanning.cpl2_frameandwheels.setText("Rahmen und Räder");
		CapacityPlanning.cpl2_overtime.setText("Überstunden pro Tag (min)");
		CapacityPlanning.cpl2_setuptime.setText("Rüstzeit + Rüstzeit Vorperiode");
		CapacityPlanning.cpl2_totalcapacity.setText("Totale Kapazität");
		CapacityPlanning.cpl2_workload.setText("Auslastung %");
		CapacityPlanning.cpl2_workstation.setText("Arbeitsplatz");
		CapacityPlanning.cpl2_c.setText("K");
		CapacityPlanning.cpl2_l.setText("D");
		CapacityPlanning.cpl2_m.setText("H");

		CapacityPlanning.cpl3_bicyclewithoutpedal.setText("Fahrrad ohne Pedale");
		CapacityPlanning.cpl3_capacityrequirements.setText("Kapazitätsbedarf");
		CapacityPlanning.cpl3_overtime.setText("Überstunden pro Tag (min)");
		CapacityPlanning.cpl3_setuptime.setText("Rüstzeit + Rüstzeit Vorperiode");
		CapacityPlanning.cpl3_totalcapacity.setText("Totale Kapazität");
		CapacityPlanning.cpl3_workload.setText("Auslastung %");
		CapacityPlanning.cpl3_workstation.setText("Arbeitsplatz");
		CapacityPlanning.cpl3_c.setText("K");
		CapacityPlanning.cpl3_l.setText("D");
		CapacityPlanning.cpl3_m.setText("H");

		CapacityPlanning.cpl4_bicyclecomplete.setText("Fahrrad komplett");
		CapacityPlanning.cpl4_overtime.setText("Überstunden pro Tag (min)");
		CapacityPlanning.cpl4_setuptime.setText("Rüstzeit + Rüstzeit Vorperiode");
		CapacityPlanning.cpl4_totalcapacity.setText("Totale Kapazität");
		CapacityPlanning.cpl4_workload.setText("Auslastung %");
		CapacityPlanning.cpl4_workstation.setText("Arbeitsplatz");
		CapacityPlanning.cpl4_capacityrequirements.setText("Kapazitätsbedarf");
		CapacityPlanning.cpl4_c.setText("K");
		CapacityPlanning.cpl4_l.setText("D");
		CapacityPlanning.cpl4_m.setText("H");

		CapacityPlanning.cpl6_capacityrequirements.setText("Kapazitätsbedarf");
		CapacityPlanning.cpl6_overtime.setText("Überstunden pro Tag (min)");
		CapacityPlanning.cpl6_setuptime.setText("Rüstzeit + Rüstzeit Vorperiode");
		CapacityPlanning.cpl6_totalcapacity.setText("Totale Kapazität");
		CapacityPlanning.cpl6_workload.setText("Auslastung %");
		CapacityPlanning.cpl6_arbeitsplatz.setText("Arbeitsplatz");
		CapacityPlanning.cpl6_lenker.setText("Lenker");
		CapacityPlanning.lblKdh.setText("K/D/H");
		CapacityPlanning.cpl6_frame.setText("Rahmen");
		CapacityPlanning.label_3.setText("K");
		CapacityPlanning.label_6.setText("D");
		CapacityPlanning.label_9.setText("H");

		CapacityPlanning.cpl7_capacityrequirements.setText("Kapazitätsbedarf");
		CapacityPlanning.cpl7_overtime.setText("Überstunden pro Tag (min)");
		CapacityPlanning.cpl7_setuptime.setText("Rüstzeit + Rüstzeit Vorperiode");
		CapacityPlanning.cpl7_totalcapacity.setText("Totale Kapazität");
		CapacityPlanning.cpl7_workload.setText("Auslastung %");
		CapacityPlanning.label_4.setText("Arbeitsplatz");
		CapacityPlanning.lblSchutzblechHinten.setText("Schutzblech hinten");
		CapacityPlanning.lblK.setText("K");
		CapacityPlanning.lblD.setText("D");
		CapacityPlanning.lblH.setText("H");
		CapacityPlanning.lblKdh.setText("K/D/H");
		CapacityPlanning.lblSchutzblechVorne.setText("Schutzblech vorne");
		CapacityPlanning.label_18.setText("K");
		CapacityPlanning.label_21.setText("D");
		CapacityPlanning.label_24.setText("H");
		CapacityPlanning.lblRahmen.setText("Rahmen");
		CapacityPlanning.label_20.setText("K");
		CapacityPlanning.label_22.setText("D");
		CapacityPlanning.label_23.setText("H");
		CapacityPlanning.lblPedale.setText("Pedale");
		CapacityPlanning.lblKdh_1.setText("K/D/H");
		// workstation
		CapacityPlanning.cpl8_capacityrequirements.setText("Kapazitätsbedarf");
		CapacityPlanning.cpl8_overtime.setText("Überstunden pro Tag (min)");
		CapacityPlanning.cpl8_setuptime.setText("Rüstzeit + Rüstzeit Vorperiode");
		CapacityPlanning.cpl8_totalcapacity.setText("Totale Kapazität");
		CapacityPlanning.cpl8_workload.setText("Auslastung %");
		CapacityPlanning.label_26.setText("Arbeitsplatz");
		CapacityPlanning.label_33.setText("Schutzblech hinten");
		CapacityPlanning.label_34.setText("K");
		CapacityPlanning.label_37.setText("D");
		CapacityPlanning.label_40.setText("H");
		CapacityPlanning.label_43.setText("Schutzblech vorne");
		CapacityPlanning.label_44.setText("K");
		CapacityPlanning.label_47.setText("D");
		CapacityPlanning.label_50.setText("H");
		CapacityPlanning.label_53.setText("Rahmen");
		CapacityPlanning.label_54.setText("K");
		CapacityPlanning.label_57.setText("D");
		CapacityPlanning.label_60.setText("H");

		// ws
		CapacityPlanning.cpl9_capacityrequirements.setText("Kapazitätsbedarf");
		CapacityPlanning.cpl9_overtime.setText("Überstunden pro Tag (min)");
		CapacityPlanning.cpl9_setuptime.setText("Rüstzeit + Rüstzeit Vorperiode");
		CapacityPlanning.cpl9_totalcapacity.setText("Totale Kapazität");
		CapacityPlanning.cpl9_workload.setText("Auslastung %");
		CapacityPlanning.label_10.setText("Arbeitsplatz");
		CapacityPlanning.label_19.setText("Schutzblech hinten");
		CapacityPlanning.label_25.setText("K");
		CapacityPlanning.label_56.setText("D");
		CapacityPlanning.label_63.setText("H");
		CapacityPlanning.label_66.setText("Schutzblech vorne");
		CapacityPlanning.label_73.setText("K");
		CapacityPlanning.label_77.setText("D");
		CapacityPlanning.label_80.setText("H");
		CapacityPlanning.label_83.setText("Rahmen");
		CapacityPlanning.label_84.setText("K");
		CapacityPlanning.label_87.setText("D");
		CapacityPlanning.label_91.setText("H");
		// ws
		CapacityPlanning.cpl10_capacityrequirements.setText("Kapazitätsbedarf");
		CapacityPlanning.cpl10_overtime.setText("Überstunden pro Tag (min)");
		CapacityPlanning.cpl10_setuptime.setText("Rüstzeit + Rüstzeit Vorperiode");
		CapacityPlanning.cpl10_totalcapacity.setText("Totale Kapazität");
		CapacityPlanning.cpl10_workload.setText("Auslastung %");
		CapacityPlanning.label_46.setText("Arbeitsplatz");
		CapacityPlanning.lblHinterrad.setText("Hinterrad");
		CapacityPlanning.label_76.setText("K");
		CapacityPlanning.label_86.setText("D");
		CapacityPlanning.label_99.setText("H");
		CapacityPlanning.lblVorderrad.setText("Vorderrad");
		CapacityPlanning.label_103.setText("K");
		CapacityPlanning.label_106.setText("D");
		CapacityPlanning.label_109.setText("H");
		// ws
		CapacityPlanning.cpl11_capacityrequirements.setText("Kapazitätsbedarf");
		CapacityPlanning.cpl11_overtime.setText("Überstunden pro Tag (min)");
		CapacityPlanning.cpl11_setuptime.setText("Rüstzeit + Rüstzeit Vorperiode");
		CapacityPlanning.cpl11_totalcapacity.setText("Totale Kapazität");
		CapacityPlanning.cpl11_workload.setText("Auslastung %");
		CapacityPlanning.label_127.setText("Arbeitsplatz");
		CapacityPlanning.lblHinterrad_1.setText("Hinterrad");
		CapacityPlanning.label_130.setText("K");
		CapacityPlanning.label_133.setText("D");
		CapacityPlanning.label_136.setText("H");
		CapacityPlanning.lblVorderrad_1.setText("Vorderrad");
		CapacityPlanning.label_140.setText("K");
		CapacityPlanning.label_143.setText("D");
		CapacityPlanning.label_146.setText("H");

		CapacityPlanning.label_154.setText("Kapazitätsbedarf");
		CapacityPlanning.label_155.setText("Rüstzeit + Rüstzeit Vorperiode");
		CapacityPlanning.label_156.setText("Totale Kapazität");
		CapacityPlanning.label_157.setText("Auslastung %");
		CapacityPlanning.label_158.setText("Überstunden pro Tag (min)");
		CapacityPlanning.label_100.setText("Arbeitsplatz");
		CapacityPlanning.label_102.setText("Schutzblech hinten");
		CapacityPlanning.label_104.setText("K");
		CapacityPlanning.label_108.setText("D");
		CapacityPlanning.label_112.setText("H");
		CapacityPlanning.label_115.setText("Schutzblech vorne");
		CapacityPlanning.label_116.setText("K");
		CapacityPlanning.label_119.setText("D");
		CapacityPlanning.label_129.setText("H");

		CapacityPlanning.label_186.setText("Kapazitätsbedarf");
		CapacityPlanning.label_187.setText("Rüstzeit + Rüstzeit Vorperiode");
		CapacityPlanning.label_188.setText("Totale Kapazität");
		CapacityPlanning.label_189.setText("Auslastung %");
		CapacityPlanning.label_190.setText("Überstunden pro Tag (min)");
		CapacityPlanning.label_137.setText("Arbeitsplatz");
		CapacityPlanning.label_141.setText("Schutzblech hinten");
		CapacityPlanning.label_144.setText("K");
		CapacityPlanning.label_150.setText("D");
		CapacityPlanning.label_153.setText("H");
		CapacityPlanning.label_166.setText("Schutzblech vorne");
		CapacityPlanning.label_167.setText("K");
		CapacityPlanning.label_170.setText("D");
		CapacityPlanning.label_173.setText("H");

		CapacityPlanning.label_192.setText("Kapazitätsbedarf");
		CapacityPlanning.label_193.setText("Rüstzeit + Rüstzeit Vorperiode");
		CapacityPlanning.label_194.setText("Totale Kapazität");
		CapacityPlanning.label_195.setText("Auslastung %");
		CapacityPlanning.label_196.setText("Überstunden pro Tag (min)");
		CapacityPlanning.label_149.setText("Arbeitsplatz");
		CapacityPlanning.label_165.setText("Lenker");
		CapacityPlanning.label_169.setText("K/D/H");

		CapacityPlanning.label_214.setText("Kapazitätsbedarf");
		CapacityPlanning.label_215.setText("Rüstzeit + Rüstzeit Vorperiode");
		CapacityPlanning.label_216.setText("Totale Kapazität");
		CapacityPlanning.label_217.setText("Auslastung %");
		CapacityPlanning.label_218.setText("Überstunden pro Tag (min)");
		CapacityPlanning.label_197.setText("Arbeitsplatz");
		CapacityPlanning.label_199.setText("Sattel");
		CapacityPlanning.label_200.setText("K/D/H");
		CapacityPlanning.label_203.setText("Pedale");
		CapacityPlanning.label_204.setText("K/D/H");

		CapacityPlanning.getCpl1_capacityold().setText("Kapazitätsbedarf Vorperiode");
		CapacityPlanning.getCpl2_capacityold().setText("Kapazitätsbedarf Vorperiode");
		CapacityPlanning.getCpl3_capacityold().setText("Kapazitätsbedarf Vorperiode");
		CapacityPlanning.getCpl4_capacityold().setText("Kapazitätsbedarf Vorperiode");

		CapacityPlanning.getCpl6_capacityold().setText("Kapazitätsbedarf Vorperiode");
		CapacityPlanning.getCpl7_capacityold().setText("Kapazitätsbedarf Vorperiode");
		CapacityPlanning.getCpl8_capacityold().setText("Kapazitätsbedarf Vorperiode");
		CapacityPlanning.getCpl9_capacityold().setText("Kapazitätsbedarf Vorperiode");
		CapacityPlanning.getCpl10_capacityold().setText("Kapazitätsbedarf Vorperiode");
		CapacityPlanning.getCpl11_capacityold().setText("Kapazitätsbedarf Vorperiode");
		CapacityPlanning.getCpl12_capacityold().setText("Kapazitätsbedarf Vorperiode");
		CapacityPlanning.getCpl13_capacityold().setText("Kapazitätsbedarf Vorperiode");

		CapacityPlanning.setFirstShift("1.Schicht");
		CapacityPlanning.setSecondShift("2.Schicht");
		CapacityPlanning.setThirdShift("3.Schicht");
		CapacityPlanning.setShiftStrings();

		JScrollPane component = (JScrollPane) PurchasePlanning.purchasePlanningPanel.getComponent(0);
		JViewport component2 = (JViewport) component.getComponent(0);
		JTable table = (JTable) component2.getComponent(0);
		table.getColumnModel().getColumn(0).setHeaderValue("ID");
		table.getColumnModel().getColumn(1).setHeaderValue("Lager");
		table.getColumnModel().getColumn(2).setHeaderValue("Di");
		table.getColumnModel().getColumn(3).setHeaderValue("Mi");
		table.getColumnModel().getColumn(4).setHeaderValue("Do");
		table.getColumnModel().getColumn(5).setHeaderValue("Fr");
		table.getColumnModel().getColumn(6).setHeaderValue("Mo+1");
		table.getColumnModel().getColumn(11).setHeaderValue("Bestellen");
		table.getColumnModel().getColumn(12).setHeaderValue("Eil");

		// SequencePlanning
		SequencePlanningObject.spt_table.getColumnModel().getColumn(0).setHeaderValue("Priorität");
		SequencePlanningObject.spt_table.getColumnModel().getColumn(1).setHeaderValue("Teil");
		SequencePlanningObject.spt_table.getColumnModel().getColumn(2).setHeaderValue("Menge");
		SequencePlanningObject.getSpb_down().setText("Runter");
		SequencePlanningObject.getSpb_up().setText("Hoch");
		SequencePlanningObject.getSpb_split().setText("Teilen");

		PrognosenObject.getCalculate().setText("Berechnen");
		PrognosenObject.getLblNewLabel_1().setText("Bitte Werte eintragen!");

		JMenu menu = menuBar.getMenu(0);
		menu.setText("Daten");
		JMenuItem item = menu.getItem(0);
		item.setText("Öffne XML Daten...");
		JMenuItem item2 = menu.getItem(1);
		item2.setText("Speichere Daten als XML...");
		JMenuItem item3 = menu.getItem(2);
		item3.setText("Schließen");

		Utility.QUALITYCONTROL = "Bitte wählen Sie die Qualitätskontrolle:\n"
				+ "<0>++ Fehlerquote in Prozent 0 in Minuten 8\n" + "<1>++ Fehlerquote in Prozent 1 in Minuten 8\n"
				+ "<2>++ Fehlerquote in Prozent 2 in Minuten 7\n" + "<3> + Fehlerquote in Prozent 3 in Minuten 7\n"
				+ "<4> + Fehlerquote in Prozent 4 in Minuten 6\n" + "<5> 0 Fehlerquote in Prozent 5 in Minuten 5\n"
				+ "<6> - Fehlerquote in Prozent 6 in Minuten 4\n" + "<7> - Fehlerquote in Prozent 7 in Minuten 3\n"
				+ "<8> - Fehlerquote in Prozent 8 in Minuten 2\n" + "<9>-- Fehlerquote in Prozent 9 in Minuten 1\n"
				+ "<10>-- Fehlerquote in Prozent 10 in Minuten 0\n\n" + "Wählen Sie eine Nummer zwischen 0 und 10!";

		NO_DATA_INSERTED_PLEASE_IMPORT_DATA_FIRST = "Es wurden keine Daten gefunden: Bitte laden Sie die Daten!";
		PLEASE_CHOOSE_A_VALID_FILE_THE_FILE_HAS_TO_BE_A_XML_FILE = "Bitte wählen Sie eine gültige Datei! Die Datei muss eine .xml sein.";
		PLEASE_CHOOSE_A_VALID_FILE_WHICH_IS_NOT_EMPTY = "Bitte wählen Sie eine gültige Datei, die nicht leer ist!";
		PLEASE_FILL_IN_VALUES_FIRST = "Bitte füllen Sie erst die Werte ein! Und drücken Sie auf Berechnen!";
		ERROR = "Fehler";
		Utility.PLEASE_CHOOSE_ONLY_NUMBERS_BETWEEN_0_AND_10 = "Bitte wählen Sie nur Zahlen zwischen 0 und 10!";
		PrognosenObject.PLEASE_LOAD_VALUES = "Bitte laden Sie die Werte!";
		WERTE_WURDEN_GELADEN = "Werte wurden geladen!";
	}

	public void changeToEnglish(JLabel label) {
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paneContainer.setTitleAt(0, "Forecast");
				paneContainer.setTitleAt(1, "Material planning");
				paneContainer.setTitleAt(2, "Capacity planning");
				paneContainer.setTitleAt(3, "Purchase planning");
				paneContainer.setTitleAt(4, "Sequence planning");
				MaterialPlanning.l1_salesorder.setText("Salesorders");
				MaterialPlanning.l1_followingperiod.setText("Following period");
				MaterialPlanning.l1_passedperiod.setText("Previous period");
				MaterialPlanning.l1_productionorders.setText("Production order");
				MaterialPlanning.l1_waitingqueue.setText("Waiting queue");
				MaterialPlanning.l1_workinprogress.setText("Working progress");
				MaterialPlanning.l1_warehousestock.setText("Warehousestock");

				MaterialPlanning.l2_follwingperiod.setText("Following period");
				MaterialPlanning.l2_passedperiod.setText("Previous period");
				MaterialPlanning.l2_productionorders.setText("Production order");
				MaterialPlanning.l2_salesorders.setText("Salesorders");
				MaterialPlanning.l2_waitingqueue.setText("Waiting queue");
				MaterialPlanning.l2_warehousestock.setText("Warehousestock");
				MaterialPlanning.l2_workinprogress.setText("Working progress");

				MaterialPlanning.l3_followingperiod.setText("Following period");
				MaterialPlanning.l3_passedperiod.setText("Previous period");
				MaterialPlanning.l3_productionorders.setText("Production order");
				MaterialPlanning.l3_salesorders.setText("Salesorders");
				MaterialPlanning.l3_waitingqueue.setText("Waiting queue");
				MaterialPlanning.l3_warehousestock.setText("Warehousestock");
				MaterialPlanning.l3_workinprogress.setText("Working progress");

				CapacityPlanning.cpl1_capacityrequirements.setText("Capacity requirements");
				CapacityPlanning.cpl1_frontwheelcomplete.setText("Front wheel complete");
				CapacityPlanning.cpl1_overtime.setText("Overtime per day (min)");
				CapacityPlanning.cpl1_setuptime.setText("Setuptime + previous Setuptime");
				CapacityPlanning.cpl1_totalcapacity.setText("Total capacity");
				CapacityPlanning.cpl1_workload.setText("Workload %");
				CapacityPlanning.cpl1_workstation.setText("Workstation");
				CapacityPlanning.cpl1_c.setText("C");
				CapacityPlanning.cpl1_l.setText("F");
				CapacityPlanning.cpl1_m.setText("M");

				CapacityPlanning.cpl2_capacityrequirements.setText("Capacity requirements");
				CapacityPlanning.cpl2_frameandwheels.setText("Frame and wheels");
				CapacityPlanning.cpl2_overtime.setText("Overtime per day (min)");
				CapacityPlanning.cpl2_setuptime.setText("Setuptime + previous Setuptime");
				CapacityPlanning.cpl2_totalcapacity.setText("Total capacity");
				CapacityPlanning.cpl2_workload.setText("Workload %");
				CapacityPlanning.cpl2_workstation.setText("Workstation");
				CapacityPlanning.cpl2_c.setText("C");
				CapacityPlanning.cpl2_l.setText("F");
				CapacityPlanning.cpl2_m.setText("M");

				CapacityPlanning.cpl3_bicyclewithoutpedal.setText("Bicycle without pedal");
				CapacityPlanning.cpl3_capacityrequirements.setText("Capacity requirements");
				CapacityPlanning.cpl3_overtime.setText("Overtime per day (min)");
				CapacityPlanning.cpl3_setuptime.setText("Setuptime + previous Setuptime");
				CapacityPlanning.cpl3_totalcapacity.setText("Total capacity");
				CapacityPlanning.cpl3_workload.setText("Workload %");
				CapacityPlanning.cpl3_workstation.setText("Workstation");
				CapacityPlanning.cpl3_c.setText("C");
				CapacityPlanning.cpl3_l.setText("F");
				CapacityPlanning.cpl3_m.setText("M");

				CapacityPlanning.cpl4_bicyclecomplete.setText("Bicycle complete");
				CapacityPlanning.cpl4_capacityrequirements.setText("Capacity requirements");
				CapacityPlanning.cpl4_overtime.setText("Overtime per day (min)");
				CapacityPlanning.cpl4_setuptime.setText("Setuptime + previous Setuptime");
				CapacityPlanning.cpl4_totalcapacity.setText("Total capacity");
				CapacityPlanning.cpl4_workload.setText("Workload %");
				CapacityPlanning.cpl4_workstation.setText("Workstation");
				CapacityPlanning.cpl4_c.setText("C");
				CapacityPlanning.cpl4_l.setText("F");
				CapacityPlanning.cpl4_m.setText("M");

				CapacityPlanning.cpl6_capacityrequirements.setText("Capacity requirements");
				CapacityPlanning.cpl6_overtime.setText("Overtime per day (min)");
				CapacityPlanning.cpl6_setuptime.setText("Setuptime + previous Setuptime");
				CapacityPlanning.cpl6_totalcapacity.setText("Total capacity");
				CapacityPlanning.cpl6_workload.setText("Workload %");
				CapacityPlanning.cpl6_arbeitsplatz.setText("Workstation");
				CapacityPlanning.cpl6_lenker.setText("Handlebar");
				CapacityPlanning.lblKdh.setText("C/F/M");
				CapacityPlanning.cpl6_frame.setText("Bicycle complete");
				CapacityPlanning.label_3.setText("C");
				CapacityPlanning.label_6.setText("F");
				CapacityPlanning.label_9.setText("M");

				// workstation
				CapacityPlanning.cpl7_capacityrequirements.setText("Capacity requirements");
				CapacityPlanning.cpl7_overtime.setText("Overtime per day (min)");
				CapacityPlanning.cpl7_setuptime.setText("Setuptime + previous Setuptime");
				CapacityPlanning.cpl7_totalcapacity.setText("Total capacity");
				CapacityPlanning.cpl7_workload.setText("Workload %");
				CapacityPlanning.label_4.setText("Workstation");
				CapacityPlanning.lblSchutzblechHinten.setText("Fender back");
				CapacityPlanning.lblK.setText("C");
				CapacityPlanning.lblD.setText("F");
				CapacityPlanning.lblH.setText("M");
				CapacityPlanning.lblKdh.setText("C/F/M");
				CapacityPlanning.lblSchutzblechVorne.setText("Fender front");
				CapacityPlanning.label_18.setText("K");
				CapacityPlanning.label_21.setText("F");
				CapacityPlanning.label_24.setText("M");
				CapacityPlanning.lblRahmen.setText("Frame");
				CapacityPlanning.label_20.setText("C");
				CapacityPlanning.label_22.setText("F");
				CapacityPlanning.label_23.setText("M");
				CapacityPlanning.lblPedale.setText("Pedal");
				CapacityPlanning.lblKdh_1.setText("C/F/M");
				// workstation
				CapacityPlanning.cpl8_capacityrequirements.setText("Capacity requirements");
				CapacityPlanning.cpl8_overtime.setText("Overtime per day (min)");
				CapacityPlanning.cpl8_setuptime.setText("Setuptime + previous Setuptime");
				CapacityPlanning.cpl8_totalcapacity.setText("Total capacity");
				CapacityPlanning.cpl8_workload.setText("Workload %");
				CapacityPlanning.label_26.setText("Workstation");
				CapacityPlanning.label_33.setText("Fender back");
				CapacityPlanning.label_34.setText("C");
				CapacityPlanning.label_37.setText("F");
				CapacityPlanning.label_40.setText("M");
				CapacityPlanning.label_43.setText("Fender front");
				CapacityPlanning.label_44.setText("C");
				CapacityPlanning.label_47.setText("F");
				CapacityPlanning.label_50.setText("M");
				CapacityPlanning.label_53.setText("Frame");
				CapacityPlanning.label_54.setText("C");
				CapacityPlanning.label_57.setText("F");
				CapacityPlanning.label_60.setText("M");
				// ws
				CapacityPlanning.cpl9_capacityrequirements.setText("Capacity requirements");
				CapacityPlanning.cpl9_overtime.setText("Overtime per day (min)");
				CapacityPlanning.cpl9_setuptime.setText("Setuptime + previous Setuptime");
				CapacityPlanning.cpl9_totalcapacity.setText("Total capacity");
				CapacityPlanning.cpl9_workload.setText("Workload %");
				CapacityPlanning.label_10.setText("Workstation");
				CapacityPlanning.label_19.setText("Fender back");
				CapacityPlanning.label_25.setText("C");
				CapacityPlanning.label_56.setText("F");
				CapacityPlanning.label_63.setText("M");
				CapacityPlanning.label_66.setText("Fender front");
				CapacityPlanning.label_73.setText("C");
				CapacityPlanning.label_77.setText("F");
				CapacityPlanning.label_80.setText("M");
				CapacityPlanning.label_83.setText("Frame");
				CapacityPlanning.label_84.setText("C");
				CapacityPlanning.label_87.setText("F");
				CapacityPlanning.label_91.setText("M");
				// ws
				CapacityPlanning.cpl10_capacityrequirements.setText("Capacity requirements");
				CapacityPlanning.cpl10_overtime.setText("Overtime per day (min)");
				CapacityPlanning.cpl10_setuptime.setText("Setuptime + previous Setuptime");
				CapacityPlanning.cpl10_totalcapacity.setText("Total capacity");
				CapacityPlanning.cpl10_workload.setText("Workload %");
				CapacityPlanning.label_46.setText("Workstation");
				CapacityPlanning.lblHinterrad.setText("Back wheel");
				CapacityPlanning.label_76.setText("C");
				CapacityPlanning.label_86.setText("F");
				CapacityPlanning.label_99.setText("M");
				CapacityPlanning.lblVorderrad.setText("Front wheel");
				CapacityPlanning.label_103.setText("C");
				CapacityPlanning.label_106.setText("F");
				CapacityPlanning.label_109.setText("M");

				// ws
				CapacityPlanning.cpl11_capacityrequirements.setText("Capacity requirements");
				CapacityPlanning.cpl11_overtime.setText("Overtime per day (min)");
				CapacityPlanning.cpl11_setuptime.setText("Setuptime + previous Setuptime");
				CapacityPlanning.cpl11_totalcapacity.setText("Total capacity");
				CapacityPlanning.cpl11_workload.setText("Workload %");
				CapacityPlanning.label_127.setText("Workstation");
				CapacityPlanning.lblHinterrad_1.setText("Back wheel");
				CapacityPlanning.label_130.setText("C");
				CapacityPlanning.label_133.setText("F");
				CapacityPlanning.label_136.setText("M");
				CapacityPlanning.lblVorderrad_1.setText("Front wheel");
				CapacityPlanning.label_140.setText("C");
				CapacityPlanning.label_143.setText("F");
				CapacityPlanning.label_146.setText("M");

				CapacityPlanning.label_154.setText("Capacity requirements");
				CapacityPlanning.label_155.setText("Setuptime + previous Setuptime");
				CapacityPlanning.label_156.setText("Total capacity");
				CapacityPlanning.label_157.setText("Workload %");
				CapacityPlanning.label_158.setText("Overtime per day (min)");
				CapacityPlanning.label_100.setText("Workstation");
				CapacityPlanning.label_102.setText("Fender back");
				CapacityPlanning.label_104.setText("C");
				CapacityPlanning.label_108.setText("F");
				CapacityPlanning.label_112.setText("M");
				CapacityPlanning.label_115.setText("Fender front");
				CapacityPlanning.label_116.setText("C");
				CapacityPlanning.label_119.setText("F");
				CapacityPlanning.label_129.setText("M");

				CapacityPlanning.label_186.setText("Capacity requirements");
				CapacityPlanning.label_187.setText("Setuptime + previous Setuptime");
				CapacityPlanning.label_188.setText("Total capacity");
				CapacityPlanning.label_189.setText("Workload %");
				CapacityPlanning.label_190.setText("Overtime per day (min)");
				CapacityPlanning.label_137.setText("Workstation");
				CapacityPlanning.label_141.setText("Fender back");
				CapacityPlanning.label_144.setText("C");
				CapacityPlanning.label_150.setText("F");
				CapacityPlanning.label_153.setText("M");
				CapacityPlanning.label_166.setText("Fender front");
				CapacityPlanning.label_167.setText("C");
				CapacityPlanning.label_170.setText("F");
				CapacityPlanning.label_173.setText("M");

				CapacityPlanning.label_192.setText("Capacity requirements");
				CapacityPlanning.label_193.setText("Setuptime + previous Setuptime");
				CapacityPlanning.label_194.setText("Total Capacity");
				CapacityPlanning.label_195.setText("Workload %");
				CapacityPlanning.label_196.setText("Overtime per day (min)");
				CapacityPlanning.label_149.setText("Workstation");
				CapacityPlanning.label_165.setText("Handlebar");
				CapacityPlanning.label_169.setText("C/F/M");

				CapacityPlanning.label_214.setText("Capacity requirements");
				CapacityPlanning.label_215.setText("Setuptime + previous Setuptime");
				CapacityPlanning.label_216.setText("Total Capacity");
				CapacityPlanning.label_217.setText("Workload %");
				CapacityPlanning.label_218.setText("Overtime per day (min)");
				CapacityPlanning.label_197.setText("Workstation");
				CapacityPlanning.label_199.setText("Saddle");
				CapacityPlanning.label_200.setText("C/F/M");
				CapacityPlanning.label_203.setText("Pedal");
				CapacityPlanning.label_204.setText("C/F/M");

				CapacityPlanning.getCpl1_capacityold().setText("Capacity previous period");
				CapacityPlanning.getCpl2_capacityold().setText("Capacity previous period");
				CapacityPlanning.getCpl3_capacityold().setText("Capacity previous period");
				CapacityPlanning.getCpl4_capacityold().setText("Capacity previous period");

				CapacityPlanning.getCpl6_capacityold().setText("Capacity previous period");
				CapacityPlanning.getCpl7_capacityold().setText("Capacity previous period");
				CapacityPlanning.getCpl8_capacityold().setText("Capacity previous period");
				CapacityPlanning.getCpl9_capacityold().setText("Capacity previous period");
				CapacityPlanning.getCpl10_capacityold().setText("Capacity previous period");
				CapacityPlanning.getCpl11_capacityold().setText("Capacity previous period");
				CapacityPlanning.getCpl12_capacityold().setText("Capacity previous period");
				CapacityPlanning.getCpl13_capacityold().setText("Capacity previous period");

				CapacityPlanning.setFirstShift("1.Shift");
				CapacityPlanning.setSecondShift("2.Shift");
				CapacityPlanning.setThirdShift("3.Shift");
				CapacityPlanning.setShiftStrings();

				// Forecast

				PrognosenObject.getCalculate().setText("Calculate");
				PrognosenObject.getLblNewLabel_1().setText("Please fill in values!");

				JScrollPane component = (JScrollPane) PurchasePlanning.purchasePlanningPanel.getComponent(0);
				JViewport component2 = (JViewport) component.getComponent(0);
				JTable table = (JTable) component2.getComponent(0);
				table.getColumnModel().getColumn(0).setHeaderValue("ID");
				table.getColumnModel().getColumn(1).setHeaderValue("Inventory");
				table.getColumnModel().getColumn(2).setHeaderValue("Tu");
				table.getColumnModel().getColumn(3).setHeaderValue("We");
				table.getColumnModel().getColumn(4).setHeaderValue("Th");
				table.getColumnModel().getColumn(5).setHeaderValue("Fr");
				table.getColumnModel().getColumn(6).setHeaderValue("Mo+1");
				table.getColumnModel().getColumn(11).setHeaderValue("Order");
				table.getColumnModel().getColumn(12).setHeaderValue("fast");

				SequencePlanningObject.spt_table.getColumnModel().getColumn(0).setHeaderValue("Priority");
				SequencePlanningObject.spt_table.getColumnModel().getColumn(1).setHeaderValue("Item");
				SequencePlanningObject.spt_table.getColumnModel().getColumn(2).setHeaderValue("Ammount");
				SequencePlanningObject.getSpb_down().setText("Down");
				SequencePlanningObject.getSpb_up().setText("Up");
				SequencePlanningObject.getSpb_split().setText("Split");

				JMenu menu = menuBar.getMenu(0);
				menu.setText("Data");
				JMenuItem item = menu.getItem(0);
				item.setText("Open XML data...");
				JMenuItem item2 = menu.getItem(1);
				item2.setText("Save data as XML...");
				JMenuItem item3 = menu.getItem(2);
				item3.setText("Close");

				Utility.QUALITYCONTROL = "Please choose qualitycontrol:\n"
						+ "<0>++ Rejection in percent 0 in minutes 8\n" + "<1>++ Rejection in percent 1 in minutes 8\n"
						+ "<2>++ Rejection in percent 2 in minutes 7\n" + "<3> + Rejection in percent 3 in minutes 7\n"
						+ "<4> + Rejection in percent 4 in minutes 6\n" + "<5> 0 Rejection in percent 5 in minutes 5\n"
						+ "<6> - Rejection in percent 6 in minutes 4\n" + "<7> - Rejection in percent 7 in minutes 3\n"
						+ "<8> - Rejection in percent 8 in minutes 2\n" + "<9>-- Rejection in percent 9 in minutes 1\n"
						+ "<10>-- Rejection in percent 10 in minutes 0\n\n" + "Enter a number between 0 and 10!";

				NO_DATA_INSERTED_PLEASE_IMPORT_DATA_FIRST = "No data inserted: Please import data first!";
				PLEASE_CHOOSE_A_VALID_FILE_THE_FILE_HAS_TO_BE_A_XML_FILE = "Please choose a valid file! The file has to be a .xml file!";
				PLEASE_CHOOSE_A_VALID_FILE_WHICH_IS_NOT_EMPTY = "Please choose a valid file which is not empty!";
				PLEASE_FILL_IN_VALUES_FIRST = "Please fill in values first! And press calculate";
				ERROR = "Error";
				Utility.PLEASE_CHOOSE_ONLY_NUMBERS_BETWEEN_0_AND_10 = "Please choose only numbers between 0 and 10!";

				PrognosenObject.PLEASE_LOAD_VALUES = "Please fill in values!";
				WERTE_WURDEN_GELADEN = "Values were loaded!";

			}
		});
	}

}
