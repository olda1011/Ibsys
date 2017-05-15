package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;

public class CapacityPlanning {
	
	private JTextField txtAsdfasdf;
	private JTextField textField_250;
	private JTextField textField_251;
	private JTextField textField_252;
	private JTextField textField_253;
	private JTextField textField_254;
	private JTextField textField_255;
	private JTextField textField_256;
	private JTextField textField_257;
	private JTextField textField_258;
	private JTextField textField_279;
	private JTextField textField_249;
	private JTextField textField_259;
	private JTextField textField_260;
	private JTextField textField_261;
	private JTextField textField_262;
	private JTextField textField_263;
	private JTextField textField_264;
	private JTextField textField_265;
	private JTextField textField_266;
	private JTextField textField_267;
	private JTextField textField_268;
	private JTextField textField_269;
	private JTextField textField_270;
	private JTextField textField_271;
	private JTextField textField_272;
	private JTextField textField_273;
	private JTextField textField_274;
	private JTextField textField_275;
	private JTextField textField_276;
	private JTextField textField_277;
	private JTextField textField_278;
	private JTextField textField_280;
	private JTextField textField_83;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;

	public CapacityPlanning() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public JTabbedPane capacityPlanning(){
	
	JTabbedPane capacityplanningPane = new JTabbedPane(JTabbedPane.TOP);
	
	
	JPanel cpp_workstation1 = new JPanel();
	capacityplanningPane.addTab("W1", null, cpp_workstation1, null);
	GridBagLayout gbl_cpp_workstation1 = new GridBagLayout();
	gbl_cpp_workstation1.columnWidths = new int[] {30, 70, 20, 40, 40, 60, 10, 60, 60, 0, 0};
	gbl_cpp_workstation1.rowHeights = new int[] {40, 0, 30, 0, 0, 0, 30, 0, 0, 0, 0, 0, 30, 30};
	gbl_cpp_workstation1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
	gbl_cpp_workstation1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	cpp_workstation1.setLayout(gbl_cpp_workstation1);
	
	JLabel cpl1_workstation = new JLabel("Arbeitsplatz");
	GridBagConstraints gbc_cpl1_workstation = new GridBagConstraints();
	gbc_cpl1_workstation.anchor = GridBagConstraints.WEST;
	gbc_cpl1_workstation.insets = new Insets(0, 0, 5, 5);
	gbc_cpl1_workstation.gridx = 1;
	gbc_cpl1_workstation.gridy = 1;
	cpp_workstation1.add(cpl1_workstation, gbc_cpl1_workstation);
	
	JLabel lblNewLabel_13 = new JLabel("1");
	GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
	gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_13.gridx = 2;
	gbc_lblNewLabel_13.gridy = 1;
	cpp_workstation1.add(lblNewLabel_13, gbc_lblNewLabel_13);
	
	JLabel cpl1_frontwheelcomplete = new JLabel("Vorderrad Komplett");
	GridBagConstraints gbc_cpl1_frontwheelcomplete = new GridBagConstraints();
	gbc_cpl1_frontwheelcomplete.anchor = GridBagConstraints.WEST;
	gbc_cpl1_frontwheelcomplete.gridheight = 3;
	gbc_cpl1_frontwheelcomplete.insets = new Insets(0, 0, 5, 5);
	gbc_cpl1_frontwheelcomplete.gridx = 1;
	gbc_cpl1_frontwheelcomplete.gridy = 3;
	cpp_workstation1.add(cpl1_frontwheelcomplete, gbc_cpl1_frontwheelcomplete);
	
	JLabel cpl1_c = new JLabel("K");
	GridBagConstraints gbc_cpl1_c = new GridBagConstraints();
	gbc_cpl1_c.insets = new Insets(0, 0, 5, 5);
	gbc_cpl1_c.gridx = 3;
	gbc_cpl1_c.gridy = 3;
	cpp_workstation1.add(cpl1_c, gbc_cpl1_c);
	
	JLabel lblNewLabel_3 = new JLabel("E49");
	GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
	gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_3.gridx = 4;
	gbc_lblNewLabel_3.gridy = 3;
	cpp_workstation1.add(lblNewLabel_3, gbc_lblNewLabel_3);
	
	txtAsdfasdf = new JTextField();
	GridBagConstraints gbc_txtAsdfasdf = new GridBagConstraints();
	gbc_txtAsdfasdf.insets = new Insets(0, 0, 5, 5);
	gbc_txtAsdfasdf.fill = GridBagConstraints.HORIZONTAL;
	gbc_txtAsdfasdf.gridx = 5;
	gbc_txtAsdfasdf.gridy = 3;
	cpp_workstation1.add(txtAsdfasdf, gbc_txtAsdfasdf);
	txtAsdfasdf.setColumns(10);
	
	JLabel lblNewLabel_9 = new JLabel("x6");
	GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
	gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_9.gridx = 6;
	gbc_lblNewLabel_9.gridy = 3;
	cpp_workstation1.add(lblNewLabel_9, gbc_lblNewLabel_9);
	
	textField_252 = new JTextField();
	textField_252.setColumns(10);
	GridBagConstraints gbc_textField_252 = new GridBagConstraints();
	gbc_textField_252.insets = new Insets(0, 0, 5, 5);
	gbc_textField_252.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_252.gridx = 7;
	gbc_textField_252.gridy = 3;
	cpp_workstation1.add(textField_252, gbc_textField_252);
	
	JLabel cpl1_l = new JLabel("D");
	GridBagConstraints gbc_cpl1_l = new GridBagConstraints();
	gbc_cpl1_l.insets = new Insets(0, 0, 5, 5);
	gbc_cpl1_l.gridx = 3;
	gbc_cpl1_l.gridy = 4;
	cpp_workstation1.add(cpl1_l, gbc_cpl1_l);
	
	JLabel lblNewLabel_6 = new JLabel("E54");
	GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
	gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_6.gridx = 4;
	gbc_lblNewLabel_6.gridy = 4;
	cpp_workstation1.add(lblNewLabel_6, gbc_lblNewLabel_6);
	
	textField_250 = new JTextField();
	GridBagConstraints gbc_textField_250 = new GridBagConstraints();
	gbc_textField_250.insets = new Insets(0, 0, 5, 5);
	gbc_textField_250.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_250.gridx = 5;
	gbc_textField_250.gridy = 4;
	cpp_workstation1.add(textField_250, gbc_textField_250);
	textField_250.setColumns(10);
	
	JLabel lblNewLabel_10 = new JLabel("x6");
	GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
	gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_10.gridx = 6;
	gbc_lblNewLabel_10.gridy = 4;
	cpp_workstation1.add(lblNewLabel_10, gbc_lblNewLabel_10);
	
	textField_253 = new JTextField();
	textField_253.setColumns(10);
	GridBagConstraints gbc_textField_253 = new GridBagConstraints();
	gbc_textField_253.insets = new Insets(0, 0, 5, 5);
	gbc_textField_253.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_253.gridx = 7;
	gbc_textField_253.gridy = 4;
	cpp_workstation1.add(textField_253, gbc_textField_253);
	
	JLabel cpl1_m = new JLabel("H");
	GridBagConstraints gbc_cpl1_m = new GridBagConstraints();
	gbc_cpl1_m.insets = new Insets(0, 0, 5, 5);
	gbc_cpl1_m.gridx = 3;
	gbc_cpl1_m.gridy = 5;
	cpp_workstation1.add(cpl1_m, gbc_cpl1_m);
	
	JLabel lblNewLabel_7 = new JLabel("E29");
	GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
	gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_7.gridx = 4;
	gbc_lblNewLabel_7.gridy = 5;
	cpp_workstation1.add(lblNewLabel_7, gbc_lblNewLabel_7);
	
	textField_251 = new JTextField();
	GridBagConstraints gbc_textField_251 = new GridBagConstraints();
	gbc_textField_251.insets = new Insets(0, 0, 5, 5);
	gbc_textField_251.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_251.gridx = 5;
	gbc_textField_251.gridy = 5;
	cpp_workstation1.add(textField_251, gbc_textField_251);
	textField_251.setColumns(10);
	
	JLabel lblNewLabel_11 = new JLabel("x6");
	GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
	gbc_lblNewLabel_11.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_11.gridx = 6;
	gbc_lblNewLabel_11.gridy = 5;
	cpp_workstation1.add(lblNewLabel_11, gbc_lblNewLabel_11);
	
	textField_254 = new JTextField();
	textField_254.setColumns(10);
	GridBagConstraints gbc_textField_254 = new GridBagConstraints();
	gbc_textField_254.insets = new Insets(0, 0, 5, 5);
	gbc_textField_254.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_254.gridx = 7;
	gbc_textField_254.gridy = 5;
	cpp_workstation1.add(textField_254, gbc_textField_254);
	
	JSeparator separator_1 = new JSeparator();
	GridBagConstraints gbc_separator_1 = new GridBagConstraints();
	gbc_separator_1.fill = GridBagConstraints.HORIZONTAL;
	gbc_separator_1.gridwidth = 7;
	gbc_separator_1.insets = new Insets(0, 0, 5, 5);
	gbc_separator_1.gridx = 1;
	gbc_separator_1.gridy = 6;
	cpp_workstation1.add(separator_1, gbc_separator_1);
	
	JLabel cpl1_capacityrequirements = new JLabel("Kapazit\u00E4tsbedarf ");
	GridBagConstraints gbc_cpl1_capacityrequirements = new GridBagConstraints();
	gbc_cpl1_capacityrequirements.anchor = GridBagConstraints.WEST;
	gbc_cpl1_capacityrequirements.insets = new Insets(0, 0, 5, 5);
	gbc_cpl1_capacityrequirements.gridx = 1;
	gbc_cpl1_capacityrequirements.gridy = 7;
	cpp_workstation1.add(cpl1_capacityrequirements, gbc_cpl1_capacityrequirements);
	
	textField_255 = new JTextField();
	textField_255.setColumns(10);
	GridBagConstraints gbc_textField_255 = new GridBagConstraints();
	gbc_textField_255.insets = new Insets(0, 0, 5, 5);
	gbc_textField_255.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_255.gridx = 7;
	gbc_textField_255.gridy = 7;
	cpp_workstation1.add(textField_255, gbc_textField_255);
	
	JLabel cpl1_setuptime = new JLabel("R\u00FCstzeit");
	GridBagConstraints gbc_cpl1_setuptime = new GridBagConstraints();
	gbc_cpl1_setuptime.anchor = GridBagConstraints.WEST;
	gbc_cpl1_setuptime.insets = new Insets(0, 0, 5, 5);
	gbc_cpl1_setuptime.gridx = 1;
	gbc_cpl1_setuptime.gridy = 8;
	cpp_workstation1.add(cpl1_setuptime, gbc_cpl1_setuptime);
	
	textField_256 = new JTextField();
	textField_256.setColumns(10);
	GridBagConstraints gbc_textField_256 = new GridBagConstraints();
	gbc_textField_256.insets = new Insets(0, 0, 5, 5);
	gbc_textField_256.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_256.gridx = 7;
	gbc_textField_256.gridy = 8;
	cpp_workstation1.add(textField_256, gbc_textField_256);
	
	JLabel lblTotaleKapazitt = new JLabel("Totale Kapazit\u00E4t");
	GridBagConstraints gbc_lblTotaleKapazitt = new GridBagConstraints();
	gbc_lblTotaleKapazitt.anchor = GridBagConstraints.WEST;
	gbc_lblTotaleKapazitt.insets = new Insets(0, 0, 5, 5);
	gbc_lblTotaleKapazitt.gridx = 1;
	gbc_lblTotaleKapazitt.gridy = 9;
	cpp_workstation1.add(lblTotaleKapazitt, gbc_lblTotaleKapazitt);
	
	textField_257 = new JTextField();
	textField_257.setColumns(10);
	GridBagConstraints gbc_textField_257 = new GridBagConstraints();
	gbc_textField_257.insets = new Insets(0, 0, 5, 5);
	gbc_textField_257.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_257.gridx = 7;
	gbc_textField_257.gridy = 9;
	cpp_workstation1.add(textField_257, gbc_textField_257);
	
	JLabel cpl1_workload = new JLabel("Auslastung %");
	GridBagConstraints gbc_cpl1_workload = new GridBagConstraints();
	gbc_cpl1_workload.anchor = GridBagConstraints.WEST;
	gbc_cpl1_workload.insets = new Insets(0, 0, 5, 5);
	gbc_cpl1_workload.gridx = 1;
	gbc_cpl1_workload.gridy = 10;
	cpp_workstation1.add(cpl1_workload, gbc_cpl1_workload);
	
	textField_258 = new JTextField();
	textField_258.setColumns(10);
	GridBagConstraints gbc_textField_258 = new GridBagConstraints();
	gbc_textField_258.insets = new Insets(0, 0, 5, 5);
	gbc_textField_258.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_258.gridx = 7;
	gbc_textField_258.gridy = 10;
	cpp_workstation1.add(textField_258, gbc_textField_258);
	
	JLabel cpl1_overtime = new JLabel("\u00DCberstunden (min) ");
	GridBagConstraints gbc_cpl1_overtime = new GridBagConstraints();
	gbc_cpl1_overtime.anchor = GridBagConstraints.WEST;
	gbc_cpl1_overtime.insets = new Insets(0, 0, 5, 5);
	gbc_cpl1_overtime.gridx = 1;
	gbc_cpl1_overtime.gridy = 11;
	cpp_workstation1.add(cpl1_overtime, gbc_cpl1_overtime);
	
	textField_279 = new JTextField();
	textField_279.setColumns(10);
	GridBagConstraints gbc_textField_279 = new GridBagConstraints();
	gbc_textField_279.insets = new Insets(0, 0, 5, 5);
	gbc_textField_279.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_279.gridx = 7;
	gbc_textField_279.gridy = 11;
	cpp_workstation1.add(textField_279, gbc_textField_279);
	
	JPanel cpp_workstation2 = new JPanel();
	capacityplanningPane.addTab("W2", null, cpp_workstation2, null);
	GridBagLayout gbl_cpp_workstation2 = new GridBagLayout();
	gbl_cpp_workstation2.columnWidths = new int[] {30, 70, 20, 40, 40, 60, 10, 60, 60, 0, 0};
	gbl_cpp_workstation2.rowHeights = new int[] {40, 0, 30, 0, 0, 0, 30, 0, 0, 0, 0, 0, 30, 30};
	gbl_cpp_workstation2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
	gbl_cpp_workstation2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	cpp_workstation2.setLayout(gbl_cpp_workstation2);
	
	JLabel cpl2_workstation = new JLabel("Arbeitsplatz");
	GridBagConstraints gbc_cpl2_workstation = new GridBagConstraints();
	gbc_cpl2_workstation.anchor = GridBagConstraints.WEST;
	gbc_cpl2_workstation.insets = new Insets(0, 0, 5, 5);
	gbc_cpl2_workstation.gridx = 1;
	gbc_cpl2_workstation.gridy = 1;
	cpp_workstation2.add(cpl2_workstation, gbc_cpl2_workstation);
	
	JLabel label_253 = new JLabel("2");
	GridBagConstraints gbc_label_253 = new GridBagConstraints();
	gbc_label_253.insets = new Insets(0, 0, 5, 5);
	gbc_label_253.gridx = 2;
	gbc_label_253.gridy = 1;
	cpp_workstation2.add(label_253, gbc_label_253);
	
	JLabel cpl2_frameandwheels = new JLabel("Rahmen und R\u00E4der");
	GridBagConstraints gbc_cpl2_frameandwheels = new GridBagConstraints();
	gbc_cpl2_frameandwheels.anchor = GridBagConstraints.WEST;
	gbc_cpl2_frameandwheels.gridheight = 3;
	gbc_cpl2_frameandwheels.insets = new Insets(0, 0, 5, 5);
	gbc_cpl2_frameandwheels.gridx = 1;
	gbc_cpl2_frameandwheels.gridy = 3;
	cpp_workstation2.add(cpl2_frameandwheels, gbc_cpl2_frameandwheels);
	
	JLabel cpl2_c = new JLabel("K");
	GridBagConstraints gbc_cpl2_c = new GridBagConstraints();
	gbc_cpl2_c.insets = new Insets(0, 0, 5, 5);
	gbc_cpl2_c.gridx = 3;
	gbc_cpl2_c.gridy = 3;
	cpp_workstation2.add(cpl2_c, gbc_cpl2_c);
	
	JLabel lblE_33 = new JLabel("E50");
	GridBagConstraints gbc_lblE_33 = new GridBagConstraints();
	gbc_lblE_33.anchor = GridBagConstraints.EAST;
	gbc_lblE_33.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_33.gridx = 4;
	gbc_lblE_33.gridy = 3;
	cpp_workstation2.add(lblE_33, gbc_lblE_33);
	
	textField_269 = new JTextField();
	textField_269.setColumns(10);
	GridBagConstraints gbc_textField_269 = new GridBagConstraints();
	gbc_textField_269.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_269.insets = new Insets(0, 0, 5, 5);
	gbc_textField_269.gridx = 5;
	gbc_textField_269.gridy = 3;
	cpp_workstation2.add(textField_269, gbc_textField_269);
	
	JLabel lblX = new JLabel("x5");
	GridBagConstraints gbc_lblX = new GridBagConstraints();
	gbc_lblX.anchor = GridBagConstraints.EAST;
	gbc_lblX.insets = new Insets(0, 0, 5, 5);
	gbc_lblX.gridx = 6;
	gbc_lblX.gridy = 3;
	cpp_workstation2.add(lblX, gbc_lblX);
	
	textField_270 = new JTextField();
	textField_270.setColumns(10);
	GridBagConstraints gbc_textField_270 = new GridBagConstraints();
	gbc_textField_270.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_270.insets = new Insets(0, 0, 5, 5);
	gbc_textField_270.gridx = 7;
	gbc_textField_270.gridy = 3;
	cpp_workstation2.add(textField_270, gbc_textField_270);
	
	JLabel cpl2_l = new JLabel("D");
	GridBagConstraints gbc_cpl2_l = new GridBagConstraints();
	gbc_cpl2_l.insets = new Insets(0, 0, 5, 5);
	gbc_cpl2_l.gridx = 3;
	gbc_cpl2_l.gridy = 4;
	cpp_workstation2.add(cpl2_l, gbc_cpl2_l);
	
	JLabel lblE_34 = new JLabel("E55");
	GridBagConstraints gbc_lblE_34 = new GridBagConstraints();
	gbc_lblE_34.anchor = GridBagConstraints.EAST;
	gbc_lblE_34.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_34.gridx = 4;
	gbc_lblE_34.gridy = 4;
	cpp_workstation2.add(lblE_34, gbc_lblE_34);
	
	textField_271 = new JTextField();
	textField_271.setColumns(10);
	GridBagConstraints gbc_textField_271 = new GridBagConstraints();
	gbc_textField_271.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_271.insets = new Insets(0, 0, 5, 5);
	gbc_textField_271.gridx = 5;
	gbc_textField_271.gridy = 4;
	cpp_workstation2.add(textField_271, gbc_textField_271);
	
	JLabel lblX_1 = new JLabel("x5");
	GridBagConstraints gbc_lblX_1 = new GridBagConstraints();
	gbc_lblX_1.anchor = GridBagConstraints.EAST;
	gbc_lblX_1.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_1.gridx = 6;
	gbc_lblX_1.gridy = 4;
	cpp_workstation2.add(lblX_1, gbc_lblX_1);
	
	textField_272 = new JTextField();
	textField_272.setColumns(10);
	GridBagConstraints gbc_textField_272 = new GridBagConstraints();
	gbc_textField_272.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_272.insets = new Insets(0, 0, 5, 5);
	gbc_textField_272.gridx = 7;
	gbc_textField_272.gridy = 4;
	cpp_workstation2.add(textField_272, gbc_textField_272);
	
	JLabel cpl2_m = new JLabel("H");
	GridBagConstraints gbc_cpl2_m = new GridBagConstraints();
	gbc_cpl2_m.insets = new Insets(0, 0, 5, 5);
	gbc_cpl2_m.gridx = 3;
	gbc_cpl2_m.gridy = 5;
	cpp_workstation2.add(cpl2_m, gbc_cpl2_m);
	
	JLabel lblE_35 = new JLabel("E30");
	GridBagConstraints gbc_lblE_35 = new GridBagConstraints();
	gbc_lblE_35.anchor = GridBagConstraints.EAST;
	gbc_lblE_35.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_35.gridx = 4;
	gbc_lblE_35.gridy = 5;
	cpp_workstation2.add(lblE_35, gbc_lblE_35);
	
	textField_273 = new JTextField();
	textField_273.setColumns(10);
	GridBagConstraints gbc_textField_273 = new GridBagConstraints();
	gbc_textField_273.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_273.insets = new Insets(0, 0, 5, 5);
	gbc_textField_273.gridx = 5;
	gbc_textField_273.gridy = 5;
	cpp_workstation2.add(textField_273, gbc_textField_273);
	
	JLabel lblX_2 = new JLabel("x5");
	GridBagConstraints gbc_lblX_2 = new GridBagConstraints();
	gbc_lblX_2.anchor = GridBagConstraints.EAST;
	gbc_lblX_2.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_2.gridx = 6;
	gbc_lblX_2.gridy = 5;
	cpp_workstation2.add(lblX_2, gbc_lblX_2);
	
	textField_274 = new JTextField();
	textField_274.setColumns(10);
	GridBagConstraints gbc_textField_274 = new GridBagConstraints();
	gbc_textField_274.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_274.insets = new Insets(0, 0, 5, 5);
	gbc_textField_274.gridx = 7;
	gbc_textField_274.gridy = 5;
	cpp_workstation2.add(textField_274, gbc_textField_274);
	
	JSeparator separator_2 = new JSeparator();
	GridBagConstraints gbc_separator_2 = new GridBagConstraints();
	gbc_separator_2.fill = GridBagConstraints.HORIZONTAL;
	gbc_separator_2.gridwidth = 7;
	gbc_separator_2.insets = new Insets(0, 0, 5, 5);
	gbc_separator_2.gridx = 1;
	gbc_separator_2.gridy = 6;
	cpp_workstation2.add(separator_2, gbc_separator_2);
	
	JLabel cpl2_capacityrequirements = new JLabel("Kapazit\u00E4tsbedarf ");
	GridBagConstraints gbc_cpl2_capacityrequirements = new GridBagConstraints();
	gbc_cpl2_capacityrequirements.anchor = GridBagConstraints.WEST;
	gbc_cpl2_capacityrequirements.insets = new Insets(0, 0, 5, 5);
	gbc_cpl2_capacityrequirements.gridx = 1;
	gbc_cpl2_capacityrequirements.gridy = 7;
	cpp_workstation2.add(cpl2_capacityrequirements, gbc_cpl2_capacityrequirements);
	
	textField_275 = new JTextField();
	textField_275.setColumns(10);
	GridBagConstraints gbc_textField_275 = new GridBagConstraints();
	gbc_textField_275.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_275.insets = new Insets(0, 0, 5, 5);
	gbc_textField_275.gridx = 7;
	gbc_textField_275.gridy = 7;
	cpp_workstation2.add(textField_275, gbc_textField_275);
	
	JLabel cpl2_setuptime = new JLabel("R\u00FCstzeit");
	GridBagConstraints gbc_cpl2_setuptime = new GridBagConstraints();
	gbc_cpl2_setuptime.anchor = GridBagConstraints.WEST;
	gbc_cpl2_setuptime.insets = new Insets(0, 0, 5, 5);
	gbc_cpl2_setuptime.gridx = 1;
	gbc_cpl2_setuptime.gridy = 8;
	cpp_workstation2.add(cpl2_setuptime, gbc_cpl2_setuptime);
	
	textField_276 = new JTextField();
	textField_276.setColumns(10);
	GridBagConstraints gbc_textField_276 = new GridBagConstraints();
	gbc_textField_276.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_276.insets = new Insets(0, 0, 5, 5);
	gbc_textField_276.gridx = 7;
	gbc_textField_276.gridy = 8;
	cpp_workstation2.add(textField_276, gbc_textField_276);
	
	JLabel cpl2_totalcapacity = new JLabel("Totale Kapazit\u00E4t");
	GridBagConstraints gbc_cpl2_totalcapacity = new GridBagConstraints();
	gbc_cpl2_totalcapacity.anchor = GridBagConstraints.WEST;
	gbc_cpl2_totalcapacity.insets = new Insets(0, 0, 5, 5);
	gbc_cpl2_totalcapacity.gridx = 1;
	gbc_cpl2_totalcapacity.gridy = 9;
	cpp_workstation2.add(cpl2_totalcapacity, gbc_cpl2_totalcapacity);
	
	textField_277 = new JTextField();
	textField_277.setColumns(10);
	GridBagConstraints gbc_textField_277 = new GridBagConstraints();
	gbc_textField_277.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_277.insets = new Insets(0, 0, 5, 5);
	gbc_textField_277.gridx = 7;
	gbc_textField_277.gridy = 9;
	cpp_workstation2.add(textField_277, gbc_textField_277);
	
	JLabel cpl2_workload = new JLabel("Auslastung %");
	GridBagConstraints gbc_cpl2_workload = new GridBagConstraints();
	gbc_cpl2_workload.anchor = GridBagConstraints.WEST;
	gbc_cpl2_workload.insets = new Insets(0, 0, 5, 5);
	gbc_cpl2_workload.gridx = 1;
	gbc_cpl2_workload.gridy = 10;
	cpp_workstation2.add(cpl2_workload, gbc_cpl2_workload);
	
	textField_278 = new JTextField();
	textField_278.setColumns(10);
	GridBagConstraints gbc_textField_278 = new GridBagConstraints();
	gbc_textField_278.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_278.insets = new Insets(0, 0, 5, 5);
	gbc_textField_278.gridx = 7;
	gbc_textField_278.gridy = 10;
	cpp_workstation2.add(textField_278, gbc_textField_278);
	
	JLabel cpl2_overtime = new JLabel("\u00DCberstunden (min) ");
	GridBagConstraints gbc_cpl2_overtime = new GridBagConstraints();
	gbc_cpl2_overtime.anchor = GridBagConstraints.WEST;
	gbc_cpl2_overtime.insets = new Insets(0, 0, 5, 5);
	gbc_cpl2_overtime.gridx = 1;
	gbc_cpl2_overtime.gridy = 11;
	cpp_workstation2.add(cpl2_overtime, gbc_cpl2_overtime);
	
	textField_280 = new JTextField();
	textField_280.setColumns(10);
	GridBagConstraints gbc_textField_280 = new GridBagConstraints();
	gbc_textField_280.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_280.insets = new Insets(0, 0, 5, 5);
	gbc_textField_280.gridx = 7;
	gbc_textField_280.gridy = 11;
	cpp_workstation2.add(textField_280, gbc_textField_280);
	
	JPanel cpp_workstation3 = new JPanel();
	capacityplanningPane.addTab("W3", null, cpp_workstation3, null);
	GridBagLayout gbl_cpp_workstation3 = new GridBagLayout();
	gbl_cpp_workstation3.columnWidths = new int[] {30, 70, 20, 40, 40, 60, 10, 60, 60, 0, 0};
	gbl_cpp_workstation3.rowHeights = new int[] {40, 0, 30, 0, 0, 0, 30, 0, 0, 0, 0, 0, 30, 30};
	gbl_cpp_workstation3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
	gbl_cpp_workstation3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	cpp_workstation3.setLayout(gbl_cpp_workstation3);
	
	JLabel cpl3_workstation = new JLabel("Arbeitsplatz");
	GridBagConstraints gbc_cpl3_workstation = new GridBagConstraints();
	gbc_cpl3_workstation.anchor = GridBagConstraints.WEST;
	gbc_cpl3_workstation.insets = new Insets(0, 0, 5, 5);
	gbc_cpl3_workstation.gridx = 1;
	gbc_cpl3_workstation.gridy = 1;
	cpp_workstation3.add(cpl3_workstation, gbc_cpl3_workstation);
	
	JLabel label_72 = new JLabel("3");
	GridBagConstraints gbc_label_72 = new GridBagConstraints();
	gbc_label_72.insets = new Insets(0, 0, 5, 5);
	gbc_label_72.gridx = 2;
	gbc_label_72.gridy = 1;
	cpp_workstation3.add(label_72, gbc_label_72);
	
	JLabel cpl3_bicyclewithoutpedal = new JLabel("Fahrrad ohne Pedale");
	GridBagConstraints gbc_cpl3_bicyclewithoutpedal = new GridBagConstraints();
	gbc_cpl3_bicyclewithoutpedal.anchor = GridBagConstraints.WEST;
	gbc_cpl3_bicyclewithoutpedal.gridheight = 3;
	gbc_cpl3_bicyclewithoutpedal.insets = new Insets(0, 0, 5, 5);
	gbc_cpl3_bicyclewithoutpedal.gridx = 1;
	gbc_cpl3_bicyclewithoutpedal.gridy = 3;
	cpp_workstation3.add(cpl3_bicyclewithoutpedal, gbc_cpl3_bicyclewithoutpedal);
	
	JLabel cpl3_c = new JLabel("K");
	GridBagConstraints gbc_cpl3_c = new GridBagConstraints();
	gbc_cpl3_c.insets = new Insets(0, 0, 5, 5);
	gbc_cpl3_c.gridx = 3;
	gbc_cpl3_c.gridy = 3;
	cpp_workstation3.add(cpl3_c, gbc_cpl3_c);
	
	JLabel lblE_36 = new JLabel("E51");
	GridBagConstraints gbc_lblE_36 = new GridBagConstraints();
	gbc_lblE_36.anchor = GridBagConstraints.EAST;
	gbc_lblE_36.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_36.gridx = 4;
	gbc_lblE_36.gridy = 3;
	cpp_workstation3.add(lblE_36, gbc_lblE_36);
	
	textField_249 = new JTextField();
	textField_249.setColumns(10);
	GridBagConstraints gbc_textField_249 = new GridBagConstraints();
	gbc_textField_249.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_249.insets = new Insets(0, 0, 5, 5);
	gbc_textField_249.gridx = 5;
	gbc_textField_249.gridy = 3;
	cpp_workstation3.add(textField_249, gbc_textField_249);
	
	JLabel lblX_3 = new JLabel("x5");
	GridBagConstraints gbc_lblX_3 = new GridBagConstraints();
	gbc_lblX_3.anchor = GridBagConstraints.EAST;
	gbc_lblX_3.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_3.gridx = 6;
	gbc_lblX_3.gridy = 3;
	cpp_workstation3.add(lblX_3, gbc_lblX_3);
	
	textField_259 = new JTextField();
	textField_259.setColumns(10);
	GridBagConstraints gbc_textField_259 = new GridBagConstraints();
	gbc_textField_259.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_259.insets = new Insets(0, 0, 5, 5);
	gbc_textField_259.gridx = 7;
	gbc_textField_259.gridy = 3;
	cpp_workstation3.add(textField_259, gbc_textField_259);
	
	JLabel cpl3_l = new JLabel("D");
	GridBagConstraints gbc_cpl3_l = new GridBagConstraints();
	gbc_cpl3_l.insets = new Insets(0, 0, 5, 5);
	gbc_cpl3_l.gridx = 3;
	gbc_cpl3_l.gridy = 4;
	cpp_workstation3.add(cpl3_l, gbc_cpl3_l);
	
	JLabel lblE_37 = new JLabel("E56");
	GridBagConstraints gbc_lblE_37 = new GridBagConstraints();
	gbc_lblE_37.anchor = GridBagConstraints.EAST;
	gbc_lblE_37.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_37.gridx = 4;
	gbc_lblE_37.gridy = 4;
	cpp_workstation3.add(lblE_37, gbc_lblE_37);
	
	textField_260 = new JTextField();
	textField_260.setColumns(10);
	GridBagConstraints gbc_textField_260 = new GridBagConstraints();
	gbc_textField_260.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_260.insets = new Insets(0, 0, 5, 5);
	gbc_textField_260.gridx = 5;
	gbc_textField_260.gridy = 4;
	cpp_workstation3.add(textField_260, gbc_textField_260);
	
	JLabel label_89 = new JLabel("x6");
	GridBagConstraints gbc_label_89 = new GridBagConstraints();
	gbc_label_89.anchor = GridBagConstraints.EAST;
	gbc_label_89.insets = new Insets(0, 0, 5, 5);
	gbc_label_89.gridx = 6;
	gbc_label_89.gridy = 4;
	cpp_workstation3.add(label_89, gbc_label_89);
	
	textField_261 = new JTextField();
	textField_261.setColumns(10);
	GridBagConstraints gbc_textField_261 = new GridBagConstraints();
	gbc_textField_261.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_261.insets = new Insets(0, 0, 5, 5);
	gbc_textField_261.gridx = 7;
	gbc_textField_261.gridy = 4;
	cpp_workstation3.add(textField_261, gbc_textField_261);
	
	JLabel cpl3_m = new JLabel("H");
	GridBagConstraints gbc_cpl3_m = new GridBagConstraints();
	gbc_cpl3_m.insets = new Insets(0, 0, 5, 5);
	gbc_cpl3_m.gridx = 3;
	gbc_cpl3_m.gridy = 5;
	cpp_workstation3.add(cpl3_m, gbc_cpl3_m);
	
	JLabel lblE_38 = new JLabel("E31");
	GridBagConstraints gbc_lblE_38 = new GridBagConstraints();
	gbc_lblE_38.anchor = GridBagConstraints.EAST;
	gbc_lblE_38.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_38.gridx = 4;
	gbc_lblE_38.gridy = 5;
	cpp_workstation3.add(lblE_38, gbc_lblE_38);
	
	textField_262 = new JTextField();
	textField_262.setColumns(10);
	GridBagConstraints gbc_textField_262 = new GridBagConstraints();
	gbc_textField_262.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_262.insets = new Insets(0, 0, 5, 5);
	gbc_textField_262.gridx = 5;
	gbc_textField_262.gridy = 5;
	cpp_workstation3.add(textField_262, gbc_textField_262);
	
	JLabel label_206 = new JLabel("x6");
	GridBagConstraints gbc_label_206 = new GridBagConstraints();
	gbc_label_206.anchor = GridBagConstraints.EAST;
	gbc_label_206.insets = new Insets(0, 0, 5, 5);
	gbc_label_206.gridx = 6;
	gbc_label_206.gridy = 5;
	cpp_workstation3.add(label_206, gbc_label_206);
	
	textField_263 = new JTextField();
	textField_263.setColumns(10);
	GridBagConstraints gbc_textField_263 = new GridBagConstraints();
	gbc_textField_263.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_263.insets = new Insets(0, 0, 5, 5);
	gbc_textField_263.gridx = 7;
	gbc_textField_263.gridy = 5;
	cpp_workstation3.add(textField_263, gbc_textField_263);
	
	JSeparator separator_3 = new JSeparator();
	GridBagConstraints gbc_separator_3 = new GridBagConstraints();
	gbc_separator_3.fill = GridBagConstraints.HORIZONTAL;
	gbc_separator_3.gridwidth = 7;
	gbc_separator_3.insets = new Insets(0, 0, 5, 5);
	gbc_separator_3.gridx = 1;
	gbc_separator_3.gridy = 6;
	cpp_workstation3.add(separator_3, gbc_separator_3);
	
	JLabel cpl3_capacityrequirements = new JLabel("Kapazit\u00E4tsbedarf ");
	GridBagConstraints gbc_cpl3_capacityrequirements = new GridBagConstraints();
	gbc_cpl3_capacityrequirements.anchor = GridBagConstraints.WEST;
	gbc_cpl3_capacityrequirements.insets = new Insets(0, 0, 5, 5);
	gbc_cpl3_capacityrequirements.gridx = 1;
	gbc_cpl3_capacityrequirements.gridy = 7;
	cpp_workstation3.add(cpl3_capacityrequirements, gbc_cpl3_capacityrequirements);
	
	textField_264 = new JTextField();
	textField_264.setColumns(10);
	GridBagConstraints gbc_textField_264 = new GridBagConstraints();
	gbc_textField_264.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_264.insets = new Insets(0, 0, 5, 5);
	gbc_textField_264.gridx = 7;
	gbc_textField_264.gridy = 7;
	cpp_workstation3.add(textField_264, gbc_textField_264);
	
	JLabel cpl3_setuptime = new JLabel("R\u00FCstzeit");
	GridBagConstraints gbc_cpl3_setuptime = new GridBagConstraints();
	gbc_cpl3_setuptime.anchor = GridBagConstraints.WEST;
	gbc_cpl3_setuptime.insets = new Insets(0, 0, 5, 5);
	gbc_cpl3_setuptime.gridx = 1;
	gbc_cpl3_setuptime.gridy = 8;
	cpp_workstation3.add(cpl3_setuptime, gbc_cpl3_setuptime);
	
	textField_265 = new JTextField();
	textField_265.setColumns(10);
	GridBagConstraints gbc_textField_265 = new GridBagConstraints();
	gbc_textField_265.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_265.insets = new Insets(0, 0, 5, 5);
	gbc_textField_265.gridx = 7;
	gbc_textField_265.gridy = 8;
	cpp_workstation3.add(textField_265, gbc_textField_265);
	
	JLabel cpl3_totalcapacity = new JLabel("Totale Kapazit\u00E4t");
	GridBagConstraints gbc_cpl3_totalcapacity = new GridBagConstraints();
	gbc_cpl3_totalcapacity.anchor = GridBagConstraints.WEST;
	gbc_cpl3_totalcapacity.insets = new Insets(0, 0, 5, 5);
	gbc_cpl3_totalcapacity.gridx = 1;
	gbc_cpl3_totalcapacity.gridy = 9;
	cpp_workstation3.add(cpl3_totalcapacity, gbc_cpl3_totalcapacity);
	
	textField_266 = new JTextField();
	textField_266.setColumns(10);
	GridBagConstraints gbc_textField_266 = new GridBagConstraints();
	gbc_textField_266.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_266.insets = new Insets(0, 0, 5, 5);
	gbc_textField_266.gridx = 7;
	gbc_textField_266.gridy = 9;
	cpp_workstation3.add(textField_266, gbc_textField_266);
	
	JLabel cpl3_workload = new JLabel("Auslastung %");
	GridBagConstraints gbc_cpl3_workload = new GridBagConstraints();
	gbc_cpl3_workload.anchor = GridBagConstraints.WEST;
	gbc_cpl3_workload.insets = new Insets(0, 0, 5, 5);
	gbc_cpl3_workload.gridx = 1;
	gbc_cpl3_workload.gridy = 10;
	cpp_workstation3.add(cpl3_workload, gbc_cpl3_workload);
	
	textField_267 = new JTextField();
	textField_267.setColumns(10);
	GridBagConstraints gbc_textField_267 = new GridBagConstraints();
	gbc_textField_267.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_267.insets = new Insets(0, 0, 5, 5);
	gbc_textField_267.gridx = 7;
	gbc_textField_267.gridy = 10;
	cpp_workstation3.add(textField_267, gbc_textField_267);
	
	JLabel cpl3_overtime = new JLabel("\u00DCberstunden (min) ");
	GridBagConstraints gbc_cpl3_overtime = new GridBagConstraints();
	gbc_cpl3_overtime.anchor = GridBagConstraints.WEST;
	gbc_cpl3_overtime.insets = new Insets(0, 0, 5, 5);
	gbc_cpl3_overtime.gridx = 1;
	gbc_cpl3_overtime.gridy = 11;
	cpp_workstation3.add(cpl3_overtime, gbc_cpl3_overtime);
	
	textField_268 = new JTextField();
	textField_268.setColumns(10);
	GridBagConstraints gbc_textField_268 = new GridBagConstraints();
	gbc_textField_268.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_268.insets = new Insets(0, 0, 5, 5);
	gbc_textField_268.gridx = 7;
	gbc_textField_268.gridy = 11;
	cpp_workstation3.add(textField_268, gbc_textField_268);
	
	JPanel cpp_workstation4 = new JPanel();
	capacityplanningPane.addTab("W4", null, cpp_workstation4, null);
	GridBagLayout gbl_cpp_workstation4 = new GridBagLayout();
	gbl_cpp_workstation4.columnWidths = new int[] {30, 70, 20, 40, 40, 60, 10, 60, 60, 0, 0};
	gbl_cpp_workstation4.rowHeights = new int[] {40, 0, 30, 0, 0, 0, 30, 0, 0, 0, 0, 0, 30, 30};
	gbl_cpp_workstation4.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
	gbl_cpp_workstation4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	cpp_workstation4.setLayout(gbl_cpp_workstation4);
	
	JLabel cpl4_workstation = new JLabel("Arbeitsplatz");
	GridBagConstraints gbc_cpl4_workstation = new GridBagConstraints();
	gbc_cpl4_workstation.anchor = GridBagConstraints.WEST;
	gbc_cpl4_workstation.insets = new Insets(0, 0, 5, 5);
	gbc_cpl4_workstation.gridx = 1;
	gbc_cpl4_workstation.gridy = 1;
	cpp_workstation4.add(cpl4_workstation, gbc_cpl4_workstation);
	
	JLabel label_75 = new JLabel("4");
	GridBagConstraints gbc_label_75 = new GridBagConstraints();
	gbc_label_75.insets = new Insets(0, 0, 5, 5);
	gbc_label_75.gridx = 2;
	gbc_label_75.gridy = 1;
	cpp_workstation4.add(label_75, gbc_label_75);
	
	JLabel cpl4_bicyclecomplete = new JLabel("Fahrrad komplett");
	GridBagConstraints gbc_cpl4_bicyclecomplete = new GridBagConstraints();
	gbc_cpl4_bicyclecomplete.anchor = GridBagConstraints.WEST;
	gbc_cpl4_bicyclecomplete.gridheight = 3;
	gbc_cpl4_bicyclecomplete.insets = new Insets(0, 0, 5, 5);
	gbc_cpl4_bicyclecomplete.gridx = 1;
	gbc_cpl4_bicyclecomplete.gridy = 3;
	cpp_workstation4.add(cpl4_bicyclecomplete, gbc_cpl4_bicyclecomplete);
	
	JLabel cpl4_c = new JLabel("K");
	GridBagConstraints gbc_cpl4_c = new GridBagConstraints();
	gbc_cpl4_c.insets = new Insets(0, 0, 5, 5);
	gbc_cpl4_c.gridx = 3;
	gbc_cpl4_c.gridy = 3;
	cpp_workstation4.add(cpl4_c, gbc_cpl4_c);
	
	JLabel lblP_4 = new JLabel(" P1 ");
	GridBagConstraints gbc_lblP_4 = new GridBagConstraints();
	gbc_lblP_4.anchor = GridBagConstraints.EAST;
	gbc_lblP_4.insets = new Insets(0, 0, 5, 5);
	gbc_lblP_4.gridx = 4;
	gbc_lblP_4.gridy = 3;
	cpp_workstation4.add(lblP_4, gbc_lblP_4);
	
	textField_83 = new JTextField();
	textField_83.setColumns(10);
	GridBagConstraints gbc_textField_83 = new GridBagConstraints();
	gbc_textField_83.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_83.insets = new Insets(0, 0, 5, 5);
	gbc_textField_83.gridx = 5;
	gbc_textField_83.gridy = 3;
	cpp_workstation4.add(textField_83, gbc_textField_83);
	
	JLabel lblX_4 = new JLabel("x6");
	GridBagConstraints gbc_lblX_4 = new GridBagConstraints();
	gbc_lblX_4.anchor = GridBagConstraints.EAST;
	gbc_lblX_4.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_4.gridx = 6;
	gbc_lblX_4.gridy = 3;
	cpp_workstation4.add(lblX_4, gbc_lblX_4);
	
	textField_84 = new JTextField();
	textField_84.setColumns(10);
	GridBagConstraints gbc_textField_84 = new GridBagConstraints();
	gbc_textField_84.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_84.insets = new Insets(0, 0, 5, 5);
	gbc_textField_84.gridx = 7;
	gbc_textField_84.gridy = 3;
	cpp_workstation4.add(textField_84, gbc_textField_84);
	
	JLabel cpl4_l = new JLabel("D");
	GridBagConstraints gbc_cpl4_l = new GridBagConstraints();
	gbc_cpl4_l.insets = new Insets(0, 0, 5, 5);
	gbc_cpl4_l.gridx = 3;
	gbc_cpl4_l.gridy = 4;
	cpp_workstation4.add(cpl4_l, gbc_cpl4_l);
	
	JLabel lblP_5 = new JLabel("P2 ");
	GridBagConstraints gbc_lblP_5 = new GridBagConstraints();
	gbc_lblP_5.anchor = GridBagConstraints.EAST;
	gbc_lblP_5.insets = new Insets(0, 0, 5, 5);
	gbc_lblP_5.gridx = 4;
	gbc_lblP_5.gridy = 4;
	cpp_workstation4.add(lblP_5, gbc_lblP_5);
	
	textField_85 = new JTextField();
	textField_85.setColumns(10);
	GridBagConstraints gbc_textField_85 = new GridBagConstraints();
	gbc_textField_85.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_85.insets = new Insets(0, 0, 5, 5);
	gbc_textField_85.gridx = 5;
	gbc_textField_85.gridy = 4;
	cpp_workstation4.add(textField_85, gbc_textField_85);
	
	JLabel lblX_5 = new JLabel("x7");
	GridBagConstraints gbc_lblX_5 = new GridBagConstraints();
	gbc_lblX_5.anchor = GridBagConstraints.EAST;
	gbc_lblX_5.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_5.gridx = 6;
	gbc_lblX_5.gridy = 4;
	cpp_workstation4.add(lblX_5, gbc_lblX_5);
	
	textField_86 = new JTextField();
	textField_86.setColumns(10);
	GridBagConstraints gbc_textField_86 = new GridBagConstraints();
	gbc_textField_86.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_86.insets = new Insets(0, 0, 5, 5);
	gbc_textField_86.gridx = 7;
	gbc_textField_86.gridy = 4;
	cpp_workstation4.add(textField_86, gbc_textField_86);
	
	JLabel cpl4_m = new JLabel("H");
	GridBagConstraints gbc_cpl4_m = new GridBagConstraints();
	gbc_cpl4_m.insets = new Insets(0, 0, 5, 5);
	gbc_cpl4_m.gridx = 3;
	gbc_cpl4_m.gridy = 5;
	cpp_workstation4.add(cpl4_m, gbc_cpl4_m);
	
	JLabel lblP_6 = new JLabel("P3 ");
	GridBagConstraints gbc_lblP_6 = new GridBagConstraints();
	gbc_lblP_6.anchor = GridBagConstraints.EAST;
	gbc_lblP_6.insets = new Insets(0, 0, 5, 5);
	gbc_lblP_6.gridx = 4;
	gbc_lblP_6.gridy = 5;
	cpp_workstation4.add(lblP_6, gbc_lblP_6);
	
	textField_87 = new JTextField();
	textField_87.setColumns(10);
	GridBagConstraints gbc_textField_87 = new GridBagConstraints();
	gbc_textField_87.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_87.insets = new Insets(0, 0, 5, 5);
	gbc_textField_87.gridx = 5;
	gbc_textField_87.gridy = 5;
	cpp_workstation4.add(textField_87, gbc_textField_87);
	
	JLabel lblX_6 = new JLabel("x7");
	GridBagConstraints gbc_lblX_6 = new GridBagConstraints();
	gbc_lblX_6.anchor = GridBagConstraints.EAST;
	gbc_lblX_6.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_6.gridx = 6;
	gbc_lblX_6.gridy = 5;
	cpp_workstation4.add(lblX_6, gbc_lblX_6);
	
	textField_88 = new JTextField();
	textField_88.setColumns(10);
	GridBagConstraints gbc_textField_88 = new GridBagConstraints();
	gbc_textField_88.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_88.insets = new Insets(0, 0, 5, 5);
	gbc_textField_88.gridx = 7;
	gbc_textField_88.gridy = 5;
	cpp_workstation4.add(textField_88, gbc_textField_88);
	
	JSeparator separator = new JSeparator();
	GridBagConstraints gbc_separator = new GridBagConstraints();
	gbc_separator.fill = GridBagConstraints.HORIZONTAL;
	gbc_separator.gridwidth = 7;
	gbc_separator.insets = new Insets(0, 0, 5, 5);
	gbc_separator.gridx = 1;
	gbc_separator.gridy = 6;
	cpp_workstation4.add(separator, gbc_separator);
	
	JLabel cpl4_capacityrequirements = new JLabel("Kapazit\u00E4tsbedarf ");
	GridBagConstraints gbc_cpl4_capacityrequirements = new GridBagConstraints();
	gbc_cpl4_capacityrequirements.anchor = GridBagConstraints.WEST;
	gbc_cpl4_capacityrequirements.insets = new Insets(0, 0, 5, 5);
	gbc_cpl4_capacityrequirements.gridx = 1;
	gbc_cpl4_capacityrequirements.gridy = 7;
	cpp_workstation4.add(cpl4_capacityrequirements, gbc_cpl4_capacityrequirements);
	
	textField_89 = new JTextField();
	textField_89.setColumns(10);
	GridBagConstraints gbc_textField_89 = new GridBagConstraints();
	gbc_textField_89.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_89.insets = new Insets(0, 0, 5, 5);
	gbc_textField_89.gridx = 7;
	gbc_textField_89.gridy = 7;
	cpp_workstation4.add(textField_89, gbc_textField_89);
	
	JLabel cpl4_setuptime = new JLabel("R\u00FCstzeit");
	GridBagConstraints gbc_cpl4_setuptime = new GridBagConstraints();
	gbc_cpl4_setuptime.anchor = GridBagConstraints.WEST;
	gbc_cpl4_setuptime.insets = new Insets(0, 0, 5, 5);
	gbc_cpl4_setuptime.gridx = 1;
	gbc_cpl4_setuptime.gridy = 8;
	cpp_workstation4.add(cpl4_setuptime, gbc_cpl4_setuptime);
	
	textField_90 = new JTextField();
	textField_90.setColumns(10);
	GridBagConstraints gbc_textField_90 = new GridBagConstraints();
	gbc_textField_90.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_90.insets = new Insets(0, 0, 5, 5);
	gbc_textField_90.gridx = 7;
	gbc_textField_90.gridy = 8;
	cpp_workstation4.add(textField_90, gbc_textField_90);
	
	JLabel cpl4_totalcapacity = new JLabel("Totale Kapazit\u00E4t");
	GridBagConstraints gbc_cpl4_totalcapacity = new GridBagConstraints();
	gbc_cpl4_totalcapacity.anchor = GridBagConstraints.WEST;
	gbc_cpl4_totalcapacity.insets = new Insets(0, 0, 5, 5);
	gbc_cpl4_totalcapacity.gridx = 1;
	gbc_cpl4_totalcapacity.gridy = 9;
	cpp_workstation4.add(cpl4_totalcapacity, gbc_cpl4_totalcapacity);
	
	textField_91 = new JTextField();
	textField_91.setColumns(10);
	GridBagConstraints gbc_textField_91 = new GridBagConstraints();
	gbc_textField_91.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_91.insets = new Insets(0, 0, 5, 5);
	gbc_textField_91.gridx = 7;
	gbc_textField_91.gridy = 9;
	cpp_workstation4.add(textField_91, gbc_textField_91);
	
	JLabel cpl4_workload = new JLabel("Auslastung %");
	GridBagConstraints gbc_cpl4_workload = new GridBagConstraints();
	gbc_cpl4_workload.anchor = GridBagConstraints.WEST;
	gbc_cpl4_workload.insets = new Insets(0, 0, 5, 5);
	gbc_cpl4_workload.gridx = 1;
	gbc_cpl4_workload.gridy = 10;
	cpp_workstation4.add(cpl4_workload, gbc_cpl4_workload);
	
	textField_92 = new JTextField();
	textField_92.setColumns(10);
	GridBagConstraints gbc_textField_92 = new GridBagConstraints();
	gbc_textField_92.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_92.insets = new Insets(0, 0, 5, 5);
	gbc_textField_92.gridx = 7;
	gbc_textField_92.gridy = 10;
	cpp_workstation4.add(textField_92, gbc_textField_92);
	
	JLabel cpl4_overtime = new JLabel("\u00DCberstunden (min) ");
	GridBagConstraints gbc_cpl4_overtime = new GridBagConstraints();
	gbc_cpl4_overtime.anchor = GridBagConstraints.WEST;
	gbc_cpl4_overtime.insets = new Insets(0, 0, 5, 5);
	gbc_cpl4_overtime.gridx = 1;
	gbc_cpl4_overtime.gridy = 11;
	cpp_workstation4.add(cpl4_overtime, gbc_cpl4_overtime);
	
	textField_93 = new JTextField();
	textField_93.setColumns(10);
	GridBagConstraints gbc_textField_93 = new GridBagConstraints();
	gbc_textField_93.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_93.insets = new Insets(0, 0, 5, 5);
	gbc_textField_93.gridx = 7;
	gbc_textField_93.gridy = 11;
	cpp_workstation4.add(textField_93, gbc_textField_93);
	
	return capacityplanningPane;
	}

}
