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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;

public class CapacityPlanning {
	
	private JTextField cptf1_49;
	private JTextField cptf1_54;
	private JTextField cptf1_29;
	private JTextField textField_252;
	private JTextField textField_253;
	private JTextField textField_254;
	private JTextField textField_255;
	private JTextField textField_256;
	private JTextField textField_257;
	private JTextField textField_258;
	private JTextField textField_279;
	private JTextField cptf3_51;
	private JTextField textField_259;
	private JTextField cptf3_56;
	private JTextField textField_261;
	private JTextField cptf3_31;
	private JTextField textField_263;
	private JTextField textField_264;
	private JTextField textField_265;
	private JTextField textField_266;
	private JTextField textField_267;
	private JTextField textField_268;
	private JTextField cptf2_50;
	private JTextField textField_270;
	private JTextField cptf2_55;
	private JTextField textField_272;
	private JTextField cptf2_30;
	private JTextField textField_274;
	private JTextField textField_275;
	private JTextField textField_276;
	private JTextField textField_277;
	private JTextField textField_278;
	private JTextField textField_280;
	private JTextField cptf4_1;
	private JTextField textField_84;
	private JTextField cptf4_2;
	private JTextField textField_86;
	private JTextField cptf4_3;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField cptf6_18;
	private JTextField textField_1;
	private JTextField cptf6_19;
	private JTextField textField_3;
	private JTextField cptf6_20;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField cptf6_16;
	private JTextField textField_12;
	private JTextField cptf7_10;
	private JTextField textField_27;
	private JTextField cptf7_13;
	private JTextField textField_29;
	private JTextField cptf7_14;
	private JTextField textField_31;
	private JTextField cptf7_15;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField cptf7_11;
	private JTextField cptf7_12;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField cptf7_18;
	private JTextField textField_44;
	private JTextField cptf7_19;
	private JTextField textField_46;
	private JTextField cptf7_20;
	private JTextField textField_48;
	private JTextField cptf8_10;
	private JTextField textField_52;
	private JTextField cptf8_11;
	private JTextField textField_54;
	private JTextField cptf8_12;
	private JTextField textField_56;
	private JTextField cptf8_13;
	private JTextField textField_58;
	private JTextField cptf8_14;
	private JTextField textField_60;
	private JTextField cptf8_15;
	private JTextField textField_62;
	private JTextField cptf8_18;
	private JTextField textField_64;
	private JTextField cptf8_19;
	private JTextField textField_66;
	private JTextField cptf8_20;
	private JTextField textField_68;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField cptf7_26;
	private JTextField textField_50;
	private JTextField cptf9_10;
	private JTextField textField_70;
	private JTextField cptf9_11;
	private JTextField textField_77;
	private JTextField cptf9_12;
	private JTextField textField_79;
	private JTextField cptf9_13;
	private JTextField textField_81;
	private JTextField cptf9_14;
	private JTextField textField_94;
	private JTextField cptf9_15;
	private JTextField textField_96;
	private JTextField cptf9_18;
	private JTextField textField_98;
	private JTextField cptf9_19;
	private JTextField textField_100;
	private JTextField cptf9_20;
	private JTextField textField_102;
	private JTextField textField_103;
	private JTextField textField_104;
	private JTextField textField_105;
	private JTextField textField_106;
	private JTextField textField_107;
	private JTextField cptf10_4;
	private JTextField textField_109;
	private JTextField cptf10_5;
	private JTextField textField_111;
	private JTextField cptf10_6;
	private JTextField textField_113;
	private JTextField cptf10_7;
	private JTextField textField_115;
	private JTextField cptf10_8;
	private JTextField textField_117;
	private JTextField cptf10_9;
	private JTextField textField_119;
	private JTextField textField_126;
	private JTextField textField_127;
	private JTextField textField_128;
	private JTextField textField_129;
	private JTextField textField_130;
	private JTextField cptf11_4;
	private JTextField textField_132;
	private JTextField cptf11_5;
	private JTextField textField_134;
	private JTextField cptf11_6;
	private JTextField textField_136;
	private JTextField cptf11_7;
	private JTextField textField_138;
	private JTextField cptf11_8;
	private JTextField textField_140;
	private JTextField cptf11_9;
	private JTextField textField_142;
	private JTextField textField_149;
	private JTextField textField_150;
	private JTextField textField_151;
	private JTextField textField_152;
	private JTextField textField_153;
	private JTextField cptf12_10;
	private JTextField textField_121;
	private JTextField cptf12_11;
	private JTextField textField_123;
	private JTextField cptf12_12;
	private JTextField textField_125;
	private JTextField cptf12_13;
	private JTextField textField_144;
	private JTextField cptf12_14;
	private JTextField textField_146;
	private JTextField cptf12_15;
	private JTextField textField_148;
	private JTextField textField_160;
	private JTextField textField_161;
	private JTextField textField_162;
	private JTextField textField_163;
	private JTextField textField_164;
	private JTextField cptf13_10;
	private JTextField textField_155;
	private JTextField cptf13_11;
	private JTextField textField_157;
	private JTextField cptf13_12;
	private JTextField textField_159;
	private JTextField cptf13_13;
	private JTextField textField_166;
	private JTextField cptf13_14;
	private JTextField textField_168;
	private JTextField cptf13_15;
	private JTextField textField_170;
	private JTextField textField_177;
	private JTextField textField_178;
	private JTextField textField_179;
	private JTextField textField_180;
	private JTextField textField_181;
	private JTextField cptf14_16;
	private JTextField textField_172;
	private JTextField textField_184;
	private JTextField textField_185;
	private JTextField textField_186;
	private JTextField textField_187;
	private JTextField textField_188;
	private JTextField cptf15_17;
	private JTextField textField_190;
	private JTextField cptf15_26;
	private JTextField textField_192;
	private JTextField textField_197;
	private JTextField textField_198;
	private JTextField textField_199;
	private JTextField textField_200;
	private JTextField textField_201;

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
	gbl_cpp_workstation1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
	
	cptf1_49 = new JTextField();
	GridBagConstraints gbc_cptf1_49 = new GridBagConstraints();
	gbc_cptf1_49.insets = new Insets(0, 0, 5, 5);
	gbc_cptf1_49.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf1_49.gridx = 5;
	gbc_cptf1_49.gridy = 3;
	cpp_workstation1.add(cptf1_49, gbc_cptf1_49);
	cptf1_49.setColumns(10);
	
	JLabel lblNewLabel_9 = new JLabel("x6 =");
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
	
	cptf1_54 = new JTextField();
	GridBagConstraints gbc_cptf1_54 = new GridBagConstraints();
	gbc_cptf1_54.insets = new Insets(0, 0, 5, 5);
	gbc_cptf1_54.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf1_54.gridx = 5;
	gbc_cptf1_54.gridy = 4;
	cpp_workstation1.add(cptf1_54, gbc_cptf1_54);
	cptf1_54.setColumns(10);
	
	JLabel lblNewLabel_10 = new JLabel("x6 =");
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
	
	cptf1_29 = new JTextField();
	GridBagConstraints gbc_cptf1_29 = new GridBagConstraints();
	gbc_cptf1_29.insets = new Insets(0, 0, 5, 5);
	gbc_cptf1_29.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf1_29.gridx = 5;
	gbc_cptf1_29.gridy = 5;
	cpp_workstation1.add(cptf1_29, gbc_cptf1_29);
	cptf1_29.setColumns(10);
	
	JLabel lblNewLabel_11 = new JLabel("x6 =");
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
	
	cptf2_50 = new JTextField();
	cptf2_50.setColumns(10);
	GridBagConstraints gbc_cptf2_50 = new GridBagConstraints();
	gbc_cptf2_50.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf2_50.insets = new Insets(0, 0, 5, 5);
	gbc_cptf2_50.gridx = 5;
	gbc_cptf2_50.gridy = 3;
	cpp_workstation2.add(cptf2_50, gbc_cptf2_50);
	
	JLabel lblX = new JLabel("x5 =");
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
	
	cptf2_55 = new JTextField();
	cptf2_55.setColumns(10);
	GridBagConstraints gbc_cptf2_55 = new GridBagConstraints();
	gbc_cptf2_55.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf2_55.insets = new Insets(0, 0, 5, 5);
	gbc_cptf2_55.gridx = 5;
	gbc_cptf2_55.gridy = 4;
	cpp_workstation2.add(cptf2_55, gbc_cptf2_55);
	
	JLabel lblX_1 = new JLabel("x5 =");
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
	
	cptf2_30 = new JTextField();
	cptf2_30.setColumns(10);
	GridBagConstraints gbc_cptf2_30 = new GridBagConstraints();
	gbc_cptf2_30.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf2_30.insets = new Insets(0, 0, 5, 5);
	gbc_cptf2_30.gridx = 5;
	gbc_cptf2_30.gridy = 5;
	cpp_workstation2.add(cptf2_30, gbc_cptf2_30);
	
	JLabel lblX_2 = new JLabel("x5 =");
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
	
	cptf3_51 = new JTextField();
	cptf3_51.setColumns(10);
	GridBagConstraints gbc_cptf3_51 = new GridBagConstraints();
	gbc_cptf3_51.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf3_51.insets = new Insets(0, 0, 5, 5);
	gbc_cptf3_51.gridx = 5;
	gbc_cptf3_51.gridy = 3;
	cpp_workstation3.add(cptf3_51, gbc_cptf3_51);
	
	JLabel lblX_3 = new JLabel("x5 =");
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
	
	cptf3_56 = new JTextField();
	cptf3_56.setColumns(10);
	GridBagConstraints gbc_cptf3_56 = new GridBagConstraints();
	gbc_cptf3_56.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf3_56.insets = new Insets(0, 0, 5, 5);
	gbc_cptf3_56.gridx = 5;
	gbc_cptf3_56.gridy = 4;
	cpp_workstation3.add(cptf3_56, gbc_cptf3_56);
	
	JLabel label_89 = new JLabel("x6 =");
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
	
	cptf3_31 = new JTextField();
	cptf3_31.setColumns(10);
	GridBagConstraints gbc_cptf3_31 = new GridBagConstraints();
	gbc_cptf3_31.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf3_31.insets = new Insets(0, 0, 5, 5);
	gbc_cptf3_31.gridx = 5;
	gbc_cptf3_31.gridy = 5;
	cpp_workstation3.add(cptf3_31, gbc_cptf3_31);
	
	JLabel label_206 = new JLabel("x6 =");
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
	
	cptf4_1 = new JTextField();
	cptf4_1.setColumns(10);
	GridBagConstraints gbc_cptf4_1 = new GridBagConstraints();
	gbc_cptf4_1.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf4_1.insets = new Insets(0, 0, 5, 5);
	gbc_cptf4_1.gridx = 5;
	gbc_cptf4_1.gridy = 3;
	cpp_workstation4.add(cptf4_1, gbc_cptf4_1);
	
	JLabel lblX_4 = new JLabel("x6 =");
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
	
	cptf4_2 = new JTextField();
	cptf4_2.setColumns(10);
	GridBagConstraints gbc_cptf4_2 = new GridBagConstraints();
	gbc_cptf4_2.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf4_2.insets = new Insets(0, 0, 5, 5);
	gbc_cptf4_2.gridx = 5;
	gbc_cptf4_2.gridy = 4;
	cpp_workstation4.add(cptf4_2, gbc_cptf4_2);
	
	JLabel lblX_5 = new JLabel("x7 =");
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
	
	cptf4_3 = new JTextField();
	cptf4_3.setColumns(10);
	GridBagConstraints gbc_cptf4_3 = new GridBagConstraints();
	gbc_cptf4_3.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf4_3.insets = new Insets(0, 0, 5, 5);
	gbc_cptf4_3.gridx = 5;
	gbc_cptf4_3.gridy = 5;
	cpp_workstation4.add(cptf4_3, gbc_cptf4_3);
	
	JLabel lblX_6 = new JLabel("x7 =");
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
	
	JPanel cpp_workstation6 = new JPanel();
	JScrollPane cpsp_workstation6 = new JScrollPane(cpp_workstation6);
    cpsp_workstation6.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    cpsp_workstation6.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	capacityplanningPane.addTab("W6", null, cpsp_workstation6, null);
	GridBagLayout gbl_cpp_workstation6 = new GridBagLayout();
	gbl_cpp_workstation6.columnWidths = new int[]{30, 70, 20, 40, 40, 78, 20, 60, 60, 0, 0, 0};
	gbl_cpp_workstation6.rowHeights = new int[] {40, 0, 30, 0, 30, 0, 0, 0, 30, 0, 0, 0, 0, 0, 30, 30, 0};
	gbl_cpp_workstation6.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	gbl_cpp_workstation6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	cpp_workstation6.setLayout(gbl_cpp_workstation6);
	
	JLabel label = new JLabel("Arbeitsplatz");
	GridBagConstraints gbc_label = new GridBagConstraints();
	gbc_label.anchor = GridBagConstraints.WEST;
	gbc_label.insets = new Insets(0, 0, 5, 5);
	gbc_label.gridx = 1;
	gbc_label.gridy = 1;
	cpp_workstation6.add(label, gbc_label);
	
	JLabel label_1 = new JLabel("6");
	GridBagConstraints gbc_label_1 = new GridBagConstraints();
	gbc_label_1.insets = new Insets(0, 0, 5, 5);
	gbc_label_1.gridx = 2;
	gbc_label_1.gridy = 1;
	cpp_workstation6.add(label_1, gbc_label_1);
	
	JLabel lblLenker = new JLabel("Lenker");
	GridBagConstraints gbc_lblLenker = new GridBagConstraints();
	gbc_lblLenker.insets = new Insets(0, 0, 5, 5);
	gbc_lblLenker.gridx = 1;
	gbc_lblLenker.gridy = 3;
	cpp_workstation6.add(lblLenker, gbc_lblLenker);
	
	JLabel lblKdh = new JLabel("KDH");
	GridBagConstraints gbc_lblKdh = new GridBagConstraints();
	gbc_lblKdh.insets = new Insets(0, 0, 5, 5);
	gbc_lblKdh.gridx = 3;
	gbc_lblKdh.gridy = 3;
	cpp_workstation6.add(lblKdh, gbc_lblKdh);
	
	JLabel lblE = new JLabel("E16");
	GridBagConstraints gbc_lblE = new GridBagConstraints();
	gbc_lblE.anchor = GridBagConstraints.EAST;
	gbc_lblE.insets = new Insets(0, 0, 5, 5);
	gbc_lblE.gridx = 4;
	gbc_lblE.gridy = 3;
	cpp_workstation6.add(lblE, gbc_lblE);
	
	cptf6_16 = new JTextField();
	cptf6_16.setColumns(10);
	GridBagConstraints gbc_cptf6_16 = new GridBagConstraints();
	gbc_cptf6_16.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf6_16.insets = new Insets(0, 0, 5, 5);
	gbc_cptf6_16.gridx = 5;
	gbc_cptf6_16.gridy = 3;
	cpp_workstation6.add(cptf6_16, gbc_cptf6_16);
	
	JLabel lblX_7 = new JLabel("x2 =");
	GridBagConstraints gbc_lblX_7 = new GridBagConstraints();
	gbc_lblX_7.anchor = GridBagConstraints.EAST;
	gbc_lblX_7.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_7.gridx = 6;
	gbc_lblX_7.gridy = 3;
	cpp_workstation6.add(lblX_7, gbc_lblX_7);
	
	textField_12 = new JTextField();
	textField_12.setColumns(10);
	GridBagConstraints gbc_textField_12 = new GridBagConstraints();
	gbc_textField_12.insets = new Insets(0, 0, 5, 5);
	gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_12.gridx = 7;
	gbc_textField_12.gridy = 3;
	cpp_workstation6.add(textField_12, gbc_textField_12);
	
	JLabel label_2 = new JLabel("Fahrrad komplett");
	GridBagConstraints gbc_label_2 = new GridBagConstraints();
	gbc_label_2.anchor = GridBagConstraints.WEST;
	gbc_label_2.gridheight = 3;
	gbc_label_2.insets = new Insets(0, 0, 5, 5);
	gbc_label_2.gridx = 1;
	gbc_label_2.gridy = 5;
	cpp_workstation6.add(label_2, gbc_label_2);
	
	JLabel label_3 = new JLabel("K");
	GridBagConstraints gbc_label_3 = new GridBagConstraints();
	gbc_label_3.insets = new Insets(0, 0, 5, 5);
	gbc_label_3.gridx = 3;
	gbc_label_3.gridy = 5;
	cpp_workstation6.add(label_3, gbc_label_3);
	
	JLabel lblE_1 = new JLabel("E18");
	GridBagConstraints gbc_lblE_1 = new GridBagConstraints();
	gbc_lblE_1.anchor = GridBagConstraints.EAST;
	gbc_lblE_1.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_1.gridx = 4;
	gbc_lblE_1.gridy = 5;
	cpp_workstation6.add(lblE_1, gbc_lblE_1);
	
	cptf6_18 = new JTextField();
	cptf6_18.setColumns(10);
	GridBagConstraints gbc_cptf6_18 = new GridBagConstraints();
	gbc_cptf6_18.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf6_18.insets = new Insets(0, 0, 5, 5);
	gbc_cptf6_18.gridx = 5;
	gbc_cptf6_18.gridy = 5;
	cpp_workstation6.add(cptf6_18, gbc_cptf6_18);
	
	JLabel lblX_8 = new JLabel("x3 =");
	GridBagConstraints gbc_lblX_8 = new GridBagConstraints();
	gbc_lblX_8.anchor = GridBagConstraints.EAST;
	gbc_lblX_8.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_8.gridx = 6;
	gbc_lblX_8.gridy = 5;
	cpp_workstation6.add(lblX_8, gbc_lblX_8);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	GridBagConstraints gbc_textField_1 = new GridBagConstraints();
	gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_1.insets = new Insets(0, 0, 5, 5);
	gbc_textField_1.gridx = 7;
	gbc_textField_1.gridy = 5;
	cpp_workstation6.add(textField_1, gbc_textField_1);
	
	JLabel label_6 = new JLabel("D");
	GridBagConstraints gbc_label_6 = new GridBagConstraints();
	gbc_label_6.insets = new Insets(0, 0, 5, 5);
	gbc_label_6.gridx = 3;
	gbc_label_6.gridy = 6;
	cpp_workstation6.add(label_6, gbc_label_6);
	
	JLabel lblE_2 = new JLabel("E19");
	GridBagConstraints gbc_lblE_2 = new GridBagConstraints();
	gbc_lblE_2.anchor = GridBagConstraints.EAST;
	gbc_lblE_2.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_2.gridx = 4;
	gbc_lblE_2.gridy = 6;
	cpp_workstation6.add(lblE_2, gbc_lblE_2);
	
	cptf6_19 = new JTextField();
	cptf6_19.setColumns(10);
	GridBagConstraints gbc_cptf6_19 = new GridBagConstraints();
	gbc_cptf6_19.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf6_19.insets = new Insets(0, 0, 5, 5);
	gbc_cptf6_19.gridx = 5;
	gbc_cptf6_19.gridy = 6;
	cpp_workstation6.add(cptf6_19, gbc_cptf6_19);
	
	JLabel lblX_9 = new JLabel("x3 =");
	GridBagConstraints gbc_lblX_9 = new GridBagConstraints();
	gbc_lblX_9.anchor = GridBagConstraints.EAST;
	gbc_lblX_9.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_9.gridx = 6;
	gbc_lblX_9.gridy = 6;
	cpp_workstation6.add(lblX_9, gbc_lblX_9);
	
	textField_3 = new JTextField();
	textField_3.setColumns(10);
	GridBagConstraints gbc_textField_3 = new GridBagConstraints();
	gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_3.insets = new Insets(0, 0, 5, 5);
	gbc_textField_3.gridx = 7;
	gbc_textField_3.gridy = 6;
	cpp_workstation6.add(textField_3, gbc_textField_3);
	
	JLabel label_9 = new JLabel("H");
	GridBagConstraints gbc_label_9 = new GridBagConstraints();
	gbc_label_9.insets = new Insets(0, 0, 5, 5);
	gbc_label_9.gridx = 3;
	gbc_label_9.gridy = 7;
	cpp_workstation6.add(label_9, gbc_label_9);
	
	JLabel lblE_3 = new JLabel("E20");
	GridBagConstraints gbc_lblE_3 = new GridBagConstraints();
	gbc_lblE_3.anchor = GridBagConstraints.EAST;
	gbc_lblE_3.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_3.gridx = 4;
	gbc_lblE_3.gridy = 7;
	cpp_workstation6.add(lblE_3, gbc_lblE_3);
	
	cptf6_20 = new JTextField();
	cptf6_20.setColumns(10);
	GridBagConstraints gbc_cptf6_20 = new GridBagConstraints();
	gbc_cptf6_20.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf6_20.insets = new Insets(0, 0, 5, 5);
	gbc_cptf6_20.gridx = 5;
	gbc_cptf6_20.gridy = 7;
	cpp_workstation6.add(cptf6_20, gbc_cptf6_20);
	
	JLabel lblX_10 = new JLabel("x3 =");
	GridBagConstraints gbc_lblX_10 = new GridBagConstraints();
	gbc_lblX_10.anchor = GridBagConstraints.EAST;
	gbc_lblX_10.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_10.gridx = 6;
	gbc_lblX_10.gridy = 7;
	cpp_workstation6.add(lblX_10, gbc_lblX_10);
	
	textField_5 = new JTextField();
	textField_5.setColumns(10);
	GridBagConstraints gbc_textField_5 = new GridBagConstraints();
	gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_5.insets = new Insets(0, 0, 5, 5);
	gbc_textField_5.gridx = 7;
	gbc_textField_5.gridy = 7;
	cpp_workstation6.add(textField_5, gbc_textField_5);
	
	JSeparator separator_4 = new JSeparator();
	GridBagConstraints gbc_separator_4 = new GridBagConstraints();
	gbc_separator_4.fill = GridBagConstraints.HORIZONTAL;
	gbc_separator_4.gridwidth = 7;
	gbc_separator_4.insets = new Insets(0, 0, 5, 5);
	gbc_separator_4.gridx = 1;
	gbc_separator_4.gridy = 8;
	cpp_workstation6.add(separator_4, gbc_separator_4);
	
	JLabel label_12 = new JLabel("Kapazit\u00E4tsbedarf ");
	GridBagConstraints gbc_label_12 = new GridBagConstraints();
	gbc_label_12.anchor = GridBagConstraints.WEST;
	gbc_label_12.insets = new Insets(0, 0, 5, 5);
	gbc_label_12.gridx = 1;
	gbc_label_12.gridy = 9;
	cpp_workstation6.add(label_12, gbc_label_12);
	
	textField_6 = new JTextField();
	textField_6.setColumns(10);
	GridBagConstraints gbc_textField_6 = new GridBagConstraints();
	gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_6.insets = new Insets(0, 0, 5, 5);
	gbc_textField_6.gridx = 7;
	gbc_textField_6.gridy = 9;
	cpp_workstation6.add(textField_6, gbc_textField_6);
	
	JLabel label_13 = new JLabel("R\u00FCstzeit");
	GridBagConstraints gbc_label_13 = new GridBagConstraints();
	gbc_label_13.anchor = GridBagConstraints.WEST;
	gbc_label_13.insets = new Insets(0, 0, 5, 5);
	gbc_label_13.gridx = 1;
	gbc_label_13.gridy = 10;
	cpp_workstation6.add(label_13, gbc_label_13);
	
	textField_7 = new JTextField();
	textField_7.setColumns(10);
	GridBagConstraints gbc_textField_7 = new GridBagConstraints();
	gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_7.insets = new Insets(0, 0, 5, 5);
	gbc_textField_7.gridx = 7;
	gbc_textField_7.gridy = 10;
	cpp_workstation6.add(textField_7, gbc_textField_7);
	
	JLabel label_14 = new JLabel("Totale Kapazit\u00E4t");
	GridBagConstraints gbc_label_14 = new GridBagConstraints();
	gbc_label_14.anchor = GridBagConstraints.WEST;
	gbc_label_14.insets = new Insets(0, 0, 5, 5);
	gbc_label_14.gridx = 1;
	gbc_label_14.gridy = 11;
	cpp_workstation6.add(label_14, gbc_label_14);
	
	textField_8 = new JTextField();
	textField_8.setColumns(10);
	GridBagConstraints gbc_textField_8 = new GridBagConstraints();
	gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_8.insets = new Insets(0, 0, 5, 5);
	gbc_textField_8.gridx = 7;
	gbc_textField_8.gridy = 11;
	cpp_workstation6.add(textField_8, gbc_textField_8);
	
	JLabel label_15 = new JLabel("Auslastung %");
	GridBagConstraints gbc_label_15 = new GridBagConstraints();
	gbc_label_15.anchor = GridBagConstraints.WEST;
	gbc_label_15.insets = new Insets(0, 0, 5, 5);
	gbc_label_15.gridx = 1;
	gbc_label_15.gridy = 12;
	cpp_workstation6.add(label_15, gbc_label_15);
	
	textField_9 = new JTextField();
	textField_9.setColumns(10);
	GridBagConstraints gbc_textField_9 = new GridBagConstraints();
	gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_9.insets = new Insets(0, 0, 5, 5);
	gbc_textField_9.gridx = 7;
	gbc_textField_9.gridy = 12;
	cpp_workstation6.add(textField_9, gbc_textField_9);
	
	JLabel label_16 = new JLabel("\u00DCberstunden (min) ");
	GridBagConstraints gbc_label_16 = new GridBagConstraints();
	gbc_label_16.anchor = GridBagConstraints.WEST;
	gbc_label_16.insets = new Insets(0, 0, 5, 5);
	gbc_label_16.gridx = 1;
	gbc_label_16.gridy = 13;
	cpp_workstation6.add(label_16, gbc_label_16);
	
	textField_10 = new JTextField();
	textField_10.setColumns(10);
	GridBagConstraints gbc_textField_10 = new GridBagConstraints();
	gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_10.insets = new Insets(0, 0, 5, 5);
	gbc_textField_10.gridx = 7;
	gbc_textField_10.gridy = 13;
	cpp_workstation6.add(textField_10, gbc_textField_10);
	
	JPanel cpp_workstation7 = new JPanel();
	JScrollPane cpsp_workstation7 = new JScrollPane(cpp_workstation7);
	cpsp_workstation7.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	cpsp_workstation7.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	capacityplanningPane.addTab("W7", null, cpsp_workstation7, null);
	GridBagLayout gbl_cpp_workstation7 = new GridBagLayout();
	gbl_cpp_workstation7.columnWidths = new int[]{30, 70, 20, 40, 40, 60, 20, 60, 60, 0, 0, 0};
	gbl_cpp_workstation7.rowHeights = new int[] {40, 0, 30, 0, 0, 0, 30, 0, 0, 0, 30, 0, 0, 0, 0, 0, 30, 0, 0, 0, 0, 0, 30, 30, 0};
	gbl_cpp_workstation7.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	gbl_cpp_workstation7.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	cpp_workstation7.setLayout(gbl_cpp_workstation7);
	
	JLabel label_4 = new JLabel("Arbeitsplatz");
	GridBagConstraints gbc_label_4 = new GridBagConstraints();
	gbc_label_4.anchor = GridBagConstraints.WEST;
	gbc_label_4.insets = new Insets(0, 0, 5, 5);
	gbc_label_4.gridx = 1;
	gbc_label_4.gridy = 1;
	cpp_workstation7.add(label_4, gbc_label_4);
	
	JLabel label_5 = new JLabel("7");
	GridBagConstraints gbc_label_5 = new GridBagConstraints();
	gbc_label_5.insets = new Insets(0, 0, 5, 5);
	gbc_label_5.gridx = 2;
	gbc_label_5.gridy = 1;
	cpp_workstation7.add(label_5, gbc_label_5);
	
	JLabel lblSchutzblechHinten = new JLabel("Schutzblech hinten");
	GridBagConstraints gbc_lblSchutzblechHinten = new GridBagConstraints();
	gbc_lblSchutzblechHinten.gridheight = 3;
	gbc_lblSchutzblechHinten.insets = new Insets(0, 0, 5, 5);
	gbc_lblSchutzblechHinten.gridx = 1;
	gbc_lblSchutzblechHinten.gridy = 3;
	cpp_workstation7.add(lblSchutzblechHinten, gbc_lblSchutzblechHinten);
	
	JLabel lblK = new JLabel("K");
	GridBagConstraints gbc_lblK = new GridBagConstraints();
	gbc_lblK.insets = new Insets(0, 0, 5, 5);
	gbc_lblK.gridx = 3;
	gbc_lblK.gridy = 3;
	cpp_workstation7.add(lblK, gbc_lblK);
	
	JLabel lblE_4 = new JLabel("E10");
	GridBagConstraints gbc_lblE_4 = new GridBagConstraints();
	gbc_lblE_4.anchor = GridBagConstraints.EAST;
	gbc_lblE_4.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_4.gridx = 4;
	gbc_lblE_4.gridy = 3;
	cpp_workstation7.add(lblE_4, gbc_lblE_4);
	
	cptf7_10 = new JTextField();
	cptf7_10.setColumns(10);
	GridBagConstraints gbc_cptf7_10 = new GridBagConstraints();
	gbc_cptf7_10.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf7_10.insets = new Insets(0, 0, 5, 5);
	gbc_cptf7_10.gridx = 5;
	gbc_cptf7_10.gridy = 3;
	cpp_workstation7.add(cptf7_10, gbc_cptf7_10);
	
	JLabel lblX_14 = new JLabel("x2 =");
	GridBagConstraints gbc_lblX_14 = new GridBagConstraints();
	gbc_lblX_14.anchor = GridBagConstraints.EAST;
	gbc_lblX_14.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_14.gridx = 6;
	gbc_lblX_14.gridy = 3;
	cpp_workstation7.add(lblX_14, gbc_lblX_14);
	
	textField_27 = new JTextField();
	textField_27.setColumns(10);
	GridBagConstraints gbc_textField_27 = new GridBagConstraints();
	gbc_textField_27.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_27.insets = new Insets(0, 0, 5, 5);
	gbc_textField_27.gridx = 7;
	gbc_textField_27.gridy = 3;
	cpp_workstation7.add(textField_27, gbc_textField_27);
	
	JLabel lblD = new JLabel("D");
	GridBagConstraints gbc_lblD = new GridBagConstraints();
	gbc_lblD.insets = new Insets(0, 0, 5, 5);
	gbc_lblD.gridx = 3;
	gbc_lblD.gridy = 4;
	cpp_workstation7.add(lblD, gbc_lblD);
	
	JLabel lblE_5 = new JLabel("E11");
	GridBagConstraints gbc_lblE_5 = new GridBagConstraints();
	gbc_lblE_5.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_5.anchor = GridBagConstraints.EAST;
	gbc_lblE_5.gridx = 4;
	gbc_lblE_5.gridy = 4;
	cpp_workstation7.add(lblE_5, gbc_lblE_5);
	
	cptf7_11 = new JTextField();
	GridBagConstraints gbc_cptf7_11 = new GridBagConstraints();
	gbc_cptf7_11.insets = new Insets(0, 0, 5, 5);
	gbc_cptf7_11.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf7_11.gridx = 5;
	gbc_cptf7_11.gridy = 4;
	cpp_workstation7.add(cptf7_11, gbc_cptf7_11);
	cptf7_11.setColumns(10);
	
	JLabel label_7 = new JLabel("x2 =");
	GridBagConstraints gbc_label_7 = new GridBagConstraints();
	gbc_label_7.insets = new Insets(0, 0, 5, 5);
	gbc_label_7.anchor = GridBagConstraints.EAST;
	gbc_label_7.gridx = 6;
	gbc_label_7.gridy = 4;
	cpp_workstation7.add(label_7, gbc_label_7);
	
	textField_41 = new JTextField();
	textField_41.setColumns(10);
	GridBagConstraints gbc_textField_41 = new GridBagConstraints();
	gbc_textField_41.insets = new Insets(0, 0, 5, 5);
	gbc_textField_41.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_41.gridx = 7;
	gbc_textField_41.gridy = 4;
	cpp_workstation7.add(textField_41, gbc_textField_41);
	
	JLabel lblH = new JLabel("H");
	GridBagConstraints gbc_lblH = new GridBagConstraints();
	gbc_lblH.insets = new Insets(0, 0, 5, 5);
	gbc_lblH.gridx = 3;
	gbc_lblH.gridy = 5;
	cpp_workstation7.add(lblH, gbc_lblH);
	
	JLabel lblE_6 = new JLabel("E12");
	GridBagConstraints gbc_lblE_6 = new GridBagConstraints();
	gbc_lblE_6.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_6.anchor = GridBagConstraints.EAST;
	gbc_lblE_6.gridx = 4;
	gbc_lblE_6.gridy = 5;
	cpp_workstation7.add(lblE_6, gbc_lblE_6);
	
	cptf7_12 = new JTextField();
	cptf7_12.setColumns(10);
	GridBagConstraints gbc_cptf7_12 = new GridBagConstraints();
	gbc_cptf7_12.insets = new Insets(0, 0, 5, 5);
	gbc_cptf7_12.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf7_12.gridx = 5;
	gbc_cptf7_12.gridy = 5;
	cpp_workstation7.add(cptf7_12, gbc_cptf7_12);
	
	JLabel label_8 = new JLabel("x2 =");
	GridBagConstraints gbc_label_8 = new GridBagConstraints();
	gbc_label_8.insets = new Insets(0, 0, 5, 5);
	gbc_label_8.anchor = GridBagConstraints.EAST;
	gbc_label_8.gridx = 6;
	gbc_label_8.gridy = 5;
	cpp_workstation7.add(label_8, gbc_label_8);
	
	textField_42 = new JTextField();
	textField_42.setColumns(10);
	GridBagConstraints gbc_textField_42 = new GridBagConstraints();
	gbc_textField_42.insets = new Insets(0, 0, 5, 5);
	gbc_textField_42.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_42.gridx = 7;
	gbc_textField_42.gridy = 5;
	cpp_workstation7.add(textField_42, gbc_textField_42);
	
	JLabel lblSchutzblechVorne = new JLabel("Schutzblech Vorne");
	GridBagConstraints gbc_lblSchutzblechVorne = new GridBagConstraints();
	gbc_lblSchutzblechVorne.anchor = GridBagConstraints.WEST;
	gbc_lblSchutzblechVorne.gridheight = 3;
	gbc_lblSchutzblechVorne.insets = new Insets(0, 0, 5, 5);
	gbc_lblSchutzblechVorne.gridx = 1;
	gbc_lblSchutzblechVorne.gridy = 7;
	cpp_workstation7.add(lblSchutzblechVorne, gbc_lblSchutzblechVorne);
	
	JLabel label_18 = new JLabel("K");
	GridBagConstraints gbc_label_18 = new GridBagConstraints();
	gbc_label_18.insets = new Insets(0, 0, 5, 5);
	gbc_label_18.gridx = 3;
	gbc_label_18.gridy = 7;
	cpp_workstation7.add(label_18, gbc_label_18);
	
	JLabel lblE_7 = new JLabel("E13");
	GridBagConstraints gbc_lblE_7 = new GridBagConstraints();
	gbc_lblE_7.anchor = GridBagConstraints.EAST;
	gbc_lblE_7.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_7.gridx = 4;
	gbc_lblE_7.gridy = 7;
	cpp_workstation7.add(lblE_7, gbc_lblE_7);
	
	cptf7_13 = new JTextField();
	cptf7_13.setColumns(10);
	GridBagConstraints gbc_cptf7_13 = new GridBagConstraints();
	gbc_cptf7_13.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf7_13.insets = new Insets(0, 0, 5, 5);
	gbc_cptf7_13.gridx = 5;
	gbc_cptf7_13.gridy = 7;
	cpp_workstation7.add(cptf7_13, gbc_cptf7_13);
	
	JLabel lblX_11 = new JLabel("x2 =");
	GridBagConstraints gbc_lblX_11 = new GridBagConstraints();
	gbc_lblX_11.anchor = GridBagConstraints.EAST;
	gbc_lblX_11.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_11.gridx = 6;
	gbc_lblX_11.gridy = 7;
	cpp_workstation7.add(lblX_11, gbc_lblX_11);
	
	textField_29 = new JTextField();
	textField_29.setColumns(10);
	GridBagConstraints gbc_textField_29 = new GridBagConstraints();
	gbc_textField_29.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_29.insets = new Insets(0, 0, 5, 5);
	gbc_textField_29.gridx = 7;
	gbc_textField_29.gridy = 7;
	cpp_workstation7.add(textField_29, gbc_textField_29);
	
	JLabel label_21 = new JLabel("D");
	GridBagConstraints gbc_label_21 = new GridBagConstraints();
	gbc_label_21.insets = new Insets(0, 0, 5, 5);
	gbc_label_21.gridx = 3;
	gbc_label_21.gridy = 8;
	cpp_workstation7.add(label_21, gbc_label_21);
	
	JLabel lblE_8 = new JLabel("E14");
	GridBagConstraints gbc_lblE_8 = new GridBagConstraints();
	gbc_lblE_8.anchor = GridBagConstraints.EAST;
	gbc_lblE_8.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_8.gridx = 4;
	gbc_lblE_8.gridy = 8;
	cpp_workstation7.add(lblE_8, gbc_lblE_8);
	
	cptf7_14 = new JTextField();
	cptf7_14.setColumns(10);
	GridBagConstraints gbc_cptf7_14 = new GridBagConstraints();
	gbc_cptf7_14.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf7_14.insets = new Insets(0, 0, 5, 5);
	gbc_cptf7_14.gridx = 5;
	gbc_cptf7_14.gridy = 8;
	cpp_workstation7.add(cptf7_14, gbc_cptf7_14);
	
	JLabel lblX_12 = new JLabel("x2 =");
	GridBagConstraints gbc_lblX_12 = new GridBagConstraints();
	gbc_lblX_12.anchor = GridBagConstraints.EAST;
	gbc_lblX_12.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_12.gridx = 6;
	gbc_lblX_12.gridy = 8;
	cpp_workstation7.add(lblX_12, gbc_lblX_12);
	
	textField_31 = new JTextField();
	textField_31.setColumns(10);
	GridBagConstraints gbc_textField_31 = new GridBagConstraints();
	gbc_textField_31.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_31.insets = new Insets(0, 0, 5, 5);
	gbc_textField_31.gridx = 7;
	gbc_textField_31.gridy = 8;
	cpp_workstation7.add(textField_31, gbc_textField_31);
	
	JLabel label_24 = new JLabel("H");
	GridBagConstraints gbc_label_24 = new GridBagConstraints();
	gbc_label_24.insets = new Insets(0, 0, 5, 5);
	gbc_label_24.gridx = 3;
	gbc_label_24.gridy = 9;
	cpp_workstation7.add(label_24, gbc_label_24);
	
	JLabel lblE_9 = new JLabel("E15");
	GridBagConstraints gbc_lblE_9 = new GridBagConstraints();
	gbc_lblE_9.anchor = GridBagConstraints.EAST;
	gbc_lblE_9.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_9.gridx = 4;
	gbc_lblE_9.gridy = 9;
	cpp_workstation7.add(lblE_9, gbc_lblE_9);
	
	cptf7_15 = new JTextField();
	cptf7_15.setColumns(10);
	GridBagConstraints gbc_cptf7_15 = new GridBagConstraints();
	gbc_cptf7_15.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf7_15.insets = new Insets(0, 0, 5, 5);
	gbc_cptf7_15.gridx = 5;
	gbc_cptf7_15.gridy = 9;
	cpp_workstation7.add(cptf7_15, gbc_cptf7_15);
	
	JLabel lblX_13 = new JLabel("x2 =");
	GridBagConstraints gbc_lblX_13 = new GridBagConstraints();
	gbc_lblX_13.anchor = GridBagConstraints.EAST;
	gbc_lblX_13.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_13.gridx = 6;
	gbc_lblX_13.gridy = 9;
	cpp_workstation7.add(lblX_13, gbc_lblX_13);
	
	textField_33 = new JTextField();
	textField_33.setColumns(10);
	GridBagConstraints gbc_textField_33 = new GridBagConstraints();
	gbc_textField_33.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_33.insets = new Insets(0, 0, 5, 5);
	gbc_textField_33.gridx = 7;
	gbc_textField_33.gridy = 9;
	cpp_workstation7.add(textField_33, gbc_textField_33);
	
	JLabel lblRahmen = new JLabel("Rahmen");
	GridBagConstraints gbc_lblRahmen = new GridBagConstraints();
	gbc_lblRahmen.gridheight = 3;
	gbc_lblRahmen.insets = new Insets(0, 0, 5, 5);
	gbc_lblRahmen.gridx = 1;
	gbc_lblRahmen.gridy = 11;
	cpp_workstation7.add(lblRahmen, gbc_lblRahmen);
	
	JLabel label_20 = new JLabel("K");
	GridBagConstraints gbc_label_20 = new GridBagConstraints();
	gbc_label_20.insets = new Insets(0, 0, 5, 5);
	gbc_label_20.gridx = 3;
	gbc_label_20.gridy = 11;
	cpp_workstation7.add(label_20, gbc_label_20);
	
	JLabel lblE_10 = new JLabel("E18");
	GridBagConstraints gbc_lblE_10 = new GridBagConstraints();
	gbc_lblE_10.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_10.anchor = GridBagConstraints.EAST;
	gbc_lblE_10.gridx = 4;
	gbc_lblE_10.gridy = 11;
	cpp_workstation7.add(lblE_10, gbc_lblE_10);
	
	cptf7_18 = new JTextField();
	cptf7_18.setColumns(10);
	GridBagConstraints gbc_cptf7_18 = new GridBagConstraints();
	gbc_cptf7_18.insets = new Insets(0, 0, 5, 5);
	gbc_cptf7_18.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf7_18.gridx = 5;
	gbc_cptf7_18.gridy = 11;
	cpp_workstation7.add(cptf7_18, gbc_cptf7_18);
	
	JLabel lblX_15 = new JLabel("x2 =");
	GridBagConstraints gbc_lblX_15 = new GridBagConstraints();
	gbc_lblX_15.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_15.anchor = GridBagConstraints.EAST;
	gbc_lblX_15.gridx = 6;
	gbc_lblX_15.gridy = 11;
	cpp_workstation7.add(lblX_15, gbc_lblX_15);
	
	textField_44 = new JTextField();
	textField_44.setColumns(10);
	GridBagConstraints gbc_textField_44 = new GridBagConstraints();
	gbc_textField_44.insets = new Insets(0, 0, 5, 5);
	gbc_textField_44.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_44.gridx = 7;
	gbc_textField_44.gridy = 11;
	cpp_workstation7.add(textField_44, gbc_textField_44);
	
	JLabel label_22 = new JLabel("D");
	GridBagConstraints gbc_label_22 = new GridBagConstraints();
	gbc_label_22.insets = new Insets(0, 0, 5, 5);
	gbc_label_22.gridx = 3;
	gbc_label_22.gridy = 12;
	cpp_workstation7.add(label_22, gbc_label_22);
	
	JLabel lblE_11 = new JLabel("E19");
	GridBagConstraints gbc_lblE_11 = new GridBagConstraints();
	gbc_lblE_11.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_11.anchor = GridBagConstraints.EAST;
	gbc_lblE_11.gridx = 4;
	gbc_lblE_11.gridy = 12;
	cpp_workstation7.add(lblE_11, gbc_lblE_11);
	
	cptf7_19 = new JTextField();
	cptf7_19.setColumns(10);
	GridBagConstraints gbc_cptf7_19 = new GridBagConstraints();
	gbc_cptf7_19.insets = new Insets(0, 0, 5, 5);
	gbc_cptf7_19.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf7_19.gridx = 5;
	gbc_cptf7_19.gridy = 12;
	cpp_workstation7.add(cptf7_19, gbc_cptf7_19);
	
	JLabel lblX_16 = new JLabel("x2 =");
	GridBagConstraints gbc_lblX_16 = new GridBagConstraints();
	gbc_lblX_16.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_16.anchor = GridBagConstraints.EAST;
	gbc_lblX_16.gridx = 6;
	gbc_lblX_16.gridy = 12;
	cpp_workstation7.add(lblX_16, gbc_lblX_16);
	
	textField_46 = new JTextField();
	textField_46.setColumns(10);
	GridBagConstraints gbc_textField_46 = new GridBagConstraints();
	gbc_textField_46.insets = new Insets(0, 0, 5, 5);
	gbc_textField_46.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_46.gridx = 7;
	gbc_textField_46.gridy = 12;
	cpp_workstation7.add(textField_46, gbc_textField_46);
	
	JLabel label_23 = new JLabel("H");
	GridBagConstraints gbc_label_23 = new GridBagConstraints();
	gbc_label_23.insets = new Insets(0, 0, 5, 5);
	gbc_label_23.gridx = 3;
	gbc_label_23.gridy = 13;
	cpp_workstation7.add(label_23, gbc_label_23);
	
	JLabel lblE_12 = new JLabel("E20");
	GridBagConstraints gbc_lblE_12 = new GridBagConstraints();
	gbc_lblE_12.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_12.anchor = GridBagConstraints.EAST;
	gbc_lblE_12.gridx = 4;
	gbc_lblE_12.gridy = 13;
	cpp_workstation7.add(lblE_12, gbc_lblE_12);
	
	cptf7_20 = new JTextField();
	cptf7_20.setColumns(10);
	GridBagConstraints gbc_cptf7_20 = new GridBagConstraints();
	gbc_cptf7_20.insets = new Insets(0, 0, 5, 5);
	gbc_cptf7_20.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf7_20.gridx = 5;
	gbc_cptf7_20.gridy = 13;
	cpp_workstation7.add(cptf7_20, gbc_cptf7_20);
	
	JLabel lblX_17 = new JLabel("x2 =");
	GridBagConstraints gbc_lblX_17 = new GridBagConstraints();
	gbc_lblX_17.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_17.anchor = GridBagConstraints.EAST;
	gbc_lblX_17.gridx = 6;
	gbc_lblX_17.gridy = 13;
	cpp_workstation7.add(lblX_17, gbc_lblX_17);
	
	textField_48 = new JTextField();
	textField_48.setColumns(10);
	GridBagConstraints gbc_textField_48 = new GridBagConstraints();
	gbc_textField_48.insets = new Insets(0, 0, 5, 5);
	gbc_textField_48.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_48.gridx = 7;
	gbc_textField_48.gridy = 13;
	cpp_workstation7.add(textField_48, gbc_textField_48);
	
	JLabel lblPedale = new JLabel("Pedale");
	GridBagConstraints gbc_lblPedale = new GridBagConstraints();
	gbc_lblPedale.insets = new Insets(0, 0, 5, 5);
	gbc_lblPedale.gridx = 1;
	gbc_lblPedale.gridy = 15;
	cpp_workstation7.add(lblPedale, gbc_lblPedale);
	
	JLabel lblKdh_1 = new JLabel("KDH");
	GridBagConstraints gbc_lblKdh_1 = new GridBagConstraints();
	gbc_lblKdh_1.insets = new Insets(0, 0, 5, 5);
	gbc_lblKdh_1.gridx = 3;
	gbc_lblKdh_1.gridy = 15;
	cpp_workstation7.add(lblKdh_1, gbc_lblKdh_1);
	
	JLabel lblE_13 = new JLabel("E26");
	GridBagConstraints gbc_lblE_13 = new GridBagConstraints();
	gbc_lblE_13.anchor = GridBagConstraints.EAST;
	gbc_lblE_13.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_13.gridx = 4;
	gbc_lblE_13.gridy = 15;
	cpp_workstation7.add(lblE_13, gbc_lblE_13);
	
	cptf7_26 = new JTextField();
	cptf7_26.setColumns(10);
	GridBagConstraints gbc_cptf7_26 = new GridBagConstraints();
	gbc_cptf7_26.insets = new Insets(0, 0, 5, 5);
	gbc_cptf7_26.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf7_26.gridx = 5;
	gbc_cptf7_26.gridy = 15;
	cpp_workstation7.add(cptf7_26, gbc_cptf7_26);
	
	JLabel label_17 = new JLabel("x2 =");
	GridBagConstraints gbc_label_17 = new GridBagConstraints();
	gbc_label_17.anchor = GridBagConstraints.EAST;
	gbc_label_17.insets = new Insets(0, 0, 5, 5);
	gbc_label_17.gridx = 6;
	gbc_label_17.gridy = 15;
	cpp_workstation7.add(label_17, gbc_label_17);
	
	textField_50 = new JTextField();
	textField_50.setColumns(10);
	GridBagConstraints gbc_textField_50 = new GridBagConstraints();
	gbc_textField_50.insets = new Insets(0, 0, 5, 5);
	gbc_textField_50.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_50.gridx = 7;
	gbc_textField_50.gridy = 15;
	cpp_workstation7.add(textField_50, gbc_textField_50);
	
	JSeparator separator_5 = new JSeparator();
	GridBagConstraints gbc_separator_5 = new GridBagConstraints();
	gbc_separator_5.fill = GridBagConstraints.HORIZONTAL;
	gbc_separator_5.gridwidth = 7;
	gbc_separator_5.insets = new Insets(0, 0, 5, 5);
	gbc_separator_5.gridx = 1;
	gbc_separator_5.gridy = 16;
	cpp_workstation7.add(separator_5, gbc_separator_5);
	
	JLabel label_27 = new JLabel("Kapazit\u00E4tsbedarf ");
	GridBagConstraints gbc_label_27 = new GridBagConstraints();
	gbc_label_27.anchor = GridBagConstraints.WEST;
	gbc_label_27.insets = new Insets(0, 0, 5, 5);
	gbc_label_27.gridx = 1;
	gbc_label_27.gridy = 17;
	cpp_workstation7.add(label_27, gbc_label_27);
	
	textField_34 = new JTextField();
	textField_34.setColumns(10);
	GridBagConstraints gbc_textField_34 = new GridBagConstraints();
	gbc_textField_34.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_34.insets = new Insets(0, 0, 5, 5);
	gbc_textField_34.gridx = 7;
	gbc_textField_34.gridy = 17;
	cpp_workstation7.add(textField_34, gbc_textField_34);
	
	JLabel label_28 = new JLabel("R\u00FCstzeit");
	GridBagConstraints gbc_label_28 = new GridBagConstraints();
	gbc_label_28.anchor = GridBagConstraints.WEST;
	gbc_label_28.insets = new Insets(0, 0, 5, 5);
	gbc_label_28.gridx = 1;
	gbc_label_28.gridy = 18;
	cpp_workstation7.add(label_28, gbc_label_28);
	
	textField_35 = new JTextField();
	textField_35.setColumns(10);
	GridBagConstraints gbc_textField_35 = new GridBagConstraints();
	gbc_textField_35.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_35.insets = new Insets(0, 0, 5, 5);
	gbc_textField_35.gridx = 7;
	gbc_textField_35.gridy = 18;
	cpp_workstation7.add(textField_35, gbc_textField_35);
	
	JLabel label_29 = new JLabel("Totale Kapazit\u00E4t");
	GridBagConstraints gbc_label_29 = new GridBagConstraints();
	gbc_label_29.anchor = GridBagConstraints.WEST;
	gbc_label_29.insets = new Insets(0, 0, 5, 5);
	gbc_label_29.gridx = 1;
	gbc_label_29.gridy = 19;
	cpp_workstation7.add(label_29, gbc_label_29);
	
	textField_36 = new JTextField();
	textField_36.setColumns(10);
	GridBagConstraints gbc_textField_36 = new GridBagConstraints();
	gbc_textField_36.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_36.insets = new Insets(0, 0, 5, 5);
	gbc_textField_36.gridx = 7;
	gbc_textField_36.gridy = 19;
	cpp_workstation7.add(textField_36, gbc_textField_36);
	
	JLabel label_30 = new JLabel("Auslastung %");
	GridBagConstraints gbc_label_30 = new GridBagConstraints();
	gbc_label_30.anchor = GridBagConstraints.WEST;
	gbc_label_30.insets = new Insets(0, 0, 5, 5);
	gbc_label_30.gridx = 1;
	gbc_label_30.gridy = 20;
	cpp_workstation7.add(label_30, gbc_label_30);
	
	textField_37 = new JTextField();
	textField_37.setColumns(10);
	GridBagConstraints gbc_textField_37 = new GridBagConstraints();
	gbc_textField_37.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_37.insets = new Insets(0, 0, 5, 5);
	gbc_textField_37.gridx = 7;
	gbc_textField_37.gridy = 20;
	cpp_workstation7.add(textField_37, gbc_textField_37);
	
	JLabel label_31 = new JLabel("\u00DCberstunden (min) ");
	GridBagConstraints gbc_label_31 = new GridBagConstraints();
	gbc_label_31.anchor = GridBagConstraints.WEST;
	gbc_label_31.insets = new Insets(0, 0, 5, 5);
	gbc_label_31.gridx = 1;
	gbc_label_31.gridy = 21;
	cpp_workstation7.add(label_31, gbc_label_31);
	
	textField_38 = new JTextField();
	textField_38.setColumns(10);
	GridBagConstraints gbc_textField_38 = new GridBagConstraints();
	gbc_textField_38.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_38.insets = new Insets(0, 0, 5, 5);
	gbc_textField_38.gridx = 7;
	gbc_textField_38.gridy = 21;
	cpp_workstation7.add(textField_38, gbc_textField_38);
	
	JPanel cpp_workstation8 = new JPanel();
	JScrollPane cpsp_workstation8 = new JScrollPane(cpp_workstation8);
	cpsp_workstation8.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	cpsp_workstation8.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	capacityplanningPane.addTab("W8", null, cpsp_workstation8, null);
	GridBagLayout gbl_cpp_workstation8 = new GridBagLayout();
	gbl_cpp_workstation8.columnWidths = new int[]{30, 70, 20, 40, 40, 60, 20, 60, 60, 0, 0, 0};
	gbl_cpp_workstation8.rowHeights = new int[]{40, 0, 30, 0, 0, 0, 23, 0, 0, 0, 0, 0, 0, 0, 30, 0, 0, 0, 0, 0, 30, 30, 0};
	gbl_cpp_workstation8.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	gbl_cpp_workstation8.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	cpp_workstation8.setLayout(gbl_cpp_workstation8);
	
	JLabel label_26 = new JLabel("Arbeitsplatz");
	GridBagConstraints gbc_label_26 = new GridBagConstraints();
	gbc_label_26.anchor = GridBagConstraints.WEST;
	gbc_label_26.insets = new Insets(0, 0, 5, 5);
	gbc_label_26.gridx = 1;
	gbc_label_26.gridy = 1;
	cpp_workstation8.add(label_26, gbc_label_26);
	
	JLabel label_32 = new JLabel("8");
	GridBagConstraints gbc_label_32 = new GridBagConstraints();
	gbc_label_32.insets = new Insets(0, 0, 5, 5);
	gbc_label_32.gridx = 2;
	gbc_label_32.gridy = 1;
	cpp_workstation8.add(label_32, gbc_label_32);
	
	JLabel label_33 = new JLabel("Schutzblech hinten");
	GridBagConstraints gbc_label_33 = new GridBagConstraints();
	gbc_label_33.gridheight = 3;
	gbc_label_33.insets = new Insets(0, 0, 5, 5);
	gbc_label_33.gridx = 1;
	gbc_label_33.gridy = 3;
	cpp_workstation8.add(label_33, gbc_label_33);
	
	JLabel label_34 = new JLabel("K");
	GridBagConstraints gbc_label_34 = new GridBagConstraints();
	gbc_label_34.insets = new Insets(0, 0, 5, 5);
	gbc_label_34.gridx = 3;
	gbc_label_34.gridy = 3;
	cpp_workstation8.add(label_34, gbc_label_34);
	
	JLabel label_35 = new JLabel("E10");
	GridBagConstraints gbc_label_35 = new GridBagConstraints();
	gbc_label_35.anchor = GridBagConstraints.EAST;
	gbc_label_35.insets = new Insets(0, 0, 5, 5);
	gbc_label_35.gridx = 4;
	gbc_label_35.gridy = 3;
	cpp_workstation8.add(label_35, gbc_label_35);
	
	cptf8_10 = new JTextField();
	cptf8_10.setColumns(10);
	GridBagConstraints gbc_cptf8_10 = new GridBagConstraints();
	gbc_cptf8_10.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf8_10.insets = new Insets(0, 0, 5, 5);
	gbc_cptf8_10.gridx = 5;
	gbc_cptf8_10.gridy = 3;
	cpp_workstation8.add(cptf8_10, gbc_cptf8_10);
	
	JLabel lblX_18 = new JLabel("x1 =");
	GridBagConstraints gbc_lblX_18 = new GridBagConstraints();
	gbc_lblX_18.anchor = GridBagConstraints.EAST;
	gbc_lblX_18.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_18.gridx = 6;
	gbc_lblX_18.gridy = 3;
	cpp_workstation8.add(lblX_18, gbc_lblX_18);
	
	textField_52 = new JTextField();
	textField_52.setColumns(10);
	GridBagConstraints gbc_textField_52 = new GridBagConstraints();
	gbc_textField_52.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_52.insets = new Insets(0, 0, 5, 5);
	gbc_textField_52.gridx = 7;
	gbc_textField_52.gridy = 3;
	cpp_workstation8.add(textField_52, gbc_textField_52);
	
	JLabel label_37 = new JLabel("D");
	GridBagConstraints gbc_label_37 = new GridBagConstraints();
	gbc_label_37.insets = new Insets(0, 0, 5, 5);
	gbc_label_37.gridx = 3;
	gbc_label_37.gridy = 4;
	cpp_workstation8.add(label_37, gbc_label_37);
	
	JLabel label_38 = new JLabel("E11");
	GridBagConstraints gbc_label_38 = new GridBagConstraints();
	gbc_label_38.anchor = GridBagConstraints.EAST;
	gbc_label_38.insets = new Insets(0, 0, 5, 5);
	gbc_label_38.gridx = 4;
	gbc_label_38.gridy = 4;
	cpp_workstation8.add(label_38, gbc_label_38);
	
	cptf8_11 = new JTextField();
	cptf8_11.setColumns(10);
	GridBagConstraints gbc_cptf8_11 = new GridBagConstraints();
	gbc_cptf8_11.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf8_11.insets = new Insets(0, 0, 5, 5);
	gbc_cptf8_11.gridx = 5;
	gbc_cptf8_11.gridy = 4;
	cpp_workstation8.add(cptf8_11, gbc_cptf8_11);
	
	JLabel label_39 = new JLabel("x2 =");
	GridBagConstraints gbc_label_39 = new GridBagConstraints();
	gbc_label_39.anchor = GridBagConstraints.EAST;
	gbc_label_39.insets = new Insets(0, 0, 5, 5);
	gbc_label_39.gridx = 6;
	gbc_label_39.gridy = 4;
	cpp_workstation8.add(label_39, gbc_label_39);
	
	textField_54 = new JTextField();
	textField_54.setColumns(10);
	GridBagConstraints gbc_textField_54 = new GridBagConstraints();
	gbc_textField_54.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_54.insets = new Insets(0, 0, 5, 5);
	gbc_textField_54.gridx = 7;
	gbc_textField_54.gridy = 4;
	cpp_workstation8.add(textField_54, gbc_textField_54);
	
	JLabel label_40 = new JLabel("H");
	GridBagConstraints gbc_label_40 = new GridBagConstraints();
	gbc_label_40.insets = new Insets(0, 0, 5, 5);
	gbc_label_40.gridx = 3;
	gbc_label_40.gridy = 5;
	cpp_workstation8.add(label_40, gbc_label_40);
	
	JLabel label_41 = new JLabel("E12");
	GridBagConstraints gbc_label_41 = new GridBagConstraints();
	gbc_label_41.anchor = GridBagConstraints.EAST;
	gbc_label_41.insets = new Insets(0, 0, 5, 5);
	gbc_label_41.gridx = 4;
	gbc_label_41.gridy = 5;
	cpp_workstation8.add(label_41, gbc_label_41);
	
	cptf8_12 = new JTextField();
	cptf8_12.setColumns(10);
	GridBagConstraints gbc_cptf8_12 = new GridBagConstraints();
	gbc_cptf8_12.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf8_12.insets = new Insets(0, 0, 5, 5);
	gbc_cptf8_12.gridx = 5;
	gbc_cptf8_12.gridy = 5;
	cpp_workstation8.add(cptf8_12, gbc_cptf8_12);
	
	JLabel label_42 = new JLabel("x2 =");
	GridBagConstraints gbc_label_42 = new GridBagConstraints();
	gbc_label_42.anchor = GridBagConstraints.EAST;
	gbc_label_42.insets = new Insets(0, 0, 5, 5);
	gbc_label_42.gridx = 6;
	gbc_label_42.gridy = 5;
	cpp_workstation8.add(label_42, gbc_label_42);
	
	textField_56 = new JTextField();
	textField_56.setColumns(10);
	GridBagConstraints gbc_textField_56 = new GridBagConstraints();
	gbc_textField_56.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_56.insets = new Insets(0, 0, 5, 5);
	gbc_textField_56.gridx = 7;
	gbc_textField_56.gridy = 5;
	cpp_workstation8.add(textField_56, gbc_textField_56);
	
	JLabel label_43 = new JLabel("Schutzblech Vorne");
	GridBagConstraints gbc_label_43 = new GridBagConstraints();
	gbc_label_43.anchor = GridBagConstraints.WEST;
	gbc_label_43.gridheight = 3;
	gbc_label_43.insets = new Insets(0, 0, 5, 5);
	gbc_label_43.gridx = 1;
	gbc_label_43.gridy = 7;
	cpp_workstation8.add(label_43, gbc_label_43);
	
	JLabel label_44 = new JLabel("K");
	GridBagConstraints gbc_label_44 = new GridBagConstraints();
	gbc_label_44.insets = new Insets(0, 0, 5, 5);
	gbc_label_44.gridx = 3;
	gbc_label_44.gridy = 7;
	cpp_workstation8.add(label_44, gbc_label_44);
	
	JLabel label_45 = new JLabel("E13");
	GridBagConstraints gbc_label_45 = new GridBagConstraints();
	gbc_label_45.anchor = GridBagConstraints.EAST;
	gbc_label_45.insets = new Insets(0, 0, 5, 5);
	gbc_label_45.gridx = 4;
	gbc_label_45.gridy = 7;
	cpp_workstation8.add(label_45, gbc_label_45);
	
	cptf8_13 = new JTextField();
	cptf8_13.setColumns(10);
	GridBagConstraints gbc_cptf8_13 = new GridBagConstraints();
	gbc_cptf8_13.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf8_13.insets = new Insets(0, 0, 5, 5);
	gbc_cptf8_13.gridx = 5;
	gbc_cptf8_13.gridy = 7;
	cpp_workstation8.add(cptf8_13, gbc_cptf8_13);
	
	JLabel lblX_19 = new JLabel("x1 =");
	GridBagConstraints gbc_lblX_19 = new GridBagConstraints();
	gbc_lblX_19.anchor = GridBagConstraints.EAST;
	gbc_lblX_19.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_19.gridx = 6;
	gbc_lblX_19.gridy = 7;
	cpp_workstation8.add(lblX_19, gbc_lblX_19);
	
	textField_58 = new JTextField();
	textField_58.setColumns(10);
	GridBagConstraints gbc_textField_58 = new GridBagConstraints();
	gbc_textField_58.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_58.insets = new Insets(0, 0, 5, 5);
	gbc_textField_58.gridx = 7;
	gbc_textField_58.gridy = 7;
	cpp_workstation8.add(textField_58, gbc_textField_58);
	
	JLabel label_47 = new JLabel("D");
	GridBagConstraints gbc_label_47 = new GridBagConstraints();
	gbc_label_47.insets = new Insets(0, 0, 5, 5);
	gbc_label_47.gridx = 3;
	gbc_label_47.gridy = 8;
	cpp_workstation8.add(label_47, gbc_label_47);
	
	JLabel label_48 = new JLabel("E14");
	GridBagConstraints gbc_label_48 = new GridBagConstraints();
	gbc_label_48.anchor = GridBagConstraints.EAST;
	gbc_label_48.insets = new Insets(0, 0, 5, 5);
	gbc_label_48.gridx = 4;
	gbc_label_48.gridy = 8;
	cpp_workstation8.add(label_48, gbc_label_48);
	
	cptf8_14 = new JTextField();
	cptf8_14.setColumns(10);
	GridBagConstraints gbc_cptf8_14 = new GridBagConstraints();
	gbc_cptf8_14.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf8_14.insets = new Insets(0, 0, 5, 5);
	gbc_cptf8_14.gridx = 5;
	gbc_cptf8_14.gridy = 8;
	cpp_workstation8.add(cptf8_14, gbc_cptf8_14);
	
	JLabel label_49 = new JLabel("x2 =");
	GridBagConstraints gbc_label_49 = new GridBagConstraints();
	gbc_label_49.anchor = GridBagConstraints.EAST;
	gbc_label_49.insets = new Insets(0, 0, 5, 5);
	gbc_label_49.gridx = 6;
	gbc_label_49.gridy = 8;
	cpp_workstation8.add(label_49, gbc_label_49);
	
	textField_60 = new JTextField();
	textField_60.setColumns(10);
	GridBagConstraints gbc_textField_60 = new GridBagConstraints();
	gbc_textField_60.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_60.insets = new Insets(0, 0, 5, 5);
	gbc_textField_60.gridx = 7;
	gbc_textField_60.gridy = 8;
	cpp_workstation8.add(textField_60, gbc_textField_60);
	
	JLabel label_50 = new JLabel("H");
	GridBagConstraints gbc_label_50 = new GridBagConstraints();
	gbc_label_50.insets = new Insets(0, 0, 5, 5);
	gbc_label_50.gridx = 3;
	gbc_label_50.gridy = 9;
	cpp_workstation8.add(label_50, gbc_label_50);
	
	JLabel label_51 = new JLabel("E15");
	GridBagConstraints gbc_label_51 = new GridBagConstraints();
	gbc_label_51.anchor = GridBagConstraints.EAST;
	gbc_label_51.insets = new Insets(0, 0, 5, 5);
	gbc_label_51.gridx = 4;
	gbc_label_51.gridy = 9;
	cpp_workstation8.add(label_51, gbc_label_51);
	
	cptf8_15 = new JTextField();
	cptf8_15.setColumns(10);
	GridBagConstraints gbc_cptf8_15 = new GridBagConstraints();
	gbc_cptf8_15.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf8_15.insets = new Insets(0, 0, 5, 5);
	gbc_cptf8_15.gridx = 5;
	gbc_cptf8_15.gridy = 9;
	cpp_workstation8.add(cptf8_15, gbc_cptf8_15);
	
	JLabel label_52 = new JLabel("x2 =");
	GridBagConstraints gbc_label_52 = new GridBagConstraints();
	gbc_label_52.anchor = GridBagConstraints.EAST;
	gbc_label_52.insets = new Insets(0, 0, 5, 5);
	gbc_label_52.gridx = 6;
	gbc_label_52.gridy = 9;
	cpp_workstation8.add(label_52, gbc_label_52);
	
	textField_62 = new JTextField();
	textField_62.setColumns(10);
	GridBagConstraints gbc_textField_62 = new GridBagConstraints();
	gbc_textField_62.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_62.insets = new Insets(0, 0, 5, 5);
	gbc_textField_62.gridx = 7;
	gbc_textField_62.gridy = 9;
	cpp_workstation8.add(textField_62, gbc_textField_62);
	
	JLabel label_53 = new JLabel("Rahmen");
	GridBagConstraints gbc_label_53 = new GridBagConstraints();
	gbc_label_53.gridheight = 3;
	gbc_label_53.insets = new Insets(0, 0, 5, 5);
	gbc_label_53.gridx = 1;
	gbc_label_53.gridy = 11;
	cpp_workstation8.add(label_53, gbc_label_53);
	
	JLabel label_54 = new JLabel("K");
	GridBagConstraints gbc_label_54 = new GridBagConstraints();
	gbc_label_54.insets = new Insets(0, 0, 5, 5);
	gbc_label_54.gridx = 3;
	gbc_label_54.gridy = 11;
	cpp_workstation8.add(label_54, gbc_label_54);
	
	JLabel label_55 = new JLabel("E18");
	GridBagConstraints gbc_label_55 = new GridBagConstraints();
	gbc_label_55.anchor = GridBagConstraints.EAST;
	gbc_label_55.insets = new Insets(0, 0, 5, 5);
	gbc_label_55.gridx = 4;
	gbc_label_55.gridy = 11;
	cpp_workstation8.add(label_55, gbc_label_55);
	
	cptf8_18 = new JTextField();
	cptf8_18.setColumns(10);
	GridBagConstraints gbc_cptf8_18 = new GridBagConstraints();
	gbc_cptf8_18.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf8_18.insets = new Insets(0, 0, 5, 5);
	gbc_cptf8_18.gridx = 5;
	gbc_cptf8_18.gridy = 11;
	cpp_workstation8.add(cptf8_18, gbc_cptf8_18);
	
	JLabel lblX_22 = new JLabel("x3 =");
	GridBagConstraints gbc_lblX_22 = new GridBagConstraints();
	gbc_lblX_22.anchor = GridBagConstraints.EAST;
	gbc_lblX_22.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_22.gridx = 6;
	gbc_lblX_22.gridy = 11;
	cpp_workstation8.add(lblX_22, gbc_lblX_22);
	
	textField_64 = new JTextField();
	textField_64.setColumns(10);
	GridBagConstraints gbc_textField_64 = new GridBagConstraints();
	gbc_textField_64.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_64.insets = new Insets(0, 0, 5, 5);
	gbc_textField_64.gridx = 7;
	gbc_textField_64.gridy = 11;
	cpp_workstation8.add(textField_64, gbc_textField_64);
	
	JLabel label_57 = new JLabel("D");
	GridBagConstraints gbc_label_57 = new GridBagConstraints();
	gbc_label_57.insets = new Insets(0, 0, 5, 5);
	gbc_label_57.gridx = 3;
	gbc_label_57.gridy = 12;
	cpp_workstation8.add(label_57, gbc_label_57);
	
	JLabel label_58 = new JLabel("E19");
	GridBagConstraints gbc_label_58 = new GridBagConstraints();
	gbc_label_58.anchor = GridBagConstraints.EAST;
	gbc_label_58.insets = new Insets(0, 0, 5, 5);
	gbc_label_58.gridx = 4;
	gbc_label_58.gridy = 12;
	cpp_workstation8.add(label_58, gbc_label_58);
	
	cptf8_19 = new JTextField();
	cptf8_19.setColumns(10);
	GridBagConstraints gbc_cptf8_19 = new GridBagConstraints();
	gbc_cptf8_19.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf8_19.insets = new Insets(0, 0, 5, 5);
	gbc_cptf8_19.gridx = 5;
	gbc_cptf8_19.gridy = 12;
	cpp_workstation8.add(cptf8_19, gbc_cptf8_19);
	
	JLabel lblX_21 = new JLabel("x3 =");
	GridBagConstraints gbc_lblX_21 = new GridBagConstraints();
	gbc_lblX_21.anchor = GridBagConstraints.EAST;
	gbc_lblX_21.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_21.gridx = 6;
	gbc_lblX_21.gridy = 12;
	cpp_workstation8.add(lblX_21, gbc_lblX_21);
	
	textField_66 = new JTextField();
	textField_66.setColumns(10);
	GridBagConstraints gbc_textField_66 = new GridBagConstraints();
	gbc_textField_66.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_66.insets = new Insets(0, 0, 5, 5);
	gbc_textField_66.gridx = 7;
	gbc_textField_66.gridy = 12;
	cpp_workstation8.add(textField_66, gbc_textField_66);
	
	JLabel label_60 = new JLabel("H");
	GridBagConstraints gbc_label_60 = new GridBagConstraints();
	gbc_label_60.insets = new Insets(0, 0, 5, 5);
	gbc_label_60.gridx = 3;
	gbc_label_60.gridy = 13;
	cpp_workstation8.add(label_60, gbc_label_60);
	
	JLabel label_61 = new JLabel("E20");
	GridBagConstraints gbc_label_61 = new GridBagConstraints();
	gbc_label_61.anchor = GridBagConstraints.EAST;
	gbc_label_61.insets = new Insets(0, 0, 5, 5);
	gbc_label_61.gridx = 4;
	gbc_label_61.gridy = 13;
	cpp_workstation8.add(label_61, gbc_label_61);
	
	cptf8_20 = new JTextField();
	cptf8_20.setColumns(10);
	GridBagConstraints gbc_cptf8_20 = new GridBagConstraints();
	gbc_cptf8_20.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf8_20.insets = new Insets(0, 0, 5, 5);
	gbc_cptf8_20.gridx = 5;
	gbc_cptf8_20.gridy = 13;
	cpp_workstation8.add(cptf8_20, gbc_cptf8_20);
	
	JLabel lblX_20 = new JLabel("x3 =");
	GridBagConstraints gbc_lblX_20 = new GridBagConstraints();
	gbc_lblX_20.anchor = GridBagConstraints.EAST;
	gbc_lblX_20.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_20.gridx = 6;
	gbc_lblX_20.gridy = 13;
	cpp_workstation8.add(lblX_20, gbc_lblX_20);
	
	textField_68 = new JTextField();
	textField_68.setColumns(10);
	GridBagConstraints gbc_textField_68 = new GridBagConstraints();
	gbc_textField_68.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_68.insets = new Insets(0, 0, 5, 5);
	gbc_textField_68.gridx = 7;
	gbc_textField_68.gridy = 13;
	cpp_workstation8.add(textField_68, gbc_textField_68);
	
	JSeparator separator_6 = new JSeparator();
	GridBagConstraints gbc_separator_6 = new GridBagConstraints();
	gbc_separator_6.fill = GridBagConstraints.HORIZONTAL;
	gbc_separator_6.gridwidth = 7;
	gbc_separator_6.insets = new Insets(0, 0, 5, 5);
	gbc_separator_6.gridx = 1;
	gbc_separator_6.gridy = 14;
	cpp_workstation8.add(separator_6, gbc_separator_6);
	
	JLabel label_67 = new JLabel("Kapazit\u00E4tsbedarf ");
	GridBagConstraints gbc_label_67 = new GridBagConstraints();
	gbc_label_67.anchor = GridBagConstraints.WEST;
	gbc_label_67.insets = new Insets(0, 0, 5, 5);
	gbc_label_67.gridx = 1;
	gbc_label_67.gridy = 15;
	cpp_workstation8.add(label_67, gbc_label_67);
	
	textField_71 = new JTextField();
	textField_71.setColumns(10);
	GridBagConstraints gbc_textField_71 = new GridBagConstraints();
	gbc_textField_71.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_71.insets = new Insets(0, 0, 5, 5);
	gbc_textField_71.gridx = 7;
	gbc_textField_71.gridy = 15;
	cpp_workstation8.add(textField_71, gbc_textField_71);
	
	JLabel label_68 = new JLabel("R\u00FCstzeit");
	GridBagConstraints gbc_label_68 = new GridBagConstraints();
	gbc_label_68.anchor = GridBagConstraints.WEST;
	gbc_label_68.insets = new Insets(0, 0, 5, 5);
	gbc_label_68.gridx = 1;
	gbc_label_68.gridy = 16;
	cpp_workstation8.add(label_68, gbc_label_68);
	
	textField_72 = new JTextField();
	textField_72.setColumns(10);
	GridBagConstraints gbc_textField_72 = new GridBagConstraints();
	gbc_textField_72.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_72.insets = new Insets(0, 0, 5, 5);
	gbc_textField_72.gridx = 7;
	gbc_textField_72.gridy = 16;
	cpp_workstation8.add(textField_72, gbc_textField_72);
	
	JLabel label_69 = new JLabel("Totale Kapazit\u00E4t");
	GridBagConstraints gbc_label_69 = new GridBagConstraints();
	gbc_label_69.anchor = GridBagConstraints.WEST;
	gbc_label_69.insets = new Insets(0, 0, 5, 5);
	gbc_label_69.gridx = 1;
	gbc_label_69.gridy = 17;
	cpp_workstation8.add(label_69, gbc_label_69);
	
	textField_73 = new JTextField();
	textField_73.setColumns(10);
	GridBagConstraints gbc_textField_73 = new GridBagConstraints();
	gbc_textField_73.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_73.insets = new Insets(0, 0, 5, 5);
	gbc_textField_73.gridx = 7;
	gbc_textField_73.gridy = 17;
	cpp_workstation8.add(textField_73, gbc_textField_73);
	
	JLabel label_70 = new JLabel("Auslastung %");
	GridBagConstraints gbc_label_70 = new GridBagConstraints();
	gbc_label_70.anchor = GridBagConstraints.WEST;
	gbc_label_70.insets = new Insets(0, 0, 5, 5);
	gbc_label_70.gridx = 1;
	gbc_label_70.gridy = 18;
	cpp_workstation8.add(label_70, gbc_label_70);
	
	textField_74 = new JTextField();
	textField_74.setColumns(10);
	GridBagConstraints gbc_textField_74 = new GridBagConstraints();
	gbc_textField_74.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_74.insets = new Insets(0, 0, 5, 5);
	gbc_textField_74.gridx = 7;
	gbc_textField_74.gridy = 18;
	cpp_workstation8.add(textField_74, gbc_textField_74);
	
	JLabel label_71 = new JLabel("\u00DCberstunden (min) ");
	GridBagConstraints gbc_label_71 = new GridBagConstraints();
	gbc_label_71.anchor = GridBagConstraints.WEST;
	gbc_label_71.insets = new Insets(0, 0, 5, 5);
	gbc_label_71.gridx = 1;
	gbc_label_71.gridy = 19;
	cpp_workstation8.add(label_71, gbc_label_71);
	
	textField_75 = new JTextField();
	textField_75.setColumns(10);
	GridBagConstraints gbc_textField_75 = new GridBagConstraints();
	gbc_textField_75.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_75.insets = new Insets(0, 0, 5, 5);
	gbc_textField_75.gridx = 7;
	gbc_textField_75.gridy = 19;
	cpp_workstation8.add(textField_75, gbc_textField_75);
	
	JPanel cpp_workstation9 = new JPanel();
	JScrollPane cpsp_workstation9 = new JScrollPane(cpp_workstation9);
	cpsp_workstation9.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	cpsp_workstation9.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	capacityplanningPane.addTab("W9", null, cpsp_workstation9, null);
	GridBagLayout gbl_cpp_workstation9 = new GridBagLayout();
	gbl_cpp_workstation9.columnWidths = new int[]{30, 70, 20, 40, 40, 60, 20, 60, 60, 0, 0, 0};
	gbl_cpp_workstation9.rowHeights = new int[] {40, 0, 30, 0, 0, 0, 30, 0, 0, 0, 30, 0, 0, 0, 30, 0, 0, 0, 0, 0, 30, 30, 0};
	gbl_cpp_workstation9.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	gbl_cpp_workstation9.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	cpp_workstation9.setLayout(gbl_cpp_workstation9);
	
	JLabel label_10 = new JLabel("Arbeitsplatz");
	GridBagConstraints gbc_label_10 = new GridBagConstraints();
	gbc_label_10.anchor = GridBagConstraints.WEST;
	gbc_label_10.insets = new Insets(0, 0, 5, 5);
	gbc_label_10.gridx = 1;
	gbc_label_10.gridy = 1;
	cpp_workstation9.add(label_10, gbc_label_10);
	
	JLabel label_11 = new JLabel("9");
	GridBagConstraints gbc_label_11 = new GridBagConstraints();
	gbc_label_11.insets = new Insets(0, 0, 5, 5);
	gbc_label_11.gridx = 2;
	gbc_label_11.gridy = 1;
	cpp_workstation9.add(label_11, gbc_label_11);
	
	JLabel label_19 = new JLabel("Schutzblech hinten");
	GridBagConstraints gbc_label_19 = new GridBagConstraints();
	gbc_label_19.gridheight = 3;
	gbc_label_19.insets = new Insets(0, 0, 5, 5);
	gbc_label_19.gridx = 1;
	gbc_label_19.gridy = 3;
	cpp_workstation9.add(label_19, gbc_label_19);
	
	JLabel label_25 = new JLabel("K");
	GridBagConstraints gbc_label_25 = new GridBagConstraints();
	gbc_label_25.insets = new Insets(0, 0, 5, 5);
	gbc_label_25.gridx = 3;
	gbc_label_25.gridy = 3;
	cpp_workstation9.add(label_25, gbc_label_25);
	
	JLabel label_36 = new JLabel("E10");
	GridBagConstraints gbc_label_36 = new GridBagConstraints();
	gbc_label_36.anchor = GridBagConstraints.EAST;
	gbc_label_36.insets = new Insets(0, 0, 5, 5);
	gbc_label_36.gridx = 4;
	gbc_label_36.gridy = 3;
	cpp_workstation9.add(label_36, gbc_label_36);
	
	cptf9_10 = new JTextField();
	cptf9_10.setColumns(10);
	GridBagConstraints gbc_cptf9_10 = new GridBagConstraints();
	gbc_cptf9_10.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf9_10.insets = new Insets(0, 0, 5, 5);
	gbc_cptf9_10.gridx = 5;
	gbc_cptf9_10.gridy = 3;
	cpp_workstation9.add(cptf9_10, gbc_cptf9_10);
	
	JLabel lblX_23 = new JLabel("x3 =");
	GridBagConstraints gbc_lblX_23 = new GridBagConstraints();
	gbc_lblX_23.anchor = GridBagConstraints.EAST;
	gbc_lblX_23.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_23.gridx = 6;
	gbc_lblX_23.gridy = 3;
	cpp_workstation9.add(lblX_23, gbc_lblX_23);
	
	textField_70 = new JTextField();
	textField_70.setColumns(10);
	GridBagConstraints gbc_textField_70 = new GridBagConstraints();
	gbc_textField_70.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_70.insets = new Insets(0, 0, 5, 5);
	gbc_textField_70.gridx = 7;
	gbc_textField_70.gridy = 3;
	cpp_workstation9.add(textField_70, gbc_textField_70);
	
	JLabel label_56 = new JLabel("D");
	GridBagConstraints gbc_label_56 = new GridBagConstraints();
	gbc_label_56.insets = new Insets(0, 0, 5, 5);
	gbc_label_56.gridx = 3;
	gbc_label_56.gridy = 4;
	cpp_workstation9.add(label_56, gbc_label_56);
	
	JLabel label_59 = new JLabel("E11");
	GridBagConstraints gbc_label_59 = new GridBagConstraints();
	gbc_label_59.anchor = GridBagConstraints.EAST;
	gbc_label_59.insets = new Insets(0, 0, 5, 5);
	gbc_label_59.gridx = 4;
	gbc_label_59.gridy = 4;
	cpp_workstation9.add(label_59, gbc_label_59);
	
	cptf9_11 = new JTextField();
	cptf9_11.setColumns(10);
	GridBagConstraints gbc_cptf9_11 = new GridBagConstraints();
	gbc_cptf9_11.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf9_11.insets = new Insets(0, 0, 5, 5);
	gbc_cptf9_11.gridx = 5;
	gbc_cptf9_11.gridy = 4;
	cpp_workstation9.add(cptf9_11, gbc_cptf9_11);
	
	JLabel lblX_24 = new JLabel("x3 =");
	GridBagConstraints gbc_lblX_24 = new GridBagConstraints();
	gbc_lblX_24.anchor = GridBagConstraints.EAST;
	gbc_lblX_24.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_24.gridx = 6;
	gbc_lblX_24.gridy = 4;
	cpp_workstation9.add(lblX_24, gbc_lblX_24);
	
	textField_77 = new JTextField();
	textField_77.setColumns(10);
	GridBagConstraints gbc_textField_77 = new GridBagConstraints();
	gbc_textField_77.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_77.insets = new Insets(0, 0, 5, 5);
	gbc_textField_77.gridx = 7;
	gbc_textField_77.gridy = 4;
	cpp_workstation9.add(textField_77, gbc_textField_77);
	
	JLabel label_63 = new JLabel("H");
	GridBagConstraints gbc_label_63 = new GridBagConstraints();
	gbc_label_63.insets = new Insets(0, 0, 5, 5);
	gbc_label_63.gridx = 3;
	gbc_label_63.gridy = 5;
	cpp_workstation9.add(label_63, gbc_label_63);
	
	JLabel label_64 = new JLabel("E12");
	GridBagConstraints gbc_label_64 = new GridBagConstraints();
	gbc_label_64.anchor = GridBagConstraints.EAST;
	gbc_label_64.insets = new Insets(0, 0, 5, 5);
	gbc_label_64.gridx = 4;
	gbc_label_64.gridy = 5;
	cpp_workstation9.add(label_64, gbc_label_64);
	
	cptf9_12 = new JTextField();
	cptf9_12.setColumns(10);
	GridBagConstraints gbc_cptf9_12 = new GridBagConstraints();
	gbc_cptf9_12.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf9_12.insets = new Insets(0, 0, 5, 5);
	gbc_cptf9_12.gridx = 5;
	gbc_cptf9_12.gridy = 5;
	cpp_workstation9.add(cptf9_12, gbc_cptf9_12);
	
	JLabel lblX_25 = new JLabel("x3 =");
	GridBagConstraints gbc_lblX_25 = new GridBagConstraints();
	gbc_lblX_25.anchor = GridBagConstraints.EAST;
	gbc_lblX_25.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_25.gridx = 6;
	gbc_lblX_25.gridy = 5;
	cpp_workstation9.add(lblX_25, gbc_lblX_25);
	
	textField_79 = new JTextField();
	textField_79.setColumns(10);
	GridBagConstraints gbc_textField_79 = new GridBagConstraints();
	gbc_textField_79.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_79.insets = new Insets(0, 0, 5, 5);
	gbc_textField_79.gridx = 7;
	gbc_textField_79.gridy = 5;
	cpp_workstation9.add(textField_79, gbc_textField_79);
	
	JLabel label_66 = new JLabel("Schutzblech Vorne");
	GridBagConstraints gbc_label_66 = new GridBagConstraints();
	gbc_label_66.anchor = GridBagConstraints.WEST;
	gbc_label_66.gridheight = 3;
	gbc_label_66.insets = new Insets(0, 0, 5, 5);
	gbc_label_66.gridx = 1;
	gbc_label_66.gridy = 7;
	cpp_workstation9.add(label_66, gbc_label_66);
	
	JLabel label_73 = new JLabel("K");
	GridBagConstraints gbc_label_73 = new GridBagConstraints();
	gbc_label_73.insets = new Insets(0, 0, 5, 5);
	gbc_label_73.gridx = 3;
	gbc_label_73.gridy = 7;
	cpp_workstation9.add(label_73, gbc_label_73);
	
	JLabel label_74 = new JLabel("E13");
	GridBagConstraints gbc_label_74 = new GridBagConstraints();
	gbc_label_74.anchor = GridBagConstraints.EAST;
	gbc_label_74.insets = new Insets(0, 0, 5, 5);
	gbc_label_74.gridx = 4;
	gbc_label_74.gridy = 7;
	cpp_workstation9.add(label_74, gbc_label_74);
	
	cptf9_13 = new JTextField();
	cptf9_13.setColumns(10);
	GridBagConstraints gbc_cptf9_13 = new GridBagConstraints();
	gbc_cptf9_13.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf9_13.insets = new Insets(0, 0, 5, 5);
	gbc_cptf9_13.gridx = 5;
	gbc_cptf9_13.gridy = 7;
	cpp_workstation9.add(cptf9_13, gbc_cptf9_13);
	
	JLabel lblX_26 = new JLabel("x3 =");
	GridBagConstraints gbc_lblX_26 = new GridBagConstraints();
	gbc_lblX_26.anchor = GridBagConstraints.EAST;
	gbc_lblX_26.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_26.gridx = 6;
	gbc_lblX_26.gridy = 7;
	cpp_workstation9.add(lblX_26, gbc_lblX_26);
	
	textField_81 = new JTextField();
	textField_81.setColumns(10);
	GridBagConstraints gbc_textField_81 = new GridBagConstraints();
	gbc_textField_81.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_81.insets = new Insets(0, 0, 5, 5);
	gbc_textField_81.gridx = 7;
	gbc_textField_81.gridy = 7;
	cpp_workstation9.add(textField_81, gbc_textField_81);
	
	JLabel label_77 = new JLabel("D");
	GridBagConstraints gbc_label_77 = new GridBagConstraints();
	gbc_label_77.insets = new Insets(0, 0, 5, 5);
	gbc_label_77.gridx = 3;
	gbc_label_77.gridy = 8;
	cpp_workstation9.add(label_77, gbc_label_77);
	
	JLabel label_78 = new JLabel("E14");
	GridBagConstraints gbc_label_78 = new GridBagConstraints();
	gbc_label_78.anchor = GridBagConstraints.EAST;
	gbc_label_78.insets = new Insets(0, 0, 5, 5);
	gbc_label_78.gridx = 4;
	gbc_label_78.gridy = 8;
	cpp_workstation9.add(label_78, gbc_label_78);
	
	cptf9_14 = new JTextField();
	cptf9_14.setColumns(10);
	GridBagConstraints gbc_cptf9_14 = new GridBagConstraints();
	gbc_cptf9_14.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf9_14.insets = new Insets(0, 0, 5, 5);
	gbc_cptf9_14.gridx = 5;
	gbc_cptf9_14.gridy = 8;
	cpp_workstation9.add(cptf9_14, gbc_cptf9_14);
	
	JLabel lblX_27 = new JLabel("x3 =");
	GridBagConstraints gbc_lblX_27 = new GridBagConstraints();
	gbc_lblX_27.anchor = GridBagConstraints.EAST;
	gbc_lblX_27.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_27.gridx = 6;
	gbc_lblX_27.gridy = 8;
	cpp_workstation9.add(lblX_27, gbc_lblX_27);
	
	textField_94 = new JTextField();
	textField_94.setColumns(10);
	GridBagConstraints gbc_textField_94 = new GridBagConstraints();
	gbc_textField_94.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_94.insets = new Insets(0, 0, 5, 5);
	gbc_textField_94.gridx = 7;
	gbc_textField_94.gridy = 8;
	cpp_workstation9.add(textField_94, gbc_textField_94);
	
	JLabel label_80 = new JLabel("H");
	GridBagConstraints gbc_label_80 = new GridBagConstraints();
	gbc_label_80.insets = new Insets(0, 0, 5, 5);
	gbc_label_80.gridx = 3;
	gbc_label_80.gridy = 9;
	cpp_workstation9.add(label_80, gbc_label_80);
	
	JLabel label_81 = new JLabel("E15");
	GridBagConstraints gbc_label_81 = new GridBagConstraints();
	gbc_label_81.anchor = GridBagConstraints.EAST;
	gbc_label_81.insets = new Insets(0, 0, 5, 5);
	gbc_label_81.gridx = 4;
	gbc_label_81.gridy = 9;
	cpp_workstation9.add(label_81, gbc_label_81);
	
	cptf9_15 = new JTextField();
	cptf9_15.setColumns(10);
	GridBagConstraints gbc_cptf9_15 = new GridBagConstraints();
	gbc_cptf9_15.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf9_15.insets = new Insets(0, 0, 5, 5);
	gbc_cptf9_15.gridx = 5;
	gbc_cptf9_15.gridy = 9;
	cpp_workstation9.add(cptf9_15, gbc_cptf9_15);
	
	JLabel lblX_28 = new JLabel("x3 =");
	GridBagConstraints gbc_lblX_28 = new GridBagConstraints();
	gbc_lblX_28.anchor = GridBagConstraints.EAST;
	gbc_lblX_28.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_28.gridx = 6;
	gbc_lblX_28.gridy = 9;
	cpp_workstation9.add(lblX_28, gbc_lblX_28);
	
	textField_96 = new JTextField();
	textField_96.setColumns(10);
	GridBagConstraints gbc_textField_96 = new GridBagConstraints();
	gbc_textField_96.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_96.insets = new Insets(0, 0, 5, 5);
	gbc_textField_96.gridx = 7;
	gbc_textField_96.gridy = 9;
	cpp_workstation9.add(textField_96, gbc_textField_96);
	
	JLabel label_83 = new JLabel("Rahmen");
	GridBagConstraints gbc_label_83 = new GridBagConstraints();
	gbc_label_83.gridheight = 3;
	gbc_label_83.insets = new Insets(0, 0, 5, 5);
	gbc_label_83.gridx = 1;
	gbc_label_83.gridy = 11;
	cpp_workstation9.add(label_83, gbc_label_83);
	
	JLabel label_84 = new JLabel("K");
	GridBagConstraints gbc_label_84 = new GridBagConstraints();
	gbc_label_84.insets = new Insets(0, 0, 5, 5);
	gbc_label_84.gridx = 3;
	gbc_label_84.gridy = 11;
	cpp_workstation9.add(label_84, gbc_label_84);
	
	JLabel label_85 = new JLabel("E18");
	GridBagConstraints gbc_label_85 = new GridBagConstraints();
	gbc_label_85.anchor = GridBagConstraints.EAST;
	gbc_label_85.insets = new Insets(0, 0, 5, 5);
	gbc_label_85.gridx = 4;
	gbc_label_85.gridy = 11;
	cpp_workstation9.add(label_85, gbc_label_85);
	
	cptf9_18 = new JTextField();
	cptf9_18.setColumns(10);
	GridBagConstraints gbc_cptf9_18 = new GridBagConstraints();
	gbc_cptf9_18.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf9_18.insets = new Insets(0, 0, 5, 5);
	gbc_cptf9_18.gridx = 5;
	gbc_cptf9_18.gridy = 11;
	cpp_workstation9.add(cptf9_18, gbc_cptf9_18);
	
	JLabel lblX_29 = new JLabel("x2 =");
	GridBagConstraints gbc_lblX_29 = new GridBagConstraints();
	gbc_lblX_29.anchor = GridBagConstraints.EAST;
	gbc_lblX_29.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_29.gridx = 6;
	gbc_lblX_29.gridy = 11;
	cpp_workstation9.add(lblX_29, gbc_lblX_29);
	
	textField_98 = new JTextField();
	textField_98.setColumns(10);
	GridBagConstraints gbc_textField_98 = new GridBagConstraints();
	gbc_textField_98.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_98.insets = new Insets(0, 0, 5, 5);
	gbc_textField_98.gridx = 7;
	gbc_textField_98.gridy = 11;
	cpp_workstation9.add(textField_98, gbc_textField_98);
	
	JLabel label_87 = new JLabel("D");
	GridBagConstraints gbc_label_87 = new GridBagConstraints();
	gbc_label_87.insets = new Insets(0, 0, 5, 5);
	gbc_label_87.gridx = 3;
	gbc_label_87.gridy = 12;
	cpp_workstation9.add(label_87, gbc_label_87);
	
	JLabel label_88 = new JLabel("E19");
	GridBagConstraints gbc_label_88 = new GridBagConstraints();
	gbc_label_88.anchor = GridBagConstraints.EAST;
	gbc_label_88.insets = new Insets(0, 0, 5, 5);
	gbc_label_88.gridx = 4;
	gbc_label_88.gridy = 12;
	cpp_workstation9.add(label_88, gbc_label_88);
	
	cptf9_19 = new JTextField();
	cptf9_19.setColumns(10);
	GridBagConstraints gbc_cptf9_19 = new GridBagConstraints();
	gbc_cptf9_19.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf9_19.insets = new Insets(0, 0, 5, 5);
	gbc_cptf9_19.gridx = 5;
	gbc_cptf9_19.gridy = 12;
	cpp_workstation9.add(cptf9_19, gbc_cptf9_19);
	
	JLabel lblX_30 = new JLabel("x2 =");
	GridBagConstraints gbc_lblX_30 = new GridBagConstraints();
	gbc_lblX_30.anchor = GridBagConstraints.EAST;
	gbc_lblX_30.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_30.gridx = 6;
	gbc_lblX_30.gridy = 12;
	cpp_workstation9.add(lblX_30, gbc_lblX_30);
	
	textField_100 = new JTextField();
	textField_100.setColumns(10);
	GridBagConstraints gbc_textField_100 = new GridBagConstraints();
	gbc_textField_100.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_100.insets = new Insets(0, 0, 5, 5);
	gbc_textField_100.gridx = 7;
	gbc_textField_100.gridy = 12;
	cpp_workstation9.add(textField_100, gbc_textField_100);
	
	JLabel label_91 = new JLabel("H");
	GridBagConstraints gbc_label_91 = new GridBagConstraints();
	gbc_label_91.insets = new Insets(0, 0, 5, 5);
	gbc_label_91.gridx = 3;
	gbc_label_91.gridy = 13;
	cpp_workstation9.add(label_91, gbc_label_91);
	
	JLabel label_92 = new JLabel("E20");
	GridBagConstraints gbc_label_92 = new GridBagConstraints();
	gbc_label_92.anchor = GridBagConstraints.EAST;
	gbc_label_92.insets = new Insets(0, 0, 5, 5);
	gbc_label_92.gridx = 4;
	gbc_label_92.gridy = 13;
	cpp_workstation9.add(label_92, gbc_label_92);
	
	cptf9_20 = new JTextField();
	cptf9_20.setColumns(10);
	GridBagConstraints gbc_cptf9_20 = new GridBagConstraints();
	gbc_cptf9_20.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf9_20.insets = new Insets(0, 0, 5, 5);
	gbc_cptf9_20.gridx = 5;
	gbc_cptf9_20.gridy = 13;
	cpp_workstation9.add(cptf9_20, gbc_cptf9_20);
	
	JLabel lblX_31 = new JLabel("x2 =");
	GridBagConstraints gbc_lblX_31 = new GridBagConstraints();
	gbc_lblX_31.anchor = GridBagConstraints.EAST;
	gbc_lblX_31.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_31.gridx = 6;
	gbc_lblX_31.gridy = 13;
	cpp_workstation9.add(lblX_31, gbc_lblX_31);
	
	textField_102 = new JTextField();
	textField_102.setColumns(10);
	GridBagConstraints gbc_textField_102 = new GridBagConstraints();
	gbc_textField_102.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_102.insets = new Insets(0, 0, 5, 5);
	gbc_textField_102.gridx = 7;
	gbc_textField_102.gridy = 13;
	cpp_workstation9.add(textField_102, gbc_textField_102);
	
	JSeparator separator_7 = new JSeparator();
	GridBagConstraints gbc_separator_7 = new GridBagConstraints();
	gbc_separator_7.fill = GridBagConstraints.HORIZONTAL;
	gbc_separator_7.gridwidth = 7;
	gbc_separator_7.insets = new Insets(0, 0, 5, 5);
	gbc_separator_7.gridx = 1;
	gbc_separator_7.gridy = 14;
	cpp_workstation9.add(separator_7, gbc_separator_7);
	
	JLabel label_94 = new JLabel("Kapazit\u00E4tsbedarf ");
	GridBagConstraints gbc_label_94 = new GridBagConstraints();
	gbc_label_94.anchor = GridBagConstraints.WEST;
	gbc_label_94.insets = new Insets(0, 0, 5, 5);
	gbc_label_94.gridx = 1;
	gbc_label_94.gridy = 15;
	cpp_workstation9.add(label_94, gbc_label_94);
	
	textField_103 = new JTextField();
	textField_103.setColumns(10);
	GridBagConstraints gbc_textField_103 = new GridBagConstraints();
	gbc_textField_103.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_103.insets = new Insets(0, 0, 5, 5);
	gbc_textField_103.gridx = 7;
	gbc_textField_103.gridy = 15;
	cpp_workstation9.add(textField_103, gbc_textField_103);
	
	JLabel label_95 = new JLabel("R\u00FCstzeit");
	GridBagConstraints gbc_label_95 = new GridBagConstraints();
	gbc_label_95.anchor = GridBagConstraints.WEST;
	gbc_label_95.insets = new Insets(0, 0, 5, 5);
	gbc_label_95.gridx = 1;
	gbc_label_95.gridy = 16;
	cpp_workstation9.add(label_95, gbc_label_95);
	
	textField_104 = new JTextField();
	textField_104.setColumns(10);
	GridBagConstraints gbc_textField_104 = new GridBagConstraints();
	gbc_textField_104.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_104.insets = new Insets(0, 0, 5, 5);
	gbc_textField_104.gridx = 7;
	gbc_textField_104.gridy = 16;
	cpp_workstation9.add(textField_104, gbc_textField_104);
	
	JLabel label_96 = new JLabel("Totale Kapazit\u00E4t");
	GridBagConstraints gbc_label_96 = new GridBagConstraints();
	gbc_label_96.anchor = GridBagConstraints.WEST;
	gbc_label_96.insets = new Insets(0, 0, 5, 5);
	gbc_label_96.gridx = 1;
	gbc_label_96.gridy = 17;
	cpp_workstation9.add(label_96, gbc_label_96);
	
	textField_105 = new JTextField();
	textField_105.setColumns(10);
	GridBagConstraints gbc_textField_105 = new GridBagConstraints();
	gbc_textField_105.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_105.insets = new Insets(0, 0, 5, 5);
	gbc_textField_105.gridx = 7;
	gbc_textField_105.gridy = 17;
	cpp_workstation9.add(textField_105, gbc_textField_105);
	
	JLabel label_97 = new JLabel("Auslastung %");
	GridBagConstraints gbc_label_97 = new GridBagConstraints();
	gbc_label_97.anchor = GridBagConstraints.WEST;
	gbc_label_97.insets = new Insets(0, 0, 5, 5);
	gbc_label_97.gridx = 1;
	gbc_label_97.gridy = 18;
	cpp_workstation9.add(label_97, gbc_label_97);
	
	textField_106 = new JTextField();
	textField_106.setColumns(10);
	GridBagConstraints gbc_textField_106 = new GridBagConstraints();
	gbc_textField_106.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_106.insets = new Insets(0, 0, 5, 5);
	gbc_textField_106.gridx = 7;
	gbc_textField_106.gridy = 18;
	cpp_workstation9.add(textField_106, gbc_textField_106);
	
	JLabel label_98 = new JLabel("\u00DCberstunden (min) ");
	GridBagConstraints gbc_label_98 = new GridBagConstraints();
	gbc_label_98.anchor = GridBagConstraints.WEST;
	gbc_label_98.insets = new Insets(0, 0, 5, 5);
	gbc_label_98.gridx = 1;
	gbc_label_98.gridy = 19;
	cpp_workstation9.add(label_98, gbc_label_98);
	
	textField_107 = new JTextField();
	textField_107.setColumns(10);
	GridBagConstraints gbc_textField_107 = new GridBagConstraints();
	gbc_textField_107.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_107.insets = new Insets(0, 0, 5, 5);
	gbc_textField_107.gridx = 7;
	gbc_textField_107.gridy = 19;
	cpp_workstation9.add(textField_107, gbc_textField_107);
	
	JPanel cpp_workstation10 = new JPanel();
	JScrollPane cpsp_workstation10 = new JScrollPane(cpp_workstation10);
	cpsp_workstation10.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	cpsp_workstation10.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	capacityplanningPane.addTab("W10", null, cpsp_workstation10, null);
	GridBagLayout gbl_cpp_workstation10 = new GridBagLayout();
	gbl_cpp_workstation10.columnWidths = new int[]{30, 70, 20, 40, 40, 60, 20, 60, 60, 0, 0, 0};
	gbl_cpp_workstation10.rowHeights = new int[]{40, 0, 30, 0, 0, 0, 30, 0, 0, 0, 30, 0, 0, 0, 0, 0, 30, 30, 0};
	gbl_cpp_workstation10.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	gbl_cpp_workstation10.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	cpp_workstation10.setLayout(gbl_cpp_workstation10);
	
	JLabel label_46 = new JLabel("Arbeitsplatz");
	GridBagConstraints gbc_label_46 = new GridBagConstraints();
	gbc_label_46.anchor = GridBagConstraints.WEST;
	gbc_label_46.insets = new Insets(0, 0, 5, 5);
	gbc_label_46.gridx = 1;
	gbc_label_46.gridy = 1;
	cpp_workstation10.add(label_46, gbc_label_46);
	
	JLabel label_62 = new JLabel("10");
	GridBagConstraints gbc_label_62 = new GridBagConstraints();
	gbc_label_62.insets = new Insets(0, 0, 5, 5);
	gbc_label_62.gridx = 2;
	gbc_label_62.gridy = 1;
	cpp_workstation10.add(label_62, gbc_label_62);
	
	JLabel lblHinterrad = new JLabel("Hinterrad");
	GridBagConstraints gbc_lblHinterrad = new GridBagConstraints();
	gbc_lblHinterrad.anchor = GridBagConstraints.WEST;
	gbc_lblHinterrad.gridheight = 3;
	gbc_lblHinterrad.insets = new Insets(0, 0, 5, 5);
	gbc_lblHinterrad.gridx = 1;
	gbc_lblHinterrad.gridy = 3;
	cpp_workstation10.add(lblHinterrad, gbc_lblHinterrad);
	
	JLabel label_76 = new JLabel("K");
	GridBagConstraints gbc_label_76 = new GridBagConstraints();
	gbc_label_76.insets = new Insets(0, 0, 5, 5);
	gbc_label_76.gridx = 3;
	gbc_label_76.gridy = 3;
	cpp_workstation10.add(label_76, gbc_label_76);
	
	JLabel lblE_14 = new JLabel("E4");
	GridBagConstraints gbc_lblE_14 = new GridBagConstraints();
	gbc_lblE_14.anchor = GridBagConstraints.EAST;
	gbc_lblE_14.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_14.gridx = 4;
	gbc_lblE_14.gridy = 3;
	cpp_workstation10.add(lblE_14, gbc_lblE_14);
	
	cptf10_4 = new JTextField();
	cptf10_4.setColumns(10);
	GridBagConstraints gbc_cptf10_4 = new GridBagConstraints();
	gbc_cptf10_4.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf10_4.insets = new Insets(0, 0, 5, 5);
	gbc_cptf10_4.gridx = 5;
	gbc_cptf10_4.gridy = 3;
	cpp_workstation10.add(cptf10_4, gbc_cptf10_4);
	
	JLabel lblX_32 = new JLabel("x4 =");
	GridBagConstraints gbc_lblX_32 = new GridBagConstraints();
	gbc_lblX_32.anchor = GridBagConstraints.EAST;
	gbc_lblX_32.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_32.gridx = 6;
	gbc_lblX_32.gridy = 3;
	cpp_workstation10.add(lblX_32, gbc_lblX_32);
	
	textField_109 = new JTextField();
	textField_109.setColumns(10);
	GridBagConstraints gbc_textField_109 = new GridBagConstraints();
	gbc_textField_109.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_109.insets = new Insets(0, 0, 5, 5);
	gbc_textField_109.gridx = 7;
	gbc_textField_109.gridy = 3;
	cpp_workstation10.add(textField_109, gbc_textField_109);
	
	JLabel label_86 = new JLabel("D");
	GridBagConstraints gbc_label_86 = new GridBagConstraints();
	gbc_label_86.insets = new Insets(0, 0, 5, 5);
	gbc_label_86.gridx = 3;
	gbc_label_86.gridy = 4;
	cpp_workstation10.add(label_86, gbc_label_86);
	
	JLabel lblE_15 = new JLabel("E5");
	GridBagConstraints gbc_lblE_15 = new GridBagConstraints();
	gbc_lblE_15.anchor = GridBagConstraints.EAST;
	gbc_lblE_15.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_15.gridx = 4;
	gbc_lblE_15.gridy = 4;
	cpp_workstation10.add(lblE_15, gbc_lblE_15);
	
	cptf10_5 = new JTextField();
	cptf10_5.setColumns(10);
	GridBagConstraints gbc_cptf10_5 = new GridBagConstraints();
	gbc_cptf10_5.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf10_5.insets = new Insets(0, 0, 5, 5);
	gbc_cptf10_5.gridx = 5;
	gbc_cptf10_5.gridy = 4;
	cpp_workstation10.add(cptf10_5, gbc_cptf10_5);
	
	JLabel label_65 = new JLabel("x4 =");
	GridBagConstraints gbc_label_65 = new GridBagConstraints();
	gbc_label_65.insets = new Insets(0, 0, 5, 5);
	gbc_label_65.anchor = GridBagConstraints.EAST;
	gbc_label_65.gridx = 6;
	gbc_label_65.gridy = 4;
	cpp_workstation10.add(label_65, gbc_label_65);
	
	textField_111 = new JTextField();
	textField_111.setColumns(10);
	GridBagConstraints gbc_textField_111 = new GridBagConstraints();
	gbc_textField_111.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_111.insets = new Insets(0, 0, 5, 5);
	gbc_textField_111.gridx = 7;
	gbc_textField_111.gridy = 4;
	cpp_workstation10.add(textField_111, gbc_textField_111);
	
	JLabel label_99 = new JLabel("H");
	GridBagConstraints gbc_label_99 = new GridBagConstraints();
	gbc_label_99.insets = new Insets(0, 0, 5, 5);
	gbc_label_99.gridx = 3;
	gbc_label_99.gridy = 5;
	cpp_workstation10.add(label_99, gbc_label_99);
	
	JLabel lblE_16 = new JLabel("E6");
	GridBagConstraints gbc_lblE_16 = new GridBagConstraints();
	gbc_lblE_16.anchor = GridBagConstraints.EAST;
	gbc_lblE_16.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_16.gridx = 4;
	gbc_lblE_16.gridy = 5;
	cpp_workstation10.add(lblE_16, gbc_lblE_16);
	
	cptf10_6 = new JTextField();
	cptf10_6.setColumns(10);
	GridBagConstraints gbc_cptf10_6 = new GridBagConstraints();
	gbc_cptf10_6.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf10_6.insets = new Insets(0, 0, 5, 5);
	gbc_cptf10_6.gridx = 5;
	gbc_cptf10_6.gridy = 5;
	cpp_workstation10.add(cptf10_6, gbc_cptf10_6);
	
	JLabel label_79 = new JLabel("x4 =");
	GridBagConstraints gbc_label_79 = new GridBagConstraints();
	gbc_label_79.insets = new Insets(0, 0, 5, 5);
	gbc_label_79.anchor = GridBagConstraints.EAST;
	gbc_label_79.gridx = 6;
	gbc_label_79.gridy = 5;
	cpp_workstation10.add(label_79, gbc_label_79);
	
	textField_113 = new JTextField();
	textField_113.setColumns(10);
	GridBagConstraints gbc_textField_113 = new GridBagConstraints();
	gbc_textField_113.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_113.insets = new Insets(0, 0, 5, 5);
	gbc_textField_113.gridx = 7;
	gbc_textField_113.gridy = 5;
	cpp_workstation10.add(textField_113, gbc_textField_113);
	
	JLabel lblVorderrad = new JLabel("Vorderrad");
	GridBagConstraints gbc_lblVorderrad = new GridBagConstraints();
	gbc_lblVorderrad.anchor = GridBagConstraints.WEST;
	gbc_lblVorderrad.gridheight = 3;
	gbc_lblVorderrad.insets = new Insets(0, 0, 5, 5);
	gbc_lblVorderrad.gridx = 1;
	gbc_lblVorderrad.gridy = 7;
	cpp_workstation10.add(lblVorderrad, gbc_lblVorderrad);
	
	JLabel label_103 = new JLabel("K");
	GridBagConstraints gbc_label_103 = new GridBagConstraints();
	gbc_label_103.insets = new Insets(0, 0, 5, 5);
	gbc_label_103.gridx = 3;
	gbc_label_103.gridy = 7;
	cpp_workstation10.add(label_103, gbc_label_103);
	
	JLabel lblE_17 = new JLabel("E7");
	GridBagConstraints gbc_lblE_17 = new GridBagConstraints();
	gbc_lblE_17.anchor = GridBagConstraints.EAST;
	gbc_lblE_17.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_17.gridx = 4;
	gbc_lblE_17.gridy = 7;
	cpp_workstation10.add(lblE_17, gbc_lblE_17);
	
	cptf10_7 = new JTextField();
	cptf10_7.setColumns(10);
	GridBagConstraints gbc_cptf10_7 = new GridBagConstraints();
	gbc_cptf10_7.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf10_7.insets = new Insets(0, 0, 5, 5);
	gbc_cptf10_7.gridx = 5;
	gbc_cptf10_7.gridy = 7;
	cpp_workstation10.add(cptf10_7, gbc_cptf10_7);
	
	JLabel label_82 = new JLabel("x4 =");
	GridBagConstraints gbc_label_82 = new GridBagConstraints();
	gbc_label_82.insets = new Insets(0, 0, 5, 5);
	gbc_label_82.anchor = GridBagConstraints.EAST;
	gbc_label_82.gridx = 6;
	gbc_label_82.gridy = 7;
	cpp_workstation10.add(label_82, gbc_label_82);
	
	textField_115 = new JTextField();
	textField_115.setColumns(10);
	GridBagConstraints gbc_textField_115 = new GridBagConstraints();
	gbc_textField_115.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_115.insets = new Insets(0, 0, 5, 5);
	gbc_textField_115.gridx = 7;
	gbc_textField_115.gridy = 7;
	cpp_workstation10.add(textField_115, gbc_textField_115);
	
	JLabel label_106 = new JLabel("D");
	GridBagConstraints gbc_label_106 = new GridBagConstraints();
	gbc_label_106.insets = new Insets(0, 0, 5, 5);
	gbc_label_106.gridx = 3;
	gbc_label_106.gridy = 8;
	cpp_workstation10.add(label_106, gbc_label_106);
	
	JLabel lblE_18 = new JLabel("E8");
	GridBagConstraints gbc_lblE_18 = new GridBagConstraints();
	gbc_lblE_18.anchor = GridBagConstraints.EAST;
	gbc_lblE_18.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_18.gridx = 4;
	gbc_lblE_18.gridy = 8;
	cpp_workstation10.add(lblE_18, gbc_lblE_18);
	
	cptf10_8 = new JTextField();
	cptf10_8.setColumns(10);
	GridBagConstraints gbc_cptf10_8 = new GridBagConstraints();
	gbc_cptf10_8.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf10_8.insets = new Insets(0, 0, 5, 5);
	gbc_cptf10_8.gridx = 5;
	gbc_cptf10_8.gridy = 8;
	cpp_workstation10.add(cptf10_8, gbc_cptf10_8);
	
	JLabel label_90 = new JLabel("x4 =");
	GridBagConstraints gbc_label_90 = new GridBagConstraints();
	gbc_label_90.insets = new Insets(0, 0, 5, 5);
	gbc_label_90.anchor = GridBagConstraints.EAST;
	gbc_label_90.gridx = 6;
	gbc_label_90.gridy = 8;
	cpp_workstation10.add(label_90, gbc_label_90);
	
	textField_117 = new JTextField();
	textField_117.setColumns(10);
	GridBagConstraints gbc_textField_117 = new GridBagConstraints();
	gbc_textField_117.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_117.insets = new Insets(0, 0, 5, 5);
	gbc_textField_117.gridx = 7;
	gbc_textField_117.gridy = 8;
	cpp_workstation10.add(textField_117, gbc_textField_117);
	
	JLabel label_109 = new JLabel("H");
	GridBagConstraints gbc_label_109 = new GridBagConstraints();
	gbc_label_109.insets = new Insets(0, 0, 5, 5);
	gbc_label_109.gridx = 3;
	gbc_label_109.gridy = 9;
	cpp_workstation10.add(label_109, gbc_label_109);
	
	JLabel lblE_19 = new JLabel("E9");
	GridBagConstraints gbc_lblE_19 = new GridBagConstraints();
	gbc_lblE_19.anchor = GridBagConstraints.EAST;
	gbc_lblE_19.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_19.gridx = 4;
	gbc_lblE_19.gridy = 9;
	cpp_workstation10.add(lblE_19, gbc_lblE_19);
	
	cptf10_9 = new JTextField();
	cptf10_9.setColumns(10);
	GridBagConstraints gbc_cptf10_9 = new GridBagConstraints();
	gbc_cptf10_9.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf10_9.insets = new Insets(0, 0, 5, 5);
	gbc_cptf10_9.gridx = 5;
	gbc_cptf10_9.gridy = 9;
	cpp_workstation10.add(cptf10_9, gbc_cptf10_9);
	
	JLabel label_93 = new JLabel("x4 =");
	GridBagConstraints gbc_label_93 = new GridBagConstraints();
	gbc_label_93.insets = new Insets(0, 0, 5, 5);
	gbc_label_93.anchor = GridBagConstraints.EAST;
	gbc_label_93.gridx = 6;
	gbc_label_93.gridy = 9;
	cpp_workstation10.add(label_93, gbc_label_93);
	
	textField_119 = new JTextField();
	textField_119.setColumns(10);
	GridBagConstraints gbc_textField_119 = new GridBagConstraints();
	gbc_textField_119.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_119.insets = new Insets(0, 0, 5, 5);
	gbc_textField_119.gridx = 7;
	gbc_textField_119.gridy = 9;
	cpp_workstation10.add(textField_119, gbc_textField_119);
	
	JSeparator separator_8 = new JSeparator();
	GridBagConstraints gbc_separator_8 = new GridBagConstraints();
	gbc_separator_8.fill = GridBagConstraints.HORIZONTAL;
	gbc_separator_8.gridwidth = 7;
	gbc_separator_8.insets = new Insets(0, 0, 5, 5);
	gbc_separator_8.gridx = 1;
	gbc_separator_8.gridy = 10;
	cpp_workstation10.add(separator_8, gbc_separator_8);
	
	JLabel label_122 = new JLabel("Kapazit\u00E4tsbedarf ");
	GridBagConstraints gbc_label_122 = new GridBagConstraints();
	gbc_label_122.anchor = GridBagConstraints.WEST;
	gbc_label_122.insets = new Insets(0, 0, 5, 5);
	gbc_label_122.gridx = 1;
	gbc_label_122.gridy = 11;
	cpp_workstation10.add(label_122, gbc_label_122);
	
	textField_126 = new JTextField();
	textField_126.setColumns(10);
	GridBagConstraints gbc_textField_126 = new GridBagConstraints();
	gbc_textField_126.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_126.insets = new Insets(0, 0, 5, 5);
	gbc_textField_126.gridx = 7;
	gbc_textField_126.gridy = 11;
	cpp_workstation10.add(textField_126, gbc_textField_126);
	
	JLabel label_123 = new JLabel("R\u00FCstzeit");
	GridBagConstraints gbc_label_123 = new GridBagConstraints();
	gbc_label_123.anchor = GridBagConstraints.WEST;
	gbc_label_123.insets = new Insets(0, 0, 5, 5);
	gbc_label_123.gridx = 1;
	gbc_label_123.gridy = 12;
	cpp_workstation10.add(label_123, gbc_label_123);
	
	textField_127 = new JTextField();
	textField_127.setColumns(10);
	GridBagConstraints gbc_textField_127 = new GridBagConstraints();
	gbc_textField_127.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_127.insets = new Insets(0, 0, 5, 5);
	gbc_textField_127.gridx = 7;
	gbc_textField_127.gridy = 12;
	cpp_workstation10.add(textField_127, gbc_textField_127);
	
	JLabel label_124 = new JLabel("Totale Kapazit\u00E4t");
	GridBagConstraints gbc_label_124 = new GridBagConstraints();
	gbc_label_124.anchor = GridBagConstraints.WEST;
	gbc_label_124.insets = new Insets(0, 0, 5, 5);
	gbc_label_124.gridx = 1;
	gbc_label_124.gridy = 13;
	cpp_workstation10.add(label_124, gbc_label_124);
	
	textField_128 = new JTextField();
	textField_128.setColumns(10);
	GridBagConstraints gbc_textField_128 = new GridBagConstraints();
	gbc_textField_128.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_128.insets = new Insets(0, 0, 5, 5);
	gbc_textField_128.gridx = 7;
	gbc_textField_128.gridy = 13;
	cpp_workstation10.add(textField_128, gbc_textField_128);
	
	JLabel label_125 = new JLabel("Auslastung %");
	GridBagConstraints gbc_label_125 = new GridBagConstraints();
	gbc_label_125.anchor = GridBagConstraints.WEST;
	gbc_label_125.insets = new Insets(0, 0, 5, 5);
	gbc_label_125.gridx = 1;
	gbc_label_125.gridy = 14;
	cpp_workstation10.add(label_125, gbc_label_125);
	
	textField_129 = new JTextField();
	textField_129.setColumns(10);
	GridBagConstraints gbc_textField_129 = new GridBagConstraints();
	gbc_textField_129.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_129.insets = new Insets(0, 0, 5, 5);
	gbc_textField_129.gridx = 7;
	gbc_textField_129.gridy = 14;
	cpp_workstation10.add(textField_129, gbc_textField_129);
	
	JLabel label_126 = new JLabel("\u00DCberstunden (min) ");
	GridBagConstraints gbc_label_126 = new GridBagConstraints();
	gbc_label_126.anchor = GridBagConstraints.WEST;
	gbc_label_126.insets = new Insets(0, 0, 5, 5);
	gbc_label_126.gridx = 1;
	gbc_label_126.gridy = 15;
	cpp_workstation10.add(label_126, gbc_label_126);
	
	textField_130 = new JTextField();
	textField_130.setColumns(10);
	GridBagConstraints gbc_textField_130 = new GridBagConstraints();
	gbc_textField_130.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_130.insets = new Insets(0, 0, 5, 5);
	gbc_textField_130.gridx = 7;
	gbc_textField_130.gridy = 15;
	cpp_workstation10.add(textField_130, gbc_textField_130);
	
	JPanel cpp_workstation11 = new JPanel();
	JScrollPane cpsp_workstation11 = new JScrollPane(cpp_workstation11);
	cpsp_workstation11.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	cpsp_workstation11.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	capacityplanningPane.addTab("W11", null, cpsp_workstation11, null);
	GridBagLayout gbl_cpp_workstation11 = new GridBagLayout();
	gbl_cpp_workstation11.columnWidths = new int[]{30, 70, 20, 40, 40, 60, 20, 60, 60, 0, 0, 0};
	gbl_cpp_workstation11.rowHeights = new int[]{40, 0, 30, 0, 0, 0, 30, 0, 0, 0, 30, 0, 0, 0, 0, 0, 30, 30, 0};
	gbl_cpp_workstation11.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	gbl_cpp_workstation11.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	cpp_workstation11.setLayout(gbl_cpp_workstation11);
	
	JLabel label_127 = new JLabel("Arbeitsplatz");
	GridBagConstraints gbc_label_127 = new GridBagConstraints();
	gbc_label_127.anchor = GridBagConstraints.WEST;
	gbc_label_127.insets = new Insets(0, 0, 5, 5);
	gbc_label_127.gridx = 1;
	gbc_label_127.gridy = 1;
	cpp_workstation11.add(label_127, gbc_label_127);
	
	JLabel label_128 = new JLabel("11");
	GridBagConstraints gbc_label_128 = new GridBagConstraints();
	gbc_label_128.insets = new Insets(0, 0, 5, 5);
	gbc_label_128.gridx = 2;
	gbc_label_128.gridy = 1;
	cpp_workstation11.add(label_128, gbc_label_128);
	
	JLabel lblHinterrad_1 = new JLabel("Hinterrad");
	GridBagConstraints gbc_lblHinterrad_1 = new GridBagConstraints();
	gbc_lblHinterrad_1.anchor = GridBagConstraints.WEST;
	gbc_lblHinterrad_1.gridheight = 3;
	gbc_lblHinterrad_1.insets = new Insets(0, 0, 5, 5);
	gbc_lblHinterrad_1.gridx = 1;
	gbc_lblHinterrad_1.gridy = 3;
	cpp_workstation11.add(lblHinterrad_1, gbc_lblHinterrad_1);
	
	JLabel label_130 = new JLabel("K");
	GridBagConstraints gbc_label_130 = new GridBagConstraints();
	gbc_label_130.insets = new Insets(0, 0, 5, 5);
	gbc_label_130.gridx = 3;
	gbc_label_130.gridy = 3;
	cpp_workstation11.add(label_130, gbc_label_130);
	
	JLabel lblE_20 = new JLabel("E4");
	GridBagConstraints gbc_lblE_20 = new GridBagConstraints();
	gbc_lblE_20.anchor = GridBagConstraints.EAST;
	gbc_lblE_20.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_20.gridx = 4;
	gbc_lblE_20.gridy = 3;
	cpp_workstation11.add(lblE_20, gbc_lblE_20);
	
	cptf11_4 = new JTextField();
	cptf11_4.setColumns(10);
	GridBagConstraints gbc_cptf11_4 = new GridBagConstraints();
	gbc_cptf11_4.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf11_4.insets = new Insets(0, 0, 5, 5);
	gbc_cptf11_4.gridx = 5;
	gbc_cptf11_4.gridy = 3;
	cpp_workstation11.add(cptf11_4, gbc_cptf11_4);
	
	JLabel label_132 = new JLabel("x3 =");
	GridBagConstraints gbc_label_132 = new GridBagConstraints();
	gbc_label_132.anchor = GridBagConstraints.EAST;
	gbc_label_132.insets = new Insets(0, 0, 5, 5);
	gbc_label_132.gridx = 6;
	gbc_label_132.gridy = 3;
	cpp_workstation11.add(label_132, gbc_label_132);
	
	textField_132 = new JTextField();
	textField_132.setColumns(10);
	GridBagConstraints gbc_textField_132 = new GridBagConstraints();
	gbc_textField_132.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_132.insets = new Insets(0, 0, 5, 5);
	gbc_textField_132.gridx = 7;
	gbc_textField_132.gridy = 3;
	cpp_workstation11.add(textField_132, gbc_textField_132);
	
	JLabel label_133 = new JLabel("D");
	GridBagConstraints gbc_label_133 = new GridBagConstraints();
	gbc_label_133.insets = new Insets(0, 0, 5, 5);
	gbc_label_133.gridx = 3;
	gbc_label_133.gridy = 4;
	cpp_workstation11.add(label_133, gbc_label_133);
	
	JLabel lblE_21 = new JLabel("E5");
	GridBagConstraints gbc_lblE_21 = new GridBagConstraints();
	gbc_lblE_21.anchor = GridBagConstraints.EAST;
	gbc_lblE_21.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_21.gridx = 4;
	gbc_lblE_21.gridy = 4;
	cpp_workstation11.add(lblE_21, gbc_lblE_21);
	
	cptf11_5 = new JTextField();
	cptf11_5.setColumns(10);
	GridBagConstraints gbc_cptf11_5 = new GridBagConstraints();
	gbc_cptf11_5.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf11_5.insets = new Insets(0, 0, 5, 5);
	gbc_cptf11_5.gridx = 5;
	gbc_cptf11_5.gridy = 4;
	cpp_workstation11.add(cptf11_5, gbc_cptf11_5);
	
	JLabel label_135 = new JLabel("x3 =");
	GridBagConstraints gbc_label_135 = new GridBagConstraints();
	gbc_label_135.anchor = GridBagConstraints.EAST;
	gbc_label_135.insets = new Insets(0, 0, 5, 5);
	gbc_label_135.gridx = 6;
	gbc_label_135.gridy = 4;
	cpp_workstation11.add(label_135, gbc_label_135);
	
	textField_134 = new JTextField();
	textField_134.setColumns(10);
	GridBagConstraints gbc_textField_134 = new GridBagConstraints();
	gbc_textField_134.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_134.insets = new Insets(0, 0, 5, 5);
	gbc_textField_134.gridx = 7;
	gbc_textField_134.gridy = 4;
	cpp_workstation11.add(textField_134, gbc_textField_134);
	
	JLabel label_136 = new JLabel("H");
	GridBagConstraints gbc_label_136 = new GridBagConstraints();
	gbc_label_136.insets = new Insets(0, 0, 5, 5);
	gbc_label_136.gridx = 3;
	gbc_label_136.gridy = 5;
	cpp_workstation11.add(label_136, gbc_label_136);
	
	JLabel lblE_22 = new JLabel("E6");
	GridBagConstraints gbc_lblE_22 = new GridBagConstraints();
	gbc_lblE_22.anchor = GridBagConstraints.EAST;
	gbc_lblE_22.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_22.gridx = 4;
	gbc_lblE_22.gridy = 5;
	cpp_workstation11.add(lblE_22, gbc_lblE_22);
	
	cptf11_6 = new JTextField();
	cptf11_6.setColumns(10);
	GridBagConstraints gbc_cptf11_6 = new GridBagConstraints();
	gbc_cptf11_6.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf11_6.insets = new Insets(0, 0, 5, 5);
	gbc_cptf11_6.gridx = 5;
	gbc_cptf11_6.gridy = 5;
	cpp_workstation11.add(cptf11_6, gbc_cptf11_6);
	
	JLabel label_138 = new JLabel("x3 =");
	GridBagConstraints gbc_label_138 = new GridBagConstraints();
	gbc_label_138.anchor = GridBagConstraints.EAST;
	gbc_label_138.insets = new Insets(0, 0, 5, 5);
	gbc_label_138.gridx = 6;
	gbc_label_138.gridy = 5;
	cpp_workstation11.add(label_138, gbc_label_138);
	
	textField_136 = new JTextField();
	textField_136.setColumns(10);
	GridBagConstraints gbc_textField_136 = new GridBagConstraints();
	gbc_textField_136.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_136.insets = new Insets(0, 0, 5, 5);
	gbc_textField_136.gridx = 7;
	gbc_textField_136.gridy = 5;
	cpp_workstation11.add(textField_136, gbc_textField_136);
	
	JLabel lblVorderrad_1 = new JLabel("Vorderrad");
	GridBagConstraints gbc_lblVorderrad_1 = new GridBagConstraints();
	gbc_lblVorderrad_1.anchor = GridBagConstraints.WEST;
	gbc_lblVorderrad_1.gridheight = 3;
	gbc_lblVorderrad_1.insets = new Insets(0, 0, 5, 5);
	gbc_lblVorderrad_1.gridx = 1;
	gbc_lblVorderrad_1.gridy = 7;
	cpp_workstation11.add(lblVorderrad_1, gbc_lblVorderrad_1);
	
	JLabel label_140 = new JLabel("K");
	GridBagConstraints gbc_label_140 = new GridBagConstraints();
	gbc_label_140.insets = new Insets(0, 0, 5, 5);
	gbc_label_140.gridx = 3;
	gbc_label_140.gridy = 7;
	cpp_workstation11.add(label_140, gbc_label_140);
	
	JLabel lblE_23 = new JLabel("E7");
	GridBagConstraints gbc_lblE_23 = new GridBagConstraints();
	gbc_lblE_23.anchor = GridBagConstraints.EAST;
	gbc_lblE_23.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_23.gridx = 4;
	gbc_lblE_23.gridy = 7;
	cpp_workstation11.add(lblE_23, gbc_lblE_23);
	
	cptf11_7 = new JTextField();
	cptf11_7.setColumns(10);
	GridBagConstraints gbc_cptf11_7 = new GridBagConstraints();
	gbc_cptf11_7.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf11_7.insets = new Insets(0, 0, 5, 5);
	gbc_cptf11_7.gridx = 5;
	gbc_cptf11_7.gridy = 7;
	cpp_workstation11.add(cptf11_7, gbc_cptf11_7);
	
	JLabel label_142 = new JLabel("x3 =");
	GridBagConstraints gbc_label_142 = new GridBagConstraints();
	gbc_label_142.anchor = GridBagConstraints.EAST;
	gbc_label_142.insets = new Insets(0, 0, 5, 5);
	gbc_label_142.gridx = 6;
	gbc_label_142.gridy = 7;
	cpp_workstation11.add(label_142, gbc_label_142);
	
	textField_138 = new JTextField();
	textField_138.setColumns(10);
	GridBagConstraints gbc_textField_138 = new GridBagConstraints();
	gbc_textField_138.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_138.insets = new Insets(0, 0, 5, 5);
	gbc_textField_138.gridx = 7;
	gbc_textField_138.gridy = 7;
	cpp_workstation11.add(textField_138, gbc_textField_138);
	
	JLabel label_143 = new JLabel("D");
	GridBagConstraints gbc_label_143 = new GridBagConstraints();
	gbc_label_143.insets = new Insets(0, 0, 5, 5);
	gbc_label_143.gridx = 3;
	gbc_label_143.gridy = 8;
	cpp_workstation11.add(label_143, gbc_label_143);
	
	JLabel lblE_24 = new JLabel("E8");
	GridBagConstraints gbc_lblE_24 = new GridBagConstraints();
	gbc_lblE_24.anchor = GridBagConstraints.EAST;
	gbc_lblE_24.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_24.gridx = 4;
	gbc_lblE_24.gridy = 8;
	cpp_workstation11.add(lblE_24, gbc_lblE_24);
	
	cptf11_8 = new JTextField();
	cptf11_8.setColumns(10);
	GridBagConstraints gbc_cptf11_8 = new GridBagConstraints();
	gbc_cptf11_8.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf11_8.insets = new Insets(0, 0, 5, 5);
	gbc_cptf11_8.gridx = 5;
	gbc_cptf11_8.gridy = 8;
	cpp_workstation11.add(cptf11_8, gbc_cptf11_8);
	
	JLabel label_145 = new JLabel("x3 =");
	GridBagConstraints gbc_label_145 = new GridBagConstraints();
	gbc_label_145.anchor = GridBagConstraints.EAST;
	gbc_label_145.insets = new Insets(0, 0, 5, 5);
	gbc_label_145.gridx = 6;
	gbc_label_145.gridy = 8;
	cpp_workstation11.add(label_145, gbc_label_145);
	
	textField_140 = new JTextField();
	textField_140.setColumns(10);
	GridBagConstraints gbc_textField_140 = new GridBagConstraints();
	gbc_textField_140.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_140.insets = new Insets(0, 0, 5, 5);
	gbc_textField_140.gridx = 7;
	gbc_textField_140.gridy = 8;
	cpp_workstation11.add(textField_140, gbc_textField_140);
	
	JLabel label_146 = new JLabel("H");
	GridBagConstraints gbc_label_146 = new GridBagConstraints();
	gbc_label_146.insets = new Insets(0, 0, 5, 5);
	gbc_label_146.gridx = 3;
	gbc_label_146.gridy = 9;
	cpp_workstation11.add(label_146, gbc_label_146);
	
	JLabel lblE_25 = new JLabel("E9");
	GridBagConstraints gbc_lblE_25 = new GridBagConstraints();
	gbc_lblE_25.anchor = GridBagConstraints.EAST;
	gbc_lblE_25.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_25.gridx = 4;
	gbc_lblE_25.gridy = 9;
	cpp_workstation11.add(lblE_25, gbc_lblE_25);
	
	cptf11_9 = new JTextField();
	cptf11_9.setColumns(10);
	GridBagConstraints gbc_cptf11_9 = new GridBagConstraints();
	gbc_cptf11_9.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf11_9.insets = new Insets(0, 0, 5, 5);
	gbc_cptf11_9.gridx = 5;
	gbc_cptf11_9.gridy = 9;
	cpp_workstation11.add(cptf11_9, gbc_cptf11_9);
	
	JLabel label_148 = new JLabel("x3 =");
	GridBagConstraints gbc_label_148 = new GridBagConstraints();
	gbc_label_148.anchor = GridBagConstraints.EAST;
	gbc_label_148.insets = new Insets(0, 0, 5, 5);
	gbc_label_148.gridx = 6;
	gbc_label_148.gridy = 9;
	cpp_workstation11.add(label_148, gbc_label_148);
	
	textField_142 = new JTextField();
	textField_142.setColumns(10);
	GridBagConstraints gbc_textField_142 = new GridBagConstraints();
	gbc_textField_142.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_142.insets = new Insets(0, 0, 5, 5);
	gbc_textField_142.gridx = 7;
	gbc_textField_142.gridy = 9;
	cpp_workstation11.add(textField_142, gbc_textField_142);
	
	JSeparator separator_9 = new JSeparator();
	GridBagConstraints gbc_separator_9 = new GridBagConstraints();
	gbc_separator_9.fill = GridBagConstraints.HORIZONTAL;
	gbc_separator_9.gridwidth = 7;
	gbc_separator_9.insets = new Insets(0, 0, 5, 5);
	gbc_separator_9.gridx = 1;
	gbc_separator_9.gridy = 10;
	cpp_workstation11.add(separator_9, gbc_separator_9);
	
	JLabel label_159 = new JLabel("Kapazit\u00E4tsbedarf ");
	GridBagConstraints gbc_label_159 = new GridBagConstraints();
	gbc_label_159.anchor = GridBagConstraints.WEST;
	gbc_label_159.insets = new Insets(0, 0, 5, 5);
	gbc_label_159.gridx = 1;
	gbc_label_159.gridy = 11;
	cpp_workstation11.add(label_159, gbc_label_159);
	
	textField_149 = new JTextField();
	textField_149.setColumns(10);
	GridBagConstraints gbc_textField_149 = new GridBagConstraints();
	gbc_textField_149.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_149.insets = new Insets(0, 0, 5, 5);
	gbc_textField_149.gridx = 7;
	gbc_textField_149.gridy = 11;
	cpp_workstation11.add(textField_149, gbc_textField_149);
	
	JLabel label_160 = new JLabel("R\u00FCstzeit");
	GridBagConstraints gbc_label_160 = new GridBagConstraints();
	gbc_label_160.anchor = GridBagConstraints.WEST;
	gbc_label_160.insets = new Insets(0, 0, 5, 5);
	gbc_label_160.gridx = 1;
	gbc_label_160.gridy = 12;
	cpp_workstation11.add(label_160, gbc_label_160);
	
	textField_150 = new JTextField();
	textField_150.setColumns(10);
	GridBagConstraints gbc_textField_150 = new GridBagConstraints();
	gbc_textField_150.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_150.insets = new Insets(0, 0, 5, 5);
	gbc_textField_150.gridx = 7;
	gbc_textField_150.gridy = 12;
	cpp_workstation11.add(textField_150, gbc_textField_150);
	
	JLabel label_161 = new JLabel("Totale Kapazit\u00E4t");
	GridBagConstraints gbc_label_161 = new GridBagConstraints();
	gbc_label_161.anchor = GridBagConstraints.WEST;
	gbc_label_161.insets = new Insets(0, 0, 5, 5);
	gbc_label_161.gridx = 1;
	gbc_label_161.gridy = 13;
	cpp_workstation11.add(label_161, gbc_label_161);
	
	textField_151 = new JTextField();
	textField_151.setColumns(10);
	GridBagConstraints gbc_textField_151 = new GridBagConstraints();
	gbc_textField_151.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_151.insets = new Insets(0, 0, 5, 5);
	gbc_textField_151.gridx = 7;
	gbc_textField_151.gridy = 13;
	cpp_workstation11.add(textField_151, gbc_textField_151);
	
	JLabel label_162 = new JLabel("Auslastung %");
	GridBagConstraints gbc_label_162 = new GridBagConstraints();
	gbc_label_162.anchor = GridBagConstraints.WEST;
	gbc_label_162.insets = new Insets(0, 0, 5, 5);
	gbc_label_162.gridx = 1;
	gbc_label_162.gridy = 14;
	cpp_workstation11.add(label_162, gbc_label_162);
	
	textField_152 = new JTextField();
	textField_152.setColumns(10);
	GridBagConstraints gbc_textField_152 = new GridBagConstraints();
	gbc_textField_152.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_152.insets = new Insets(0, 0, 5, 5);
	gbc_textField_152.gridx = 7;
	gbc_textField_152.gridy = 14;
	cpp_workstation11.add(textField_152, gbc_textField_152);
	
	JLabel label_163 = new JLabel("\u00DCberstunden (min) ");
	GridBagConstraints gbc_label_163 = new GridBagConstraints();
	gbc_label_163.anchor = GridBagConstraints.WEST;
	gbc_label_163.insets = new Insets(0, 0, 5, 5);
	gbc_label_163.gridx = 1;
	gbc_label_163.gridy = 15;
	cpp_workstation11.add(label_163, gbc_label_163);
	
	textField_153 = new JTextField();
	textField_153.setColumns(10);
	GridBagConstraints gbc_textField_153 = new GridBagConstraints();
	gbc_textField_153.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_153.insets = new Insets(0, 0, 5, 5);
	gbc_textField_153.gridx = 7;
	gbc_textField_153.gridy = 15;
	cpp_workstation11.add(textField_153, gbc_textField_153);
	
	JPanel cpp_workstation12 = new JPanel();
	JScrollPane cpsp_workstation12 = new JScrollPane(cpp_workstation12);
	cpsp_workstation12.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	cpsp_workstation12.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	capacityplanningPane.addTab("W12", null, cpsp_workstation12, null);
	GridBagLayout gbl_cpp_workstation12 = new GridBagLayout();
	gbl_cpp_workstation12.columnWidths = new int[]{30, 70, 20, 40, 40, 60, 20, 60, 60, 0, 0, 0};
	gbl_cpp_workstation12.rowHeights = new int[]{40, 0, 30, 0, 0, 0, 30, 0, 0, 0, 30, 0, 0, 0, 0, 0, 30, 30, 0};
	gbl_cpp_workstation12.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	gbl_cpp_workstation12.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	cpp_workstation12.setLayout(gbl_cpp_workstation12);
	
	JLabel label_100 = new JLabel("Arbeitsplatz");
	GridBagConstraints gbc_label_100 = new GridBagConstraints();
	gbc_label_100.anchor = GridBagConstraints.WEST;
	gbc_label_100.insets = new Insets(0, 0, 5, 5);
	gbc_label_100.gridx = 1;
	gbc_label_100.gridy = 1;
	cpp_workstation12.add(label_100, gbc_label_100);
	
	JLabel label_101 = new JLabel("12");
	GridBagConstraints gbc_label_101 = new GridBagConstraints();
	gbc_label_101.insets = new Insets(0, 0, 5, 5);
	gbc_label_101.gridx = 2;
	gbc_label_101.gridy = 1;
	cpp_workstation12.add(label_101, gbc_label_101);
	
	JLabel label_102 = new JLabel("Schutzblech hinten");
	GridBagConstraints gbc_label_102 = new GridBagConstraints();
	gbc_label_102.gridheight = 3;
	gbc_label_102.insets = new Insets(0, 0, 5, 5);
	gbc_label_102.gridx = 1;
	gbc_label_102.gridy = 3;
	cpp_workstation12.add(label_102, gbc_label_102);
	
	JLabel label_104 = new JLabel("K");
	GridBagConstraints gbc_label_104 = new GridBagConstraints();
	gbc_label_104.insets = new Insets(0, 0, 5, 5);
	gbc_label_104.gridx = 3;
	gbc_label_104.gridy = 3;
	cpp_workstation12.add(label_104, gbc_label_104);
	
	JLabel label_105 = new JLabel("E10");
	GridBagConstraints gbc_label_105 = new GridBagConstraints();
	gbc_label_105.anchor = GridBagConstraints.EAST;
	gbc_label_105.insets = new Insets(0, 0, 5, 5);
	gbc_label_105.gridx = 4;
	gbc_label_105.gridy = 3;
	cpp_workstation12.add(label_105, gbc_label_105);
	
	cptf12_10 = new JTextField();
	cptf12_10.setColumns(10);
	GridBagConstraints gbc_cptf12_10 = new GridBagConstraints();
	gbc_cptf12_10.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf12_10.insets = new Insets(0, 0, 5, 5);
	gbc_cptf12_10.gridx = 5;
	gbc_cptf12_10.gridy = 3;
	cpp_workstation12.add(cptf12_10, gbc_cptf12_10);
	
	JLabel label_107 = new JLabel("x3 =");
	GridBagConstraints gbc_label_107 = new GridBagConstraints();
	gbc_label_107.anchor = GridBagConstraints.EAST;
	gbc_label_107.insets = new Insets(0, 0, 5, 5);
	gbc_label_107.gridx = 6;
	gbc_label_107.gridy = 3;
	cpp_workstation12.add(label_107, gbc_label_107);
	
	textField_121 = new JTextField();
	textField_121.setColumns(10);
	GridBagConstraints gbc_textField_121 = new GridBagConstraints();
	gbc_textField_121.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_121.insets = new Insets(0, 0, 5, 5);
	gbc_textField_121.gridx = 7;
	gbc_textField_121.gridy = 3;
	cpp_workstation12.add(textField_121, gbc_textField_121);
	
	JLabel label_108 = new JLabel("D");
	GridBagConstraints gbc_label_108 = new GridBagConstraints();
	gbc_label_108.insets = new Insets(0, 0, 5, 5);
	gbc_label_108.gridx = 3;
	gbc_label_108.gridy = 4;
	cpp_workstation12.add(label_108, gbc_label_108);
	
	JLabel label_110 = new JLabel("E11");
	GridBagConstraints gbc_label_110 = new GridBagConstraints();
	gbc_label_110.anchor = GridBagConstraints.EAST;
	gbc_label_110.insets = new Insets(0, 0, 5, 5);
	gbc_label_110.gridx = 4;
	gbc_label_110.gridy = 4;
	cpp_workstation12.add(label_110, gbc_label_110);
	
	cptf12_11 = new JTextField();
	cptf12_11.setColumns(10);
	GridBagConstraints gbc_cptf12_11 = new GridBagConstraints();
	gbc_cptf12_11.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf12_11.insets = new Insets(0, 0, 5, 5);
	gbc_cptf12_11.gridx = 5;
	gbc_cptf12_11.gridy = 4;
	cpp_workstation12.add(cptf12_11, gbc_cptf12_11);
	
	JLabel label_111 = new JLabel("x3 =");
	GridBagConstraints gbc_label_111 = new GridBagConstraints();
	gbc_label_111.anchor = GridBagConstraints.EAST;
	gbc_label_111.insets = new Insets(0, 0, 5, 5);
	gbc_label_111.gridx = 6;
	gbc_label_111.gridy = 4;
	cpp_workstation12.add(label_111, gbc_label_111);
	
	textField_123 = new JTextField();
	textField_123.setColumns(10);
	GridBagConstraints gbc_textField_123 = new GridBagConstraints();
	gbc_textField_123.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_123.insets = new Insets(0, 0, 5, 5);
	gbc_textField_123.gridx = 7;
	gbc_textField_123.gridy = 4;
	cpp_workstation12.add(textField_123, gbc_textField_123);
	
	JLabel label_112 = new JLabel("H");
	GridBagConstraints gbc_label_112 = new GridBagConstraints();
	gbc_label_112.insets = new Insets(0, 0, 5, 5);
	gbc_label_112.gridx = 3;
	gbc_label_112.gridy = 5;
	cpp_workstation12.add(label_112, gbc_label_112);
	
	JLabel label_113 = new JLabel("E12");
	GridBagConstraints gbc_label_113 = new GridBagConstraints();
	gbc_label_113.anchor = GridBagConstraints.EAST;
	gbc_label_113.insets = new Insets(0, 0, 5, 5);
	gbc_label_113.gridx = 4;
	gbc_label_113.gridy = 5;
	cpp_workstation12.add(label_113, gbc_label_113);
	
	cptf12_12 = new JTextField();
	cptf12_12.setColumns(10);
	GridBagConstraints gbc_cptf12_12 = new GridBagConstraints();
	gbc_cptf12_12.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf12_12.insets = new Insets(0, 0, 5, 5);
	gbc_cptf12_12.gridx = 5;
	gbc_cptf12_12.gridy = 5;
	cpp_workstation12.add(cptf12_12, gbc_cptf12_12);
	
	JLabel label_114 = new JLabel("x3 =");
	GridBagConstraints gbc_label_114 = new GridBagConstraints();
	gbc_label_114.anchor = GridBagConstraints.EAST;
	gbc_label_114.insets = new Insets(0, 0, 5, 5);
	gbc_label_114.gridx = 6;
	gbc_label_114.gridy = 5;
	cpp_workstation12.add(label_114, gbc_label_114);
	
	textField_125 = new JTextField();
	textField_125.setColumns(10);
	GridBagConstraints gbc_textField_125 = new GridBagConstraints();
	gbc_textField_125.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_125.insets = new Insets(0, 0, 5, 5);
	gbc_textField_125.gridx = 7;
	gbc_textField_125.gridy = 5;
	cpp_workstation12.add(textField_125, gbc_textField_125);
	
	JLabel label_115 = new JLabel("Schutzblech Vorne");
	GridBagConstraints gbc_label_115 = new GridBagConstraints();
	gbc_label_115.anchor = GridBagConstraints.WEST;
	gbc_label_115.gridheight = 3;
	gbc_label_115.insets = new Insets(0, 0, 5, 5);
	gbc_label_115.gridx = 1;
	gbc_label_115.gridy = 7;
	cpp_workstation12.add(label_115, gbc_label_115);
	
	JLabel label_116 = new JLabel("K");
	GridBagConstraints gbc_label_116 = new GridBagConstraints();
	gbc_label_116.insets = new Insets(0, 0, 5, 5);
	gbc_label_116.gridx = 3;
	gbc_label_116.gridy = 7;
	cpp_workstation12.add(label_116, gbc_label_116);
	
	JLabel label_117 = new JLabel("E13");
	GridBagConstraints gbc_label_117 = new GridBagConstraints();
	gbc_label_117.anchor = GridBagConstraints.EAST;
	gbc_label_117.insets = new Insets(0, 0, 5, 5);
	gbc_label_117.gridx = 4;
	gbc_label_117.gridy = 7;
	cpp_workstation12.add(label_117, gbc_label_117);
	
	cptf12_13 = new JTextField();
	cptf12_13.setColumns(10);
	GridBagConstraints gbc_cptf12_13 = new GridBagConstraints();
	gbc_cptf12_13.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf12_13.insets = new Insets(0, 0, 5, 5);
	gbc_cptf12_13.gridx = 5;
	gbc_cptf12_13.gridy = 7;
	cpp_workstation12.add(cptf12_13, gbc_cptf12_13);
	
	JLabel label_118 = new JLabel("x3 =");
	GridBagConstraints gbc_label_118 = new GridBagConstraints();
	gbc_label_118.anchor = GridBagConstraints.EAST;
	gbc_label_118.insets = new Insets(0, 0, 5, 5);
	gbc_label_118.gridx = 6;
	gbc_label_118.gridy = 7;
	cpp_workstation12.add(label_118, gbc_label_118);
	
	textField_144 = new JTextField();
	textField_144.setColumns(10);
	GridBagConstraints gbc_textField_144 = new GridBagConstraints();
	gbc_textField_144.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_144.insets = new Insets(0, 0, 5, 5);
	gbc_textField_144.gridx = 7;
	gbc_textField_144.gridy = 7;
	cpp_workstation12.add(textField_144, gbc_textField_144);
	
	JLabel label_119 = new JLabel("D");
	GridBagConstraints gbc_label_119 = new GridBagConstraints();
	gbc_label_119.insets = new Insets(0, 0, 5, 5);
	gbc_label_119.gridx = 3;
	gbc_label_119.gridy = 8;
	cpp_workstation12.add(label_119, gbc_label_119);
	
	JLabel label_120 = new JLabel("E14");
	GridBagConstraints gbc_label_120 = new GridBagConstraints();
	gbc_label_120.anchor = GridBagConstraints.EAST;
	gbc_label_120.insets = new Insets(0, 0, 5, 5);
	gbc_label_120.gridx = 4;
	gbc_label_120.gridy = 8;
	cpp_workstation12.add(label_120, gbc_label_120);
	
	cptf12_14 = new JTextField();
	cptf12_14.setColumns(10);
	GridBagConstraints gbc_cptf12_14 = new GridBagConstraints();
	gbc_cptf12_14.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf12_14.insets = new Insets(0, 0, 5, 5);
	gbc_cptf12_14.gridx = 5;
	gbc_cptf12_14.gridy = 8;
	cpp_workstation12.add(cptf12_14, gbc_cptf12_14);
	
	JLabel label_121 = new JLabel("x3 =");
	GridBagConstraints gbc_label_121 = new GridBagConstraints();
	gbc_label_121.anchor = GridBagConstraints.EAST;
	gbc_label_121.insets = new Insets(0, 0, 5, 5);
	gbc_label_121.gridx = 6;
	gbc_label_121.gridy = 8;
	cpp_workstation12.add(label_121, gbc_label_121);
	
	textField_146 = new JTextField();
	textField_146.setColumns(10);
	GridBagConstraints gbc_textField_146 = new GridBagConstraints();
	gbc_textField_146.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_146.insets = new Insets(0, 0, 5, 5);
	gbc_textField_146.gridx = 7;
	gbc_textField_146.gridy = 8;
	cpp_workstation12.add(textField_146, gbc_textField_146);
	
	JLabel label_129 = new JLabel("H");
	GridBagConstraints gbc_label_129 = new GridBagConstraints();
	gbc_label_129.insets = new Insets(0, 0, 5, 5);
	gbc_label_129.gridx = 3;
	gbc_label_129.gridy = 9;
	cpp_workstation12.add(label_129, gbc_label_129);
	
	JLabel label_131 = new JLabel("E15");
	GridBagConstraints gbc_label_131 = new GridBagConstraints();
	gbc_label_131.anchor = GridBagConstraints.EAST;
	gbc_label_131.insets = new Insets(0, 0, 5, 5);
	gbc_label_131.gridx = 4;
	gbc_label_131.gridy = 9;
	cpp_workstation12.add(label_131, gbc_label_131);
	
	cptf12_15 = new JTextField();
	cptf12_15.setColumns(10);
	GridBagConstraints gbc_cptf12_15 = new GridBagConstraints();
	gbc_cptf12_15.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf12_15.insets = new Insets(0, 0, 5, 5);
	gbc_cptf12_15.gridx = 5;
	gbc_cptf12_15.gridy = 9;
	cpp_workstation12.add(cptf12_15, gbc_cptf12_15);
	
	JLabel label_134 = new JLabel("x3 =");
	GridBagConstraints gbc_label_134 = new GridBagConstraints();
	gbc_label_134.anchor = GridBagConstraints.EAST;
	gbc_label_134.insets = new Insets(0, 0, 5, 5);
	gbc_label_134.gridx = 6;
	gbc_label_134.gridy = 9;
	cpp_workstation12.add(label_134, gbc_label_134);
	
	textField_148 = new JTextField();
	textField_148.setColumns(10);
	GridBagConstraints gbc_textField_148 = new GridBagConstraints();
	gbc_textField_148.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_148.insets = new Insets(0, 0, 5, 5);
	gbc_textField_148.gridx = 7;
	gbc_textField_148.gridy = 9;
	cpp_workstation12.add(textField_148, gbc_textField_148);
	
	JSeparator separator_10 = new JSeparator();
	GridBagConstraints gbc_separator_10 = new GridBagConstraints();
	gbc_separator_10.fill = GridBagConstraints.HORIZONTAL;
	gbc_separator_10.gridwidth = 7;
	gbc_separator_10.insets = new Insets(0, 0, 5, 5);
	gbc_separator_10.gridx = 1;
	gbc_separator_10.gridy = 10;
	cpp_workstation12.add(separator_10, gbc_separator_10);
	
	JLabel label_154 = new JLabel("Kapazit\u00E4tsbedarf ");
	GridBagConstraints gbc_label_154 = new GridBagConstraints();
	gbc_label_154.anchor = GridBagConstraints.WEST;
	gbc_label_154.insets = new Insets(0, 0, 5, 5);
	gbc_label_154.gridx = 1;
	gbc_label_154.gridy = 11;
	cpp_workstation12.add(label_154, gbc_label_154);
	
	textField_160 = new JTextField();
	textField_160.setColumns(10);
	GridBagConstraints gbc_textField_160 = new GridBagConstraints();
	gbc_textField_160.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_160.insets = new Insets(0, 0, 5, 5);
	gbc_textField_160.gridx = 7;
	gbc_textField_160.gridy = 11;
	cpp_workstation12.add(textField_160, gbc_textField_160);
	
	JLabel label_155 = new JLabel("R\u00FCstzeit");
	GridBagConstraints gbc_label_155 = new GridBagConstraints();
	gbc_label_155.anchor = GridBagConstraints.WEST;
	gbc_label_155.insets = new Insets(0, 0, 5, 5);
	gbc_label_155.gridx = 1;
	gbc_label_155.gridy = 12;
	cpp_workstation12.add(label_155, gbc_label_155);
	
	textField_161 = new JTextField();
	textField_161.setColumns(10);
	GridBagConstraints gbc_textField_161 = new GridBagConstraints();
	gbc_textField_161.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_161.insets = new Insets(0, 0, 5, 5);
	gbc_textField_161.gridx = 7;
	gbc_textField_161.gridy = 12;
	cpp_workstation12.add(textField_161, gbc_textField_161);
	
	JLabel label_156 = new JLabel("Totale Kapazit\u00E4t");
	GridBagConstraints gbc_label_156 = new GridBagConstraints();
	gbc_label_156.anchor = GridBagConstraints.WEST;
	gbc_label_156.insets = new Insets(0, 0, 5, 5);
	gbc_label_156.gridx = 1;
	gbc_label_156.gridy = 13;
	cpp_workstation12.add(label_156, gbc_label_156);
	
	textField_162 = new JTextField();
	textField_162.setColumns(10);
	GridBagConstraints gbc_textField_162 = new GridBagConstraints();
	gbc_textField_162.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_162.insets = new Insets(0, 0, 5, 5);
	gbc_textField_162.gridx = 7;
	gbc_textField_162.gridy = 13;
	cpp_workstation12.add(textField_162, gbc_textField_162);
	
	JLabel label_157 = new JLabel("Auslastung %");
	GridBagConstraints gbc_label_157 = new GridBagConstraints();
	gbc_label_157.anchor = GridBagConstraints.WEST;
	gbc_label_157.insets = new Insets(0, 0, 5, 5);
	gbc_label_157.gridx = 1;
	gbc_label_157.gridy = 14;
	cpp_workstation12.add(label_157, gbc_label_157);
	
	textField_163 = new JTextField();
	textField_163.setColumns(10);
	GridBagConstraints gbc_textField_163 = new GridBagConstraints();
	gbc_textField_163.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_163.insets = new Insets(0, 0, 5, 5);
	gbc_textField_163.gridx = 7;
	gbc_textField_163.gridy = 14;
	cpp_workstation12.add(textField_163, gbc_textField_163);
	
	JLabel label_158 = new JLabel("\u00DCberstunden (min) ");
	GridBagConstraints gbc_label_158 = new GridBagConstraints();
	gbc_label_158.anchor = GridBagConstraints.WEST;
	gbc_label_158.insets = new Insets(0, 0, 5, 5);
	gbc_label_158.gridx = 1;
	gbc_label_158.gridy = 15;
	cpp_workstation12.add(label_158, gbc_label_158);
	
	textField_164 = new JTextField();
	textField_164.setColumns(10);
	GridBagConstraints gbc_textField_164 = new GridBagConstraints();
	gbc_textField_164.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_164.insets = new Insets(0, 0, 5, 5);
	gbc_textField_164.gridx = 7;
	gbc_textField_164.gridy = 15;
	cpp_workstation12.add(textField_164, gbc_textField_164);
	
	JPanel cpp_workstation13 = new JPanel();
	JScrollPane cpsp_workstation13 = new JScrollPane(cpp_workstation13);
	cpsp_workstation13.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	cpsp_workstation13.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	capacityplanningPane.addTab("W13", null, cpsp_workstation13, null);
	GridBagLayout gbl_cpp_workstation13 = new GridBagLayout();
	gbl_cpp_workstation13.columnWidths = new int[]{30, 70, 20, 40, 40, 60, 20, 60, 60, 0, 0, 0};
	gbl_cpp_workstation13.rowHeights = new int[]{40, 0, 30, 0, 0, 0, 30, 0, 0, 0, 30, 0, 0, 0, 0, 0, 30, 30, 0};
	gbl_cpp_workstation13.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	gbl_cpp_workstation13.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	cpp_workstation13.setLayout(gbl_cpp_workstation13);
	
	JLabel label_137 = new JLabel("Arbeitsplatz");
	GridBagConstraints gbc_label_137 = new GridBagConstraints();
	gbc_label_137.anchor = GridBagConstraints.WEST;
	gbc_label_137.insets = new Insets(0, 0, 5, 5);
	gbc_label_137.gridx = 1;
	gbc_label_137.gridy = 1;
	cpp_workstation13.add(label_137, gbc_label_137);
	
	JLabel label_139 = new JLabel("13");
	GridBagConstraints gbc_label_139 = new GridBagConstraints();
	gbc_label_139.insets = new Insets(0, 0, 5, 5);
	gbc_label_139.gridx = 2;
	gbc_label_139.gridy = 1;
	cpp_workstation13.add(label_139, gbc_label_139);
	
	JLabel label_141 = new JLabel("Schutzblech hinten");
	GridBagConstraints gbc_label_141 = new GridBagConstraints();
	gbc_label_141.gridheight = 3;
	gbc_label_141.insets = new Insets(0, 0, 5, 5);
	gbc_label_141.gridx = 1;
	gbc_label_141.gridy = 3;
	cpp_workstation13.add(label_141, gbc_label_141);
	
	JLabel label_144 = new JLabel("K");
	GridBagConstraints gbc_label_144 = new GridBagConstraints();
	gbc_label_144.insets = new Insets(0, 0, 5, 5);
	gbc_label_144.gridx = 3;
	gbc_label_144.gridy = 3;
	cpp_workstation13.add(label_144, gbc_label_144);
	
	JLabel label_147 = new JLabel("E10");
	GridBagConstraints gbc_label_147 = new GridBagConstraints();
	gbc_label_147.anchor = GridBagConstraints.EAST;
	gbc_label_147.insets = new Insets(0, 0, 5, 5);
	gbc_label_147.gridx = 4;
	gbc_label_147.gridy = 3;
	cpp_workstation13.add(label_147, gbc_label_147);
	
	cptf13_10 = new JTextField();
	cptf13_10.setColumns(10);
	GridBagConstraints gbc_cptf13_10 = new GridBagConstraints();
	gbc_cptf13_10.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf13_10.insets = new Insets(0, 0, 5, 5);
	gbc_cptf13_10.gridx = 5;
	gbc_cptf13_10.gridy = 3;
	cpp_workstation13.add(cptf13_10, gbc_cptf13_10);
	
	JLabel lblX_33 = new JLabel("x2 =");
	GridBagConstraints gbc_lblX_33 = new GridBagConstraints();
	gbc_lblX_33.anchor = GridBagConstraints.EAST;
	gbc_lblX_33.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_33.gridx = 6;
	gbc_lblX_33.gridy = 3;
	cpp_workstation13.add(lblX_33, gbc_lblX_33);
	
	textField_155 = new JTextField();
	textField_155.setColumns(10);
	GridBagConstraints gbc_textField_155 = new GridBagConstraints();
	gbc_textField_155.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_155.insets = new Insets(0, 0, 5, 5);
	gbc_textField_155.gridx = 7;
	gbc_textField_155.gridy = 3;
	cpp_workstation13.add(textField_155, gbc_textField_155);
	
	JLabel label_150 = new JLabel("D");
	GridBagConstraints gbc_label_150 = new GridBagConstraints();
	gbc_label_150.insets = new Insets(0, 0, 5, 5);
	gbc_label_150.gridx = 3;
	gbc_label_150.gridy = 4;
	cpp_workstation13.add(label_150, gbc_label_150);
	
	JLabel label_151 = new JLabel("E11");
	GridBagConstraints gbc_label_151 = new GridBagConstraints();
	gbc_label_151.anchor = GridBagConstraints.EAST;
	gbc_label_151.insets = new Insets(0, 0, 5, 5);
	gbc_label_151.gridx = 4;
	gbc_label_151.gridy = 4;
	cpp_workstation13.add(label_151, gbc_label_151);
	
	cptf13_11 = new JTextField();
	cptf13_11.setColumns(10);
	GridBagConstraints gbc_cptf13_11 = new GridBagConstraints();
	gbc_cptf13_11.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf13_11.insets = new Insets(0, 0, 5, 5);
	gbc_cptf13_11.gridx = 5;
	gbc_cptf13_11.gridy = 4;
	cpp_workstation13.add(cptf13_11, gbc_cptf13_11);
	
	JLabel lblX_34 = new JLabel("x2 =");
	GridBagConstraints gbc_lblX_34 = new GridBagConstraints();
	gbc_lblX_34.anchor = GridBagConstraints.EAST;
	gbc_lblX_34.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_34.gridx = 6;
	gbc_lblX_34.gridy = 4;
	cpp_workstation13.add(lblX_34, gbc_lblX_34);
	
	textField_157 = new JTextField();
	textField_157.setColumns(10);
	GridBagConstraints gbc_textField_157 = new GridBagConstraints();
	gbc_textField_157.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_157.insets = new Insets(0, 0, 5, 5);
	gbc_textField_157.gridx = 7;
	gbc_textField_157.gridy = 4;
	cpp_workstation13.add(textField_157, gbc_textField_157);
	
	JLabel label_153 = new JLabel("H");
	GridBagConstraints gbc_label_153 = new GridBagConstraints();
	gbc_label_153.insets = new Insets(0, 0, 5, 5);
	gbc_label_153.gridx = 3;
	gbc_label_153.gridy = 5;
	cpp_workstation13.add(label_153, gbc_label_153);
	
	JLabel label_164 = new JLabel("E12");
	GridBagConstraints gbc_label_164 = new GridBagConstraints();
	gbc_label_164.anchor = GridBagConstraints.EAST;
	gbc_label_164.insets = new Insets(0, 0, 5, 5);
	gbc_label_164.gridx = 4;
	gbc_label_164.gridy = 5;
	cpp_workstation13.add(label_164, gbc_label_164);
	
	cptf13_12 = new JTextField();
	cptf13_12.setColumns(10);
	GridBagConstraints gbc_cptf13_12 = new GridBagConstraints();
	gbc_cptf13_12.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf13_12.insets = new Insets(0, 0, 5, 5);
	gbc_cptf13_12.gridx = 5;
	gbc_cptf13_12.gridy = 5;
	cpp_workstation13.add(cptf13_12, gbc_cptf13_12);
	
	JLabel lblX_35 = new JLabel("x2 =");
	GridBagConstraints gbc_lblX_35 = new GridBagConstraints();
	gbc_lblX_35.anchor = GridBagConstraints.EAST;
	gbc_lblX_35.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_35.gridx = 6;
	gbc_lblX_35.gridy = 5;
	cpp_workstation13.add(lblX_35, gbc_lblX_35);
	
	textField_159 = new JTextField();
	textField_159.setColumns(10);
	GridBagConstraints gbc_textField_159 = new GridBagConstraints();
	gbc_textField_159.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_159.insets = new Insets(0, 0, 5, 5);
	gbc_textField_159.gridx = 7;
	gbc_textField_159.gridy = 5;
	cpp_workstation13.add(textField_159, gbc_textField_159);
	
	JLabel label_166 = new JLabel("Schutzblech Vorne");
	GridBagConstraints gbc_label_166 = new GridBagConstraints();
	gbc_label_166.anchor = GridBagConstraints.WEST;
	gbc_label_166.gridheight = 3;
	gbc_label_166.insets = new Insets(0, 0, 5, 5);
	gbc_label_166.gridx = 1;
	gbc_label_166.gridy = 7;
	cpp_workstation13.add(label_166, gbc_label_166);
	
	JLabel label_167 = new JLabel("K");
	GridBagConstraints gbc_label_167 = new GridBagConstraints();
	gbc_label_167.insets = new Insets(0, 0, 5, 5);
	gbc_label_167.gridx = 3;
	gbc_label_167.gridy = 7;
	cpp_workstation13.add(label_167, gbc_label_167);
	
	JLabel label_168 = new JLabel("E13");
	GridBagConstraints gbc_label_168 = new GridBagConstraints();
	gbc_label_168.anchor = GridBagConstraints.EAST;
	gbc_label_168.insets = new Insets(0, 0, 5, 5);
	gbc_label_168.gridx = 4;
	gbc_label_168.gridy = 7;
	cpp_workstation13.add(label_168, gbc_label_168);
	
	cptf13_13 = new JTextField();
	cptf13_13.setColumns(10);
	GridBagConstraints gbc_cptf13_13 = new GridBagConstraints();
	gbc_cptf13_13.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf13_13.insets = new Insets(0, 0, 5, 5);
	gbc_cptf13_13.gridx = 5;
	gbc_cptf13_13.gridy = 7;
	cpp_workstation13.add(cptf13_13, gbc_cptf13_13);
	
	JLabel lblX_36 = new JLabel("x2 =");
	GridBagConstraints gbc_lblX_36 = new GridBagConstraints();
	gbc_lblX_36.anchor = GridBagConstraints.EAST;
	gbc_lblX_36.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_36.gridx = 6;
	gbc_lblX_36.gridy = 7;
	cpp_workstation13.add(lblX_36, gbc_lblX_36);
	
	textField_166 = new JTextField();
	textField_166.setColumns(10);
	GridBagConstraints gbc_textField_166 = new GridBagConstraints();
	gbc_textField_166.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_166.insets = new Insets(0, 0, 5, 5);
	gbc_textField_166.gridx = 7;
	gbc_textField_166.gridy = 7;
	cpp_workstation13.add(textField_166, gbc_textField_166);
	
	JLabel label_170 = new JLabel("D");
	GridBagConstraints gbc_label_170 = new GridBagConstraints();
	gbc_label_170.insets = new Insets(0, 0, 5, 5);
	gbc_label_170.gridx = 3;
	gbc_label_170.gridy = 8;
	cpp_workstation13.add(label_170, gbc_label_170);
	
	JLabel label_171 = new JLabel("E14");
	GridBagConstraints gbc_label_171 = new GridBagConstraints();
	gbc_label_171.anchor = GridBagConstraints.EAST;
	gbc_label_171.insets = new Insets(0, 0, 5, 5);
	gbc_label_171.gridx = 4;
	gbc_label_171.gridy = 8;
	cpp_workstation13.add(label_171, gbc_label_171);
	
	cptf13_14 = new JTextField();
	cptf13_14.setColumns(10);
	GridBagConstraints gbc_cptf13_14 = new GridBagConstraints();
	gbc_cptf13_14.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf13_14.insets = new Insets(0, 0, 5, 5);
	gbc_cptf13_14.gridx = 5;
	gbc_cptf13_14.gridy = 8;
	cpp_workstation13.add(cptf13_14, gbc_cptf13_14);
	
	JLabel label_172 = new JLabel("x3 =");
	GridBagConstraints gbc_label_172 = new GridBagConstraints();
	gbc_label_172.anchor = GridBagConstraints.EAST;
	gbc_label_172.insets = new Insets(0, 0, 5, 5);
	gbc_label_172.gridx = 6;
	gbc_label_172.gridy = 8;
	cpp_workstation13.add(label_172, gbc_label_172);
	
	textField_168 = new JTextField();
	textField_168.setColumns(10);
	GridBagConstraints gbc_textField_168 = new GridBagConstraints();
	gbc_textField_168.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_168.insets = new Insets(0, 0, 5, 5);
	gbc_textField_168.gridx = 7;
	gbc_textField_168.gridy = 8;
	cpp_workstation13.add(textField_168, gbc_textField_168);
	
	JLabel label_173 = new JLabel("H");
	GridBagConstraints gbc_label_173 = new GridBagConstraints();
	gbc_label_173.insets = new Insets(0, 0, 5, 5);
	gbc_label_173.gridx = 3;
	gbc_label_173.gridy = 9;
	cpp_workstation13.add(label_173, gbc_label_173);
	
	JLabel label_174 = new JLabel("E15");
	GridBagConstraints gbc_label_174 = new GridBagConstraints();
	gbc_label_174.anchor = GridBagConstraints.EAST;
	gbc_label_174.insets = new Insets(0, 0, 5, 5);
	gbc_label_174.gridx = 4;
	gbc_label_174.gridy = 9;
	cpp_workstation13.add(label_174, gbc_label_174);
	
	cptf13_15 = new JTextField();
	cptf13_15.setColumns(10);
	GridBagConstraints gbc_cptf13_15 = new GridBagConstraints();
	gbc_cptf13_15.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf13_15.insets = new Insets(0, 0, 5, 5);
	gbc_cptf13_15.gridx = 5;
	gbc_cptf13_15.gridy = 9;
	cpp_workstation13.add(cptf13_15, gbc_cptf13_15);
	
	JLabel lblX_37 = new JLabel("x2 =");
	GridBagConstraints gbc_lblX_37 = new GridBagConstraints();
	gbc_lblX_37.anchor = GridBagConstraints.EAST;
	gbc_lblX_37.insets = new Insets(0, 0, 5, 5);
	gbc_lblX_37.gridx = 6;
	gbc_lblX_37.gridy = 9;
	cpp_workstation13.add(lblX_37, gbc_lblX_37);
	
	textField_170 = new JTextField();
	textField_170.setColumns(10);
	GridBagConstraints gbc_textField_170 = new GridBagConstraints();
	gbc_textField_170.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_170.insets = new Insets(0, 0, 5, 5);
	gbc_textField_170.gridx = 7;
	gbc_textField_170.gridy = 9;
	cpp_workstation13.add(textField_170, gbc_textField_170);
	
	JSeparator separator_11 = new JSeparator();
	GridBagConstraints gbc_separator_11 = new GridBagConstraints();
	gbc_separator_11.fill = GridBagConstraints.HORIZONTAL;
	gbc_separator_11.gridwidth = 7;
	gbc_separator_11.insets = new Insets(0, 0, 5, 5);
	gbc_separator_11.gridx = 1;
	gbc_separator_11.gridy = 10;
	cpp_workstation13.add(separator_11, gbc_separator_11);
	
	JLabel label_186 = new JLabel("Kapazit\u00E4tsbedarf ");
	GridBagConstraints gbc_label_186 = new GridBagConstraints();
	gbc_label_186.anchor = GridBagConstraints.WEST;
	gbc_label_186.insets = new Insets(0, 0, 5, 5);
	gbc_label_186.gridx = 1;
	gbc_label_186.gridy = 11;
	cpp_workstation13.add(label_186, gbc_label_186);
	
	textField_177 = new JTextField();
	textField_177.setColumns(10);
	GridBagConstraints gbc_textField_177 = new GridBagConstraints();
	gbc_textField_177.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_177.insets = new Insets(0, 0, 5, 5);
	gbc_textField_177.gridx = 7;
	gbc_textField_177.gridy = 11;
	cpp_workstation13.add(textField_177, gbc_textField_177);
	
	JLabel label_187 = new JLabel("R\u00FCstzeit");
	GridBagConstraints gbc_label_187 = new GridBagConstraints();
	gbc_label_187.anchor = GridBagConstraints.WEST;
	gbc_label_187.insets = new Insets(0, 0, 5, 5);
	gbc_label_187.gridx = 1;
	gbc_label_187.gridy = 12;
	cpp_workstation13.add(label_187, gbc_label_187);
	
	textField_178 = new JTextField();
	textField_178.setColumns(10);
	GridBagConstraints gbc_textField_178 = new GridBagConstraints();
	gbc_textField_178.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_178.insets = new Insets(0, 0, 5, 5);
	gbc_textField_178.gridx = 7;
	gbc_textField_178.gridy = 12;
	cpp_workstation13.add(textField_178, gbc_textField_178);
	
	JLabel label_188 = new JLabel("Totale Kapazit\u00E4t");
	GridBagConstraints gbc_label_188 = new GridBagConstraints();
	gbc_label_188.anchor = GridBagConstraints.WEST;
	gbc_label_188.insets = new Insets(0, 0, 5, 5);
	gbc_label_188.gridx = 1;
	gbc_label_188.gridy = 13;
	cpp_workstation13.add(label_188, gbc_label_188);
	
	textField_179 = new JTextField();
	textField_179.setColumns(10);
	GridBagConstraints gbc_textField_179 = new GridBagConstraints();
	gbc_textField_179.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_179.insets = new Insets(0, 0, 5, 5);
	gbc_textField_179.gridx = 7;
	gbc_textField_179.gridy = 13;
	cpp_workstation13.add(textField_179, gbc_textField_179);
	
	JLabel label_189 = new JLabel("Auslastung %");
	GridBagConstraints gbc_label_189 = new GridBagConstraints();
	gbc_label_189.anchor = GridBagConstraints.WEST;
	gbc_label_189.insets = new Insets(0, 0, 5, 5);
	gbc_label_189.gridx = 1;
	gbc_label_189.gridy = 14;
	cpp_workstation13.add(label_189, gbc_label_189);
	
	textField_180 = new JTextField();
	textField_180.setColumns(10);
	GridBagConstraints gbc_textField_180 = new GridBagConstraints();
	gbc_textField_180.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_180.insets = new Insets(0, 0, 5, 5);
	gbc_textField_180.gridx = 7;
	gbc_textField_180.gridy = 14;
	cpp_workstation13.add(textField_180, gbc_textField_180);
	
	JLabel label_190 = new JLabel("\u00DCberstunden (min) ");
	GridBagConstraints gbc_label_190 = new GridBagConstraints();
	gbc_label_190.anchor = GridBagConstraints.WEST;
	gbc_label_190.insets = new Insets(0, 0, 5, 5);
	gbc_label_190.gridx = 1;
	gbc_label_190.gridy = 15;
	cpp_workstation13.add(label_190, gbc_label_190);
	
	textField_181 = new JTextField();
	textField_181.setColumns(10);
	GridBagConstraints gbc_textField_181 = new GridBagConstraints();
	gbc_textField_181.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_181.insets = new Insets(0, 0, 5, 5);
	gbc_textField_181.gridx = 7;
	gbc_textField_181.gridy = 15;
	cpp_workstation13.add(textField_181, gbc_textField_181);
	
	JPanel cpp_workstation14 = new JPanel();
	capacityplanningPane.addTab("W14", null, cpp_workstation14, null);
	GridBagLayout gbl_cpp_workstation14 = new GridBagLayout();
	gbl_cpp_workstation14.columnWidths = new int[]{30, 70, 20, 40, 40, 78, 20, 60, 60, 0, 0, 0};
	gbl_cpp_workstation14.rowHeights = new int[]{40, 0, 30, 0, 30, 0, 0, 0, 0, 0, 30, 30, 0};
	gbl_cpp_workstation14.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	gbl_cpp_workstation14.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	cpp_workstation14.setLayout(gbl_cpp_workstation14);
	
	JLabel label_149 = new JLabel("Arbeitsplatz");
	GridBagConstraints gbc_label_149 = new GridBagConstraints();
	gbc_label_149.anchor = GridBagConstraints.WEST;
	gbc_label_149.insets = new Insets(0, 0, 5, 5);
	gbc_label_149.gridx = 1;
	gbc_label_149.gridy = 1;
	cpp_workstation14.add(label_149, gbc_label_149);
	
	JLabel label_152 = new JLabel("14");
	GridBagConstraints gbc_label_152 = new GridBagConstraints();
	gbc_label_152.insets = new Insets(0, 0, 5, 5);
	gbc_label_152.gridx = 2;
	gbc_label_152.gridy = 1;
	cpp_workstation14.add(label_152, gbc_label_152);
	
	JLabel label_165 = new JLabel("Lenker");
	GridBagConstraints gbc_label_165 = new GridBagConstraints();
	gbc_label_165.insets = new Insets(0, 0, 5, 5);
	gbc_label_165.gridx = 1;
	gbc_label_165.gridy = 3;
	cpp_workstation14.add(label_165, gbc_label_165);
	
	JLabel label_169 = new JLabel("KDH");
	GridBagConstraints gbc_label_169 = new GridBagConstraints();
	gbc_label_169.insets = new Insets(0, 0, 5, 5);
	gbc_label_169.gridx = 3;
	gbc_label_169.gridy = 3;
	cpp_workstation14.add(label_169, gbc_label_169);
	
	JLabel label_175 = new JLabel("E16");
	GridBagConstraints gbc_label_175 = new GridBagConstraints();
	gbc_label_175.anchor = GridBagConstraints.EAST;
	gbc_label_175.insets = new Insets(0, 0, 5, 5);
	gbc_label_175.gridx = 4;
	gbc_label_175.gridy = 3;
	cpp_workstation14.add(label_175, gbc_label_175);
	
	cptf14_16 = new JTextField();
	cptf14_16.setColumns(10);
	GridBagConstraints gbc_cptf14_16 = new GridBagConstraints();
	gbc_cptf14_16.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf14_16.insets = new Insets(0, 0, 5, 5);
	gbc_cptf14_16.gridx = 5;
	gbc_cptf14_16.gridy = 3;
	cpp_workstation14.add(cptf14_16, gbc_cptf14_16);
	
	JLabel label_176 = new JLabel("x3 =");
	GridBagConstraints gbc_label_176 = new GridBagConstraints();
	gbc_label_176.anchor = GridBagConstraints.EAST;
	gbc_label_176.insets = new Insets(0, 0, 5, 5);
	gbc_label_176.gridx = 6;
	gbc_label_176.gridy = 3;
	cpp_workstation14.add(label_176, gbc_label_176);
	
	textField_172 = new JTextField();
	textField_172.setColumns(10);
	GridBagConstraints gbc_textField_172 = new GridBagConstraints();
	gbc_textField_172.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_172.insets = new Insets(0, 0, 5, 5);
	gbc_textField_172.gridx = 7;
	gbc_textField_172.gridy = 3;
	cpp_workstation14.add(textField_172, gbc_textField_172);
	
	JSeparator separator_12 = new JSeparator();
	GridBagConstraints gbc_separator_12 = new GridBagConstraints();
	gbc_separator_12.fill = GridBagConstraints.HORIZONTAL;
	gbc_separator_12.gridwidth = 7;
	gbc_separator_12.insets = new Insets(0, 0, 5, 5);
	gbc_separator_12.gridx = 1;
	gbc_separator_12.gridy = 4;
	cpp_workstation14.add(separator_12, gbc_separator_12);
	
	JLabel label_192 = new JLabel("Kapazit\u00E4tsbedarf ");
	GridBagConstraints gbc_label_192 = new GridBagConstraints();
	gbc_label_192.anchor = GridBagConstraints.WEST;
	gbc_label_192.insets = new Insets(0, 0, 5, 5);
	gbc_label_192.gridx = 1;
	gbc_label_192.gridy = 5;
	cpp_workstation14.add(label_192, gbc_label_192);
	
	textField_184 = new JTextField();
	textField_184.setColumns(10);
	GridBagConstraints gbc_textField_184 = new GridBagConstraints();
	gbc_textField_184.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_184.insets = new Insets(0, 0, 5, 5);
	gbc_textField_184.gridx = 7;
	gbc_textField_184.gridy = 5;
	cpp_workstation14.add(textField_184, gbc_textField_184);
	
	JLabel label_193 = new JLabel("R\u00FCstzeit");
	GridBagConstraints gbc_label_193 = new GridBagConstraints();
	gbc_label_193.anchor = GridBagConstraints.WEST;
	gbc_label_193.insets = new Insets(0, 0, 5, 5);
	gbc_label_193.gridx = 1;
	gbc_label_193.gridy = 6;
	cpp_workstation14.add(label_193, gbc_label_193);
	
	textField_185 = new JTextField();
	textField_185.setColumns(10);
	GridBagConstraints gbc_textField_185 = new GridBagConstraints();
	gbc_textField_185.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_185.insets = new Insets(0, 0, 5, 5);
	gbc_textField_185.gridx = 7;
	gbc_textField_185.gridy = 6;
	cpp_workstation14.add(textField_185, gbc_textField_185);
	
	JLabel label_194 = new JLabel("Totale Kapazit\u00E4t");
	GridBagConstraints gbc_label_194 = new GridBagConstraints();
	gbc_label_194.anchor = GridBagConstraints.WEST;
	gbc_label_194.insets = new Insets(0, 0, 5, 5);
	gbc_label_194.gridx = 1;
	gbc_label_194.gridy = 7;
	cpp_workstation14.add(label_194, gbc_label_194);
	
	textField_186 = new JTextField();
	textField_186.setColumns(10);
	GridBagConstraints gbc_textField_186 = new GridBagConstraints();
	gbc_textField_186.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_186.insets = new Insets(0, 0, 5, 5);
	gbc_textField_186.gridx = 7;
	gbc_textField_186.gridy = 7;
	cpp_workstation14.add(textField_186, gbc_textField_186);
	
	JLabel label_195 = new JLabel("Auslastung %");
	GridBagConstraints gbc_label_195 = new GridBagConstraints();
	gbc_label_195.anchor = GridBagConstraints.WEST;
	gbc_label_195.insets = new Insets(0, 0, 5, 5);
	gbc_label_195.gridx = 1;
	gbc_label_195.gridy = 8;
	cpp_workstation14.add(label_195, gbc_label_195);
	
	textField_187 = new JTextField();
	textField_187.setColumns(10);
	GridBagConstraints gbc_textField_187 = new GridBagConstraints();
	gbc_textField_187.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_187.insets = new Insets(0, 0, 5, 5);
	gbc_textField_187.gridx = 7;
	gbc_textField_187.gridy = 8;
	cpp_workstation14.add(textField_187, gbc_textField_187);
	
	JLabel label_196 = new JLabel("\u00DCberstunden (min) ");
	GridBagConstraints gbc_label_196 = new GridBagConstraints();
	gbc_label_196.anchor = GridBagConstraints.WEST;
	gbc_label_196.insets = new Insets(0, 0, 5, 5);
	gbc_label_196.gridx = 1;
	gbc_label_196.gridy = 9;
	cpp_workstation14.add(label_196, gbc_label_196);
	
	textField_188 = new JTextField();
	textField_188.setColumns(10);
	GridBagConstraints gbc_textField_188 = new GridBagConstraints();
	gbc_textField_188.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_188.insets = new Insets(0, 0, 5, 5);
	gbc_textField_188.gridx = 7;
	gbc_textField_188.gridy = 9;
	cpp_workstation14.add(textField_188, gbc_textField_188);
	
	JPanel cpp_workstation15 = new JPanel();
	capacityplanningPane.addTab("W15", null, cpp_workstation15, null);
	GridBagLayout gbl_cpp_workstation15 = new GridBagLayout();
	gbl_cpp_workstation15.columnWidths = new int[]{30, 70, 20, 40, 40, 78, 20, 60, 60, 0, 0, 0};
	gbl_cpp_workstation15.rowHeights = new int[]{40, 0, 30, 0, 30, 0, 30, 0, 0, 0, 0, 0, 30, 30, 0};
	gbl_cpp_workstation15.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 4.9E-324, 0.0, Double.MIN_VALUE};
	gbl_cpp_workstation15.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	cpp_workstation15.setLayout(gbl_cpp_workstation15);
	
	JLabel label_197 = new JLabel("Arbeitsplatz");
	GridBagConstraints gbc_label_197 = new GridBagConstraints();
	gbc_label_197.anchor = GridBagConstraints.WEST;
	gbc_label_197.insets = new Insets(0, 0, 5, 5);
	gbc_label_197.gridx = 1;
	gbc_label_197.gridy = 1;
	cpp_workstation15.add(label_197, gbc_label_197);
	
	JLabel label_198 = new JLabel("15");
	GridBagConstraints gbc_label_198 = new GridBagConstraints();
	gbc_label_198.insets = new Insets(0, 0, 5, 5);
	gbc_label_198.gridx = 2;
	gbc_label_198.gridy = 1;
	cpp_workstation15.add(label_198, gbc_label_198);
	
	JLabel label_199 = new JLabel("Sattel");
	GridBagConstraints gbc_label_199 = new GridBagConstraints();
	gbc_label_199.anchor = GridBagConstraints.WEST;
	gbc_label_199.insets = new Insets(0, 0, 5, 5);
	gbc_label_199.gridx = 1;
	gbc_label_199.gridy = 3;
	cpp_workstation15.add(label_199, gbc_label_199);
	
	JLabel label_200 = new JLabel("KDH");
	GridBagConstraints gbc_label_200 = new GridBagConstraints();
	gbc_label_200.insets = new Insets(0, 0, 5, 5);
	gbc_label_200.gridx = 3;
	gbc_label_200.gridy = 3;
	cpp_workstation15.add(label_200, gbc_label_200);
	
	JLabel lblE_26 = new JLabel("E17");
	GridBagConstraints gbc_lblE_26 = new GridBagConstraints();
	gbc_lblE_26.anchor = GridBagConstraints.EAST;
	gbc_lblE_26.insets = new Insets(0, 0, 5, 5);
	gbc_lblE_26.gridx = 4;
	gbc_lblE_26.gridy = 3;
	cpp_workstation15.add(lblE_26, gbc_lblE_26);
	
	cptf15_17 = new JTextField();
	cptf15_17.setColumns(10);
	GridBagConstraints gbc_cptf15_17 = new GridBagConstraints();
	gbc_cptf15_17.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf15_17.insets = new Insets(0, 0, 5, 5);
	gbc_cptf15_17.gridx = 5;
	gbc_cptf15_17.gridy = 3;
	cpp_workstation15.add(cptf15_17, gbc_cptf15_17);
	
	JLabel label_202 = new JLabel("x2 =");
	GridBagConstraints gbc_label_202 = new GridBagConstraints();
	gbc_label_202.anchor = GridBagConstraints.EAST;
	gbc_label_202.insets = new Insets(0, 0, 5, 5);
	gbc_label_202.gridx = 6;
	gbc_label_202.gridy = 3;
	cpp_workstation15.add(label_202, gbc_label_202);
	
	textField_190 = new JTextField();
	textField_190.setColumns(10);
	GridBagConstraints gbc_textField_190 = new GridBagConstraints();
	gbc_textField_190.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_190.insets = new Insets(0, 0, 5, 5);
	gbc_textField_190.gridx = 7;
	gbc_textField_190.gridy = 3;
	cpp_workstation15.add(textField_190, gbc_textField_190);
	
	JLabel label_203 = new JLabel("Pedale");
	GridBagConstraints gbc_label_203 = new GridBagConstraints();
	gbc_label_203.anchor = GridBagConstraints.WEST;
	gbc_label_203.insets = new Insets(0, 0, 5, 5);
	gbc_label_203.gridx = 1;
	gbc_label_203.gridy = 5;
	cpp_workstation15.add(label_203, gbc_label_203);
	
	JLabel label_204 = new JLabel("KDH");
	GridBagConstraints gbc_label_204 = new GridBagConstraints();
	gbc_label_204.insets = new Insets(0, 0, 5, 5);
	gbc_label_204.gridx = 3;
	gbc_label_204.gridy = 5;
	cpp_workstation15.add(label_204, gbc_label_204);
	
	JLabel label_205 = new JLabel("E26");
	GridBagConstraints gbc_label_205 = new GridBagConstraints();
	gbc_label_205.anchor = GridBagConstraints.EAST;
	gbc_label_205.insets = new Insets(0, 0, 5, 5);
	gbc_label_205.gridx = 4;
	gbc_label_205.gridy = 5;
	cpp_workstation15.add(label_205, gbc_label_205);
	
	cptf15_26 = new JTextField();
	cptf15_26.setColumns(10);
	GridBagConstraints gbc_cptf15_26 = new GridBagConstraints();
	gbc_cptf15_26.fill = GridBagConstraints.HORIZONTAL;
	gbc_cptf15_26.insets = new Insets(0, 0, 5, 5);
	gbc_cptf15_26.gridx = 5;
	gbc_cptf15_26.gridy = 5;
	cpp_workstation15.add(cptf15_26, gbc_cptf15_26);
	
	JLabel label_207 = new JLabel("x3 =");
	GridBagConstraints gbc_label_207 = new GridBagConstraints();
	gbc_label_207.anchor = GridBagConstraints.EAST;
	gbc_label_207.insets = new Insets(0, 0, 5, 5);
	gbc_label_207.gridx = 6;
	gbc_label_207.gridy = 5;
	cpp_workstation15.add(label_207, gbc_label_207);
	
	textField_192 = new JTextField();
	textField_192.setColumns(10);
	GridBagConstraints gbc_textField_192 = new GridBagConstraints();
	gbc_textField_192.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_192.insets = new Insets(0, 0, 5, 5);
	gbc_textField_192.gridx = 7;
	gbc_textField_192.gridy = 5;
	cpp_workstation15.add(textField_192, gbc_textField_192);
	
	JSeparator separator_13 = new JSeparator();
	GridBagConstraints gbc_separator_13 = new GridBagConstraints();
	gbc_separator_13.fill = GridBagConstraints.HORIZONTAL;
	gbc_separator_13.gridwidth = 7;
	gbc_separator_13.insets = new Insets(0, 0, 5, 5);
	gbc_separator_13.gridx = 1;
	gbc_separator_13.gridy = 6;
	cpp_workstation15.add(separator_13, gbc_separator_13);
	
	JLabel label_214 = new JLabel("Kapazit\u00E4tsbedarf ");
	GridBagConstraints gbc_label_214 = new GridBagConstraints();
	gbc_label_214.anchor = GridBagConstraints.WEST;
	gbc_label_214.insets = new Insets(0, 0, 5, 5);
	gbc_label_214.gridx = 1;
	gbc_label_214.gridy = 7;
	cpp_workstation15.add(label_214, gbc_label_214);
	
	textField_197 = new JTextField();
	textField_197.setColumns(10);
	GridBagConstraints gbc_textField_197 = new GridBagConstraints();
	gbc_textField_197.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_197.insets = new Insets(0, 0, 5, 5);
	gbc_textField_197.gridx = 7;
	gbc_textField_197.gridy = 7;
	cpp_workstation15.add(textField_197, gbc_textField_197);
	
	JLabel label_215 = new JLabel("R\u00FCstzeit");
	GridBagConstraints gbc_label_215 = new GridBagConstraints();
	gbc_label_215.anchor = GridBagConstraints.WEST;
	gbc_label_215.insets = new Insets(0, 0, 5, 5);
	gbc_label_215.gridx = 1;
	gbc_label_215.gridy = 8;
	cpp_workstation15.add(label_215, gbc_label_215);
	
	textField_198 = new JTextField();
	textField_198.setColumns(10);
	GridBagConstraints gbc_textField_198 = new GridBagConstraints();
	gbc_textField_198.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_198.insets = new Insets(0, 0, 5, 5);
	gbc_textField_198.gridx = 7;
	gbc_textField_198.gridy = 8;
	cpp_workstation15.add(textField_198, gbc_textField_198);
	
	JLabel label_216 = new JLabel("Totale Kapazit\u00E4t");
	GridBagConstraints gbc_label_216 = new GridBagConstraints();
	gbc_label_216.anchor = GridBagConstraints.WEST;
	gbc_label_216.insets = new Insets(0, 0, 5, 5);
	gbc_label_216.gridx = 1;
	gbc_label_216.gridy = 9;
	cpp_workstation15.add(label_216, gbc_label_216);
	
	textField_199 = new JTextField();
	textField_199.setColumns(10);
	GridBagConstraints gbc_textField_199 = new GridBagConstraints();
	gbc_textField_199.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_199.insets = new Insets(0, 0, 5, 5);
	gbc_textField_199.gridx = 7;
	gbc_textField_199.gridy = 9;
	cpp_workstation15.add(textField_199, gbc_textField_199);
	
	JLabel label_217 = new JLabel("Auslastung %");
	GridBagConstraints gbc_label_217 = new GridBagConstraints();
	gbc_label_217.anchor = GridBagConstraints.WEST;
	gbc_label_217.insets = new Insets(0, 0, 5, 5);
	gbc_label_217.gridx = 1;
	gbc_label_217.gridy = 10;
	cpp_workstation15.add(label_217, gbc_label_217);
	
	textField_200 = new JTextField();
	textField_200.setColumns(10);
	GridBagConstraints gbc_textField_200 = new GridBagConstraints();
	gbc_textField_200.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_200.insets = new Insets(0, 0, 5, 5);
	gbc_textField_200.gridx = 7;
	gbc_textField_200.gridy = 10;
	cpp_workstation15.add(textField_200, gbc_textField_200);
	
	JLabel label_218 = new JLabel("\u00DCberstunden (min) ");
	GridBagConstraints gbc_label_218 = new GridBagConstraints();
	gbc_label_218.anchor = GridBagConstraints.WEST;
	gbc_label_218.insets = new Insets(0, 0, 5, 5);
	gbc_label_218.gridx = 1;
	gbc_label_218.gridy = 11;
	cpp_workstation15.add(label_218, gbc_label_218);
	
	textField_201 = new JTextField();
	textField_201.setColumns(10);
	GridBagConstraints gbc_textField_201 = new GridBagConstraints();
	gbc_textField_201.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_201.insets = new Insets(0, 0, 5, 5);
	gbc_textField_201.gridx = 7;
	gbc_textField_201.gridy = 11;
	cpp_workstation15.add(textField_201, gbc_textField_201);
	
	return capacityplanningPane;
	}

}
