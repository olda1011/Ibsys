package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import application.Main;
import util.Utility;

public class MaterialPlanning {

	// ---------P1--------------
	private static JTextField tf1_0101;
	private static JTextField tf1_0301;
	private static JTextField tf1_0401;
	private static JTextField tf1_0501;
	private static JTextField tf1_0601;
	private static JTextField tf1_0701;
	private static JTextField tf1_0102;
	private static JTextField tf1_0202;
	private static JTextField tf1_0302;
	private static JTextField tf1_0402;
	private static JTextField tf1_0502;
	private static JTextField tf1_0602;
	private static JTextField tf1_0702;
	private static JTextField tf1_0103;
	private static JTextField tf1_0203;
	private static JTextField tf1_0303;
	private static JTextField tf1_0403;
	private static JTextField tf1_0503;
	private static JTextField tf1_0603;
	private static JTextField tf1_0703;
	private static JTextField tf1_0104;
	private static JTextField tf1_0204;
	private static JTextField tf1_0304;
	private static JTextField tf1_0404;
	private static JTextField tf1_0504;
	private static JTextField tf1_0604;
	private static JTextField tf1_0704;
	private static JTextField tf1_0105;
	private static JTextField tf1_0205;
	private static JTextField tf1_0305;
	private static JTextField tf1_0405;
	private static JTextField tf1_0505;
	private static JTextField tf1_0605;
	private static JTextField tf1_0705;
	private static JTextField tf1_0106;
	private static JTextField tf1_0206;
	private static JTextField tf1_0306;
	private static JTextField tf1_0406;
	private static JTextField tf1_0506;
	private static JTextField tf1_0606;
	private static JTextField tf1_0706;
	private static JTextField tf1_0107;
	private static JTextField tf1_0207;
	private static JTextField tf1_0307;
	private static JTextField tf1_0407;
	private static JTextField tf1_0507;
	private static JTextField tf1_0607;
	private static JTextField tf1_0707;
	private static JTextField tf1_0108;
	private static JTextField tf1_0208;
	private static JTextField tf1_0308;
	private static JTextField tf1_0408;
	private static JTextField tf1_0508;
	private static JTextField tf1_0608;
	private static JTextField tf1_0708;
	private static JTextField tf1_0109;
	private static JTextField tf1_0209;
	private static JTextField tf1_0309;
	private static JTextField tf1_0409;
	private static JTextField tf1_0509;
	private static JTextField tf1_0609;
	private static JTextField tf1_0709;
	private static JTextField tf1_0110;
	private static JTextField tf1_0210;
	private static JTextField tf1_0310;
	private static JTextField tf1_0410;
	private static JTextField tf1_0510;
	private static JTextField tf1_0610;
	private static JTextField tf1_0710;
	private static JTextField tf1_0111;
	private static JTextField tf1_0211;
	private static JTextField tf1_0311;
	private static JTextField tf1_0411;
	private static JTextField tf1_0511;
	private static JTextField tf1_0611;
	private static JTextField tf1_0711;
	private static JTextField tf1_0112;
	private static JTextField tf1_0212;
	private static JTextField tf1_0312;
	private static JTextField tf1_0412;
	private static JTextField tf1_0512;
	private static JTextField tf1_0612;
	private static JTextField tf1_0712;

	// --------P2---------------

	private static JTextField tf2_0301;
	private static JTextField tf2_0102;
	private static JTextField tf2_0101;

	public static JTextField getTf2_0301() {
		return tf2_0301;
	}

	public static JTextField getTf2_0102() {
		return tf2_0102;
	}

	public static JTextField getTf2_0101() {
		return tf2_0101;
	}

	public static JTextField getTf2_0103() {
		return tf2_0103;
	}

	public static JTextField getTf2_0104() {
		return tf2_0104;
	}

	public static JTextField getTf2_0105() {
		return tf2_0105;
	}

	public static JTextField getTf2_0106() {
		return tf2_0106;
	}

	public static JTextField getTf2_0107() {
		return tf2_0107;
	}

	public static JTextField getTf2_0108() {
		return tf2_0108;
	}

	public static JTextField getTf2_0109() {
		return tf2_0109;
	}

	public static JTextField getTf2_0110() {
		return tf2_0110;
	}

	public static JTextField getTf2_0111() {
		return tf2_0111;
	}

	public static JTextField getTf2_0112() {
		return tf2_0112;
	}

	public static JTextField getTf2_0202() {
		return tf2_0202;
	}

	public static JTextField getTf2_0302() {
		return tf2_0302;
	}

	public static JTextField getTf2_0203() {
		return tf2_0203;
	}

	public static JTextField getTf2_0206() {
		return tf2_0206;
	}

	public static JTextField getTf2_0205() {
		return tf2_0205;
	}

	public static JTextField getTf2_0204() {
		return tf2_0204;
	}

	public static JTextField getTf2_0207() {
		return tf2_0207;
	}

	public static JTextField getTf2_0208() {
		return tf2_0208;
	}

	public static JTextField getTf2_0209() {
		return tf2_0209;
	}

	public static JTextField getTf2_0210() {
		return tf2_0210;
	}

	public static JTextField getTf2_0211() {
		return tf2_0211;
	}

	public static JTextField getTf2_0212() {
		return tf2_0212;
	}

	public static JTextField getTf2_0303() {
		return tf2_0303;
	}

	public static JTextField getTf2_0304() {
		return tf2_0304;
	}

	public static JTextField getTf2_0305() {
		return tf2_0305;
	}

	public static JTextField getTf2_0306() {
		return tf2_0306;
	}

	public static JTextField getTf2_0307() {
		return tf2_0307;
	}

	public static JTextField getTf2_0308() {
		return tf2_0308;
	}

	public static JTextField getTf2_0309() {
		return tf2_0309;
	}

	public static JTextField getTf2_0310() {
		return tf2_0310;
	}

	public static JTextField getTf2_0311() {
		return tf2_0311;
	}

	public static JTextField getTf2_0312() {
		return tf2_0312;
	}

	public static JTextField getTf2_0402() {
		return tf2_0402;
	}

	public static JTextField getTf2_0403() {
		return tf2_0403;
	}

	public static JTextField getTf2_0404() {
		return tf2_0404;
	}

	public static JTextField getTf2_0405() {
		return tf2_0405;
	}

	public static JTextField getTf2_0406() {
		return tf2_0406;
	}

	public static JTextField getTf2_0407() {
		return tf2_0407;
	}

	public static JTextField getTf2_0408() {
		return tf2_0408;
	}

	public static JTextField getTf2_0409() {
		return tf2_0409;
	}

	public static JTextField getTf2_0410() {
		return tf2_0410;
	}

	public static JTextField getTf2_0411() {
		return tf2_0411;
	}

	public static JTextField getTf2_0412() {
		return tf2_0412;
	}

	public static JTextField getTf2_0401() {
		return tf2_0401;
	}

	public static JTextField getTf2_0501() {
		return tf2_0501;
	}

	public static JTextField getTf2_0502() {
		return tf2_0502;
	}

	public static JTextField getTf2_0503() {
		return tf2_0503;
	}

	public static JTextField getTf2_0504() {
		return tf2_0504;
	}

	public static JTextField getTf2_0505() {
		return tf2_0505;
	}

	public static JTextField getTf2_0506() {
		return tf2_0506;
	}

	public static JTextField getTf2_0507() {
		return tf2_0507;
	}

	public static JTextField getTf2_0508() {
		return tf2_0508;
	}

	public static JTextField getTf2_0509() {
		return tf2_0509;
	}

	public static JTextField getTf2_0510() {
		return tf2_0510;
	}

	public static JTextField getTf2_0511() {
		return tf2_0511;
	}

	public static JTextField getTf2_0512() {
		return tf2_0512;
	}

	public static JTextField getTf2_0601() {
		return tf2_0601;
	}

	public static JTextField getTf2_0602() {
		return tf2_0602;
	}

	public static JTextField getTf2_0603() {
		return tf2_0603;
	}

	public static JTextField getTf2_0604() {
		return tf2_0604;
	}

	public static JTextField getTf2_0605() {
		return tf2_0605;
	}

	public static JTextField getTf2_0606() {
		return tf2_0606;
	}

	public static JTextField getTf2_0607() {
		return tf2_0607;
	}

	public static JTextField getTf2_0608() {
		return tf2_0608;
	}

	public static JTextField getTf2_0609() {
		return tf2_0609;
	}

	public static JTextField getTf2_0610() {
		return tf2_0610;
	}

	public static JTextField getTf2_0611() {
		return tf2_0611;
	}

	public static JTextField getTf2_0612() {
		return tf2_0612;
	}

	public static JTextField getTf2_0701() {
		return tf2_0701;
	}

	public static JTextField getTf2_0702() {
		return tf2_0702;
	}

	public static JTextField getTf2_0703() {
		return tf2_0703;
	}

	public static JTextField getTf2_0704() {
		return tf2_0704;
	}

	public static JTextField getTf2_0705() {
		return tf2_0705;
	}

	public static JTextField getTf2_0706() {
		return tf2_0706;
	}

	public static JTextField getTf2_0707() {
		return tf2_0707;
	}

	public static JTextField getTf2_0708() {
		return tf2_0708;
	}

	public static JTextField getTf2_0709() {
		return tf2_0709;
	}

	public static JTextField getTf2_0710() {
		return tf2_0710;
	}

	public static JTextField getTf2_0711() {
		return tf2_0711;
	}

	public static JTextField getTf2_0712() {
		return tf2_0712;
	}

	public static JTextField getTf3_0101() {
		return tf3_0101;
	}

	public static JTextField getTf3_0301() {
		return tf3_0301;
	}

	public static JTextField getTf3_0401() {
		return tf3_0401;
	}

	public static JTextField getTf3_0501() {
		return tf3_0501;
	}

	public static JTextField getTf3_0601() {
		return tf3_0601;
	}

	public static JTextField getTf3_0701() {
		return tf3_0701;
	}

	public static JTextField getTf3_0102() {
		return tf3_0102;
	}

	public static JTextField getTf3_0202() {
		return tf3_0202;
	}

	public static JTextField getTf3_0302() {
		return tf3_0302;
	}

	public static JTextField getTf3_0402() {
		return tf3_0402;
	}

	public static JTextField getTf3_0502() {
		return tf3_0502;
	}

	public static JTextField getTf3_0602() {
		return tf3_0602;
	}

	public static JTextField getTf3_0702() {
		return tf3_0702;
	}

	public static JTextField getTf3_0103() {
		return tf3_0103;
	}

	public static JTextField getTf3_0203() {
		return tf3_0203;
	}

	public static JTextField getTf3_0303() {
		return tf3_0303;
	}

	public static JTextField getTf3_0403() {
		return tf3_0403;
	}

	public static JTextField getTf3_0503() {
		return tf3_0503;
	}

	public static JTextField getTf3_0603() {
		return tf3_0603;
	}

	public static JTextField getTf3_0703() {
		return tf3_0703;
	}

	public static JTextField getTf3_0104() {
		return tf3_0104;
	}

	public static JTextField getTf3_0204() {
		return tf3_0204;
	}

	public static JTextField getTf3_0304() {
		return tf3_0304;
	}

	public static JTextField getTf3_0404() {
		return tf3_0404;
	}

	public static JTextField getTf3_0504() {
		return tf3_0504;
	}

	public static JTextField getTf3_0604() {
		return tf3_0604;
	}

	public static JTextField getTf3_0704() {
		return tf3_0704;
	}

	public static JTextField getTf3_0105() {
		return tf3_0105;
	}

	public static JTextField getTf3_0205() {
		return tf3_0205;
	}

	public static JTextField getTf3_0305() {
		return tf3_0305;
	}

	public static JTextField getTf3_0405() {
		return tf3_0405;
	}

	public static JTextField getTf3_0505() {
		return tf3_0505;
	}

	public static JTextField getTf3_0605() {
		return tf3_0605;
	}

	public static JTextField getTf3_0705() {
		return tf3_0705;
	}

	public static JTextField getTf3_0106() {
		return tf3_0106;
	}

	public static JTextField getTf3_0206() {
		return tf3_0206;
	}

	public static JTextField getTf3_0306() {
		return tf3_0306;
	}

	public static JTextField getTf3_0406() {
		return tf3_0406;
	}

	public static JTextField getTf3_0506() {
		return tf3_0506;
	}

	public static JTextField getTf3_0606() {
		return tf3_0606;
	}

	public static JTextField getTf3_0706() {
		return tf3_0706;
	}

	public static JTextField getTf3_0107() {
		return tf3_0107;
	}

	public static JTextField getTf3_0207() {
		return tf3_0207;
	}

	public static JTextField getTf3_0307() {
		return tf3_0307;
	}

	public static JTextField getTf3_0407() {
		return tf3_0407;
	}

	public static JTextField getTf3_0507() {
		return tf3_0507;
	}

	public static JTextField getTf3_0607() {
		return tf3_0607;
	}

	public static JTextField getTf3_0707() {
		return tf3_0707;
	}

	public static JTextField getTf3_0108() {
		return tf3_0108;
	}

	public static JTextField getTf3_0208() {
		return tf3_0208;
	}

	public static JTextField getTf3_0308() {
		return tf3_0308;
	}

	public static JTextField getTf3_0408() {
		return tf3_0408;
	}

	public static JTextField getTf3_0508() {
		return tf3_0508;
	}

	public static JTextField getTf3_0608() {
		return tf3_0608;
	}

	public static JTextField getTf3_0708() {
		return tf3_0708;
	}

	public static JTextField getTf3_0109() {
		return tf3_0109;
	}

	public static JTextField getTf3_0209() {
		return tf3_0209;
	}

	public static JTextField getTf3_0309() {
		return tf3_0309;
	}

	public static JTextField getTf3_0409() {
		return tf3_0409;
	}

	public static JTextField getTf3_0509() {
		return tf3_0509;
	}

	public static JTextField getTf3_0609() {
		return tf3_0609;
	}

	public static JTextField getTf3_0709() {
		return tf3_0709;
	}

	public static JTextField getTf3_0110() {
		return tf3_0110;
	}

	public static JTextField getTf3_0210() {
		return tf3_0210;
	}

	public static JTextField getTf3_0310() {
		return tf3_0310;
	}

	public static JTextField getTf3_0410() {
		return tf3_0410;
	}

	public static JTextField getTf3_0510() {
		return tf3_0510;
	}

	public static JTextField getTf3_0610() {
		return tf3_0610;
	}

	public static JTextField getTf3_0710() {
		return tf3_0710;
	}

	public static JTextField getTf3_0111() {
		return tf3_0111;
	}

	public static JTextField getTf3_0211() {
		return tf3_0211;
	}

	public static JTextField getTf3_0311() {
		return tf3_0311;
	}

	public static JTextField getTf3_0411() {
		return tf3_0411;
	}

	public static JTextField getTf3_0511() {
		return tf3_0511;
	}

	public static JTextField getTf3_0611() {
		return tf3_0611;
	}

	public static JTextField getTf3_0711() {
		return tf3_0711;
	}

	public static JTextField getTf3_0112() {
		return tf3_0112;
	}

	public static JTextField getTf3_0212() {
		return tf3_0212;
	}

	public static JTextField getTf3_0312() {
		return tf3_0312;
	}

	public static JTextField getTf3_0412() {
		return tf3_0412;
	}

	public static JTextField getTf3_0512() {
		return tf3_0512;
	}

	public static JTextField getTf3_0612() {
		return tf3_0612;
	}

	public static JTextField getTf3_0712() {
		return tf3_0712;
	}

	private static JTextField tf2_0103;
	private static JTextField tf2_0104;
	private static JTextField tf2_0105;
	private static JTextField tf2_0106;
	private static JTextField tf2_0107;
	private static JTextField tf2_0108;
	private static JTextField tf2_0109;
	private static JTextField tf2_0110;
	private static JTextField tf2_0111;
	private static JTextField tf2_0112;
	private static JTextField tf2_0202;
	private static JTextField tf2_0302;
	private static JTextField tf2_0203;
	private static JTextField tf2_0206;
	private static JTextField tf2_0205;
	private static JTextField tf2_0204;
	private static JTextField tf2_0207;
	private static JTextField tf2_0208;
	private static JTextField tf2_0209;
	private static JTextField tf2_0210;
	private static JTextField tf2_0211;
	private static JTextField tf2_0212;
	private static JTextField tf2_0303;
	private static JTextField tf2_0304;
	private static JTextField tf2_0305;
	private static JTextField tf2_0306;
	private static JTextField tf2_0307;
	private static JTextField tf2_0308;
	private static JTextField tf2_0309;
	private static JTextField tf2_0310;
	private static JTextField tf2_0311;
	private static JTextField tf2_0312;
	private static JTextField tf2_0402;
	private static JTextField tf2_0403;
	private static JTextField tf2_0404;
	private static JTextField tf2_0405;
	private static JTextField tf2_0406;
	private static JTextField tf2_0407;
	private static JTextField tf2_0408;
	private static JTextField tf2_0409;
	private static JTextField tf2_0410;
	private static JTextField tf2_0411;
	private static JTextField tf2_0412;
	private static JTextField tf2_0401;
	private static JTextField tf2_0501;
	private static JTextField tf2_0502;
	private static JTextField tf2_0503;
	private static JTextField tf2_0504;
	private static JTextField tf2_0505;
	private static JTextField tf2_0506;
	private static JTextField tf2_0507;
	private static JTextField tf2_0508;
	private static JTextField tf2_0509;
	private static JTextField tf2_0510;
	private static JTextField tf2_0511;
	private static JTextField tf2_0512;
	private static JTextField tf2_0601;
	private static JTextField tf2_0602;
	private static JTextField tf2_0603;
	private static JTextField tf2_0604;
	private static JTextField tf2_0605;
	private static JTextField tf2_0606;
	private static JTextField tf2_0607;
	private static JTextField tf2_0608;
	private static JTextField tf2_0609;
	private static JTextField tf2_0610;
	private static JTextField tf2_0611;
	private static JTextField tf2_0612;
	private static JTextField tf2_0701;
	private static JTextField tf2_0702;
	private static JTextField tf2_0703;
	private static JTextField tf2_0704;
	private static JTextField tf2_0705;
	private static JTextField tf2_0706;
	private static JTextField tf2_0707;
	private static JTextField tf2_0708;
	private static JTextField tf2_0709;
	private static JTextField tf2_0710;
	private static JTextField tf2_0711;
	private static JTextField tf2_0712;

	// -------------P3--------------

	private static JTextField tf3_0101;
	private static JTextField tf3_0301;
	private static JTextField tf3_0401;
	private static JTextField tf3_0501;
	private static JTextField tf3_0601;
	private static JTextField tf3_0701;
	private static JTextField tf3_0102;
	private static JTextField tf3_0202;
	private static JTextField tf3_0302;
	private static JTextField tf3_0402;
	private static JTextField tf3_0502;
	private static JTextField tf3_0602;
	private static JTextField tf3_0702;
	private static JTextField tf3_0103;
	private static JTextField tf3_0203;
	private static JTextField tf3_0303;
	private static JTextField tf3_0403;
	private static JTextField tf3_0503;
	private static JTextField tf3_0603;
	private static JTextField tf3_0703;
	private static JTextField tf3_0104;
	private static JTextField tf3_0204;
	private static JTextField tf3_0304;
	private static JTextField tf3_0404;
	private static JTextField tf3_0504;
	private static JTextField tf3_0604;
	private static JTextField tf3_0704;
	private static JTextField tf3_0105;
	private static JTextField tf3_0205;
	private static JTextField tf3_0305;
	private static JTextField tf3_0405;
	private static JTextField tf3_0505;
	private static JTextField tf3_0605;
	private static JTextField tf3_0705;
	private static JTextField tf3_0106;
	private static JTextField tf3_0206;
	private static JTextField tf3_0306;
	private static JTextField tf3_0406;
	private static JTextField tf3_0506;
	private static JTextField tf3_0606;
	private static JTextField tf3_0706;
	private static JTextField tf3_0107;
	private static JTextField tf3_0207;
	private static JTextField tf3_0307;
	private static JTextField tf3_0407;
	private static JTextField tf3_0507;
	private static JTextField tf3_0607;
	private static JTextField tf3_0707;
	private static JTextField tf3_0108;
	private static JTextField tf3_0208;
	private static JTextField tf3_0308;
	private static JTextField tf3_0408;
	private static JTextField tf3_0508;
	private static JTextField tf3_0608;
	private static JTextField tf3_0708;
	private static JTextField tf3_0109;
	private static JTextField tf3_0209;
	private static JTextField tf3_0309;
	private static JTextField tf3_0409;
	private static JTextField tf3_0509;
	private static JTextField tf3_0609;
	private static JTextField tf3_0709;
	private static JTextField tf3_0110;
	private static JTextField tf3_0210;
	private static JTextField tf3_0310;
	private static JTextField tf3_0410;
	private static JTextField tf3_0510;
	private static JTextField tf3_0610;
	private static JTextField tf3_0710;
	private static JTextField tf3_0111;
	private static JTextField tf3_0211;
	private static JTextField tf3_0311;
	private static JTextField tf3_0411;
	private static JTextField tf3_0511;
	private static JTextField tf3_0611;
	private static JTextField tf3_0711;
	private static JTextField tf3_0112;
	private static JTextField tf3_0212;
	private static JTextField tf3_0312;
	private static JTextField tf3_0412;
	private static JTextField tf3_0512;
	private static JTextField tf3_0612;
	private static JTextField tf3_0712;

	public MaterialPlanning() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public static JTabbedPane materialPlanning() {

		JTabbedPane materialplanningPane = new JTabbedPane(JTabbedPane.TOP);

		JPanel p1_panel = new JPanel();
		materialplanningPane.addTab("P1", null, p1_panel, null);
		GridBagLayout gbl_p1_panel = new GridBagLayout();
		gbl_p1_panel.columnWidths = new int[] { 0, 0, 85, 0, 85, 0, 85, 10, 85, 0, 85, 0, 85, 0, 85,
				27, 0, 0 };
		gbl_p1_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0 };
		gbl_p1_panel.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0,
				0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_p1_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		p1_panel.setLayout(gbl_p1_panel);

		JLabel l1_warehousestock = new JLabel("Warehouse stock");
		GridBagConstraints gbc_l1_warehousestock = new GridBagConstraints();
		gbc_l1_warehousestock.gridwidth = 3;
		gbc_l1_warehousestock.insets = new Insets(0, 0, 5, 5);
		gbc_l1_warehousestock.gridx = 6;
		gbc_l1_warehousestock.gridy = 1;
		p1_panel.add(l1_warehousestock, gbc_l1_warehousestock);

		JLabel l1_salesorder = new JLabel("Sales Orders");
		GridBagConstraints gbc_l1_salesorder = new GridBagConstraints();
		gbc_l1_salesorder.insets = new Insets(0, 0, 5, 5);
		gbc_l1_salesorder.gridx = 2;
		gbc_l1_salesorder.gridy = 2;
		p1_panel.add(l1_salesorder, gbc_l1_salesorder);

		JLabel l1_followingperiod = new JLabel("following period");
		GridBagConstraints gbc_l1_followingperiod = new GridBagConstraints();
		gbc_l1_followingperiod.insets = new Insets(0, 0, 5, 5);
		gbc_l1_followingperiod.gridx = 6;
		gbc_l1_followingperiod.gridy = 2;
		p1_panel.add(l1_followingperiod, gbc_l1_followingperiod);

		JLabel l1_passedperiod = new JLabel("passed period");
		GridBagConstraints gbc_l1_passedperiod = new GridBagConstraints();
		gbc_l1_passedperiod.insets = new Insets(0, 0, 5, 5);
		gbc_l1_passedperiod.gridx = 8;
		gbc_l1_passedperiod.gridy = 2;
		p1_panel.add(l1_passedperiod, gbc_l1_passedperiod);

		JLabel l1_waitingqueue = new JLabel("Waiting queue");
		GridBagConstraints gbc_l1_waitingqueue = new GridBagConstraints();
		gbc_l1_waitingqueue.insets = new Insets(0, 0, 5, 5);
		gbc_l1_waitingqueue.gridx = 10;
		gbc_l1_waitingqueue.gridy = 2;
		p1_panel.add(l1_waitingqueue, gbc_l1_waitingqueue);

		JLabel l1_workinprogress = new JLabel("Work in progress");
		GridBagConstraints gbc_l1_workinprogress = new GridBagConstraints();
		gbc_l1_workinprogress.insets = new Insets(0, 0, 5, 5);
		gbc_l1_workinprogress.gridx = 12;
		gbc_l1_workinprogress.gridy = 2;
		p1_panel.add(l1_workinprogress, gbc_l1_workinprogress);

		JLabel l1_productionorders = new JLabel("Production orders");
		GridBagConstraints gbc_l1_productionorders = new GridBagConstraints();
		gbc_l1_productionorders.insets = new Insets(0, 0, 5, 5);
		gbc_l1_productionorders.gridx = 14;
		gbc_l1_productionorders.gridy = 2;
		p1_panel.add(l1_productionorders, gbc_l1_productionorders);

		JLabel lblP_1 = new JLabel("P1");
		GridBagConstraints gbc_lblP_1 = new GridBagConstraints();
		gbc_lblP_1.anchor = GridBagConstraints.WEST;
		gbc_lblP_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblP_1.gridx = 1;
		gbc_lblP_1.gridy = 3;
		p1_panel.add(lblP_1, gbc_lblP_1);

		tf1_0101 = new JTextField();
		tf1_0101.setColumns(10);
		GridBagConstraints gbc_tf1_0101 = new GridBagConstraints();
		gbc_tf1_0101.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0101.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0101.gridx = 2;
		gbc_tf1_0101.gridy = 3;
		p1_panel.add(tf1_0101, gbc_tf1_0101);

		JLabel label_90 = new JLabel("+");
		GridBagConstraints gbc_label_90 = new GridBagConstraints();
		gbc_label_90.fill = GridBagConstraints.VERTICAL;
		gbc_label_90.gridwidth = 3;
		gbc_label_90.insets = new Insets(0, 0, 5, 5);
		gbc_label_90.gridx = 3;
		gbc_label_90.gridy = 3;
		p1_panel.add(label_90, gbc_label_90);

		tf1_0301 = new JTextField();
		tf1_0301.setColumns(10);
		GridBagConstraints gbc_tf1_0301 = new GridBagConstraints();
		gbc_tf1_0301.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0301.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0301.gridx = 6;
		gbc_tf1_0301.gridy = 3;
		p1_panel.add(tf1_0301, gbc_tf1_0301);

		JLabel label_91 = new JLabel("-");
		GridBagConstraints gbc_label_91 = new GridBagConstraints();
		gbc_label_91.anchor = GridBagConstraints.EAST;
		gbc_label_91.insets = new Insets(0, 0, 5, 5);
		gbc_label_91.gridx = 7;
		gbc_label_91.gridy = 3;
		p1_panel.add(label_91, gbc_label_91);

		tf1_0401 = new JTextField();
		tf1_0401.setColumns(10);
		GridBagConstraints gbc_tf1_0401 = new GridBagConstraints();
		gbc_tf1_0401.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0401.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0401.gridx = 8;
		gbc_tf1_0401.gridy = 3;
		p1_panel.add(tf1_0401, gbc_tf1_0401);

		JLabel label_92 = new JLabel("-");
		GridBagConstraints gbc_label_92 = new GridBagConstraints();
		gbc_label_92.anchor = GridBagConstraints.EAST;
		gbc_label_92.insets = new Insets(0, 0, 5, 5);
		gbc_label_92.gridx = 9;
		gbc_label_92.gridy = 3;
		p1_panel.add(label_92, gbc_label_92);

		tf1_0501 = new JTextField();
		tf1_0501.setColumns(10);
		GridBagConstraints gbc_tf1_0501 = new GridBagConstraints();
		gbc_tf1_0501.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0501.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0501.gridx = 10;
		gbc_tf1_0501.gridy = 3;
		p1_panel.add(tf1_0501, gbc_tf1_0501);

		JLabel label_93 = new JLabel("-");
		GridBagConstraints gbc_label_93 = new GridBagConstraints();
		gbc_label_93.anchor = GridBagConstraints.EAST;
		gbc_label_93.insets = new Insets(0, 0, 5, 5);
		gbc_label_93.gridx = 11;
		gbc_label_93.gridy = 3;
		p1_panel.add(label_93, gbc_label_93);

		tf1_0601 = new JTextField();
		tf1_0601.setColumns(10);
		GridBagConstraints gbc_tf1_0601 = new GridBagConstraints();
		gbc_tf1_0601.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0601.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0601.gridx = 12;
		gbc_tf1_0601.gridy = 3;
		p1_panel.add(tf1_0601, gbc_tf1_0601);

		JLabel label_94 = new JLabel("=");
		GridBagConstraints gbc_label_94 = new GridBagConstraints();
		gbc_label_94.anchor = GridBagConstraints.EAST;
		gbc_label_94.insets = new Insets(0, 0, 5, 5);
		gbc_label_94.gridx = 13;
		gbc_label_94.gridy = 3;
		p1_panel.add(label_94, gbc_label_94);

		tf1_0701 = new JTextField();
		tf1_0701.setColumns(10);
		GridBagConstraints gbc_tf1_0701 = new GridBagConstraints();
		gbc_tf1_0701.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0701.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0701.gridx = 14;
		gbc_tf1_0701.gridy = 3;
		p1_panel.add(tf1_0701, gbc_tf1_0701);

		JLabel label_95 = new JLabel("P1");
		GridBagConstraints gbc_label_95 = new GridBagConstraints();
		gbc_label_95.anchor = GridBagConstraints.EAST;
		gbc_label_95.insets = new Insets(0, 0, 5, 5);
		gbc_label_95.gridx = 15;
		gbc_label_95.gridy = 3;
		p1_panel.add(label_95, gbc_label_95);

		JSeparator separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_1.gridwidth = 15;
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 1;
		gbc_separator_1.gridy = 4;
		p1_panel.add(separator_1, gbc_separator_1);

		JLabel label_96 = new JLabel("E26");
		GridBagConstraints gbc_label_96 = new GridBagConstraints();
		gbc_label_96.anchor = GridBagConstraints.WEST;
		gbc_label_96.insets = new Insets(0, 0, 5, 5);
		gbc_label_96.gridx = 1;
		gbc_label_96.gridy = 5;
		p1_panel.add(label_96, gbc_label_96);

		tf1_0102 = new JTextField();
		tf1_0102.setColumns(10);
		GridBagConstraints gbc_tf1_0102 = new GridBagConstraints();
		gbc_tf1_0102.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0102.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0102.gridx = 2;
		gbc_tf1_0102.gridy = 5;
		p1_panel.add(tf1_0102, gbc_tf1_0102);

		JLabel label_97 = new JLabel("+");
		GridBagConstraints gbc_label_97 = new GridBagConstraints();
		gbc_label_97.anchor = GridBagConstraints.EAST;
		gbc_label_97.insets = new Insets(0, 0, 5, 5);
		gbc_label_97.gridx = 3;
		gbc_label_97.gridy = 5;
		p1_panel.add(label_97, gbc_label_97);

		tf1_0202 = new JTextField();
		tf1_0202.setColumns(10);
		GridBagConstraints gbc_tf1_0202 = new GridBagConstraints();
		gbc_tf1_0202.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0202.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0202.gridx = 4;
		gbc_tf1_0202.gridy = 5;
		p1_panel.add(tf1_0202, gbc_tf1_0202);

		JLabel label_98 = new JLabel("+");
		GridBagConstraints gbc_label_98 = new GridBagConstraints();
		gbc_label_98.anchor = GridBagConstraints.EAST;
		gbc_label_98.insets = new Insets(0, 0, 5, 5);
		gbc_label_98.gridx = 5;
		gbc_label_98.gridy = 5;
		p1_panel.add(label_98, gbc_label_98);

		tf1_0302 = new JTextField();
		tf1_0302.setColumns(10);
		GridBagConstraints gbc_tf1_0302 = new GridBagConstraints();
		gbc_tf1_0302.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0302.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0302.gridx = 6;
		gbc_tf1_0302.gridy = 5;
		p1_panel.add(tf1_0302, gbc_tf1_0302);

		JLabel label_99 = new JLabel("-");
		GridBagConstraints gbc_label_99 = new GridBagConstraints();
		gbc_label_99.anchor = GridBagConstraints.EAST;
		gbc_label_99.insets = new Insets(0, 0, 5, 5);
		gbc_label_99.gridx = 7;
		gbc_label_99.gridy = 5;
		p1_panel.add(label_99, gbc_label_99);

		tf1_0402 = new JTextField();
		tf1_0402.setColumns(10);
		GridBagConstraints gbc_tf1_0402 = new GridBagConstraints();
		gbc_tf1_0402.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0402.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0402.gridx = 8;
		gbc_tf1_0402.gridy = 5;
		p1_panel.add(tf1_0402, gbc_tf1_0402);

		JLabel label_100 = new JLabel("-");
		GridBagConstraints gbc_label_100 = new GridBagConstraints();
		gbc_label_100.anchor = GridBagConstraints.EAST;
		gbc_label_100.insets = new Insets(0, 0, 5, 5);
		gbc_label_100.gridx = 9;
		gbc_label_100.gridy = 5;
		p1_panel.add(label_100, gbc_label_100);

		tf1_0502 = new JTextField();
		tf1_0502.setColumns(10);
		GridBagConstraints gbc_tf1_0502 = new GridBagConstraints();
		gbc_tf1_0502.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0502.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0502.gridx = 10;
		gbc_tf1_0502.gridy = 5;
		p1_panel.add(tf1_0502, gbc_tf1_0502);

		JLabel label_101 = new JLabel("-");
		GridBagConstraints gbc_label_101 = new GridBagConstraints();
		gbc_label_101.anchor = GridBagConstraints.EAST;
		gbc_label_101.insets = new Insets(0, 0, 5, 5);
		gbc_label_101.gridx = 11;
		gbc_label_101.gridy = 5;
		p1_panel.add(label_101, gbc_label_101);

		tf1_0602 = new JTextField();
		tf1_0602.setColumns(10);
		GridBagConstraints gbc_tf1_0602 = new GridBagConstraints();
		gbc_tf1_0602.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0602.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0602.gridx = 12;
		gbc_tf1_0602.gridy = 5;
		p1_panel.add(tf1_0602, gbc_tf1_0602);

		JLabel label_102 = new JLabel("=");
		GridBagConstraints gbc_label_102 = new GridBagConstraints();
		gbc_label_102.anchor = GridBagConstraints.EAST;
		gbc_label_102.insets = new Insets(0, 0, 5, 5);
		gbc_label_102.gridx = 13;
		gbc_label_102.gridy = 5;
		p1_panel.add(label_102, gbc_label_102);

		tf1_0702 = new JTextField();
		tf1_0702.setColumns(10);
		GridBagConstraints gbc_tf1_0702 = new GridBagConstraints();
		gbc_tf1_0702.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0702.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0702.gridx = 14;
		gbc_tf1_0702.gridy = 5;
		p1_panel.add(tf1_0702, gbc_tf1_0702);

		JLabel label_103 = new JLabel("E26");
		GridBagConstraints gbc_label_103 = new GridBagConstraints();
		gbc_label_103.anchor = GridBagConstraints.EAST;
		gbc_label_103.insets = new Insets(0, 0, 5, 5);
		gbc_label_103.gridx = 15;
		gbc_label_103.gridy = 5;
		p1_panel.add(label_103, gbc_label_103);

		JLabel label_104 = new JLabel("E51");
		GridBagConstraints gbc_label_104 = new GridBagConstraints();
		gbc_label_104.anchor = GridBagConstraints.WEST;
		gbc_label_104.insets = new Insets(0, 0, 5, 5);
		gbc_label_104.gridx = 1;
		gbc_label_104.gridy = 6;
		p1_panel.add(label_104, gbc_label_104);

		tf1_0103 = new JTextField();
		tf1_0103.setColumns(10);
		GridBagConstraints gbc_tf1_0103 = new GridBagConstraints();
		gbc_tf1_0103.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0103.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0103.gridx = 2;
		gbc_tf1_0103.gridy = 6;
		p1_panel.add(tf1_0103, gbc_tf1_0103);

		JLabel label_105 = new JLabel("+");
		GridBagConstraints gbc_label_105 = new GridBagConstraints();
		gbc_label_105.anchor = GridBagConstraints.EAST;
		gbc_label_105.insets = new Insets(0, 0, 5, 5);
		gbc_label_105.gridx = 3;
		gbc_label_105.gridy = 6;
		p1_panel.add(label_105, gbc_label_105);

		tf1_0203 = new JTextField();
		tf1_0203.setColumns(10);
		GridBagConstraints gbc_tf1_0203 = new GridBagConstraints();
		gbc_tf1_0203.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0203.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0203.gridx = 4;
		gbc_tf1_0203.gridy = 6;
		p1_panel.add(tf1_0203, gbc_tf1_0203);

		JLabel label_106 = new JLabel("+");
		GridBagConstraints gbc_label_106 = new GridBagConstraints();
		gbc_label_106.anchor = GridBagConstraints.EAST;
		gbc_label_106.insets = new Insets(0, 0, 5, 5);
		gbc_label_106.gridx = 5;
		gbc_label_106.gridy = 6;
		p1_panel.add(label_106, gbc_label_106);

		tf1_0303 = new JTextField();
		tf1_0303.setColumns(10);
		GridBagConstraints gbc_tf1_0303 = new GridBagConstraints();
		gbc_tf1_0303.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0303.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0303.gridx = 6;
		gbc_tf1_0303.gridy = 6;
		p1_panel.add(tf1_0303, gbc_tf1_0303);

		JLabel label_107 = new JLabel("-");
		GridBagConstraints gbc_label_107 = new GridBagConstraints();
		gbc_label_107.anchor = GridBagConstraints.EAST;
		gbc_label_107.insets = new Insets(0, 0, 5, 5);
		gbc_label_107.gridx = 7;
		gbc_label_107.gridy = 6;
		p1_panel.add(label_107, gbc_label_107);

		tf1_0403 = new JTextField();
		tf1_0403.setColumns(10);
		GridBagConstraints gbc_tf1_0403 = new GridBagConstraints();
		gbc_tf1_0403.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0403.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0403.gridx = 8;
		gbc_tf1_0403.gridy = 6;
		p1_panel.add(tf1_0403, gbc_tf1_0403);

		JLabel label_108 = new JLabel("-");
		GridBagConstraints gbc_label_108 = new GridBagConstraints();
		gbc_label_108.anchor = GridBagConstraints.EAST;
		gbc_label_108.insets = new Insets(0, 0, 5, 5);
		gbc_label_108.gridx = 9;
		gbc_label_108.gridy = 6;
		p1_panel.add(label_108, gbc_label_108);

		tf1_0503 = new JTextField();
		tf1_0503.setColumns(10);
		GridBagConstraints gbc_tf1_0503 = new GridBagConstraints();
		gbc_tf1_0503.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0503.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0503.gridx = 10;
		gbc_tf1_0503.gridy = 6;
		p1_panel.add(tf1_0503, gbc_tf1_0503);

		JLabel label_109 = new JLabel("-");
		GridBagConstraints gbc_label_109 = new GridBagConstraints();
		gbc_label_109.anchor = GridBagConstraints.EAST;
		gbc_label_109.insets = new Insets(0, 0, 5, 5);
		gbc_label_109.gridx = 11;
		gbc_label_109.gridy = 6;
		p1_panel.add(label_109, gbc_label_109);

		tf1_0603 = new JTextField();
		tf1_0603.setColumns(10);
		GridBagConstraints gbc_tf1_0603 = new GridBagConstraints();
		gbc_tf1_0603.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0603.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0603.gridx = 12;
		gbc_tf1_0603.gridy = 6;
		p1_panel.add(tf1_0603, gbc_tf1_0603);

		JLabel label_110 = new JLabel("=");
		GridBagConstraints gbc_label_110 = new GridBagConstraints();
		gbc_label_110.anchor = GridBagConstraints.EAST;
		gbc_label_110.insets = new Insets(0, 0, 5, 5);
		gbc_label_110.gridx = 13;
		gbc_label_110.gridy = 6;
		p1_panel.add(label_110, gbc_label_110);

		tf1_0703 = new JTextField();
		tf1_0703.setColumns(10);
		GridBagConstraints gbc_tf1_0703 = new GridBagConstraints();
		gbc_tf1_0703.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0703.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0703.gridx = 14;
		gbc_tf1_0703.gridy = 6;
		p1_panel.add(tf1_0703, gbc_tf1_0703);

		JLabel label_111 = new JLabel("E51");
		GridBagConstraints gbc_label_111 = new GridBagConstraints();
		gbc_label_111.anchor = GridBagConstraints.EAST;
		gbc_label_111.insets = new Insets(0, 0, 5, 5);
		gbc_label_111.gridx = 15;
		gbc_label_111.gridy = 6;
		p1_panel.add(label_111, gbc_label_111);

		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator.gridwidth = 15;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 7;
		p1_panel.add(separator, gbc_separator);

		JLabel label_112 = new JLabel("E16");
		GridBagConstraints gbc_label_112 = new GridBagConstraints();
		gbc_label_112.anchor = GridBagConstraints.WEST;
		gbc_label_112.insets = new Insets(0, 0, 5, 5);
		gbc_label_112.gridx = 1;
		gbc_label_112.gridy = 8;
		p1_panel.add(label_112, gbc_label_112);

		tf1_0104 = new JTextField();
		tf1_0104.setColumns(10);
		GridBagConstraints gbc_tf1_0104 = new GridBagConstraints();
		gbc_tf1_0104.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0104.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0104.gridx = 2;
		gbc_tf1_0104.gridy = 8;
		p1_panel.add(tf1_0104, gbc_tf1_0104);

		JLabel label_113 = new JLabel("+");
		GridBagConstraints gbc_label_113 = new GridBagConstraints();
		gbc_label_113.anchor = GridBagConstraints.EAST;
		gbc_label_113.insets = new Insets(0, 0, 5, 5);
		gbc_label_113.gridx = 3;
		gbc_label_113.gridy = 8;
		p1_panel.add(label_113, gbc_label_113);

		tf1_0204 = new JTextField();
		tf1_0204.setColumns(10);
		GridBagConstraints gbc_tf1_0204 = new GridBagConstraints();
		gbc_tf1_0204.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0204.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0204.gridx = 4;
		gbc_tf1_0204.gridy = 8;
		p1_panel.add(tf1_0204, gbc_tf1_0204);

		JLabel label_114 = new JLabel("+");
		GridBagConstraints gbc_label_114 = new GridBagConstraints();
		gbc_label_114.anchor = GridBagConstraints.EAST;
		gbc_label_114.insets = new Insets(0, 0, 5, 5);
		gbc_label_114.gridx = 5;
		gbc_label_114.gridy = 8;
		p1_panel.add(label_114, gbc_label_114);

		tf1_0304 = new JTextField();
		tf1_0304.setColumns(10);
		GridBagConstraints gbc_tf1_0304 = new GridBagConstraints();
		gbc_tf1_0304.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0304.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0304.gridx = 6;
		gbc_tf1_0304.gridy = 8;
		p1_panel.add(tf1_0304, gbc_tf1_0304);

		JLabel label_115 = new JLabel("-");
		GridBagConstraints gbc_label_115 = new GridBagConstraints();
		gbc_label_115.anchor = GridBagConstraints.EAST;
		gbc_label_115.insets = new Insets(0, 0, 5, 5);
		gbc_label_115.gridx = 7;
		gbc_label_115.gridy = 8;
		p1_panel.add(label_115, gbc_label_115);

		tf1_0404 = new JTextField();
		tf1_0404.setColumns(10);
		GridBagConstraints gbc_tf1_0404 = new GridBagConstraints();
		gbc_tf1_0404.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0404.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0404.gridx = 8;
		gbc_tf1_0404.gridy = 8;
		p1_panel.add(tf1_0404, gbc_tf1_0404);

		JLabel label_116 = new JLabel("-");
		GridBagConstraints gbc_label_116 = new GridBagConstraints();
		gbc_label_116.anchor = GridBagConstraints.EAST;
		gbc_label_116.insets = new Insets(0, 0, 5, 5);
		gbc_label_116.gridx = 9;
		gbc_label_116.gridy = 8;
		p1_panel.add(label_116, gbc_label_116);

		tf1_0504 = new JTextField();
		tf1_0504.setColumns(10);
		GridBagConstraints gbc_tf1_0504 = new GridBagConstraints();
		gbc_tf1_0504.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0504.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0504.gridx = 10;
		gbc_tf1_0504.gridy = 8;
		p1_panel.add(tf1_0504, gbc_tf1_0504);

		JLabel label_117 = new JLabel("-");
		GridBagConstraints gbc_label_117 = new GridBagConstraints();
		gbc_label_117.anchor = GridBagConstraints.EAST;
		gbc_label_117.insets = new Insets(0, 0, 5, 5);
		gbc_label_117.gridx = 11;
		gbc_label_117.gridy = 8;
		p1_panel.add(label_117, gbc_label_117);

		tf1_0604 = new JTextField();
		tf1_0604.setColumns(10);
		GridBagConstraints gbc_tf1_0604 = new GridBagConstraints();
		gbc_tf1_0604.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0604.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0604.gridx = 12;
		gbc_tf1_0604.gridy = 8;
		p1_panel.add(tf1_0604, gbc_tf1_0604);

		JLabel label_118 = new JLabel("=");
		GridBagConstraints gbc_label_118 = new GridBagConstraints();
		gbc_label_118.anchor = GridBagConstraints.EAST;
		gbc_label_118.insets = new Insets(0, 0, 5, 5);
		gbc_label_118.gridx = 13;
		gbc_label_118.gridy = 8;
		p1_panel.add(label_118, gbc_label_118);

		tf1_0704 = new JTextField();
		tf1_0704.setColumns(10);
		GridBagConstraints gbc_tf1_0704 = new GridBagConstraints();
		gbc_tf1_0704.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0704.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0704.gridx = 14;
		gbc_tf1_0704.gridy = 8;
		p1_panel.add(tf1_0704, gbc_tf1_0704);

		JLabel label_119 = new JLabel("E16");
		GridBagConstraints gbc_label_119 = new GridBagConstraints();
		gbc_label_119.anchor = GridBagConstraints.EAST;
		gbc_label_119.insets = new Insets(0, 0, 5, 5);
		gbc_label_119.gridx = 15;
		gbc_label_119.gridy = 8;
		p1_panel.add(label_119, gbc_label_119);

		JLabel label_120 = new JLabel("E17");
		GridBagConstraints gbc_label_120 = new GridBagConstraints();
		gbc_label_120.anchor = GridBagConstraints.WEST;
		gbc_label_120.insets = new Insets(0, 0, 5, 5);
		gbc_label_120.gridx = 1;
		gbc_label_120.gridy = 9;
		p1_panel.add(label_120, gbc_label_120);

		tf1_0105 = new JTextField();
		tf1_0105.setColumns(10);
		GridBagConstraints gbc_tf1_0105 = new GridBagConstraints();
		gbc_tf1_0105.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0105.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0105.gridx = 2;
		gbc_tf1_0105.gridy = 9;
		p1_panel.add(tf1_0105, gbc_tf1_0105);

		JLabel label_121 = new JLabel("+");
		GridBagConstraints gbc_label_121 = new GridBagConstraints();
		gbc_label_121.anchor = GridBagConstraints.EAST;
		gbc_label_121.insets = new Insets(0, 0, 5, 5);
		gbc_label_121.gridx = 3;
		gbc_label_121.gridy = 9;
		p1_panel.add(label_121, gbc_label_121);

		tf1_0205 = new JTextField();
		tf1_0205.setColumns(10);
		GridBagConstraints gbc_tf1_0205 = new GridBagConstraints();
		gbc_tf1_0205.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0205.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0205.gridx = 4;
		gbc_tf1_0205.gridy = 9;
		p1_panel.add(tf1_0205, gbc_tf1_0205);

		JLabel label_122 = new JLabel("+");
		GridBagConstraints gbc_label_122 = new GridBagConstraints();
		gbc_label_122.anchor = GridBagConstraints.EAST;
		gbc_label_122.insets = new Insets(0, 0, 5, 5);
		gbc_label_122.gridx = 5;
		gbc_label_122.gridy = 9;
		p1_panel.add(label_122, gbc_label_122);

		tf1_0305 = new JTextField();
		tf1_0305.setColumns(10);
		GridBagConstraints gbc_tf1_0305 = new GridBagConstraints();
		gbc_tf1_0305.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0305.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0305.gridx = 6;
		gbc_tf1_0305.gridy = 9;
		p1_panel.add(tf1_0305, gbc_tf1_0305);

		JLabel label_123 = new JLabel("-");
		GridBagConstraints gbc_label_123 = new GridBagConstraints();
		gbc_label_123.anchor = GridBagConstraints.EAST;
		gbc_label_123.insets = new Insets(0, 0, 5, 5);
		gbc_label_123.gridx = 7;
		gbc_label_123.gridy = 9;
		p1_panel.add(label_123, gbc_label_123);

		tf1_0405 = new JTextField();
		tf1_0405.setColumns(10);
		GridBagConstraints gbc_tf1_0405 = new GridBagConstraints();
		gbc_tf1_0405.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0405.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0405.gridx = 8;
		gbc_tf1_0405.gridy = 9;
		p1_panel.add(tf1_0405, gbc_tf1_0405);

		JLabel label_124 = new JLabel("-");
		GridBagConstraints gbc_label_124 = new GridBagConstraints();
		gbc_label_124.anchor = GridBagConstraints.EAST;
		gbc_label_124.insets = new Insets(0, 0, 5, 5);
		gbc_label_124.gridx = 9;
		gbc_label_124.gridy = 9;
		p1_panel.add(label_124, gbc_label_124);

		tf1_0505 = new JTextField();
		tf1_0505.setColumns(10);
		GridBagConstraints gbc_tf1_0505 = new GridBagConstraints();
		gbc_tf1_0505.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0505.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0505.gridx = 10;
		gbc_tf1_0505.gridy = 9;
		p1_panel.add(tf1_0505, gbc_tf1_0505);

		JLabel label_125 = new JLabel("-");
		GridBagConstraints gbc_label_125 = new GridBagConstraints();
		gbc_label_125.anchor = GridBagConstraints.EAST;
		gbc_label_125.insets = new Insets(0, 0, 5, 5);
		gbc_label_125.gridx = 11;
		gbc_label_125.gridy = 9;
		p1_panel.add(label_125, gbc_label_125);

		tf1_0605 = new JTextField();
		tf1_0605.setColumns(10);
		GridBagConstraints gbc_tf1_0605 = new GridBagConstraints();
		gbc_tf1_0605.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0605.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0605.gridx = 12;
		gbc_tf1_0605.gridy = 9;
		p1_panel.add(tf1_0605, gbc_tf1_0605);

		JLabel label_126 = new JLabel("=");
		GridBagConstraints gbc_label_126 = new GridBagConstraints();
		gbc_label_126.anchor = GridBagConstraints.EAST;
		gbc_label_126.insets = new Insets(0, 0, 5, 5);
		gbc_label_126.gridx = 13;
		gbc_label_126.gridy = 9;
		p1_panel.add(label_126, gbc_label_126);

		tf1_0705 = new JTextField();
		tf1_0705.setColumns(10);
		GridBagConstraints gbc_tf1_0705 = new GridBagConstraints();
		gbc_tf1_0705.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0705.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0705.gridx = 14;
		gbc_tf1_0705.gridy = 9;
		p1_panel.add(tf1_0705, gbc_tf1_0705);

		JLabel label_127 = new JLabel("E17");
		GridBagConstraints gbc_label_127 = new GridBagConstraints();
		gbc_label_127.anchor = GridBagConstraints.EAST;
		gbc_label_127.insets = new Insets(0, 0, 5, 5);
		gbc_label_127.gridx = 15;
		gbc_label_127.gridy = 9;
		p1_panel.add(label_127, gbc_label_127);

		JLabel label_128 = new JLabel("E50");
		GridBagConstraints gbc_label_128 = new GridBagConstraints();
		gbc_label_128.anchor = GridBagConstraints.WEST;
		gbc_label_128.insets = new Insets(0, 0, 5, 5);
		gbc_label_128.gridx = 1;
		gbc_label_128.gridy = 10;
		p1_panel.add(label_128, gbc_label_128);

		tf1_0106 = new JTextField();
		tf1_0106.setColumns(10);
		GridBagConstraints gbc_tf1_0106 = new GridBagConstraints();
		gbc_tf1_0106.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0106.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0106.gridx = 2;
		gbc_tf1_0106.gridy = 10;
		p1_panel.add(tf1_0106, gbc_tf1_0106);

		JLabel label_129 = new JLabel("+");
		GridBagConstraints gbc_label_129 = new GridBagConstraints();
		gbc_label_129.anchor = GridBagConstraints.EAST;
		gbc_label_129.insets = new Insets(0, 0, 5, 5);
		gbc_label_129.gridx = 3;
		gbc_label_129.gridy = 10;
		p1_panel.add(label_129, gbc_label_129);

		tf1_0206 = new JTextField();
		tf1_0206.setColumns(10);
		GridBagConstraints gbc_tf1_0206 = new GridBagConstraints();
		gbc_tf1_0206.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0206.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0206.gridx = 4;
		gbc_tf1_0206.gridy = 10;
		p1_panel.add(tf1_0206, gbc_tf1_0206);

		JLabel label_130 = new JLabel("+");
		GridBagConstraints gbc_label_130 = new GridBagConstraints();
		gbc_label_130.anchor = GridBagConstraints.EAST;
		gbc_label_130.insets = new Insets(0, 0, 5, 5);
		gbc_label_130.gridx = 5;
		gbc_label_130.gridy = 10;
		p1_panel.add(label_130, gbc_label_130);

		tf1_0306 = new JTextField();
		tf1_0306.setColumns(10);
		GridBagConstraints gbc_tf1_0306 = new GridBagConstraints();
		gbc_tf1_0306.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0306.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0306.gridx = 6;
		gbc_tf1_0306.gridy = 10;
		p1_panel.add(tf1_0306, gbc_tf1_0306);

		JLabel label_131 = new JLabel("-");
		GridBagConstraints gbc_label_131 = new GridBagConstraints();
		gbc_label_131.anchor = GridBagConstraints.EAST;
		gbc_label_131.insets = new Insets(0, 0, 5, 5);
		gbc_label_131.gridx = 7;
		gbc_label_131.gridy = 10;
		p1_panel.add(label_131, gbc_label_131);

		tf1_0406 = new JTextField();
		tf1_0406.setColumns(10);
		GridBagConstraints gbc_tf1_0406 = new GridBagConstraints();
		gbc_tf1_0406.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0406.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0406.gridx = 8;
		gbc_tf1_0406.gridy = 10;
		p1_panel.add(tf1_0406, gbc_tf1_0406);

		JLabel label_132 = new JLabel("-");
		GridBagConstraints gbc_label_132 = new GridBagConstraints();
		gbc_label_132.anchor = GridBagConstraints.EAST;
		gbc_label_132.insets = new Insets(0, 0, 5, 5);
		gbc_label_132.gridx = 9;
		gbc_label_132.gridy = 10;
		p1_panel.add(label_132, gbc_label_132);

		tf1_0506 = new JTextField();
		tf1_0506.setColumns(10);
		GridBagConstraints gbc_tf1_0506 = new GridBagConstraints();
		gbc_tf1_0506.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0506.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0506.gridx = 10;
		gbc_tf1_0506.gridy = 10;
		p1_panel.add(tf1_0506, gbc_tf1_0506);

		JLabel label_133 = new JLabel("-");
		GridBagConstraints gbc_label_133 = new GridBagConstraints();
		gbc_label_133.anchor = GridBagConstraints.EAST;
		gbc_label_133.insets = new Insets(0, 0, 5, 5);
		gbc_label_133.gridx = 11;
		gbc_label_133.gridy = 10;
		p1_panel.add(label_133, gbc_label_133);

		tf1_0606 = new JTextField();
		tf1_0606.setColumns(10);
		GridBagConstraints gbc_tf1_0606 = new GridBagConstraints();
		gbc_tf1_0606.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0606.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0606.gridx = 12;
		gbc_tf1_0606.gridy = 10;
		p1_panel.add(tf1_0606, gbc_tf1_0606);

		JLabel label_134 = new JLabel("=");
		GridBagConstraints gbc_label_134 = new GridBagConstraints();
		gbc_label_134.anchor = GridBagConstraints.EAST;
		gbc_label_134.insets = new Insets(0, 0, 5, 5);
		gbc_label_134.gridx = 13;
		gbc_label_134.gridy = 10;
		p1_panel.add(label_134, gbc_label_134);

		tf1_0706 = new JTextField();
		tf1_0706.setColumns(10);
		GridBagConstraints gbc_tf1_0706 = new GridBagConstraints();
		gbc_tf1_0706.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0706.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0706.gridx = 14;
		gbc_tf1_0706.gridy = 10;
		p1_panel.add(tf1_0706, gbc_tf1_0706);

		JLabel label_135 = new JLabel("E50");
		GridBagConstraints gbc_label_135 = new GridBagConstraints();
		gbc_label_135.anchor = GridBagConstraints.EAST;
		gbc_label_135.insets = new Insets(0, 0, 5, 5);
		gbc_label_135.gridx = 15;
		gbc_label_135.gridy = 10;
		p1_panel.add(label_135, gbc_label_135);

		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.gridwidth = 15;
		gbc_separator_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 1;
		gbc_separator_2.gridy = 11;
		p1_panel.add(separator_2, gbc_separator_2);

		JLabel label_136 = new JLabel("E4");
		GridBagConstraints gbc_label_136 = new GridBagConstraints();
		gbc_label_136.anchor = GridBagConstraints.WEST;
		gbc_label_136.insets = new Insets(0, 0, 5, 5);
		gbc_label_136.gridx = 1;
		gbc_label_136.gridy = 12;
		p1_panel.add(label_136, gbc_label_136);

		tf1_0107 = new JTextField();
		tf1_0107.setColumns(10);
		GridBagConstraints gbc_tf1_0107 = new GridBagConstraints();
		gbc_tf1_0107.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0107.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0107.gridx = 2;
		gbc_tf1_0107.gridy = 12;
		p1_panel.add(tf1_0107, gbc_tf1_0107);

		JLabel label_137 = new JLabel("+");
		GridBagConstraints gbc_label_137 = new GridBagConstraints();
		gbc_label_137.anchor = GridBagConstraints.EAST;
		gbc_label_137.insets = new Insets(0, 0, 5, 5);
		gbc_label_137.gridx = 3;
		gbc_label_137.gridy = 12;
		p1_panel.add(label_137, gbc_label_137);

		tf1_0207 = new JTextField();
		tf1_0207.setColumns(10);
		GridBagConstraints gbc_tf1_0207 = new GridBagConstraints();
		gbc_tf1_0207.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0207.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0207.gridx = 4;
		gbc_tf1_0207.gridy = 12;
		p1_panel.add(tf1_0207, gbc_tf1_0207);

		JLabel label_138 = new JLabel("+");
		GridBagConstraints gbc_label_138 = new GridBagConstraints();
		gbc_label_138.anchor = GridBagConstraints.EAST;
		gbc_label_138.insets = new Insets(0, 0, 5, 5);
		gbc_label_138.gridx = 5;
		gbc_label_138.gridy = 12;
		p1_panel.add(label_138, gbc_label_138);

		tf1_0307 = new JTextField();
		tf1_0307.setColumns(10);
		GridBagConstraints gbc_tf1_0307 = new GridBagConstraints();
		gbc_tf1_0307.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0307.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0307.gridx = 6;
		gbc_tf1_0307.gridy = 12;
		p1_panel.add(tf1_0307, gbc_tf1_0307);

		JLabel label_139 = new JLabel("-");
		GridBagConstraints gbc_label_139 = new GridBagConstraints();
		gbc_label_139.anchor = GridBagConstraints.EAST;
		gbc_label_139.insets = new Insets(0, 0, 5, 5);
		gbc_label_139.gridx = 7;
		gbc_label_139.gridy = 12;
		p1_panel.add(label_139, gbc_label_139);

		tf1_0407 = new JTextField();
		tf1_0407.setColumns(10);
		GridBagConstraints gbc_tf1_0407 = new GridBagConstraints();
		gbc_tf1_0407.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0407.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0407.gridx = 8;
		gbc_tf1_0407.gridy = 12;
		p1_panel.add(tf1_0407, gbc_tf1_0407);

		JLabel label_140 = new JLabel("-");
		GridBagConstraints gbc_label_140 = new GridBagConstraints();
		gbc_label_140.anchor = GridBagConstraints.EAST;
		gbc_label_140.insets = new Insets(0, 0, 5, 5);
		gbc_label_140.gridx = 9;
		gbc_label_140.gridy = 12;
		p1_panel.add(label_140, gbc_label_140);

		tf1_0507 = new JTextField();
		tf1_0507.setColumns(10);
		GridBagConstraints gbc_tf1_0507 = new GridBagConstraints();
		gbc_tf1_0507.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0507.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0507.gridx = 10;
		gbc_tf1_0507.gridy = 12;
		p1_panel.add(tf1_0507, gbc_tf1_0507);

		JLabel label_141 = new JLabel("-");
		GridBagConstraints gbc_label_141 = new GridBagConstraints();
		gbc_label_141.anchor = GridBagConstraints.EAST;
		gbc_label_141.insets = new Insets(0, 0, 5, 5);
		gbc_label_141.gridx = 11;
		gbc_label_141.gridy = 12;
		p1_panel.add(label_141, gbc_label_141);

		tf1_0607 = new JTextField();
		tf1_0607.setColumns(10);
		GridBagConstraints gbc_tf1_0607 = new GridBagConstraints();
		gbc_tf1_0607.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0607.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0607.gridx = 12;
		gbc_tf1_0607.gridy = 12;
		p1_panel.add(tf1_0607, gbc_tf1_0607);

		JLabel label_142 = new JLabel("=");
		GridBagConstraints gbc_label_142 = new GridBagConstraints();
		gbc_label_142.anchor = GridBagConstraints.EAST;
		gbc_label_142.insets = new Insets(0, 0, 5, 5);
		gbc_label_142.gridx = 13;
		gbc_label_142.gridy = 12;
		p1_panel.add(label_142, gbc_label_142);

		tf1_0707 = new JTextField();
		tf1_0707.setColumns(10);
		GridBagConstraints gbc_tf1_0707 = new GridBagConstraints();
		gbc_tf1_0707.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0707.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0707.gridx = 14;
		gbc_tf1_0707.gridy = 12;
		p1_panel.add(tf1_0707, gbc_tf1_0707);

		JLabel label_143 = new JLabel("E4");
		GridBagConstraints gbc_label_143 = new GridBagConstraints();
		gbc_label_143.anchor = GridBagConstraints.EAST;
		gbc_label_143.insets = new Insets(0, 0, 5, 5);
		gbc_label_143.gridx = 15;
		gbc_label_143.gridy = 12;
		p1_panel.add(label_143, gbc_label_143);

		JLabel label_144 = new JLabel("E10");
		GridBagConstraints gbc_label_144 = new GridBagConstraints();
		gbc_label_144.anchor = GridBagConstraints.WEST;
		gbc_label_144.insets = new Insets(0, 0, 5, 5);
		gbc_label_144.gridx = 1;
		gbc_label_144.gridy = 13;
		p1_panel.add(label_144, gbc_label_144);

		tf1_0108 = new JTextField();
		tf1_0108.setColumns(10);
		GridBagConstraints gbc_tf1_0108 = new GridBagConstraints();
		gbc_tf1_0108.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0108.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0108.gridx = 2;
		gbc_tf1_0108.gridy = 13;
		p1_panel.add(tf1_0108, gbc_tf1_0108);

		JLabel label_145 = new JLabel("+");
		GridBagConstraints gbc_label_145 = new GridBagConstraints();
		gbc_label_145.anchor = GridBagConstraints.EAST;
		gbc_label_145.insets = new Insets(0, 0, 5, 5);
		gbc_label_145.gridx = 3;
		gbc_label_145.gridy = 13;
		p1_panel.add(label_145, gbc_label_145);

		tf1_0208 = new JTextField();
		tf1_0208.setColumns(10);
		GridBagConstraints gbc_tf1_0208 = new GridBagConstraints();
		gbc_tf1_0208.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0208.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0208.gridx = 4;
		gbc_tf1_0208.gridy = 13;
		p1_panel.add(tf1_0208, gbc_tf1_0208);

		JLabel label_146 = new JLabel("+");
		GridBagConstraints gbc_label_146 = new GridBagConstraints();
		gbc_label_146.anchor = GridBagConstraints.EAST;
		gbc_label_146.insets = new Insets(0, 0, 5, 5);
		gbc_label_146.gridx = 5;
		gbc_label_146.gridy = 13;
		p1_panel.add(label_146, gbc_label_146);

		tf1_0308 = new JTextField();
		tf1_0308.setColumns(10);
		GridBagConstraints gbc_tf1_0308 = new GridBagConstraints();
		gbc_tf1_0308.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0308.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0308.gridx = 6;
		gbc_tf1_0308.gridy = 13;
		p1_panel.add(tf1_0308, gbc_tf1_0308);

		JLabel label_147 = new JLabel("-");
		GridBagConstraints gbc_label_147 = new GridBagConstraints();
		gbc_label_147.anchor = GridBagConstraints.EAST;
		gbc_label_147.insets = new Insets(0, 0, 5, 5);
		gbc_label_147.gridx = 7;
		gbc_label_147.gridy = 13;
		p1_panel.add(label_147, gbc_label_147);

		tf1_0408 = new JTextField();
		tf1_0408.setColumns(10);
		GridBagConstraints gbc_tf1_0408 = new GridBagConstraints();
		gbc_tf1_0408.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0408.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0408.gridx = 8;
		gbc_tf1_0408.gridy = 13;
		p1_panel.add(tf1_0408, gbc_tf1_0408);

		JLabel label_148 = new JLabel("-");
		GridBagConstraints gbc_label_148 = new GridBagConstraints();
		gbc_label_148.anchor = GridBagConstraints.EAST;
		gbc_label_148.insets = new Insets(0, 0, 5, 5);
		gbc_label_148.gridx = 9;
		gbc_label_148.gridy = 13;
		p1_panel.add(label_148, gbc_label_148);

		tf1_0508 = new JTextField();
		tf1_0508.setColumns(10);
		GridBagConstraints gbc_tf1_0508 = new GridBagConstraints();
		gbc_tf1_0508.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0508.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0508.gridx = 10;
		gbc_tf1_0508.gridy = 13;
		p1_panel.add(tf1_0508, gbc_tf1_0508);

		JLabel label_149 = new JLabel("-");
		GridBagConstraints gbc_label_149 = new GridBagConstraints();
		gbc_label_149.anchor = GridBagConstraints.EAST;
		gbc_label_149.insets = new Insets(0, 0, 5, 5);
		gbc_label_149.gridx = 11;
		gbc_label_149.gridy = 13;
		p1_panel.add(label_149, gbc_label_149);

		tf1_0608 = new JTextField();
		tf1_0608.setColumns(10);
		GridBagConstraints gbc_tf1_0608 = new GridBagConstraints();
		gbc_tf1_0608.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0608.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0608.gridx = 12;
		gbc_tf1_0608.gridy = 13;
		p1_panel.add(tf1_0608, gbc_tf1_0608);

		JLabel label_150 = new JLabel("=");
		GridBagConstraints gbc_label_150 = new GridBagConstraints();
		gbc_label_150.anchor = GridBagConstraints.EAST;
		gbc_label_150.insets = new Insets(0, 0, 5, 5);
		gbc_label_150.gridx = 13;
		gbc_label_150.gridy = 13;
		p1_panel.add(label_150, gbc_label_150);

		tf1_0708 = new JTextField();
		tf1_0708.setColumns(10);
		GridBagConstraints gbc_tf1_0708 = new GridBagConstraints();
		gbc_tf1_0708.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0708.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0708.gridx = 14;
		gbc_tf1_0708.gridy = 13;
		p1_panel.add(tf1_0708, gbc_tf1_0708);

		JLabel label_151 = new JLabel("E10");
		GridBagConstraints gbc_label_151 = new GridBagConstraints();
		gbc_label_151.anchor = GridBagConstraints.EAST;
		gbc_label_151.insets = new Insets(0, 0, 5, 5);
		gbc_label_151.gridx = 15;
		gbc_label_151.gridy = 13;
		p1_panel.add(label_151, gbc_label_151);

		JLabel label_152 = new JLabel("E49");
		GridBagConstraints gbc_label_152 = new GridBagConstraints();
		gbc_label_152.anchor = GridBagConstraints.WEST;
		gbc_label_152.insets = new Insets(0, 0, 5, 5);
		gbc_label_152.gridx = 1;
		gbc_label_152.gridy = 14;
		p1_panel.add(label_152, gbc_label_152);

		tf1_0109 = new JTextField();
		tf1_0109.setColumns(10);
		GridBagConstraints gbc_tf1_0109 = new GridBagConstraints();
		gbc_tf1_0109.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0109.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0109.gridx = 2;
		gbc_tf1_0109.gridy = 14;
		p1_panel.add(tf1_0109, gbc_tf1_0109);

		JLabel label_153 = new JLabel("+");
		GridBagConstraints gbc_label_153 = new GridBagConstraints();
		gbc_label_153.anchor = GridBagConstraints.EAST;
		gbc_label_153.insets = new Insets(0, 0, 5, 5);
		gbc_label_153.gridx = 3;
		gbc_label_153.gridy = 14;
		p1_panel.add(label_153, gbc_label_153);

		tf1_0209 = new JTextField();
		tf1_0209.setColumns(10);
		GridBagConstraints gbc_tf1_0209 = new GridBagConstraints();
		gbc_tf1_0209.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0209.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0209.gridx = 4;
		gbc_tf1_0209.gridy = 14;
		p1_panel.add(tf1_0209, gbc_tf1_0209);

		JLabel label_154 = new JLabel("+");
		GridBagConstraints gbc_label_154 = new GridBagConstraints();
		gbc_label_154.anchor = GridBagConstraints.EAST;
		gbc_label_154.insets = new Insets(0, 0, 5, 5);
		gbc_label_154.gridx = 5;
		gbc_label_154.gridy = 14;
		p1_panel.add(label_154, gbc_label_154);

		tf1_0309 = new JTextField();
		tf1_0309.setColumns(10);
		GridBagConstraints gbc_tf1_0309 = new GridBagConstraints();
		gbc_tf1_0309.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0309.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0309.gridx = 6;
		gbc_tf1_0309.gridy = 14;
		p1_panel.add(tf1_0309, gbc_tf1_0309);

		JLabel label_155 = new JLabel("-");
		GridBagConstraints gbc_label_155 = new GridBagConstraints();
		gbc_label_155.anchor = GridBagConstraints.EAST;
		gbc_label_155.insets = new Insets(0, 0, 5, 5);
		gbc_label_155.gridx = 7;
		gbc_label_155.gridy = 14;
		p1_panel.add(label_155, gbc_label_155);

		tf1_0409 = new JTextField();
		tf1_0409.setColumns(10);
		GridBagConstraints gbc_tf1_0409 = new GridBagConstraints();
		gbc_tf1_0409.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0409.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0409.gridx = 8;
		gbc_tf1_0409.gridy = 14;
		p1_panel.add(tf1_0409, gbc_tf1_0409);

		JLabel label_156 = new JLabel("-");
		GridBagConstraints gbc_label_156 = new GridBagConstraints();
		gbc_label_156.anchor = GridBagConstraints.EAST;
		gbc_label_156.insets = new Insets(0, 0, 5, 5);
		gbc_label_156.gridx = 9;
		gbc_label_156.gridy = 14;
		p1_panel.add(label_156, gbc_label_156);

		tf1_0509 = new JTextField();
		tf1_0509.setColumns(10);
		GridBagConstraints gbc_tf1_0509 = new GridBagConstraints();
		gbc_tf1_0509.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0509.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0509.gridx = 10;
		gbc_tf1_0509.gridy = 14;
		p1_panel.add(tf1_0509, gbc_tf1_0509);

		JLabel label_157 = new JLabel("-");
		GridBagConstraints gbc_label_157 = new GridBagConstraints();
		gbc_label_157.anchor = GridBagConstraints.EAST;
		gbc_label_157.insets = new Insets(0, 0, 5, 5);
		gbc_label_157.gridx = 11;
		gbc_label_157.gridy = 14;
		p1_panel.add(label_157, gbc_label_157);

		tf1_0609 = new JTextField();
		tf1_0609.setColumns(10);
		GridBagConstraints gbc_tf1_0609 = new GridBagConstraints();
		gbc_tf1_0609.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0609.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0609.gridx = 12;
		gbc_tf1_0609.gridy = 14;
		p1_panel.add(tf1_0609, gbc_tf1_0609);

		JLabel label_158 = new JLabel("=");
		GridBagConstraints gbc_label_158 = new GridBagConstraints();
		gbc_label_158.anchor = GridBagConstraints.EAST;
		gbc_label_158.insets = new Insets(0, 0, 5, 5);
		gbc_label_158.gridx = 13;
		gbc_label_158.gridy = 14;
		p1_panel.add(label_158, gbc_label_158);

		tf1_0709 = new JTextField();
		tf1_0709.setColumns(10);
		GridBagConstraints gbc_tf1_0709 = new GridBagConstraints();
		gbc_tf1_0709.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0709.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0709.gridx = 14;
		gbc_tf1_0709.gridy = 14;
		p1_panel.add(tf1_0709, gbc_tf1_0709);

		JLabel label_159 = new JLabel("E49");
		GridBagConstraints gbc_label_159 = new GridBagConstraints();
		gbc_label_159.anchor = GridBagConstraints.EAST;
		gbc_label_159.insets = new Insets(0, 0, 5, 5);
		gbc_label_159.gridx = 15;
		gbc_label_159.gridy = 14;
		p1_panel.add(label_159, gbc_label_159);

		JSeparator separator_3 = new JSeparator();
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.gridwidth = 15;
		gbc_separator_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_3.insets = new Insets(0, 0, 5, 5);
		gbc_separator_3.gridx = 1;
		gbc_separator_3.gridy = 15;
		p1_panel.add(separator_3, gbc_separator_3);

		JLabel label_160 = new JLabel("E7");
		GridBagConstraints gbc_label_160 = new GridBagConstraints();
		gbc_label_160.anchor = GridBagConstraints.WEST;
		gbc_label_160.insets = new Insets(0, 0, 5, 5);
		gbc_label_160.gridx = 1;
		gbc_label_160.gridy = 16;
		p1_panel.add(label_160, gbc_label_160);

		tf1_0110 = new JTextField();
		tf1_0110.setColumns(10);
		GridBagConstraints gbc_tf1_0110 = new GridBagConstraints();
		gbc_tf1_0110.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0110.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0110.gridx = 2;
		gbc_tf1_0110.gridy = 16;
		p1_panel.add(tf1_0110, gbc_tf1_0110);

		JLabel label_161 = new JLabel("+");
		GridBagConstraints gbc_label_161 = new GridBagConstraints();
		gbc_label_161.anchor = GridBagConstraints.EAST;
		gbc_label_161.insets = new Insets(0, 0, 5, 5);
		gbc_label_161.gridx = 3;
		gbc_label_161.gridy = 16;
		p1_panel.add(label_161, gbc_label_161);

		tf1_0210 = new JTextField();
		tf1_0210.setColumns(10);
		GridBagConstraints gbc_tf1_0210 = new GridBagConstraints();
		gbc_tf1_0210.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0210.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0210.gridx = 4;
		gbc_tf1_0210.gridy = 16;
		p1_panel.add(tf1_0210, gbc_tf1_0210);

		JLabel label_162 = new JLabel("+");
		GridBagConstraints gbc_label_162 = new GridBagConstraints();
		gbc_label_162.anchor = GridBagConstraints.EAST;
		gbc_label_162.insets = new Insets(0, 0, 5, 5);
		gbc_label_162.gridx = 5;
		gbc_label_162.gridy = 16;
		p1_panel.add(label_162, gbc_label_162);

		tf1_0310 = new JTextField();
		tf1_0310.setColumns(10);
		GridBagConstraints gbc_tf1_0310 = new GridBagConstraints();
		gbc_tf1_0310.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0310.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0310.gridx = 6;
		gbc_tf1_0310.gridy = 16;
		p1_panel.add(tf1_0310, gbc_tf1_0310);

		JLabel label_163 = new JLabel("-");
		GridBagConstraints gbc_label_163 = new GridBagConstraints();
		gbc_label_163.anchor = GridBagConstraints.EAST;
		gbc_label_163.insets = new Insets(0, 0, 5, 5);
		gbc_label_163.gridx = 7;
		gbc_label_163.gridy = 16;
		p1_panel.add(label_163, gbc_label_163);

		tf1_0410 = new JTextField();
		tf1_0410.setColumns(10);
		GridBagConstraints gbc_tf1_0410 = new GridBagConstraints();
		gbc_tf1_0410.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0410.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0410.gridx = 8;
		gbc_tf1_0410.gridy = 16;
		p1_panel.add(tf1_0410, gbc_tf1_0410);

		JLabel label_164 = new JLabel("-");
		GridBagConstraints gbc_label_164 = new GridBagConstraints();
		gbc_label_164.anchor = GridBagConstraints.EAST;
		gbc_label_164.insets = new Insets(0, 0, 5, 5);
		gbc_label_164.gridx = 9;
		gbc_label_164.gridy = 16;
		p1_panel.add(label_164, gbc_label_164);

		tf1_0510 = new JTextField();
		tf1_0510.setColumns(10);
		GridBagConstraints gbc_tf1_0510 = new GridBagConstraints();
		gbc_tf1_0510.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0510.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0510.gridx = 10;
		gbc_tf1_0510.gridy = 16;
		p1_panel.add(tf1_0510, gbc_tf1_0510);

		JLabel label_165 = new JLabel("-");
		GridBagConstraints gbc_label_165 = new GridBagConstraints();
		gbc_label_165.anchor = GridBagConstraints.EAST;
		gbc_label_165.insets = new Insets(0, 0, 5, 5);
		gbc_label_165.gridx = 11;
		gbc_label_165.gridy = 16;
		p1_panel.add(label_165, gbc_label_165);

		tf1_0610 = new JTextField();
		tf1_0610.setColumns(10);
		GridBagConstraints gbc_tf1_0610 = new GridBagConstraints();
		gbc_tf1_0610.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0610.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0610.gridx = 12;
		gbc_tf1_0610.gridy = 16;
		p1_panel.add(tf1_0610, gbc_tf1_0610);

		JLabel label_166 = new JLabel("=");
		GridBagConstraints gbc_label_166 = new GridBagConstraints();
		gbc_label_166.anchor = GridBagConstraints.EAST;
		gbc_label_166.insets = new Insets(0, 0, 5, 5);
		gbc_label_166.gridx = 13;
		gbc_label_166.gridy = 16;
		p1_panel.add(label_166, gbc_label_166);

		tf1_0710 = new JTextField();
		tf1_0710.setColumns(10);
		GridBagConstraints gbc_tf1_0710 = new GridBagConstraints();
		gbc_tf1_0710.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0710.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0710.gridx = 14;
		gbc_tf1_0710.gridy = 16;
		p1_panel.add(tf1_0710, gbc_tf1_0710);

		JLabel label_167 = new JLabel("E7");
		GridBagConstraints gbc_label_167 = new GridBagConstraints();
		gbc_label_167.anchor = GridBagConstraints.EAST;
		gbc_label_167.insets = new Insets(0, 0, 5, 5);
		gbc_label_167.gridx = 15;
		gbc_label_167.gridy = 16;
		p1_panel.add(label_167, gbc_label_167);

		JLabel label_168 = new JLabel("E13");
		GridBagConstraints gbc_label_168 = new GridBagConstraints();
		gbc_label_168.anchor = GridBagConstraints.WEST;
		gbc_label_168.insets = new Insets(0, 0, 5, 5);
		gbc_label_168.gridx = 1;
		gbc_label_168.gridy = 17;
		p1_panel.add(label_168, gbc_label_168);

		tf1_0111 = new JTextField();
		tf1_0111.setColumns(10);
		GridBagConstraints gbc_tf1_0111 = new GridBagConstraints();
		gbc_tf1_0111.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0111.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0111.gridx = 2;
		gbc_tf1_0111.gridy = 17;
		p1_panel.add(tf1_0111, gbc_tf1_0111);

		JLabel label_169 = new JLabel("+");
		GridBagConstraints gbc_label_169 = new GridBagConstraints();
		gbc_label_169.anchor = GridBagConstraints.EAST;
		gbc_label_169.insets = new Insets(0, 0, 5, 5);
		gbc_label_169.gridx = 3;
		gbc_label_169.gridy = 17;
		p1_panel.add(label_169, gbc_label_169);

		tf1_0211 = new JTextField();
		tf1_0211.setColumns(10);
		GridBagConstraints gbc_tf1_0211 = new GridBagConstraints();
		gbc_tf1_0211.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0211.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0211.gridx = 4;
		gbc_tf1_0211.gridy = 17;
		p1_panel.add(tf1_0211, gbc_tf1_0211);

		JLabel label_170 = new JLabel("+");
		GridBagConstraints gbc_label_170 = new GridBagConstraints();
		gbc_label_170.anchor = GridBagConstraints.EAST;
		gbc_label_170.insets = new Insets(0, 0, 5, 5);
		gbc_label_170.gridx = 5;
		gbc_label_170.gridy = 17;
		p1_panel.add(label_170, gbc_label_170);

		tf1_0311 = new JTextField();
		tf1_0311.setColumns(10);
		GridBagConstraints gbc_tf1_0311 = new GridBagConstraints();
		gbc_tf1_0311.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0311.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0311.gridx = 6;
		gbc_tf1_0311.gridy = 17;
		p1_panel.add(tf1_0311, gbc_tf1_0311);

		JLabel label_171 = new JLabel("-");
		GridBagConstraints gbc_label_171 = new GridBagConstraints();
		gbc_label_171.anchor = GridBagConstraints.EAST;
		gbc_label_171.insets = new Insets(0, 0, 5, 5);
		gbc_label_171.gridx = 7;
		gbc_label_171.gridy = 17;
		p1_panel.add(label_171, gbc_label_171);

		tf1_0411 = new JTextField();
		tf1_0411.setColumns(10);
		GridBagConstraints gbc_tf1_0411 = new GridBagConstraints();
		gbc_tf1_0411.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0411.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0411.gridx = 8;
		gbc_tf1_0411.gridy = 17;
		p1_panel.add(tf1_0411, gbc_tf1_0411);

		JLabel label_172 = new JLabel("-");
		GridBagConstraints gbc_label_172 = new GridBagConstraints();
		gbc_label_172.anchor = GridBagConstraints.EAST;
		gbc_label_172.insets = new Insets(0, 0, 5, 5);
		gbc_label_172.gridx = 9;
		gbc_label_172.gridy = 17;
		p1_panel.add(label_172, gbc_label_172);

		tf1_0511 = new JTextField();
		tf1_0511.setColumns(10);
		GridBagConstraints gbc_tf1_0511 = new GridBagConstraints();
		gbc_tf1_0511.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0511.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0511.gridx = 10;
		gbc_tf1_0511.gridy = 17;
		p1_panel.add(tf1_0511, gbc_tf1_0511);

		JLabel label_173 = new JLabel("-");
		GridBagConstraints gbc_label_173 = new GridBagConstraints();
		gbc_label_173.anchor = GridBagConstraints.EAST;
		gbc_label_173.insets = new Insets(0, 0, 5, 5);
		gbc_label_173.gridx = 11;
		gbc_label_173.gridy = 17;
		p1_panel.add(label_173, gbc_label_173);

		tf1_0611 = new JTextField();
		tf1_0611.setColumns(10);
		GridBagConstraints gbc_tf1_0611 = new GridBagConstraints();
		gbc_tf1_0611.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0611.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0611.gridx = 12;
		gbc_tf1_0611.gridy = 17;
		p1_panel.add(tf1_0611, gbc_tf1_0611);

		JLabel label_174 = new JLabel("=");
		GridBagConstraints gbc_label_174 = new GridBagConstraints();
		gbc_label_174.anchor = GridBagConstraints.EAST;
		gbc_label_174.insets = new Insets(0, 0, 5, 5);
		gbc_label_174.gridx = 13;
		gbc_label_174.gridy = 17;
		p1_panel.add(label_174, gbc_label_174);

		tf1_0711 = new JTextField();
		tf1_0711.setColumns(10);
		GridBagConstraints gbc_tf1_0711 = new GridBagConstraints();
		gbc_tf1_0711.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0711.insets = new Insets(0, 0, 5, 5);
		gbc_tf1_0711.gridx = 14;
		gbc_tf1_0711.gridy = 17;
		p1_panel.add(tf1_0711, gbc_tf1_0711);

		JLabel label_175 = new JLabel("E13");
		GridBagConstraints gbc_label_175 = new GridBagConstraints();
		gbc_label_175.anchor = GridBagConstraints.EAST;
		gbc_label_175.insets = new Insets(0, 0, 5, 5);
		gbc_label_175.gridx = 15;
		gbc_label_175.gridy = 17;
		p1_panel.add(label_175, gbc_label_175);

		JLabel label_176 = new JLabel("E18");
		GridBagConstraints gbc_label_176 = new GridBagConstraints();
		gbc_label_176.anchor = GridBagConstraints.WEST;
		gbc_label_176.insets = new Insets(0, 0, 0, 5);
		gbc_label_176.gridx = 1;
		gbc_label_176.gridy = 18;
		p1_panel.add(label_176, gbc_label_176);

		tf1_0112 = new JTextField();
		tf1_0112.setColumns(10);
		GridBagConstraints gbc_tf1_0112 = new GridBagConstraints();
		gbc_tf1_0112.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0112.insets = new Insets(0, 0, 0, 5);
		gbc_tf1_0112.gridx = 2;
		gbc_tf1_0112.gridy = 18;
		p1_panel.add(tf1_0112, gbc_tf1_0112);

		JLabel label_177 = new JLabel("+");
		GridBagConstraints gbc_label_177 = new GridBagConstraints();
		gbc_label_177.anchor = GridBagConstraints.EAST;
		gbc_label_177.insets = new Insets(0, 0, 0, 5);
		gbc_label_177.gridx = 3;
		gbc_label_177.gridy = 18;
		p1_panel.add(label_177, gbc_label_177);

		tf1_0212 = new JTextField();
		tf1_0212.setColumns(10);
		GridBagConstraints gbc_tf1_0212 = new GridBagConstraints();
		gbc_tf1_0212.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0212.insets = new Insets(0, 0, 0, 5);
		gbc_tf1_0212.gridx = 4;
		gbc_tf1_0212.gridy = 18;
		p1_panel.add(tf1_0212, gbc_tf1_0212);

		JLabel label_178 = new JLabel("+");
		GridBagConstraints gbc_label_178 = new GridBagConstraints();
		gbc_label_178.anchor = GridBagConstraints.EAST;
		gbc_label_178.insets = new Insets(0, 0, 0, 5);
		gbc_label_178.gridx = 5;
		gbc_label_178.gridy = 18;
		p1_panel.add(label_178, gbc_label_178);

		tf1_0312 = new JTextField();
		tf1_0312.setColumns(10);
		GridBagConstraints gbc_tf1_0312 = new GridBagConstraints();
		gbc_tf1_0312.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0312.insets = new Insets(0, 0, 0, 5);
		gbc_tf1_0312.gridx = 6;
		gbc_tf1_0312.gridy = 18;
		p1_panel.add(tf1_0312, gbc_tf1_0312);

		JLabel label_179 = new JLabel("-");
		GridBagConstraints gbc_label_179 = new GridBagConstraints();
		gbc_label_179.anchor = GridBagConstraints.EAST;
		gbc_label_179.insets = new Insets(0, 0, 0, 5);
		gbc_label_179.gridx = 7;
		gbc_label_179.gridy = 18;
		p1_panel.add(label_179, gbc_label_179);

		tf1_0412 = new JTextField();
		tf1_0412.setColumns(10);
		GridBagConstraints gbc_tf1_0412 = new GridBagConstraints();
		gbc_tf1_0412.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0412.insets = new Insets(0, 0, 0, 5);
		gbc_tf1_0412.gridx = 8;
		gbc_tf1_0412.gridy = 18;
		p1_panel.add(tf1_0412, gbc_tf1_0412);

		JLabel label_180 = new JLabel("-");
		GridBagConstraints gbc_label_180 = new GridBagConstraints();
		gbc_label_180.anchor = GridBagConstraints.EAST;
		gbc_label_180.insets = new Insets(0, 0, 0, 5);
		gbc_label_180.gridx = 9;
		gbc_label_180.gridy = 18;
		p1_panel.add(label_180, gbc_label_180);

		tf1_0512 = new JTextField();
		tf1_0512.setColumns(10);
		GridBagConstraints gbc_tf1_0512 = new GridBagConstraints();
		gbc_tf1_0512.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0512.insets = new Insets(0, 0, 0, 5);
		gbc_tf1_0512.gridx = 10;
		gbc_tf1_0512.gridy = 18;
		p1_panel.add(tf1_0512, gbc_tf1_0512);

		JLabel label_181 = new JLabel("-");
		GridBagConstraints gbc_label_181 = new GridBagConstraints();
		gbc_label_181.anchor = GridBagConstraints.EAST;
		gbc_label_181.insets = new Insets(0, 0, 0, 5);
		gbc_label_181.gridx = 11;
		gbc_label_181.gridy = 18;
		p1_panel.add(label_181, gbc_label_181);

		tf1_0612 = new JTextField();
		tf1_0612.setColumns(10);
		GridBagConstraints gbc_tf1_0612 = new GridBagConstraints();
		gbc_tf1_0612.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0612.insets = new Insets(0, 0, 0, 5);
		gbc_tf1_0612.gridx = 12;
		gbc_tf1_0612.gridy = 18;
		p1_panel.add(tf1_0612, gbc_tf1_0612);

		JLabel label_182 = new JLabel("=");
		GridBagConstraints gbc_label_182 = new GridBagConstraints();
		gbc_label_182.anchor = GridBagConstraints.EAST;
		gbc_label_182.insets = new Insets(0, 0, 0, 5);
		gbc_label_182.gridx = 13;
		gbc_label_182.gridy = 18;
		p1_panel.add(label_182, gbc_label_182);

		tf1_0712 = new JTextField();
		tf1_0712.setColumns(10);
		GridBagConstraints gbc_tf1_0712 = new GridBagConstraints();
		gbc_tf1_0712.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf1_0712.insets = new Insets(0, 0, 0, 5);
		gbc_tf1_0712.gridx = 14;
		gbc_tf1_0712.gridy = 18;
		p1_panel.add(tf1_0712, gbc_tf1_0712);

		JLabel label_183 = new JLabel("E18");
		GridBagConstraints gbc_label_183 = new GridBagConstraints();
		gbc_label_183.anchor = GridBagConstraints.EAST;
		gbc_label_183.insets = new Insets(0, 0, 0, 5);
		gbc_label_183.gridx = 15;
		gbc_label_183.gridy = 18;
		p1_panel.add(label_183, gbc_label_183);

		// -------------P2----------------------------

		JPanel p2_panel = new JPanel();
		materialplanningPane.addTab("P2", null, p2_panel, null);
		GridBagLayout gbl_p2_panel = new GridBagLayout();
		gbl_p2_panel.columnWidths = new int[] { 0, 0, 85, 0, 85, 0, 85, 10, 85, 0, 85, 0, 85, 0, 85,
				27, 0, 0 };
		gbl_p2_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0 };
		gbl_p2_panel.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0,
				0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_p2_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		p2_panel.setLayout(gbl_p2_panel);

		JLabel l2_warehousestock = new JLabel("Warehouse stock");
		GridBagConstraints gbc_l2_warehousestock = new GridBagConstraints();
		gbc_l2_warehousestock.gridwidth = 3;
		gbc_l2_warehousestock.insets = new Insets(0, 0, 5, 5);
		gbc_l2_warehousestock.gridx = 6;
		gbc_l2_warehousestock.gridy = 1;
		p2_panel.add(l2_warehousestock, gbc_l2_warehousestock);

		JLabel l2_salesorders = new JLabel("Sales Orders");
		GridBagConstraints gbc_l2_salesorders = new GridBagConstraints();
		gbc_l2_salesorders.insets = new Insets(0, 0, 5, 5);
		gbc_l2_salesorders.gridx = 2;
		gbc_l2_salesorders.gridy = 2;
		p2_panel.add(l2_salesorders, gbc_l2_salesorders);

		JLabel l2_follwingperiod = new JLabel("following period");
		GridBagConstraints gbc_l2_follwingperiod = new GridBagConstraints();
		gbc_l2_follwingperiod.insets = new Insets(0, 0, 5, 5);
		gbc_l2_follwingperiod.gridx = 6;
		gbc_l2_follwingperiod.gridy = 2;
		p2_panel.add(l2_follwingperiod, gbc_l2_follwingperiod);

		JLabel l2_passedperiod = new JLabel("passed period");
		GridBagConstraints gbc_l2_passedperiod = new GridBagConstraints();
		gbc_l2_passedperiod.insets = new Insets(0, 0, 5, 5);
		gbc_l2_passedperiod.gridx = 8;
		gbc_l2_passedperiod.gridy = 2;
		p2_panel.add(l2_passedperiod, gbc_l2_passedperiod);

		JLabel l2_waitingqueue = new JLabel("Waiting queue");
		GridBagConstraints gbc_l2_waitingqueue = new GridBagConstraints();
		gbc_l2_waitingqueue.insets = new Insets(0, 0, 5, 5);
		gbc_l2_waitingqueue.gridx = 10;
		gbc_l2_waitingqueue.gridy = 2;
		p2_panel.add(l2_waitingqueue, gbc_l2_waitingqueue);

		JLabel l2_workinprogress = new JLabel("Work in progress");
		GridBagConstraints gbc_l2_workinprogress = new GridBagConstraints();
		gbc_l2_workinprogress.insets = new Insets(0, 0, 5, 5);
		gbc_l2_workinprogress.gridx = 12;
		gbc_l2_workinprogress.gridy = 2;
		p2_panel.add(l2_workinprogress, gbc_l2_workinprogress);

		JLabel l2_productionorders = new JLabel("Production orders");
		GridBagConstraints gbc_l2_productionorders = new GridBagConstraints();
		gbc_l2_productionorders.insets = new Insets(0, 0, 5, 5);
		gbc_l2_productionorders.gridx = 14;
		gbc_l2_productionorders.gridy = 2;
		p2_panel.add(l2_productionorders, gbc_l2_productionorders);

		JLabel lblNewLabel = new JLabel("P2");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		p2_panel.add(lblNewLabel, gbc_lblNewLabel);

		tf2_0101 = new JTextField();
		tf2_0101.setColumns(10);
		GridBagConstraints gbc_tf2_0101 = new GridBagConstraints();
		gbc_tf2_0101.anchor = GridBagConstraints.NORTH;
		gbc_tf2_0101.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0101.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0101.gridx = 2;
		gbc_tf2_0101.gridy = 3;
		p2_panel.add(tf2_0101, gbc_tf2_0101);

		JLabel lblNewLabel_2 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridwidth = 3;
		gbc_lblNewLabel_2.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 3;
		p2_panel.add(lblNewLabel_2, gbc_lblNewLabel_2);

		tf2_0301 = new JTextField();
		GridBagConstraints gbc_tf2_0301 = new GridBagConstraints();
		gbc_tf2_0301.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0301.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0301.gridx = 6;
		gbc_tf2_0301.gridy = 3;
		p2_panel.add(tf2_0301, gbc_tf2_0301);
		tf2_0301.setColumns(10);

		JLabel label_33 = new JLabel("-");
		GridBagConstraints gbc_label_33 = new GridBagConstraints();
		gbc_label_33.anchor = GridBagConstraints.EAST;
		gbc_label_33.insets = new Insets(0, 0, 5, 5);
		gbc_label_33.gridx = 7;
		gbc_label_33.gridy = 3;
		p2_panel.add(label_33, gbc_label_33);

		tf2_0401 = new JTextField();
		tf2_0401.setColumns(10);
		GridBagConstraints gbc_tf2_0401 = new GridBagConstraints();
		gbc_tf2_0401.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0401.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0401.gridx = 8;
		gbc_tf2_0401.gridy = 3;
		p2_panel.add(tf2_0401, gbc_tf2_0401);

		JLabel label_47 = new JLabel("-");
		GridBagConstraints gbc_label_47 = new GridBagConstraints();
		gbc_label_47.anchor = GridBagConstraints.EAST;
		gbc_label_47.insets = new Insets(0, 0, 5, 5);
		gbc_label_47.gridx = 9;
		gbc_label_47.gridy = 3;
		p2_panel.add(label_47, gbc_label_47);

		tf2_0501 = new JTextField();
		tf2_0501.setColumns(10);
		GridBagConstraints gbc_tf2_0501 = new GridBagConstraints();
		gbc_tf2_0501.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0501.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0501.gridx = 10;
		gbc_tf2_0501.gridy = 3;
		p2_panel.add(tf2_0501, gbc_tf2_0501);

		JLabel label_2 = new JLabel("-");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 11;
		gbc_label_2.gridy = 3;
		p2_panel.add(label_2, gbc_label_2);

		tf2_0601 = new JTextField();
		tf2_0601.setColumns(10);
		GridBagConstraints gbc_tf2_0601 = new GridBagConstraints();
		gbc_tf2_0601.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0601.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0601.gridx = 12;
		gbc_tf2_0601.gridy = 3;
		p2_panel.add(tf2_0601, gbc_tf2_0601);

		JLabel label_58 = new JLabel("=");
		GridBagConstraints gbc_label_58 = new GridBagConstraints();
		gbc_label_58.anchor = GridBagConstraints.EAST;
		gbc_label_58.insets = new Insets(0, 0, 5, 5);
		gbc_label_58.gridx = 13;
		gbc_label_58.gridy = 3;
		p2_panel.add(label_58, gbc_label_58);

		tf2_0701 = new JTextField();
		tf2_0701.setColumns(10);
		GridBagConstraints gbc_tf2_0701 = new GridBagConstraints();
		gbc_tf2_0701.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0701.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0701.gridx = 14;
		gbc_tf2_0701.gridy = 3;
		p2_panel.add(tf2_0701, gbc_tf2_0701);

		JLabel lblP_2 = new JLabel("P2");
		GridBagConstraints gbc_lblP_2 = new GridBagConstraints();
		gbc_lblP_2.anchor = GridBagConstraints.EAST;
		gbc_lblP_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblP_2.gridx = 15;
		gbc_lblP_2.gridy = 3;
		p2_panel.add(lblP_2, gbc_lblP_2);

		JSeparator separator_4 = new JSeparator();
		GridBagConstraints gbc_separator_4 = new GridBagConstraints();
		gbc_separator_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_4.gridwidth = 15;
		gbc_separator_4.insets = new Insets(0, 0, 5, 5);
		gbc_separator_4.gridx = 1;
		gbc_separator_4.gridy = 4;
		p2_panel.add(separator_4, gbc_separator_4);

		JLabel lblNewLabel_1 = new JLabel("E26");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 5;
		p2_panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		tf2_0102 = new JTextField();
		GridBagConstraints gbc_tf2_0102 = new GridBagConstraints();
		gbc_tf2_0102.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0102.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0102.gridx = 2;
		gbc_tf2_0102.gridy = 5;
		p2_panel.add(tf2_0102, gbc_tf2_0102);
		tf2_0102.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 3;
		gbc_lblNewLabel_4.gridy = 5;
		p2_panel.add(lblNewLabel_4, gbc_lblNewLabel_4);

		tf2_0202 = new JTextField();
		tf2_0202.setColumns(10);
		GridBagConstraints gbc_tf2_0202 = new GridBagConstraints();
		gbc_tf2_0202.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0202.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0202.gridx = 4;
		gbc_tf2_0202.gridy = 5;
		p2_panel.add(tf2_0202, gbc_tf2_0202);

		JLabel label_21 = new JLabel("+");
		GridBagConstraints gbc_label_21 = new GridBagConstraints();
		gbc_label_21.anchor = GridBagConstraints.EAST;
		gbc_label_21.insets = new Insets(0, 0, 5, 5);
		gbc_label_21.gridx = 5;
		gbc_label_21.gridy = 5;
		p2_panel.add(label_21, gbc_label_21);

		tf2_0302 = new JTextField();
		tf2_0302.setColumns(10);
		GridBagConstraints gbc_tf2_0302 = new GridBagConstraints();
		gbc_tf2_0302.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0302.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0302.gridx = 6;
		gbc_tf2_0302.gridy = 5;
		p2_panel.add(tf2_0302, gbc_tf2_0302);

		JLabel label = new JLabel("-");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.gridx = 7;
		gbc_label.gridy = 5;
		p2_panel.add(label, gbc_label);

		tf2_0402 = new JTextField();
		tf2_0402.setColumns(10);
		GridBagConstraints gbc_tf2_0402 = new GridBagConstraints();
		gbc_tf2_0402.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0402.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0402.gridx = 8;
		gbc_tf2_0402.gridy = 5;
		p2_panel.add(tf2_0402, gbc_tf2_0402);

		JLabel label_46 = new JLabel("-");
		GridBagConstraints gbc_label_46 = new GridBagConstraints();
		gbc_label_46.anchor = GridBagConstraints.EAST;
		gbc_label_46.insets = new Insets(0, 0, 5, 5);
		gbc_label_46.gridx = 9;
		gbc_label_46.gridy = 5;
		p2_panel.add(label_46, gbc_label_46);

		tf2_0502 = new JTextField();
		tf2_0502.setColumns(10);
		GridBagConstraints gbc_tf2_0502 = new GridBagConstraints();
		gbc_tf2_0502.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0502.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0502.gridx = 10;
		gbc_tf2_0502.gridy = 5;
		p2_panel.add(tf2_0502, gbc_tf2_0502);

		JLabel label_3 = new JLabel("-");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 11;
		gbc_label_3.gridy = 5;
		p2_panel.add(label_3, gbc_label_3);

		tf2_0602 = new JTextField();
		tf2_0602.setColumns(10);
		GridBagConstraints gbc_tf2_0602 = new GridBagConstraints();
		gbc_tf2_0602.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0602.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0602.gridx = 12;
		gbc_tf2_0602.gridy = 5;
		p2_panel.add(tf2_0602, gbc_tf2_0602);

		JLabel label_59 = new JLabel("=");
		GridBagConstraints gbc_label_59 = new GridBagConstraints();
		gbc_label_59.anchor = GridBagConstraints.EAST;
		gbc_label_59.insets = new Insets(0, 0, 5, 5);
		gbc_label_59.gridx = 13;
		gbc_label_59.gridy = 5;
		p2_panel.add(label_59, gbc_label_59);

		tf2_0702 = new JTextField();
		tf2_0702.setColumns(10);
		GridBagConstraints gbc_tf2_0702 = new GridBagConstraints();
		gbc_tf2_0702.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0702.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0702.gridx = 14;
		gbc_tf2_0702.gridy = 5;
		p2_panel.add(tf2_0702, gbc_tf2_0702);

		JLabel label_71 = new JLabel("E26");
		GridBagConstraints gbc_label_71 = new GridBagConstraints();
		gbc_label_71.anchor = GridBagConstraints.EAST;
		gbc_label_71.insets = new Insets(0, 0, 5, 5);
		gbc_label_71.gridx = 15;
		gbc_label_71.gridy = 5;
		p2_panel.add(label_71, gbc_label_71);

		JLabel lblE = new JLabel("E56");
		GridBagConstraints gbc_lblE = new GridBagConstraints();
		gbc_lblE.anchor = GridBagConstraints.WEST;
		gbc_lblE.insets = new Insets(0, 0, 5, 5);
		gbc_lblE.gridx = 1;
		gbc_lblE.gridy = 6;
		p2_panel.add(lblE, gbc_lblE);

		tf2_0103 = new JTextField();
		tf2_0103.setColumns(10);
		GridBagConstraints gbc_tf2_0103 = new GridBagConstraints();
		gbc_tf2_0103.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0103.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0103.gridx = 2;
		gbc_tf2_0103.gridy = 6;
		p2_panel.add(tf2_0103, gbc_tf2_0103);

		JLabel label_11 = new JLabel("+");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.anchor = GridBagConstraints.EAST;
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 3;
		gbc_label_11.gridy = 6;
		p2_panel.add(label_11, gbc_label_11);

		tf2_0203 = new JTextField();
		tf2_0203.setColumns(10);
		GridBagConstraints gbc_tf2_0203 = new GridBagConstraints();
		gbc_tf2_0203.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0203.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0203.gridx = 4;
		gbc_tf2_0203.gridy = 6;
		p2_panel.add(tf2_0203, gbc_tf2_0203);

		JLabel label_22 = new JLabel("+");
		GridBagConstraints gbc_label_22 = new GridBagConstraints();
		gbc_label_22.anchor = GridBagConstraints.EAST;
		gbc_label_22.insets = new Insets(0, 0, 5, 5);
		gbc_label_22.gridx = 5;
		gbc_label_22.gridy = 6;
		p2_panel.add(label_22, gbc_label_22);

		tf2_0303 = new JTextField();
		tf2_0303.setColumns(10);
		GridBagConstraints gbc_tf2_0303 = new GridBagConstraints();
		gbc_tf2_0303.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0303.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0303.gridx = 6;
		gbc_tf2_0303.gridy = 6;
		p2_panel.add(tf2_0303, gbc_tf2_0303);

		JLabel label_35 = new JLabel("-");
		GridBagConstraints gbc_label_35 = new GridBagConstraints();
		gbc_label_35.anchor = GridBagConstraints.EAST;
		gbc_label_35.insets = new Insets(0, 0, 5, 5);
		gbc_label_35.gridx = 7;
		gbc_label_35.gridy = 6;
		p2_panel.add(label_35, gbc_label_35);

		tf2_0403 = new JTextField();
		tf2_0403.setColumns(10);
		GridBagConstraints gbc_tf2_0403 = new GridBagConstraints();
		gbc_tf2_0403.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0403.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0403.gridx = 8;
		gbc_tf2_0403.gridy = 6;
		p2_panel.add(tf2_0403, gbc_tf2_0403);

		JLabel label_48 = new JLabel("-");
		GridBagConstraints gbc_label_48 = new GridBagConstraints();
		gbc_label_48.anchor = GridBagConstraints.EAST;
		gbc_label_48.insets = new Insets(0, 0, 5, 5);
		gbc_label_48.gridx = 9;
		gbc_label_48.gridy = 6;
		p2_panel.add(label_48, gbc_label_48);

		tf2_0503 = new JTextField();
		tf2_0503.setColumns(10);
		GridBagConstraints gbc_tf2_0503 = new GridBagConstraints();
		gbc_tf2_0503.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0503.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0503.gridx = 10;
		gbc_tf2_0503.gridy = 6;
		p2_panel.add(tf2_0503, gbc_tf2_0503);

		JLabel label_4 = new JLabel("-");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 11;
		gbc_label_4.gridy = 6;
		p2_panel.add(label_4, gbc_label_4);

		tf2_0603 = new JTextField();
		tf2_0603.setColumns(10);
		GridBagConstraints gbc_tf2_0603 = new GridBagConstraints();
		gbc_tf2_0603.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0603.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0603.gridx = 12;
		gbc_tf2_0603.gridy = 6;
		p2_panel.add(tf2_0603, gbc_tf2_0603);

		JLabel label_60 = new JLabel("=");
		GridBagConstraints gbc_label_60 = new GridBagConstraints();
		gbc_label_60.anchor = GridBagConstraints.EAST;
		gbc_label_60.insets = new Insets(0, 0, 5, 5);
		gbc_label_60.gridx = 13;
		gbc_label_60.gridy = 6;
		p2_panel.add(label_60, gbc_label_60);

		tf2_0703 = new JTextField();
		tf2_0703.setColumns(10);
		GridBagConstraints gbc_tf2_0703 = new GridBagConstraints();
		gbc_tf2_0703.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0703.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0703.gridx = 14;
		gbc_tf2_0703.gridy = 6;
		p2_panel.add(tf2_0703, gbc_tf2_0703);

		JLabel lblE_11 = new JLabel("E56");
		GridBagConstraints gbc_lblE_11 = new GridBagConstraints();
		gbc_lblE_11.anchor = GridBagConstraints.EAST;
		gbc_lblE_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_11.gridx = 15;
		gbc_lblE_11.gridy = 6;
		p2_panel.add(lblE_11, gbc_lblE_11);

		JSeparator separator_6 = new JSeparator();
		GridBagConstraints gbc_separator_6 = new GridBagConstraints();
		gbc_separator_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_6.gridwidth = 15;
		gbc_separator_6.insets = new Insets(0, 0, 5, 5);
		gbc_separator_6.gridx = 1;
		gbc_separator_6.gridy = 7;
		p2_panel.add(separator_6, gbc_separator_6);

		JLabel lblE_1 = new JLabel("E16");
		GridBagConstraints gbc_lblE_1 = new GridBagConstraints();
		gbc_lblE_1.anchor = GridBagConstraints.WEST;
		gbc_lblE_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_1.gridx = 1;
		gbc_lblE_1.gridy = 8;
		p2_panel.add(lblE_1, gbc_lblE_1);

		tf2_0104 = new JTextField();
		tf2_0104.setColumns(10);
		GridBagConstraints gbc_tf2_0104 = new GridBagConstraints();
		gbc_tf2_0104.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0104.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0104.gridx = 2;
		gbc_tf2_0104.gridy = 8;
		p2_panel.add(tf2_0104, gbc_tf2_0104);

		JLabel label_12 = new JLabel("+");
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.anchor = GridBagConstraints.EAST;
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 3;
		gbc_label_12.gridy = 8;
		p2_panel.add(label_12, gbc_label_12);

		tf2_0204 = new JTextField();
		tf2_0204.setColumns(10);
		GridBagConstraints gbc_tf2_0204 = new GridBagConstraints();
		gbc_tf2_0204.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0204.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0204.gridx = 4;
		gbc_tf2_0204.gridy = 8;
		p2_panel.add(tf2_0204, gbc_tf2_0204);

		JLabel label_23 = new JLabel("+");
		GridBagConstraints gbc_label_23 = new GridBagConstraints();
		gbc_label_23.anchor = GridBagConstraints.EAST;
		gbc_label_23.insets = new Insets(0, 0, 5, 5);
		gbc_label_23.gridx = 5;
		gbc_label_23.gridy = 8;
		p2_panel.add(label_23, gbc_label_23);

		tf2_0304 = new JTextField();
		tf2_0304.setColumns(10);
		GridBagConstraints gbc_tf2_0304 = new GridBagConstraints();
		gbc_tf2_0304.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0304.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0304.gridx = 6;
		gbc_tf2_0304.gridy = 8;
		p2_panel.add(tf2_0304, gbc_tf2_0304);

		JLabel label_36 = new JLabel("-");
		GridBagConstraints gbc_label_36 = new GridBagConstraints();
		gbc_label_36.anchor = GridBagConstraints.EAST;
		gbc_label_36.insets = new Insets(0, 0, 5, 5);
		gbc_label_36.gridx = 7;
		gbc_label_36.gridy = 8;
		p2_panel.add(label_36, gbc_label_36);

		tf2_0404 = new JTextField();
		tf2_0404.setColumns(10);
		GridBagConstraints gbc_tf2_0404 = new GridBagConstraints();
		gbc_tf2_0404.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0404.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0404.gridx = 8;
		gbc_tf2_0404.gridy = 8;
		p2_panel.add(tf2_0404, gbc_tf2_0404);

		JLabel label_49 = new JLabel("-");
		GridBagConstraints gbc_label_49 = new GridBagConstraints();
		gbc_label_49.anchor = GridBagConstraints.EAST;
		gbc_label_49.insets = new Insets(0, 0, 5, 5);
		gbc_label_49.gridx = 9;
		gbc_label_49.gridy = 8;
		p2_panel.add(label_49, gbc_label_49);

		tf2_0504 = new JTextField();
		tf2_0504.setColumns(10);
		GridBagConstraints gbc_tf2_0504 = new GridBagConstraints();
		gbc_tf2_0504.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0504.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0504.gridx = 10;
		gbc_tf2_0504.gridy = 8;
		p2_panel.add(tf2_0504, gbc_tf2_0504);

		JLabel label_5 = new JLabel("-");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.EAST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 11;
		gbc_label_5.gridy = 8;
		p2_panel.add(label_5, gbc_label_5);

		tf2_0604 = new JTextField();
		tf2_0604.setColumns(10);
		GridBagConstraints gbc_tf2_0604 = new GridBagConstraints();
		gbc_tf2_0604.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0604.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0604.gridx = 12;
		gbc_tf2_0604.gridy = 8;
		p2_panel.add(tf2_0604, gbc_tf2_0604);

		JLabel label_61 = new JLabel("=");
		GridBagConstraints gbc_label_61 = new GridBagConstraints();
		gbc_label_61.anchor = GridBagConstraints.EAST;
		gbc_label_61.insets = new Insets(0, 0, 5, 5);
		gbc_label_61.gridx = 13;
		gbc_label_61.gridy = 8;
		p2_panel.add(label_61, gbc_label_61);

		tf2_0704 = new JTextField();
		tf2_0704.setColumns(10);
		GridBagConstraints gbc_tf2_0704 = new GridBagConstraints();
		gbc_tf2_0704.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0704.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0704.gridx = 14;
		gbc_tf2_0704.gridy = 8;
		p2_panel.add(tf2_0704, gbc_tf2_0704);

		JLabel label_73 = new JLabel("E16");
		GridBagConstraints gbc_label_73 = new GridBagConstraints();
		gbc_label_73.anchor = GridBagConstraints.EAST;
		gbc_label_73.insets = new Insets(0, 0, 5, 5);
		gbc_label_73.gridx = 15;
		gbc_label_73.gridy = 8;
		p2_panel.add(label_73, gbc_label_73);

		JLabel lblE_2 = new JLabel("E17");
		GridBagConstraints gbc_lblE_2 = new GridBagConstraints();
		gbc_lblE_2.anchor = GridBagConstraints.WEST;
		gbc_lblE_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_2.gridx = 1;
		gbc_lblE_2.gridy = 9;
		p2_panel.add(lblE_2, gbc_lblE_2);

		tf2_0105 = new JTextField();
		tf2_0105.setColumns(10);
		GridBagConstraints gbc_tf2_0105 = new GridBagConstraints();
		gbc_tf2_0105.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0105.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0105.gridx = 2;
		gbc_tf2_0105.gridy = 9;
		p2_panel.add(tf2_0105, gbc_tf2_0105);

		JLabel label_13 = new JLabel("+");
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.anchor = GridBagConstraints.EAST;
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 3;
		gbc_label_13.gridy = 9;
		p2_panel.add(label_13, gbc_label_13);

		tf2_0205 = new JTextField();
		tf2_0205.setColumns(10);
		GridBagConstraints gbc_tf2_0205 = new GridBagConstraints();
		gbc_tf2_0205.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0205.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0205.gridx = 4;
		gbc_tf2_0205.gridy = 9;
		p2_panel.add(tf2_0205, gbc_tf2_0205);

		JLabel label_24 = new JLabel("+");
		GridBagConstraints gbc_label_24 = new GridBagConstraints();
		gbc_label_24.anchor = GridBagConstraints.EAST;
		gbc_label_24.insets = new Insets(0, 0, 5, 5);
		gbc_label_24.gridx = 5;
		gbc_label_24.gridy = 9;
		p2_panel.add(label_24, gbc_label_24);

		tf2_0305 = new JTextField();
		tf2_0305.setColumns(10);
		GridBagConstraints gbc_tf2_0305 = new GridBagConstraints();
		gbc_tf2_0305.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0305.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0305.gridx = 6;
		gbc_tf2_0305.gridy = 9;
		p2_panel.add(tf2_0305, gbc_tf2_0305);

		JLabel label_37 = new JLabel("-");
		GridBagConstraints gbc_label_37 = new GridBagConstraints();
		gbc_label_37.anchor = GridBagConstraints.EAST;
		gbc_label_37.insets = new Insets(0, 0, 5, 5);
		gbc_label_37.gridx = 7;
		gbc_label_37.gridy = 9;
		p2_panel.add(label_37, gbc_label_37);

		tf2_0405 = new JTextField();
		tf2_0405.setColumns(10);
		GridBagConstraints gbc_tf2_0405 = new GridBagConstraints();
		gbc_tf2_0405.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0405.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0405.gridx = 8;
		gbc_tf2_0405.gridy = 9;
		p2_panel.add(tf2_0405, gbc_tf2_0405);

		JLabel label_50 = new JLabel("-");
		GridBagConstraints gbc_label_50 = new GridBagConstraints();
		gbc_label_50.anchor = GridBagConstraints.EAST;
		gbc_label_50.insets = new Insets(0, 0, 5, 5);
		gbc_label_50.gridx = 9;
		gbc_label_50.gridy = 9;
		p2_panel.add(label_50, gbc_label_50);

		tf2_0505 = new JTextField();
		tf2_0505.setColumns(10);
		GridBagConstraints gbc_tf2_0505 = new GridBagConstraints();
		gbc_tf2_0505.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0505.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0505.gridx = 10;
		gbc_tf2_0505.gridy = 9;
		p2_panel.add(tf2_0505, gbc_tf2_0505);

		JLabel label_6 = new JLabel("-");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.EAST;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 11;
		gbc_label_6.gridy = 9;
		p2_panel.add(label_6, gbc_label_6);

		tf2_0605 = new JTextField();
		tf2_0605.setColumns(10);
		GridBagConstraints gbc_tf2_0605 = new GridBagConstraints();
		gbc_tf2_0605.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0605.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0605.gridx = 12;
		gbc_tf2_0605.gridy = 9;
		p2_panel.add(tf2_0605, gbc_tf2_0605);

		JLabel label_62 = new JLabel("=");
		GridBagConstraints gbc_label_62 = new GridBagConstraints();
		gbc_label_62.anchor = GridBagConstraints.EAST;
		gbc_label_62.insets = new Insets(0, 0, 5, 5);
		gbc_label_62.gridx = 13;
		gbc_label_62.gridy = 9;
		p2_panel.add(label_62, gbc_label_62);

		tf2_0705 = new JTextField();
		tf2_0705.setColumns(10);
		GridBagConstraints gbc_tf2_0705 = new GridBagConstraints();
		gbc_tf2_0705.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0705.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0705.gridx = 14;
		gbc_tf2_0705.gridy = 9;
		p2_panel.add(tf2_0705, gbc_tf2_0705);

		JLabel label_74 = new JLabel("E17");
		GridBagConstraints gbc_label_74 = new GridBagConstraints();
		gbc_label_74.anchor = GridBagConstraints.EAST;
		gbc_label_74.insets = new Insets(0, 0, 5, 5);
		gbc_label_74.gridx = 15;
		gbc_label_74.gridy = 9;
		p2_panel.add(label_74, gbc_label_74);

		JLabel lblE_3 = new JLabel("E55");
		GridBagConstraints gbc_lblE_3 = new GridBagConstraints();
		gbc_lblE_3.anchor = GridBagConstraints.WEST;
		gbc_lblE_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_3.gridx = 1;
		gbc_lblE_3.gridy = 10;
		p2_panel.add(lblE_3, gbc_lblE_3);

		tf2_0106 = new JTextField();
		tf2_0106.setColumns(10);
		GridBagConstraints gbc_tf2_0106 = new GridBagConstraints();
		gbc_tf2_0106.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0106.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0106.gridx = 2;
		gbc_tf2_0106.gridy = 10;
		p2_panel.add(tf2_0106, gbc_tf2_0106);

		JLabel label_14 = new JLabel("+");
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.anchor = GridBagConstraints.EAST;
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 3;
		gbc_label_14.gridy = 10;
		p2_panel.add(label_14, gbc_label_14);

		tf2_0206 = new JTextField();
		tf2_0206.setColumns(10);
		GridBagConstraints gbc_tf2_0206 = new GridBagConstraints();
		gbc_tf2_0206.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0206.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0206.gridx = 4;
		gbc_tf2_0206.gridy = 10;
		p2_panel.add(tf2_0206, gbc_tf2_0206);

		JLabel label_25 = new JLabel("+");
		GridBagConstraints gbc_label_25 = new GridBagConstraints();
		gbc_label_25.anchor = GridBagConstraints.EAST;
		gbc_label_25.insets = new Insets(0, 0, 5, 5);
		gbc_label_25.gridx = 5;
		gbc_label_25.gridy = 10;
		p2_panel.add(label_25, gbc_label_25);

		tf2_0306 = new JTextField();
		tf2_0306.setColumns(10);
		GridBagConstraints gbc_tf2_0306 = new GridBagConstraints();
		gbc_tf2_0306.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0306.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0306.gridx = 6;
		gbc_tf2_0306.gridy = 10;
		p2_panel.add(tf2_0306, gbc_tf2_0306);

		JLabel label_38 = new JLabel("-");
		GridBagConstraints gbc_label_38 = new GridBagConstraints();
		gbc_label_38.anchor = GridBagConstraints.EAST;
		gbc_label_38.insets = new Insets(0, 0, 5, 5);
		gbc_label_38.gridx = 7;
		gbc_label_38.gridy = 10;
		p2_panel.add(label_38, gbc_label_38);

		tf2_0406 = new JTextField();
		tf2_0406.setColumns(10);
		GridBagConstraints gbc_tf2_0406 = new GridBagConstraints();
		gbc_tf2_0406.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0406.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0406.gridx = 8;
		gbc_tf2_0406.gridy = 10;
		p2_panel.add(tf2_0406, gbc_tf2_0406);

		JLabel label_51 = new JLabel("-");
		GridBagConstraints gbc_label_51 = new GridBagConstraints();
		gbc_label_51.anchor = GridBagConstraints.EAST;
		gbc_label_51.insets = new Insets(0, 0, 5, 5);
		gbc_label_51.gridx = 9;
		gbc_label_51.gridy = 10;
		p2_panel.add(label_51, gbc_label_51);

		tf2_0506 = new JTextField();
		tf2_0506.setColumns(10);
		GridBagConstraints gbc_tf2_0506 = new GridBagConstraints();
		gbc_tf2_0506.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0506.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0506.gridx = 10;
		gbc_tf2_0506.gridy = 10;
		p2_panel.add(tf2_0506, gbc_tf2_0506);

		JLabel label_7 = new JLabel("-");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.EAST;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 11;
		gbc_label_7.gridy = 10;
		p2_panel.add(label_7, gbc_label_7);

		tf2_0606 = new JTextField();
		tf2_0606.setColumns(10);
		GridBagConstraints gbc_tf2_0606 = new GridBagConstraints();
		gbc_tf2_0606.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0606.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0606.gridx = 12;
		gbc_tf2_0606.gridy = 10;
		p2_panel.add(tf2_0606, gbc_tf2_0606);

		JLabel label_63 = new JLabel("=");
		GridBagConstraints gbc_label_63 = new GridBagConstraints();
		gbc_label_63.anchor = GridBagConstraints.EAST;
		gbc_label_63.insets = new Insets(0, 0, 5, 5);
		gbc_label_63.gridx = 13;
		gbc_label_63.gridy = 10;
		p2_panel.add(label_63, gbc_label_63);

		tf2_0706 = new JTextField();
		tf2_0706.setColumns(10);
		GridBagConstraints gbc_tf2_0706 = new GridBagConstraints();
		gbc_tf2_0706.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0706.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0706.gridx = 14;
		gbc_tf2_0706.gridy = 10;
		p2_panel.add(tf2_0706, gbc_tf2_0706);

		JLabel lblE_10 = new JLabel("E55");
		GridBagConstraints gbc_lblE_10 = new GridBagConstraints();
		gbc_lblE_10.anchor = GridBagConstraints.EAST;
		gbc_lblE_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_10.gridx = 15;
		gbc_lblE_10.gridy = 10;
		p2_panel.add(lblE_10, gbc_lblE_10);

		JSeparator separator_5 = new JSeparator();
		GridBagConstraints gbc_separator_5 = new GridBagConstraints();
		gbc_separator_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_5.gridwidth = 15;
		gbc_separator_5.insets = new Insets(0, 0, 5, 5);
		gbc_separator_5.gridx = 1;
		gbc_separator_5.gridy = 11;
		p2_panel.add(separator_5, gbc_separator_5);

		JLabel lblE_4 = new JLabel("E5");
		GridBagConstraints gbc_lblE_4 = new GridBagConstraints();
		gbc_lblE_4.anchor = GridBagConstraints.WEST;
		gbc_lblE_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_4.gridx = 1;
		gbc_lblE_4.gridy = 12;
		p2_panel.add(lblE_4, gbc_lblE_4);

		tf2_0107 = new JTextField();
		tf2_0107.setColumns(10);
		GridBagConstraints gbc_tf2_0107 = new GridBagConstraints();
		gbc_tf2_0107.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0107.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0107.gridx = 2;
		gbc_tf2_0107.gridy = 12;
		p2_panel.add(tf2_0107, gbc_tf2_0107);

		JLabel label_15 = new JLabel("+");
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.anchor = GridBagConstraints.EAST;
		gbc_label_15.insets = new Insets(0, 0, 5, 5);
		gbc_label_15.gridx = 3;
		gbc_label_15.gridy = 12;
		p2_panel.add(label_15, gbc_label_15);

		tf2_0207 = new JTextField();
		tf2_0207.setColumns(10);
		GridBagConstraints gbc_tf2_0207 = new GridBagConstraints();
		gbc_tf2_0207.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0207.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0207.gridx = 4;
		gbc_tf2_0207.gridy = 12;
		p2_panel.add(tf2_0207, gbc_tf2_0207);

		JLabel label_26 = new JLabel("+");
		GridBagConstraints gbc_label_26 = new GridBagConstraints();
		gbc_label_26.anchor = GridBagConstraints.EAST;
		gbc_label_26.insets = new Insets(0, 0, 5, 5);
		gbc_label_26.gridx = 5;
		gbc_label_26.gridy = 12;
		p2_panel.add(label_26, gbc_label_26);

		tf2_0307 = new JTextField();
		tf2_0307.setColumns(10);
		GridBagConstraints gbc_tf2_0307 = new GridBagConstraints();
		gbc_tf2_0307.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0307.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0307.gridx = 6;
		gbc_tf2_0307.gridy = 12;
		p2_panel.add(tf2_0307, gbc_tf2_0307);

		JLabel label_39 = new JLabel("-");
		GridBagConstraints gbc_label_39 = new GridBagConstraints();
		gbc_label_39.anchor = GridBagConstraints.EAST;
		gbc_label_39.insets = new Insets(0, 0, 5, 5);
		gbc_label_39.gridx = 7;
		gbc_label_39.gridy = 12;
		p2_panel.add(label_39, gbc_label_39);

		tf2_0407 = new JTextField();
		tf2_0407.setColumns(10);
		GridBagConstraints gbc_tf2_0407 = new GridBagConstraints();
		gbc_tf2_0407.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0407.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0407.gridx = 8;
		gbc_tf2_0407.gridy = 12;
		p2_panel.add(tf2_0407, gbc_tf2_0407);

		JLabel label_52 = new JLabel("-");
		GridBagConstraints gbc_label_52 = new GridBagConstraints();
		gbc_label_52.anchor = GridBagConstraints.EAST;
		gbc_label_52.insets = new Insets(0, 0, 5, 5);
		gbc_label_52.gridx = 9;
		gbc_label_52.gridy = 12;
		p2_panel.add(label_52, gbc_label_52);

		tf2_0507 = new JTextField();
		tf2_0507.setColumns(10);
		GridBagConstraints gbc_tf2_0507 = new GridBagConstraints();
		gbc_tf2_0507.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0507.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0507.gridx = 10;
		gbc_tf2_0507.gridy = 12;
		p2_panel.add(tf2_0507, gbc_tf2_0507);

		JLabel label_8 = new JLabel("-");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.EAST;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 11;
		gbc_label_8.gridy = 12;
		p2_panel.add(label_8, gbc_label_8);

		tf2_0607 = new JTextField();
		tf2_0607.setColumns(10);
		GridBagConstraints gbc_tf2_0607 = new GridBagConstraints();
		gbc_tf2_0607.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0607.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0607.gridx = 12;
		gbc_tf2_0607.gridy = 12;
		p2_panel.add(tf2_0607, gbc_tf2_0607);

		JLabel label_64 = new JLabel("=");
		GridBagConstraints gbc_label_64 = new GridBagConstraints();
		gbc_label_64.anchor = GridBagConstraints.EAST;
		gbc_label_64.insets = new Insets(0, 0, 5, 5);
		gbc_label_64.gridx = 13;
		gbc_label_64.gridy = 12;
		p2_panel.add(label_64, gbc_label_64);

		tf2_0707 = new JTextField();
		tf2_0707.setColumns(10);
		GridBagConstraints gbc_tf2_0707 = new GridBagConstraints();
		gbc_tf2_0707.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0707.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0707.gridx = 14;
		gbc_tf2_0707.gridy = 12;
		p2_panel.add(tf2_0707, gbc_tf2_0707);

		JLabel lblE_16 = new JLabel("E5");
		GridBagConstraints gbc_lblE_16 = new GridBagConstraints();
		gbc_lblE_16.anchor = GridBagConstraints.EAST;
		gbc_lblE_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_16.gridx = 15;
		gbc_lblE_16.gridy = 12;
		p2_panel.add(lblE_16, gbc_lblE_16);

		JLabel lblE_5 = new JLabel("E11");
		GridBagConstraints gbc_lblE_5 = new GridBagConstraints();
		gbc_lblE_5.anchor = GridBagConstraints.WEST;
		gbc_lblE_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_5.gridx = 1;
		gbc_lblE_5.gridy = 13;
		p2_panel.add(lblE_5, gbc_lblE_5);

		tf2_0108 = new JTextField();
		tf2_0108.setColumns(10);
		GridBagConstraints gbc_tf2_0108 = new GridBagConstraints();
		gbc_tf2_0108.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0108.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0108.gridx = 2;
		gbc_tf2_0108.gridy = 13;
		p2_panel.add(tf2_0108, gbc_tf2_0108);

		JLabel label_16 = new JLabel("+");
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.anchor = GridBagConstraints.EAST;
		gbc_label_16.insets = new Insets(0, 0, 5, 5);
		gbc_label_16.gridx = 3;
		gbc_label_16.gridy = 13;
		p2_panel.add(label_16, gbc_label_16);

		tf2_0208 = new JTextField();
		tf2_0208.setColumns(10);
		GridBagConstraints gbc_tf2_0208 = new GridBagConstraints();
		gbc_tf2_0208.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0208.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0208.gridx = 4;
		gbc_tf2_0208.gridy = 13;
		p2_panel.add(tf2_0208, gbc_tf2_0208);

		JLabel label_27 = new JLabel("+");
		GridBagConstraints gbc_label_27 = new GridBagConstraints();
		gbc_label_27.anchor = GridBagConstraints.EAST;
		gbc_label_27.insets = new Insets(0, 0, 5, 5);
		gbc_label_27.gridx = 5;
		gbc_label_27.gridy = 13;
		p2_panel.add(label_27, gbc_label_27);

		tf2_0308 = new JTextField();
		tf2_0308.setColumns(10);
		GridBagConstraints gbc_tf2_0308 = new GridBagConstraints();
		gbc_tf2_0308.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0308.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0308.gridx = 6;
		gbc_tf2_0308.gridy = 13;
		p2_panel.add(tf2_0308, gbc_tf2_0308);

		JLabel label_40 = new JLabel("-");
		GridBagConstraints gbc_label_40 = new GridBagConstraints();
		gbc_label_40.anchor = GridBagConstraints.EAST;
		gbc_label_40.insets = new Insets(0, 0, 5, 5);
		gbc_label_40.gridx = 7;
		gbc_label_40.gridy = 13;
		p2_panel.add(label_40, gbc_label_40);

		tf2_0408 = new JTextField();
		tf2_0408.setColumns(10);
		GridBagConstraints gbc_tf2_0408 = new GridBagConstraints();
		gbc_tf2_0408.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0408.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0408.gridx = 8;
		gbc_tf2_0408.gridy = 13;
		p2_panel.add(tf2_0408, gbc_tf2_0408);

		JLabel label_53 = new JLabel("-");
		GridBagConstraints gbc_label_53 = new GridBagConstraints();
		gbc_label_53.anchor = GridBagConstraints.EAST;
		gbc_label_53.insets = new Insets(0, 0, 5, 5);
		gbc_label_53.gridx = 9;
		gbc_label_53.gridy = 13;
		p2_panel.add(label_53, gbc_label_53);

		tf2_0508 = new JTextField();
		tf2_0508.setColumns(10);
		GridBagConstraints gbc_tf2_0508 = new GridBagConstraints();
		gbc_tf2_0508.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0508.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0508.gridx = 10;
		gbc_tf2_0508.gridy = 13;
		p2_panel.add(tf2_0508, gbc_tf2_0508);

		JLabel label_9 = new JLabel("-");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.EAST;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 11;
		gbc_label_9.gridy = 13;
		p2_panel.add(label_9, gbc_label_9);

		tf2_0608 = new JTextField();
		tf2_0608.setColumns(10);
		GridBagConstraints gbc_tf2_0608 = new GridBagConstraints();
		gbc_tf2_0608.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0608.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0608.gridx = 12;
		gbc_tf2_0608.gridy = 13;
		p2_panel.add(tf2_0608, gbc_tf2_0608);

		JLabel label_65 = new JLabel("=");
		GridBagConstraints gbc_label_65 = new GridBagConstraints();
		gbc_label_65.anchor = GridBagConstraints.EAST;
		gbc_label_65.insets = new Insets(0, 0, 5, 5);
		gbc_label_65.gridx = 13;
		gbc_label_65.gridy = 13;
		p2_panel.add(label_65, gbc_label_65);

		tf2_0708 = new JTextField();
		tf2_0708.setColumns(10);
		GridBagConstraints gbc_tf2_0708 = new GridBagConstraints();
		gbc_tf2_0708.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0708.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0708.gridx = 14;
		gbc_tf2_0708.gridy = 13;
		p2_panel.add(tf2_0708, gbc_tf2_0708);

		JLabel lblE_15 = new JLabel("E11");
		GridBagConstraints gbc_lblE_15 = new GridBagConstraints();
		gbc_lblE_15.anchor = GridBagConstraints.EAST;
		gbc_lblE_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_15.gridx = 15;
		gbc_lblE_15.gridy = 13;
		p2_panel.add(lblE_15, gbc_lblE_15);

		JLabel lblE_6 = new JLabel("E54");
		GridBagConstraints gbc_lblE_6 = new GridBagConstraints();
		gbc_lblE_6.anchor = GridBagConstraints.WEST;
		gbc_lblE_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_6.gridx = 1;
		gbc_lblE_6.gridy = 14;
		p2_panel.add(lblE_6, gbc_lblE_6);

		tf2_0109 = new JTextField();
		tf2_0109.setColumns(10);
		GridBagConstraints gbc_tf2_0109 = new GridBagConstraints();
		gbc_tf2_0109.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0109.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0109.gridx = 2;
		gbc_tf2_0109.gridy = 14;
		p2_panel.add(tf2_0109, gbc_tf2_0109);

		JLabel label_17 = new JLabel("+");
		GridBagConstraints gbc_label_17 = new GridBagConstraints();
		gbc_label_17.anchor = GridBagConstraints.EAST;
		gbc_label_17.insets = new Insets(0, 0, 5, 5);
		gbc_label_17.gridx = 3;
		gbc_label_17.gridy = 14;
		p2_panel.add(label_17, gbc_label_17);

		tf2_0209 = new JTextField();
		tf2_0209.setColumns(10);
		GridBagConstraints gbc_tf2_0209 = new GridBagConstraints();
		gbc_tf2_0209.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0209.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0209.gridx = 4;
		gbc_tf2_0209.gridy = 14;
		p2_panel.add(tf2_0209, gbc_tf2_0209);

		JLabel label_28 = new JLabel("+");
		GridBagConstraints gbc_label_28 = new GridBagConstraints();
		gbc_label_28.anchor = GridBagConstraints.EAST;
		gbc_label_28.insets = new Insets(0, 0, 5, 5);
		gbc_label_28.gridx = 5;
		gbc_label_28.gridy = 14;
		p2_panel.add(label_28, gbc_label_28);

		tf2_0309 = new JTextField();
		tf2_0309.setColumns(10);
		GridBagConstraints gbc_tf2_0309 = new GridBagConstraints();
		gbc_tf2_0309.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0309.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0309.gridx = 6;
		gbc_tf2_0309.gridy = 14;
		p2_panel.add(tf2_0309, gbc_tf2_0309);

		JLabel label_41 = new JLabel("-");
		GridBagConstraints gbc_label_41 = new GridBagConstraints();
		gbc_label_41.anchor = GridBagConstraints.EAST;
		gbc_label_41.insets = new Insets(0, 0, 5, 5);
		gbc_label_41.gridx = 7;
		gbc_label_41.gridy = 14;
		p2_panel.add(label_41, gbc_label_41);

		tf2_0409 = new JTextField();
		tf2_0409.setColumns(10);
		GridBagConstraints gbc_tf2_0409 = new GridBagConstraints();
		gbc_tf2_0409.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0409.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0409.gridx = 8;
		gbc_tf2_0409.gridy = 14;
		p2_panel.add(tf2_0409, gbc_tf2_0409);

		JLabel label_54 = new JLabel("-");
		GridBagConstraints gbc_label_54 = new GridBagConstraints();
		gbc_label_54.anchor = GridBagConstraints.EAST;
		gbc_label_54.insets = new Insets(0, 0, 5, 5);
		gbc_label_54.gridx = 9;
		gbc_label_54.gridy = 14;
		p2_panel.add(label_54, gbc_label_54);

		tf2_0509 = new JTextField();
		tf2_0509.setColumns(10);
		GridBagConstraints gbc_tf2_0509 = new GridBagConstraints();
		gbc_tf2_0509.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0509.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0509.gridx = 10;
		gbc_tf2_0509.gridy = 14;
		p2_panel.add(tf2_0509, gbc_tf2_0509);

		JLabel label_10 = new JLabel("-");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.EAST;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 11;
		gbc_label_10.gridy = 14;
		p2_panel.add(label_10, gbc_label_10);

		tf2_0609 = new JTextField();
		tf2_0609.setColumns(10);
		GridBagConstraints gbc_tf2_0609 = new GridBagConstraints();
		gbc_tf2_0609.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0609.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0609.gridx = 12;
		gbc_tf2_0609.gridy = 14;
		p2_panel.add(tf2_0609, gbc_tf2_0609);

		JLabel label_66 = new JLabel("=");
		GridBagConstraints gbc_label_66 = new GridBagConstraints();
		gbc_label_66.anchor = GridBagConstraints.EAST;
		gbc_label_66.insets = new Insets(0, 0, 5, 5);
		gbc_label_66.gridx = 13;
		gbc_label_66.gridy = 14;
		p2_panel.add(label_66, gbc_label_66);

		tf2_0709 = new JTextField();
		tf2_0709.setColumns(10);
		GridBagConstraints gbc_tf2_0709 = new GridBagConstraints();
		gbc_tf2_0709.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0709.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0709.gridx = 14;
		gbc_tf2_0709.gridy = 14;
		p2_panel.add(tf2_0709, gbc_tf2_0709);

		JLabel lblE_14 = new JLabel("E54");
		GridBagConstraints gbc_lblE_14 = new GridBagConstraints();
		gbc_lblE_14.anchor = GridBagConstraints.EAST;
		gbc_lblE_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_14.gridx = 15;
		gbc_lblE_14.gridy = 14;
		p2_panel.add(lblE_14, gbc_lblE_14);

		JSeparator separator_7 = new JSeparator();
		GridBagConstraints gbc_separator_7 = new GridBagConstraints();
		gbc_separator_7.gridwidth = 15;
		gbc_separator_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_7.insets = new Insets(0, 0, 5, 5);
		gbc_separator_7.gridx = 1;
		gbc_separator_7.gridy = 15;
		p2_panel.add(separator_7, gbc_separator_7);

		JLabel lblE_7 = new JLabel("E8");
		GridBagConstraints gbc_lblE_7 = new GridBagConstraints();
		gbc_lblE_7.anchor = GridBagConstraints.WEST;
		gbc_lblE_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_7.gridx = 1;
		gbc_lblE_7.gridy = 16;
		p2_panel.add(lblE_7, gbc_lblE_7);

		tf2_0110 = new JTextField();
		tf2_0110.setColumns(10);
		GridBagConstraints gbc_tf2_0110 = new GridBagConstraints();
		gbc_tf2_0110.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0110.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0110.gridx = 2;
		gbc_tf2_0110.gridy = 16;
		p2_panel.add(tf2_0110, gbc_tf2_0110);

		JLabel label_18 = new JLabel("+");
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.anchor = GridBagConstraints.EAST;
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 3;
		gbc_label_18.gridy = 16;
		p2_panel.add(label_18, gbc_label_18);

		tf2_0210 = new JTextField();
		tf2_0210.setColumns(10);
		GridBagConstraints gbc_tf2_0210 = new GridBagConstraints();
		gbc_tf2_0210.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0210.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0210.gridx = 4;
		gbc_tf2_0210.gridy = 16;
		p2_panel.add(tf2_0210, gbc_tf2_0210);

		JLabel label_29 = new JLabel("+");
		GridBagConstraints gbc_label_29 = new GridBagConstraints();
		gbc_label_29.anchor = GridBagConstraints.EAST;
		gbc_label_29.insets = new Insets(0, 0, 5, 5);
		gbc_label_29.gridx = 5;
		gbc_label_29.gridy = 16;
		p2_panel.add(label_29, gbc_label_29);

		tf2_0310 = new JTextField();
		tf2_0310.setColumns(10);
		GridBagConstraints gbc_tf2_0310 = new GridBagConstraints();
		gbc_tf2_0310.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0310.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0310.gridx = 6;
		gbc_tf2_0310.gridy = 16;
		p2_panel.add(tf2_0310, gbc_tf2_0310);

		JLabel label_42 = new JLabel("-");
		GridBagConstraints gbc_label_42 = new GridBagConstraints();
		gbc_label_42.anchor = GridBagConstraints.EAST;
		gbc_label_42.insets = new Insets(0, 0, 5, 5);
		gbc_label_42.gridx = 7;
		gbc_label_42.gridy = 16;
		p2_panel.add(label_42, gbc_label_42);

		tf2_0410 = new JTextField();
		tf2_0410.setColumns(10);
		GridBagConstraints gbc_tf2_0410 = new GridBagConstraints();
		gbc_tf2_0410.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0410.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0410.gridx = 8;
		gbc_tf2_0410.gridy = 16;
		p2_panel.add(tf2_0410, gbc_tf2_0410);

		JLabel label_55 = new JLabel("-");
		GridBagConstraints gbc_label_55 = new GridBagConstraints();
		gbc_label_55.anchor = GridBagConstraints.EAST;
		gbc_label_55.insets = new Insets(0, 0, 5, 5);
		gbc_label_55.gridx = 9;
		gbc_label_55.gridy = 16;
		p2_panel.add(label_55, gbc_label_55);

		tf2_0510 = new JTextField();
		tf2_0510.setColumns(10);
		GridBagConstraints gbc_tf2_0510 = new GridBagConstraints();
		gbc_tf2_0510.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0510.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0510.gridx = 10;
		gbc_tf2_0510.gridy = 16;
		p2_panel.add(tf2_0510, gbc_tf2_0510);

		JLabel label_32 = new JLabel("-");
		GridBagConstraints gbc_label_32 = new GridBagConstraints();
		gbc_label_32.anchor = GridBagConstraints.EAST;
		gbc_label_32.insets = new Insets(0, 0, 5, 5);
		gbc_label_32.gridx = 11;
		gbc_label_32.gridy = 16;
		p2_panel.add(label_32, gbc_label_32);

		tf2_0610 = new JTextField();
		tf2_0610.setColumns(10);
		GridBagConstraints gbc_tf2_0610 = new GridBagConstraints();
		gbc_tf2_0610.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0610.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0610.gridx = 12;
		gbc_tf2_0610.gridy = 16;
		p2_panel.add(tf2_0610, gbc_tf2_0610);

		JLabel label_67 = new JLabel("=");
		GridBagConstraints gbc_label_67 = new GridBagConstraints();
		gbc_label_67.anchor = GridBagConstraints.EAST;
		gbc_label_67.insets = new Insets(0, 0, 5, 5);
		gbc_label_67.gridx = 13;
		gbc_label_67.gridy = 16;
		p2_panel.add(label_67, gbc_label_67);

		tf2_0710 = new JTextField();
		tf2_0710.setColumns(10);
		GridBagConstraints gbc_tf2_0710 = new GridBagConstraints();
		gbc_tf2_0710.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0710.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0710.gridx = 14;
		gbc_tf2_0710.gridy = 16;
		p2_panel.add(tf2_0710, gbc_tf2_0710);

		JLabel label_79 = new JLabel("E7");
		GridBagConstraints gbc_label_79 = new GridBagConstraints();
		gbc_label_79.anchor = GridBagConstraints.EAST;
		gbc_label_79.insets = new Insets(0, 0, 5, 5);
		gbc_label_79.gridx = 15;
		gbc_label_79.gridy = 16;
		p2_panel.add(label_79, gbc_label_79);

		JLabel lblE_8 = new JLabel("E14");
		GridBagConstraints gbc_lblE_8 = new GridBagConstraints();
		gbc_lblE_8.anchor = GridBagConstraints.WEST;
		gbc_lblE_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_8.gridx = 1;
		gbc_lblE_8.gridy = 17;
		p2_panel.add(lblE_8, gbc_lblE_8);

		tf2_0111 = new JTextField();
		tf2_0111.setColumns(10);
		GridBagConstraints gbc_tf2_0111 = new GridBagConstraints();
		gbc_tf2_0111.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0111.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0111.gridx = 2;
		gbc_tf2_0111.gridy = 17;
		p2_panel.add(tf2_0111, gbc_tf2_0111);

		JLabel label_19 = new JLabel("+");
		GridBagConstraints gbc_label_19 = new GridBagConstraints();
		gbc_label_19.anchor = GridBagConstraints.EAST;
		gbc_label_19.insets = new Insets(0, 0, 5, 5);
		gbc_label_19.gridx = 3;
		gbc_label_19.gridy = 17;
		p2_panel.add(label_19, gbc_label_19);

		tf2_0211 = new JTextField();
		tf2_0211.setColumns(10);
		GridBagConstraints gbc_tf2_0211 = new GridBagConstraints();
		gbc_tf2_0211.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0211.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0211.gridx = 4;
		gbc_tf2_0211.gridy = 17;
		p2_panel.add(tf2_0211, gbc_tf2_0211);

		JLabel label_30 = new JLabel("+");
		GridBagConstraints gbc_label_30 = new GridBagConstraints();
		gbc_label_30.anchor = GridBagConstraints.EAST;
		gbc_label_30.insets = new Insets(0, 0, 5, 5);
		gbc_label_30.gridx = 5;
		gbc_label_30.gridy = 17;
		p2_panel.add(label_30, gbc_label_30);

		tf2_0311 = new JTextField();
		tf2_0311.setColumns(10);
		GridBagConstraints gbc_tf2_0311 = new GridBagConstraints();
		gbc_tf2_0311.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0311.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0311.gridx = 6;
		gbc_tf2_0311.gridy = 17;
		p2_panel.add(tf2_0311, gbc_tf2_0311);

		JLabel label_43 = new JLabel("-");
		GridBagConstraints gbc_label_43 = new GridBagConstraints();
		gbc_label_43.anchor = GridBagConstraints.EAST;
		gbc_label_43.insets = new Insets(0, 0, 5, 5);
		gbc_label_43.gridx = 7;
		gbc_label_43.gridy = 17;
		p2_panel.add(label_43, gbc_label_43);

		tf2_0411 = new JTextField();
		tf2_0411.setColumns(10);
		GridBagConstraints gbc_tf2_0411 = new GridBagConstraints();
		gbc_tf2_0411.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0411.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0411.gridx = 8;
		gbc_tf2_0411.gridy = 17;
		p2_panel.add(tf2_0411, gbc_tf2_0411);

		JLabel label_56 = new JLabel("-");
		GridBagConstraints gbc_label_56 = new GridBagConstraints();
		gbc_label_56.anchor = GridBagConstraints.EAST;
		gbc_label_56.insets = new Insets(0, 0, 5, 5);
		gbc_label_56.gridx = 9;
		gbc_label_56.gridy = 17;
		p2_panel.add(label_56, gbc_label_56);

		tf2_0511 = new JTextField();
		tf2_0511.setColumns(10);
		GridBagConstraints gbc_tf2_0511 = new GridBagConstraints();
		gbc_tf2_0511.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0511.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0511.gridx = 10;
		gbc_tf2_0511.gridy = 17;
		p2_panel.add(tf2_0511, gbc_tf2_0511);

		JLabel label_34 = new JLabel("-");
		GridBagConstraints gbc_label_34 = new GridBagConstraints();
		gbc_label_34.anchor = GridBagConstraints.EAST;
		gbc_label_34.insets = new Insets(0, 0, 5, 5);
		gbc_label_34.gridx = 11;
		gbc_label_34.gridy = 17;
		p2_panel.add(label_34, gbc_label_34);

		tf2_0611 = new JTextField();
		tf2_0611.setColumns(10);
		GridBagConstraints gbc_tf2_0611 = new GridBagConstraints();
		gbc_tf2_0611.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0611.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0611.gridx = 12;
		gbc_tf2_0611.gridy = 17;
		p2_panel.add(tf2_0611, gbc_tf2_0611);

		JLabel label_68 = new JLabel("=");
		GridBagConstraints gbc_label_68 = new GridBagConstraints();
		gbc_label_68.anchor = GridBagConstraints.EAST;
		gbc_label_68.insets = new Insets(0, 0, 5, 5);
		gbc_label_68.gridx = 13;
		gbc_label_68.gridy = 17;
		p2_panel.add(label_68, gbc_label_68);

		tf2_0711 = new JTextField();
		tf2_0711.setColumns(10);
		GridBagConstraints gbc_tf2_0711 = new GridBagConstraints();
		gbc_tf2_0711.insets = new Insets(0, 0, 5, 5);
		gbc_tf2_0711.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0711.gridx = 14;
		gbc_tf2_0711.gridy = 17;
		p2_panel.add(tf2_0711, gbc_tf2_0711);

		JLabel lblE_13 = new JLabel("E14");
		GridBagConstraints gbc_lblE_13 = new GridBagConstraints();
		gbc_lblE_13.anchor = GridBagConstraints.EAST;
		gbc_lblE_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_13.gridx = 15;
		gbc_lblE_13.gridy = 17;
		p2_panel.add(lblE_13, gbc_lblE_13);

		JLabel lblE_9 = new JLabel("E19");
		GridBagConstraints gbc_lblE_9 = new GridBagConstraints();
		gbc_lblE_9.anchor = GridBagConstraints.WEST;
		gbc_lblE_9.insets = new Insets(0, 0, 0, 5);
		gbc_lblE_9.gridx = 1;
		gbc_lblE_9.gridy = 18;
		p2_panel.add(lblE_9, gbc_lblE_9);

		tf2_0112 = new JTextField();
		tf2_0112.setColumns(10);
		GridBagConstraints gbc_tf2_0112 = new GridBagConstraints();
		gbc_tf2_0112.insets = new Insets(0, 0, 0, 5);
		gbc_tf2_0112.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0112.gridx = 2;
		gbc_tf2_0112.gridy = 18;
		p2_panel.add(tf2_0112, gbc_tf2_0112);

		JLabel label_20 = new JLabel("+");
		GridBagConstraints gbc_label_20 = new GridBagConstraints();
		gbc_label_20.anchor = GridBagConstraints.EAST;
		gbc_label_20.insets = new Insets(0, 0, 0, 5);
		gbc_label_20.gridx = 3;
		gbc_label_20.gridy = 18;
		p2_panel.add(label_20, gbc_label_20);

		tf2_0212 = new JTextField();
		tf2_0212.setColumns(10);
		GridBagConstraints gbc_tf2_0212 = new GridBagConstraints();
		gbc_tf2_0212.insets = new Insets(0, 0, 0, 5);
		gbc_tf2_0212.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0212.gridx = 4;
		gbc_tf2_0212.gridy = 18;
		p2_panel.add(tf2_0212, gbc_tf2_0212);

		JLabel label_31 = new JLabel("+");
		GridBagConstraints gbc_label_31 = new GridBagConstraints();
		gbc_label_31.anchor = GridBagConstraints.EAST;
		gbc_label_31.insets = new Insets(0, 0, 0, 5);
		gbc_label_31.gridx = 5;
		gbc_label_31.gridy = 18;
		p2_panel.add(label_31, gbc_label_31);

		tf2_0312 = new JTextField();
		tf2_0312.setColumns(10);
		GridBagConstraints gbc_tf2_0312 = new GridBagConstraints();
		gbc_tf2_0312.insets = new Insets(0, 0, 0, 5);
		gbc_tf2_0312.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0312.gridx = 6;
		gbc_tf2_0312.gridy = 18;
		p2_panel.add(tf2_0312, gbc_tf2_0312);

		JLabel label_44 = new JLabel("-");
		GridBagConstraints gbc_label_44 = new GridBagConstraints();
		gbc_label_44.anchor = GridBagConstraints.EAST;
		gbc_label_44.insets = new Insets(0, 0, 0, 5);
		gbc_label_44.gridx = 7;
		gbc_label_44.gridy = 18;
		p2_panel.add(label_44, gbc_label_44);

		tf2_0412 = new JTextField();
		tf2_0412.setColumns(10);
		GridBagConstraints gbc_tf2_0412 = new GridBagConstraints();
		gbc_tf2_0412.insets = new Insets(0, 0, 0, 5);
		gbc_tf2_0412.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0412.gridx = 8;
		gbc_tf2_0412.gridy = 18;
		p2_panel.add(tf2_0412, gbc_tf2_0412);

		JLabel label_57 = new JLabel("-");
		GridBagConstraints gbc_label_57 = new GridBagConstraints();
		gbc_label_57.anchor = GridBagConstraints.EAST;
		gbc_label_57.insets = new Insets(0, 0, 0, 5);
		gbc_label_57.gridx = 9;
		gbc_label_57.gridy = 18;
		p2_panel.add(label_57, gbc_label_57);

		tf2_0512 = new JTextField();
		tf2_0512.setColumns(10);
		GridBagConstraints gbc_tf2_0512 = new GridBagConstraints();
		gbc_tf2_0512.insets = new Insets(0, 0, 0, 5);
		gbc_tf2_0512.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0512.gridx = 10;
		gbc_tf2_0512.gridy = 18;
		p2_panel.add(tf2_0512, gbc_tf2_0512);

		JLabel label_45 = new JLabel("-");
		GridBagConstraints gbc_label_45 = new GridBagConstraints();
		gbc_label_45.anchor = GridBagConstraints.EAST;
		gbc_label_45.insets = new Insets(0, 0, 0, 5);
		gbc_label_45.gridx = 11;
		gbc_label_45.gridy = 18;
		p2_panel.add(label_45, gbc_label_45);

		tf2_0612 = new JTextField();
		tf2_0612.setColumns(10);
		GridBagConstraints gbc_tf2_0612 = new GridBagConstraints();
		gbc_tf2_0612.insets = new Insets(0, 0, 0, 5);
		gbc_tf2_0612.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0612.gridx = 12;
		gbc_tf2_0612.gridy = 18;
		p2_panel.add(tf2_0612, gbc_tf2_0612);

		JLabel label_69 = new JLabel("=");
		GridBagConstraints gbc_label_69 = new GridBagConstraints();
		gbc_label_69.anchor = GridBagConstraints.EAST;
		gbc_label_69.insets = new Insets(0, 0, 0, 5);
		gbc_label_69.gridx = 13;
		gbc_label_69.gridy = 18;
		p2_panel.add(label_69, gbc_label_69);

		tf2_0712 = new JTextField();
		tf2_0712.setColumns(10);
		GridBagConstraints gbc_tf2_0712 = new GridBagConstraints();
		gbc_tf2_0712.insets = new Insets(0, 0, 0, 5);
		gbc_tf2_0712.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf2_0712.gridx = 14;
		gbc_tf2_0712.gridy = 18;
		p2_panel.add(tf2_0712, gbc_tf2_0712);

		JLabel lblE_12 = new JLabel("E19");
		GridBagConstraints gbc_lblE_12 = new GridBagConstraints();
		gbc_lblE_12.anchor = GridBagConstraints.EAST;
		gbc_lblE_12.insets = new Insets(0, 0, 0, 5);
		gbc_lblE_12.gridx = 15;
		gbc_lblE_12.gridy = 18;
		p2_panel.add(lblE_12, gbc_lblE_12);

		// -------------------P3----------------------------------

		JPanel p3_panel = new JPanel();
		materialplanningPane.addTab("P3", null, p3_panel, null);
		GridBagLayout gbl_p3_panel = new GridBagLayout();
		gbl_p3_panel.columnWidths = new int[] { 0, 0, 85, 0, 85, 0, 85, 10, 85, 0, 85, 0, 85, 0, 85,
				27, 0, 0 };
		gbl_p3_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0 };
		gbl_p3_panel.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0,
				0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_p3_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		p3_panel.setLayout(gbl_p3_panel);

		JLabel l3_warehousestock = new JLabel("Warehouse stock");
		GridBagConstraints gbc_l3_warehousestock = new GridBagConstraints();
		gbc_l3_warehousestock.gridwidth = 3;
		gbc_l3_warehousestock.insets = new Insets(0, 0, 5, 5);
		gbc_l3_warehousestock.gridx = 6;
		gbc_l3_warehousestock.gridy = 1;
		p3_panel.add(l3_warehousestock, gbc_l3_warehousestock);

		JLabel l3_salesorders = new JLabel("Sales Orders");
		GridBagConstraints gbc_l3_salesorders = new GridBagConstraints();
		gbc_l3_salesorders.insets = new Insets(0, 0, 5, 5);
		gbc_l3_salesorders.gridx = 2;
		gbc_l3_salesorders.gridy = 2;
		p3_panel.add(l3_salesorders, gbc_l3_salesorders);

		JLabel l3_followingperiod = new JLabel("following period");
		GridBagConstraints gbc_l3_followingperiod = new GridBagConstraints();
		gbc_l3_followingperiod.insets = new Insets(0, 0, 5, 5);
		gbc_l3_followingperiod.gridx = 6;
		gbc_l3_followingperiod.gridy = 2;
		p3_panel.add(l3_followingperiod, gbc_l3_followingperiod);

		JLabel l3_passedperiod = new JLabel("passed period");
		GridBagConstraints gbc_l3_passedperiod = new GridBagConstraints();
		gbc_l3_passedperiod.insets = new Insets(0, 0, 5, 5);
		gbc_l3_passedperiod.gridx = 8;
		gbc_l3_passedperiod.gridy = 2;
		p3_panel.add(l3_passedperiod, gbc_l3_passedperiod);

		JLabel l3_waitingqueue = new JLabel("Waiting queue");
		GridBagConstraints gbc_l3_waitingqueue = new GridBagConstraints();
		gbc_l3_waitingqueue.insets = new Insets(0, 0, 5, 5);
		gbc_l3_waitingqueue.gridx = 10;
		gbc_l3_waitingqueue.gridy = 2;
		p3_panel.add(l3_waitingqueue, gbc_l3_waitingqueue);

		JLabel l3_workinprogress = new JLabel("Work in progress");
		GridBagConstraints gbc_l3_workinprogress = new GridBagConstraints();
		gbc_l3_workinprogress.insets = new Insets(0, 0, 5, 5);
		gbc_l3_workinprogress.gridx = 12;
		gbc_l3_workinprogress.gridy = 2;
		p3_panel.add(l3_workinprogress, gbc_l3_workinprogress);

		JLabel l3_productionorders = new JLabel("Production orders");
		GridBagConstraints gbc_l3_productionorders = new GridBagConstraints();
		gbc_l3_productionorders.insets = new Insets(0, 0, 5, 5);
		gbc_l3_productionorders.gridx = 14;
		gbc_l3_productionorders.gridy = 2;
		p3_panel.add(l3_productionorders, gbc_l3_productionorders);

		JLabel lblP = new JLabel("P3");
		GridBagConstraints gbc_lblP = new GridBagConstraints();
		gbc_lblP.anchor = GridBagConstraints.WEST;
		gbc_lblP.insets = new Insets(0, 0, 5, 5);
		gbc_lblP.gridx = 1;
		gbc_lblP.gridy = 3;
		p3_panel.add(lblP, gbc_lblP);

		tf3_0101 = new JTextField();
		tf3_0101.setColumns(10);
		GridBagConstraints gbc_tf3_0101 = new GridBagConstraints();
		gbc_tf3_0101.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0101.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0101.gridx = 2;
		gbc_tf3_0101.gridy = 3;
		p3_panel.add(tf3_0101, gbc_tf3_0101);

		JLabel label_192 = new JLabel("+");
		GridBagConstraints gbc_label_192 = new GridBagConstraints();
		gbc_label_192.fill = GridBagConstraints.VERTICAL;
		gbc_label_192.gridwidth = 3;
		gbc_label_192.insets = new Insets(0, 0, 5, 5);
		gbc_label_192.gridx = 3;
		gbc_label_192.gridy = 3;
		p3_panel.add(label_192, gbc_label_192);

		tf3_0301 = new JTextField();
		tf3_0301.setColumns(10);
		GridBagConstraints gbc_tf3_0301 = new GridBagConstraints();
		gbc_tf3_0301.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0301.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0301.gridx = 6;
		gbc_tf3_0301.gridy = 3;
		p3_panel.add(tf3_0301, gbc_tf3_0301);

		JLabel label_193 = new JLabel("-");
		GridBagConstraints gbc_label_193 = new GridBagConstraints();
		gbc_label_193.anchor = GridBagConstraints.EAST;
		gbc_label_193.insets = new Insets(0, 0, 5, 5);
		gbc_label_193.gridx = 7;
		gbc_label_193.gridy = 3;
		p3_panel.add(label_193, gbc_label_193);

		tf3_0401 = new JTextField();
		tf3_0401.setColumns(10);
		GridBagConstraints gbc_tf3_0401 = new GridBagConstraints();
		gbc_tf3_0401.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0401.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0401.gridx = 8;
		gbc_tf3_0401.gridy = 3;
		p3_panel.add(tf3_0401, gbc_tf3_0401);

		JLabel label_194 = new JLabel("-");
		GridBagConstraints gbc_label_194 = new GridBagConstraints();
		gbc_label_194.anchor = GridBagConstraints.EAST;
		gbc_label_194.insets = new Insets(0, 0, 5, 5);
		gbc_label_194.gridx = 9;
		gbc_label_194.gridy = 3;
		p3_panel.add(label_194, gbc_label_194);

		tf3_0501 = new JTextField();
		tf3_0501.setColumns(10);
		GridBagConstraints gbc_tf3_0501 = new GridBagConstraints();
		gbc_tf3_0501.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0501.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0501.gridx = 10;
		gbc_tf3_0501.gridy = 3;
		p3_panel.add(tf3_0501, gbc_tf3_0501);

		JLabel label_195 = new JLabel("-");
		GridBagConstraints gbc_label_195 = new GridBagConstraints();
		gbc_label_195.anchor = GridBagConstraints.EAST;
		gbc_label_195.insets = new Insets(0, 0, 5, 5);
		gbc_label_195.gridx = 11;
		gbc_label_195.gridy = 3;
		p3_panel.add(label_195, gbc_label_195);

		tf3_0601 = new JTextField();
		tf3_0601.setColumns(10);
		GridBagConstraints gbc_tf3_0601 = new GridBagConstraints();
		gbc_tf3_0601.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0601.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0601.gridx = 12;
		gbc_tf3_0601.gridy = 3;
		p3_panel.add(tf3_0601, gbc_tf3_0601);

		JLabel label_196 = new JLabel("=");
		GridBagConstraints gbc_label_196 = new GridBagConstraints();
		gbc_label_196.anchor = GridBagConstraints.EAST;
		gbc_label_196.insets = new Insets(0, 0, 5, 5);
		gbc_label_196.gridx = 13;
		gbc_label_196.gridy = 3;
		p3_panel.add(label_196, gbc_label_196);

		tf3_0701 = new JTextField();
		tf3_0701.setColumns(10);
		GridBagConstraints gbc_tf3_0701 = new GridBagConstraints();
		gbc_tf3_0701.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0701.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0701.gridx = 14;
		gbc_tf3_0701.gridy = 3;
		p3_panel.add(tf3_0701, gbc_tf3_0701);

		JLabel lblP_3 = new JLabel("P3");
		GridBagConstraints gbc_lblP_3 = new GridBagConstraints();
		gbc_lblP_3.anchor = GridBagConstraints.EAST;
		gbc_lblP_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblP_3.gridx = 15;
		gbc_lblP_3.gridy = 3;
		p3_panel.add(lblP_3, gbc_lblP_3);

		JSeparator separator_8 = new JSeparator();
		GridBagConstraints gbc_separator_8 = new GridBagConstraints();
		gbc_separator_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_8.gridwidth = 15;
		gbc_separator_8.insets = new Insets(0, 0, 5, 5);
		gbc_separator_8.gridx = 1;
		gbc_separator_8.gridy = 4;
		p3_panel.add(separator_8, gbc_separator_8);

		JLabel label_198 = new JLabel("E26");
		GridBagConstraints gbc_label_198 = new GridBagConstraints();
		gbc_label_198.anchor = GridBagConstraints.WEST;
		gbc_label_198.insets = new Insets(0, 0, 5, 5);
		gbc_label_198.gridx = 1;
		gbc_label_198.gridy = 5;
		p3_panel.add(label_198, gbc_label_198);

		tf3_0102 = new JTextField();
		tf3_0102.setColumns(10);
		GridBagConstraints gbc_tf3_0102 = new GridBagConstraints();
		gbc_tf3_0102.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0102.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0102.gridx = 2;
		gbc_tf3_0102.gridy = 5;
		p3_panel.add(tf3_0102, gbc_tf3_0102);

		JLabel label_199 = new JLabel("+");
		GridBagConstraints gbc_label_199 = new GridBagConstraints();
		gbc_label_199.anchor = GridBagConstraints.EAST;
		gbc_label_199.insets = new Insets(0, 0, 5, 5);
		gbc_label_199.gridx = 3;
		gbc_label_199.gridy = 5;
		p3_panel.add(label_199, gbc_label_199);

		tf3_0202 = new JTextField();
		tf3_0202.setColumns(10);
		GridBagConstraints gbc_tf3_0202 = new GridBagConstraints();
		gbc_tf3_0202.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0202.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0202.gridx = 4;
		gbc_tf3_0202.gridy = 5;
		p3_panel.add(tf3_0202, gbc_tf3_0202);

		JLabel label_200 = new JLabel("+");
		GridBagConstraints gbc_label_200 = new GridBagConstraints();
		gbc_label_200.anchor = GridBagConstraints.EAST;
		gbc_label_200.insets = new Insets(0, 0, 5, 5);
		gbc_label_200.gridx = 5;
		gbc_label_200.gridy = 5;
		p3_panel.add(label_200, gbc_label_200);

		tf3_0302 = new JTextField();
		tf3_0302.setColumns(10);
		GridBagConstraints gbc_tf3_0302 = new GridBagConstraints();
		gbc_tf3_0302.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0302.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0302.gridx = 6;
		gbc_tf3_0302.gridy = 5;
		p3_panel.add(tf3_0302, gbc_tf3_0302);

		JLabel label_201 = new JLabel("-");
		GridBagConstraints gbc_label_201 = new GridBagConstraints();
		gbc_label_201.anchor = GridBagConstraints.EAST;
		gbc_label_201.insets = new Insets(0, 0, 5, 5);
		gbc_label_201.gridx = 7;
		gbc_label_201.gridy = 5;
		p3_panel.add(label_201, gbc_label_201);

		tf3_0402 = new JTextField();
		tf3_0402.setColumns(10);
		GridBagConstraints gbc_tf3_0402 = new GridBagConstraints();
		gbc_tf3_0402.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0402.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0402.gridx = 8;
		gbc_tf3_0402.gridy = 5;
		p3_panel.add(tf3_0402, gbc_tf3_0402);

		JLabel label_202 = new JLabel("-");
		GridBagConstraints gbc_label_202 = new GridBagConstraints();
		gbc_label_202.anchor = GridBagConstraints.EAST;
		gbc_label_202.insets = new Insets(0, 0, 5, 5);
		gbc_label_202.gridx = 9;
		gbc_label_202.gridy = 5;
		p3_panel.add(label_202, gbc_label_202);

		tf3_0502 = new JTextField();
		tf3_0502.setColumns(10);
		GridBagConstraints gbc_tf3_0502 = new GridBagConstraints();
		gbc_tf3_0502.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0502.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0502.gridx = 10;
		gbc_tf3_0502.gridy = 5;
		p3_panel.add(tf3_0502, gbc_tf3_0502);

		JLabel label_203 = new JLabel("-");
		GridBagConstraints gbc_label_203 = new GridBagConstraints();
		gbc_label_203.anchor = GridBagConstraints.EAST;
		gbc_label_203.insets = new Insets(0, 0, 5, 5);
		gbc_label_203.gridx = 11;
		gbc_label_203.gridy = 5;
		p3_panel.add(label_203, gbc_label_203);

		tf3_0602 = new JTextField();
		tf3_0602.setColumns(10);
		GridBagConstraints gbc_tf3_0602 = new GridBagConstraints();
		gbc_tf3_0602.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0602.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0602.gridx = 12;
		gbc_tf3_0602.gridy = 5;
		p3_panel.add(tf3_0602, gbc_tf3_0602);

		JLabel label_204 = new JLabel("=");
		GridBagConstraints gbc_label_204 = new GridBagConstraints();
		gbc_label_204.anchor = GridBagConstraints.EAST;
		gbc_label_204.insets = new Insets(0, 0, 5, 5);
		gbc_label_204.gridx = 13;
		gbc_label_204.gridy = 5;
		p3_panel.add(label_204, gbc_label_204);

		tf3_0702 = new JTextField();
		tf3_0702.setColumns(10);
		GridBagConstraints gbc_tf3_0702 = new GridBagConstraints();
		gbc_tf3_0702.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0702.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0702.gridx = 14;
		gbc_tf3_0702.gridy = 5;
		p3_panel.add(tf3_0702, gbc_tf3_0702);

		JLabel label_205 = new JLabel("E26");
		GridBagConstraints gbc_label_205 = new GridBagConstraints();
		gbc_label_205.anchor = GridBagConstraints.EAST;
		gbc_label_205.insets = new Insets(0, 0, 5, 5);
		gbc_label_205.gridx = 15;
		gbc_label_205.gridy = 5;
		p3_panel.add(label_205, gbc_label_205);

		JLabel lblE_17 = new JLabel("E31");
		GridBagConstraints gbc_lblE_17 = new GridBagConstraints();
		gbc_lblE_17.anchor = GridBagConstraints.WEST;
		gbc_lblE_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_17.gridx = 1;
		gbc_lblE_17.gridy = 6;
		p3_panel.add(lblE_17, gbc_lblE_17);

		tf3_0103 = new JTextField();
		tf3_0103.setColumns(10);
		GridBagConstraints gbc_tf3_0103 = new GridBagConstraints();
		gbc_tf3_0103.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0103.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0103.gridx = 2;
		gbc_tf3_0103.gridy = 6;
		p3_panel.add(tf3_0103, gbc_tf3_0103);

		JLabel label_207 = new JLabel("+");
		GridBagConstraints gbc_label_207 = new GridBagConstraints();
		gbc_label_207.anchor = GridBagConstraints.EAST;
		gbc_label_207.insets = new Insets(0, 0, 5, 5);
		gbc_label_207.gridx = 3;
		gbc_label_207.gridy = 6;
		p3_panel.add(label_207, gbc_label_207);

		tf3_0203 = new JTextField();
		tf3_0203.setColumns(10);
		GridBagConstraints gbc_tf3_0203 = new GridBagConstraints();
		gbc_tf3_0203.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0203.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0203.gridx = 4;
		gbc_tf3_0203.gridy = 6;
		p3_panel.add(tf3_0203, gbc_tf3_0203);

		JLabel label_208 = new JLabel("+");
		GridBagConstraints gbc_label_208 = new GridBagConstraints();
		gbc_label_208.anchor = GridBagConstraints.EAST;
		gbc_label_208.insets = new Insets(0, 0, 5, 5);
		gbc_label_208.gridx = 5;
		gbc_label_208.gridy = 6;
		p3_panel.add(label_208, gbc_label_208);

		tf3_0303 = new JTextField();
		tf3_0303.setColumns(10);
		GridBagConstraints gbc_tf3_0303 = new GridBagConstraints();
		gbc_tf3_0303.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0303.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0303.gridx = 6;
		gbc_tf3_0303.gridy = 6;
		p3_panel.add(tf3_0303, gbc_tf3_0303);

		JLabel label_209 = new JLabel("-");
		GridBagConstraints gbc_label_209 = new GridBagConstraints();
		gbc_label_209.anchor = GridBagConstraints.EAST;
		gbc_label_209.insets = new Insets(0, 0, 5, 5);
		gbc_label_209.gridx = 7;
		gbc_label_209.gridy = 6;
		p3_panel.add(label_209, gbc_label_209);

		tf3_0403 = new JTextField();
		tf3_0403.setColumns(10);
		GridBagConstraints gbc_tf3_0403 = new GridBagConstraints();
		gbc_tf3_0403.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0403.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0403.gridx = 8;
		gbc_tf3_0403.gridy = 6;
		p3_panel.add(tf3_0403, gbc_tf3_0403);

		JLabel label_210 = new JLabel("-");
		GridBagConstraints gbc_label_210 = new GridBagConstraints();
		gbc_label_210.anchor = GridBagConstraints.EAST;
		gbc_label_210.insets = new Insets(0, 0, 5, 5);
		gbc_label_210.gridx = 9;
		gbc_label_210.gridy = 6;
		p3_panel.add(label_210, gbc_label_210);

		tf3_0503 = new JTextField();
		tf3_0503.setColumns(10);
		GridBagConstraints gbc_tf3_0503 = new GridBagConstraints();
		gbc_tf3_0503.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0503.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0503.gridx = 10;
		gbc_tf3_0503.gridy = 6;
		p3_panel.add(tf3_0503, gbc_tf3_0503);

		JLabel label_211 = new JLabel("-");
		GridBagConstraints gbc_label_211 = new GridBagConstraints();
		gbc_label_211.anchor = GridBagConstraints.EAST;
		gbc_label_211.insets = new Insets(0, 0, 5, 5);
		gbc_label_211.gridx = 11;
		gbc_label_211.gridy = 6;
		p3_panel.add(label_211, gbc_label_211);

		tf3_0603 = new JTextField();
		tf3_0603.setColumns(10);
		GridBagConstraints gbc_tf3_0603 = new GridBagConstraints();
		gbc_tf3_0603.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0603.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0603.gridx = 12;
		gbc_tf3_0603.gridy = 6;
		p3_panel.add(tf3_0603, gbc_tf3_0603);

		JLabel label_212 = new JLabel("=");
		GridBagConstraints gbc_label_212 = new GridBagConstraints();
		gbc_label_212.anchor = GridBagConstraints.EAST;
		gbc_label_212.insets = new Insets(0, 0, 5, 5);
		gbc_label_212.gridx = 13;
		gbc_label_212.gridy = 6;
		p3_panel.add(label_212, gbc_label_212);

		tf3_0703 = new JTextField();
		tf3_0703.setColumns(10);
		GridBagConstraints gbc_tf3_0703 = new GridBagConstraints();
		gbc_tf3_0703.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0703.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0703.gridx = 14;
		gbc_tf3_0703.gridy = 6;
		p3_panel.add(tf3_0703, gbc_tf3_0703);

		JLabel lblE_32 = new JLabel("E31");
		GridBagConstraints gbc_lblE_32 = new GridBagConstraints();
		gbc_lblE_32.anchor = GridBagConstraints.EAST;
		gbc_lblE_32.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_32.gridx = 15;
		gbc_lblE_32.gridy = 6;
		p3_panel.add(lblE_32, gbc_lblE_32);

		JSeparator separator_9 = new JSeparator();
		GridBagConstraints gbc_separator_9 = new GridBagConstraints();
		gbc_separator_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_9.gridwidth = 15;
		gbc_separator_9.insets = new Insets(0, 0, 5, 5);
		gbc_separator_9.gridx = 1;
		gbc_separator_9.gridy = 7;
		p3_panel.add(separator_9, gbc_separator_9);

		JLabel label_214 = new JLabel("E16");
		GridBagConstraints gbc_label_214 = new GridBagConstraints();
		gbc_label_214.anchor = GridBagConstraints.WEST;
		gbc_label_214.insets = new Insets(0, 0, 5, 5);
		gbc_label_214.gridx = 1;
		gbc_label_214.gridy = 8;
		p3_panel.add(label_214, gbc_label_214);

		tf3_0104 = new JTextField();
		tf3_0104.setColumns(10);
		GridBagConstraints gbc_tf3_0104 = new GridBagConstraints();
		gbc_tf3_0104.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0104.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0104.gridx = 2;
		gbc_tf3_0104.gridy = 8;
		p3_panel.add(tf3_0104, gbc_tf3_0104);

		JLabel label_215 = new JLabel("+");
		GridBagConstraints gbc_label_215 = new GridBagConstraints();
		gbc_label_215.anchor = GridBagConstraints.EAST;
		gbc_label_215.insets = new Insets(0, 0, 5, 5);
		gbc_label_215.gridx = 3;
		gbc_label_215.gridy = 8;
		p3_panel.add(label_215, gbc_label_215);

		tf3_0204 = new JTextField();
		tf3_0204.setColumns(10);
		GridBagConstraints gbc_tf3_0204 = new GridBagConstraints();
		gbc_tf3_0204.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0204.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0204.gridx = 4;
		gbc_tf3_0204.gridy = 8;
		p3_panel.add(tf3_0204, gbc_tf3_0204);

		JLabel label_216 = new JLabel("+");
		GridBagConstraints gbc_label_216 = new GridBagConstraints();
		gbc_label_216.anchor = GridBagConstraints.EAST;
		gbc_label_216.insets = new Insets(0, 0, 5, 5);
		gbc_label_216.gridx = 5;
		gbc_label_216.gridy = 8;
		p3_panel.add(label_216, gbc_label_216);

		tf3_0304 = new JTextField();
		tf3_0304.setColumns(10);
		GridBagConstraints gbc_tf3_0304 = new GridBagConstraints();
		gbc_tf3_0304.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0304.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0304.gridx = 6;
		gbc_tf3_0304.gridy = 8;
		p3_panel.add(tf3_0304, gbc_tf3_0304);

		JLabel label_217 = new JLabel("-");
		GridBagConstraints gbc_label_217 = new GridBagConstraints();
		gbc_label_217.anchor = GridBagConstraints.EAST;
		gbc_label_217.insets = new Insets(0, 0, 5, 5);
		gbc_label_217.gridx = 7;
		gbc_label_217.gridy = 8;
		p3_panel.add(label_217, gbc_label_217);

		tf3_0404 = new JTextField();
		tf3_0404.setColumns(10);
		GridBagConstraints gbc_tf3_0404 = new GridBagConstraints();
		gbc_tf3_0404.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0404.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0404.gridx = 8;
		gbc_tf3_0404.gridy = 8;
		p3_panel.add(tf3_0404, gbc_tf3_0404);

		JLabel label_218 = new JLabel("-");
		GridBagConstraints gbc_label_218 = new GridBagConstraints();
		gbc_label_218.anchor = GridBagConstraints.EAST;
		gbc_label_218.insets = new Insets(0, 0, 5, 5);
		gbc_label_218.gridx = 9;
		gbc_label_218.gridy = 8;
		p3_panel.add(label_218, gbc_label_218);

		tf3_0504 = new JTextField();
		tf3_0504.setColumns(10);
		GridBagConstraints gbc_tf3_0504 = new GridBagConstraints();
		gbc_tf3_0504.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0504.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0504.gridx = 10;
		gbc_tf3_0504.gridy = 8;
		p3_panel.add(tf3_0504, gbc_tf3_0504);

		JLabel label_219 = new JLabel("-");
		GridBagConstraints gbc_label_219 = new GridBagConstraints();
		gbc_label_219.anchor = GridBagConstraints.EAST;
		gbc_label_219.insets = new Insets(0, 0, 5, 5);
		gbc_label_219.gridx = 11;
		gbc_label_219.gridy = 8;
		p3_panel.add(label_219, gbc_label_219);

		tf3_0604 = new JTextField();
		tf3_0604.setColumns(10);
		GridBagConstraints gbc_tf3_0604 = new GridBagConstraints();
		gbc_tf3_0604.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0604.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0604.gridx = 12;
		gbc_tf3_0604.gridy = 8;
		p3_panel.add(tf3_0604, gbc_tf3_0604);

		JLabel label_220 = new JLabel("=");
		GridBagConstraints gbc_label_220 = new GridBagConstraints();
		gbc_label_220.anchor = GridBagConstraints.EAST;
		gbc_label_220.insets = new Insets(0, 0, 5, 5);
		gbc_label_220.gridx = 13;
		gbc_label_220.gridy = 8;
		p3_panel.add(label_220, gbc_label_220);

		tf3_0704 = new JTextField();
		tf3_0704.setColumns(10);
		GridBagConstraints gbc_tf3_0704 = new GridBagConstraints();
		gbc_tf3_0704.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0704.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0704.gridx = 14;
		gbc_tf3_0704.gridy = 8;
		p3_panel.add(tf3_0704, gbc_tf3_0704);

		JLabel label_221 = new JLabel("E16");
		GridBagConstraints gbc_label_221 = new GridBagConstraints();
		gbc_label_221.anchor = GridBagConstraints.EAST;
		gbc_label_221.insets = new Insets(0, 0, 5, 5);
		gbc_label_221.gridx = 15;
		gbc_label_221.gridy = 8;
		p3_panel.add(label_221, gbc_label_221);

		JLabel label_222 = new JLabel("E17");
		GridBagConstraints gbc_label_222 = new GridBagConstraints();
		gbc_label_222.anchor = GridBagConstraints.WEST;
		gbc_label_222.insets = new Insets(0, 0, 5, 5);
		gbc_label_222.gridx = 1;
		gbc_label_222.gridy = 9;
		p3_panel.add(label_222, gbc_label_222);

		tf3_0105 = new JTextField();
		tf3_0105.setColumns(10);
		GridBagConstraints gbc_tf3_0105 = new GridBagConstraints();
		gbc_tf3_0105.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0105.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0105.gridx = 2;
		gbc_tf3_0105.gridy = 9;
		p3_panel.add(tf3_0105, gbc_tf3_0105);

		JLabel label_223 = new JLabel("+");
		GridBagConstraints gbc_label_223 = new GridBagConstraints();
		gbc_label_223.anchor = GridBagConstraints.EAST;
		gbc_label_223.insets = new Insets(0, 0, 5, 5);
		gbc_label_223.gridx = 3;
		gbc_label_223.gridy = 9;
		p3_panel.add(label_223, gbc_label_223);

		tf3_0205 = new JTextField();
		tf3_0205.setColumns(10);
		GridBagConstraints gbc_tf3_0205 = new GridBagConstraints();
		gbc_tf3_0205.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0205.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0205.gridx = 4;
		gbc_tf3_0205.gridy = 9;
		p3_panel.add(tf3_0205, gbc_tf3_0205);

		JLabel label_224 = new JLabel("+");
		GridBagConstraints gbc_label_224 = new GridBagConstraints();
		gbc_label_224.anchor = GridBagConstraints.EAST;
		gbc_label_224.insets = new Insets(0, 0, 5, 5);
		gbc_label_224.gridx = 5;
		gbc_label_224.gridy = 9;
		p3_panel.add(label_224, gbc_label_224);

		tf3_0305 = new JTextField();
		tf3_0305.setColumns(10);
		GridBagConstraints gbc_tf3_0305 = new GridBagConstraints();
		gbc_tf3_0305.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0305.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0305.gridx = 6;
		gbc_tf3_0305.gridy = 9;
		p3_panel.add(tf3_0305, gbc_tf3_0305);

		JLabel label_225 = new JLabel("-");
		GridBagConstraints gbc_label_225 = new GridBagConstraints();
		gbc_label_225.anchor = GridBagConstraints.EAST;
		gbc_label_225.insets = new Insets(0, 0, 5, 5);
		gbc_label_225.gridx = 7;
		gbc_label_225.gridy = 9;
		p3_panel.add(label_225, gbc_label_225);

		tf3_0405 = new JTextField();
		tf3_0405.setColumns(10);
		GridBagConstraints gbc_tf3_0405 = new GridBagConstraints();
		gbc_tf3_0405.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0405.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0405.gridx = 8;
		gbc_tf3_0405.gridy = 9;
		p3_panel.add(tf3_0405, gbc_tf3_0405);

		JLabel label_226 = new JLabel("-");
		GridBagConstraints gbc_label_226 = new GridBagConstraints();
		gbc_label_226.anchor = GridBagConstraints.EAST;
		gbc_label_226.insets = new Insets(0, 0, 5, 5);
		gbc_label_226.gridx = 9;
		gbc_label_226.gridy = 9;
		p3_panel.add(label_226, gbc_label_226);

		tf3_0505 = new JTextField();
		tf3_0505.setColumns(10);
		GridBagConstraints gbc_tf3_0505 = new GridBagConstraints();
		gbc_tf3_0505.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0505.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0505.gridx = 10;
		gbc_tf3_0505.gridy = 9;
		p3_panel.add(tf3_0505, gbc_tf3_0505);

		JLabel label_227 = new JLabel("-");
		GridBagConstraints gbc_label_227 = new GridBagConstraints();
		gbc_label_227.anchor = GridBagConstraints.EAST;
		gbc_label_227.insets = new Insets(0, 0, 5, 5);
		gbc_label_227.gridx = 11;
		gbc_label_227.gridy = 9;
		p3_panel.add(label_227, gbc_label_227);

		tf3_0605 = new JTextField();
		tf3_0605.setColumns(10);
		GridBagConstraints gbc_tf3_0605 = new GridBagConstraints();
		gbc_tf3_0605.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0605.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0605.gridx = 12;
		gbc_tf3_0605.gridy = 9;
		p3_panel.add(tf3_0605, gbc_tf3_0605);

		JLabel label_228 = new JLabel("=");
		GridBagConstraints gbc_label_228 = new GridBagConstraints();
		gbc_label_228.anchor = GridBagConstraints.EAST;
		gbc_label_228.insets = new Insets(0, 0, 5, 5);
		gbc_label_228.gridx = 13;
		gbc_label_228.gridy = 9;
		p3_panel.add(label_228, gbc_label_228);

		tf3_0705 = new JTextField();
		tf3_0705.setColumns(10);
		GridBagConstraints gbc_tf3_0705 = new GridBagConstraints();
		gbc_tf3_0705.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0705.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0705.gridx = 14;
		gbc_tf3_0705.gridy = 9;
		p3_panel.add(tf3_0705, gbc_tf3_0705);

		JLabel label_229 = new JLabel("E17");
		GridBagConstraints gbc_label_229 = new GridBagConstraints();
		gbc_label_229.anchor = GridBagConstraints.EAST;
		gbc_label_229.insets = new Insets(0, 0, 5, 5);
		gbc_label_229.gridx = 15;
		gbc_label_229.gridy = 9;
		p3_panel.add(label_229, gbc_label_229);

		JLabel lblE_18 = new JLabel("E30");
		GridBagConstraints gbc_lblE_18 = new GridBagConstraints();
		gbc_lblE_18.anchor = GridBagConstraints.WEST;
		gbc_lblE_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_18.gridx = 1;
		gbc_lblE_18.gridy = 10;
		p3_panel.add(lblE_18, gbc_lblE_18);

		tf3_0106 = new JTextField();
		tf3_0106.setColumns(10);
		GridBagConstraints gbc_tf3_0106 = new GridBagConstraints();
		gbc_tf3_0106.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0106.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0106.gridx = 2;
		gbc_tf3_0106.gridy = 10;
		p3_panel.add(tf3_0106, gbc_tf3_0106);

		JLabel label_231 = new JLabel("+");
		GridBagConstraints gbc_label_231 = new GridBagConstraints();
		gbc_label_231.anchor = GridBagConstraints.EAST;
		gbc_label_231.insets = new Insets(0, 0, 5, 5);
		gbc_label_231.gridx = 3;
		gbc_label_231.gridy = 10;
		p3_panel.add(label_231, gbc_label_231);

		tf3_0206 = new JTextField();
		tf3_0206.setColumns(10);
		GridBagConstraints gbc_tf3_0206 = new GridBagConstraints();
		gbc_tf3_0206.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0206.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0206.gridx = 4;
		gbc_tf3_0206.gridy = 10;
		p3_panel.add(tf3_0206, gbc_tf3_0206);

		JLabel label_232 = new JLabel("+");
		GridBagConstraints gbc_label_232 = new GridBagConstraints();
		gbc_label_232.anchor = GridBagConstraints.EAST;
		gbc_label_232.insets = new Insets(0, 0, 5, 5);
		gbc_label_232.gridx = 5;
		gbc_label_232.gridy = 10;
		p3_panel.add(label_232, gbc_label_232);

		tf3_0306 = new JTextField();
		tf3_0306.setColumns(10);
		GridBagConstraints gbc_tf3_0306 = new GridBagConstraints();
		gbc_tf3_0306.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0306.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0306.gridx = 6;
		gbc_tf3_0306.gridy = 10;
		p3_panel.add(tf3_0306, gbc_tf3_0306);

		JLabel label_233 = new JLabel("-");
		GridBagConstraints gbc_label_233 = new GridBagConstraints();
		gbc_label_233.anchor = GridBagConstraints.EAST;
		gbc_label_233.insets = new Insets(0, 0, 5, 5);
		gbc_label_233.gridx = 7;
		gbc_label_233.gridy = 10;
		p3_panel.add(label_233, gbc_label_233);

		tf3_0406 = new JTextField();
		tf3_0406.setColumns(10);
		GridBagConstraints gbc_tf3_0406 = new GridBagConstraints();
		gbc_tf3_0406.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0406.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0406.gridx = 8;
		gbc_tf3_0406.gridy = 10;
		p3_panel.add(tf3_0406, gbc_tf3_0406);

		JLabel label_234 = new JLabel("-");
		GridBagConstraints gbc_label_234 = new GridBagConstraints();
		gbc_label_234.anchor = GridBagConstraints.EAST;
		gbc_label_234.insets = new Insets(0, 0, 5, 5);
		gbc_label_234.gridx = 9;
		gbc_label_234.gridy = 10;
		p3_panel.add(label_234, gbc_label_234);

		tf3_0506 = new JTextField();
		tf3_0506.setColumns(10);
		GridBagConstraints gbc_tf3_0506 = new GridBagConstraints();
		gbc_tf3_0506.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0506.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0506.gridx = 10;
		gbc_tf3_0506.gridy = 10;
		p3_panel.add(tf3_0506, gbc_tf3_0506);

		JLabel label_235 = new JLabel("-");
		GridBagConstraints gbc_label_235 = new GridBagConstraints();
		gbc_label_235.anchor = GridBagConstraints.EAST;
		gbc_label_235.insets = new Insets(0, 0, 5, 5);
		gbc_label_235.gridx = 11;
		gbc_label_235.gridy = 10;
		p3_panel.add(label_235, gbc_label_235);

		tf3_0606 = new JTextField();
		tf3_0606.setColumns(10);
		GridBagConstraints gbc_tf3_0606 = new GridBagConstraints();
		gbc_tf3_0606.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0606.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0606.gridx = 12;
		gbc_tf3_0606.gridy = 10;
		p3_panel.add(tf3_0606, gbc_tf3_0606);

		JLabel label_236 = new JLabel("=");
		GridBagConstraints gbc_label_236 = new GridBagConstraints();
		gbc_label_236.anchor = GridBagConstraints.EAST;
		gbc_label_236.insets = new Insets(0, 0, 5, 5);
		gbc_label_236.gridx = 13;
		gbc_label_236.gridy = 10;
		p3_panel.add(label_236, gbc_label_236);

		tf3_0706 = new JTextField();
		tf3_0706.setColumns(10);
		GridBagConstraints gbc_tf3_0706 = new GridBagConstraints();
		gbc_tf3_0706.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0706.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0706.gridx = 14;
		gbc_tf3_0706.gridy = 10;
		p3_panel.add(tf3_0706, gbc_tf3_0706);

		JLabel lblE_31 = new JLabel("E30");
		GridBagConstraints gbc_lblE_31 = new GridBagConstraints();
		gbc_lblE_31.anchor = GridBagConstraints.EAST;
		gbc_lblE_31.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_31.gridx = 15;
		gbc_lblE_31.gridy = 10;
		p3_panel.add(lblE_31, gbc_lblE_31);

		JSeparator separator_10 = new JSeparator();
		GridBagConstraints gbc_separator_10 = new GridBagConstraints();
		gbc_separator_10.gridwidth = 15;
		gbc_separator_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_10.insets = new Insets(0, 0, 5, 5);
		gbc_separator_10.gridx = 1;
		gbc_separator_10.gridy = 11;
		p3_panel.add(separator_10, gbc_separator_10);

		JLabel lblE_19 = new JLabel("E6");
		GridBagConstraints gbc_lblE_19 = new GridBagConstraints();
		gbc_lblE_19.anchor = GridBagConstraints.WEST;
		gbc_lblE_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_19.gridx = 1;
		gbc_lblE_19.gridy = 12;
		p3_panel.add(lblE_19, gbc_lblE_19);

		tf3_0107 = new JTextField();
		tf3_0107.setColumns(10);
		GridBagConstraints gbc_tf3_0107 = new GridBagConstraints();
		gbc_tf3_0107.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0107.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0107.gridx = 2;
		gbc_tf3_0107.gridy = 12;
		p3_panel.add(tf3_0107, gbc_tf3_0107);

		JLabel label_239 = new JLabel("+");
		GridBagConstraints gbc_label_239 = new GridBagConstraints();
		gbc_label_239.anchor = GridBagConstraints.EAST;
		gbc_label_239.insets = new Insets(0, 0, 5, 5);
		gbc_label_239.gridx = 3;
		gbc_label_239.gridy = 12;
		p3_panel.add(label_239, gbc_label_239);

		tf3_0207 = new JTextField();
		tf3_0207.setColumns(10);
		GridBagConstraints gbc_tf3_0207 = new GridBagConstraints();
		gbc_tf3_0207.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0207.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0207.gridx = 4;
		gbc_tf3_0207.gridy = 12;
		p3_panel.add(tf3_0207, gbc_tf3_0207);

		JLabel label_240 = new JLabel("+");
		GridBagConstraints gbc_label_240 = new GridBagConstraints();
		gbc_label_240.anchor = GridBagConstraints.EAST;
		gbc_label_240.insets = new Insets(0, 0, 5, 5);
		gbc_label_240.gridx = 5;
		gbc_label_240.gridy = 12;
		p3_panel.add(label_240, gbc_label_240);

		tf3_0307 = new JTextField();
		tf3_0307.setColumns(10);
		GridBagConstraints gbc_tf3_0307 = new GridBagConstraints();
		gbc_tf3_0307.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0307.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0307.gridx = 6;
		gbc_tf3_0307.gridy = 12;
		p3_panel.add(tf3_0307, gbc_tf3_0307);

		JLabel label_241 = new JLabel("-");
		GridBagConstraints gbc_label_241 = new GridBagConstraints();
		gbc_label_241.anchor = GridBagConstraints.EAST;
		gbc_label_241.insets = new Insets(0, 0, 5, 5);
		gbc_label_241.gridx = 7;
		gbc_label_241.gridy = 12;
		p3_panel.add(label_241, gbc_label_241);

		tf3_0407 = new JTextField();
		tf3_0407.setColumns(10);
		GridBagConstraints gbc_tf3_0407 = new GridBagConstraints();
		gbc_tf3_0407.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0407.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0407.gridx = 8;
		gbc_tf3_0407.gridy = 12;
		p3_panel.add(tf3_0407, gbc_tf3_0407);

		JLabel label_242 = new JLabel("-");
		GridBagConstraints gbc_label_242 = new GridBagConstraints();
		gbc_label_242.anchor = GridBagConstraints.EAST;
		gbc_label_242.insets = new Insets(0, 0, 5, 5);
		gbc_label_242.gridx = 9;
		gbc_label_242.gridy = 12;
		p3_panel.add(label_242, gbc_label_242);

		tf3_0507 = new JTextField();
		tf3_0507.setColumns(10);
		GridBagConstraints gbc_tf3_0507 = new GridBagConstraints();
		gbc_tf3_0507.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0507.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0507.gridx = 10;
		gbc_tf3_0507.gridy = 12;
		p3_panel.add(tf3_0507, gbc_tf3_0507);

		JLabel label_243 = new JLabel("-");
		GridBagConstraints gbc_label_243 = new GridBagConstraints();
		gbc_label_243.anchor = GridBagConstraints.EAST;
		gbc_label_243.insets = new Insets(0, 0, 5, 5);
		gbc_label_243.gridx = 11;
		gbc_label_243.gridy = 12;
		p3_panel.add(label_243, gbc_label_243);

		tf3_0607 = new JTextField();
		tf3_0607.setColumns(10);
		GridBagConstraints gbc_tf3_0607 = new GridBagConstraints();
		gbc_tf3_0607.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0607.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0607.gridx = 12;
		gbc_tf3_0607.gridy = 12;
		p3_panel.add(tf3_0607, gbc_tf3_0607);

		JLabel label_244 = new JLabel("=");
		GridBagConstraints gbc_label_244 = new GridBagConstraints();
		gbc_label_244.anchor = GridBagConstraints.EAST;
		gbc_label_244.insets = new Insets(0, 0, 5, 5);
		gbc_label_244.gridx = 13;
		gbc_label_244.gridy = 12;
		p3_panel.add(label_244, gbc_label_244);

		tf3_0707 = new JTextField();
		tf3_0707.setColumns(10);
		GridBagConstraints gbc_tf3_0707 = new GridBagConstraints();
		gbc_tf3_0707.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0707.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0707.gridx = 14;
		gbc_tf3_0707.gridy = 12;
		p3_panel.add(tf3_0707, gbc_tf3_0707);

		JLabel lblE_28 = new JLabel("E6");
		GridBagConstraints gbc_lblE_28 = new GridBagConstraints();
		gbc_lblE_28.anchor = GridBagConstraints.EAST;
		gbc_lblE_28.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_28.gridx = 15;
		gbc_lblE_28.gridy = 12;
		p3_panel.add(lblE_28, gbc_lblE_28);

		JLabel lblE_20 = new JLabel("E12");
		GridBagConstraints gbc_lblE_20 = new GridBagConstraints();
		gbc_lblE_20.anchor = GridBagConstraints.WEST;
		gbc_lblE_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_20.gridx = 1;
		gbc_lblE_20.gridy = 13;
		p3_panel.add(lblE_20, gbc_lblE_20);

		tf3_0108 = new JTextField();
		tf3_0108.setColumns(10);
		GridBagConstraints gbc_tf3_0108 = new GridBagConstraints();
		gbc_tf3_0108.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0108.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0108.gridx = 2;
		gbc_tf3_0108.gridy = 13;
		p3_panel.add(tf3_0108, gbc_tf3_0108);

		JLabel label_247 = new JLabel("+");
		GridBagConstraints gbc_label_247 = new GridBagConstraints();
		gbc_label_247.anchor = GridBagConstraints.EAST;
		gbc_label_247.insets = new Insets(0, 0, 5, 5);
		gbc_label_247.gridx = 3;
		gbc_label_247.gridy = 13;
		p3_panel.add(label_247, gbc_label_247);

		tf3_0208 = new JTextField();
		tf3_0208.setColumns(10);
		GridBagConstraints gbc_tf3_0208 = new GridBagConstraints();
		gbc_tf3_0208.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0208.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0208.gridx = 4;
		gbc_tf3_0208.gridy = 13;
		p3_panel.add(tf3_0208, gbc_tf3_0208);

		JLabel label_248 = new JLabel("+");
		GridBagConstraints gbc_label_248 = new GridBagConstraints();
		gbc_label_248.anchor = GridBagConstraints.EAST;
		gbc_label_248.insets = new Insets(0, 0, 5, 5);
		gbc_label_248.gridx = 5;
		gbc_label_248.gridy = 13;
		p3_panel.add(label_248, gbc_label_248);

		tf3_0308 = new JTextField();
		tf3_0308.setColumns(10);
		GridBagConstraints gbc_tf3_0308 = new GridBagConstraints();
		gbc_tf3_0308.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0308.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0308.gridx = 6;
		gbc_tf3_0308.gridy = 13;
		p3_panel.add(tf3_0308, gbc_tf3_0308);

		JLabel label_249 = new JLabel("-");
		GridBagConstraints gbc_label_249 = new GridBagConstraints();
		gbc_label_249.anchor = GridBagConstraints.EAST;
		gbc_label_249.insets = new Insets(0, 0, 5, 5);
		gbc_label_249.gridx = 7;
		gbc_label_249.gridy = 13;
		p3_panel.add(label_249, gbc_label_249);

		tf3_0408 = new JTextField();
		tf3_0408.setColumns(10);
		GridBagConstraints gbc_tf3_0408 = new GridBagConstraints();
		gbc_tf3_0408.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0408.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0408.gridx = 8;
		gbc_tf3_0408.gridy = 13;
		p3_panel.add(tf3_0408, gbc_tf3_0408);

		JLabel label_250 = new JLabel("-");
		GridBagConstraints gbc_label_250 = new GridBagConstraints();
		gbc_label_250.anchor = GridBagConstraints.EAST;
		gbc_label_250.insets = new Insets(0, 0, 5, 5);
		gbc_label_250.gridx = 9;
		gbc_label_250.gridy = 13;
		p3_panel.add(label_250, gbc_label_250);

		tf3_0508 = new JTextField();
		tf3_0508.setColumns(10);
		GridBagConstraints gbc_tf3_0508 = new GridBagConstraints();
		gbc_tf3_0508.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0508.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0508.gridx = 10;
		gbc_tf3_0508.gridy = 13;
		p3_panel.add(tf3_0508, gbc_tf3_0508);

		JLabel label_251 = new JLabel("-");
		GridBagConstraints gbc_label_251 = new GridBagConstraints();
		gbc_label_251.anchor = GridBagConstraints.EAST;
		gbc_label_251.insets = new Insets(0, 0, 5, 5);
		gbc_label_251.gridx = 11;
		gbc_label_251.gridy = 13;
		p3_panel.add(label_251, gbc_label_251);

		tf3_0608 = new JTextField();
		tf3_0608.setColumns(10);
		GridBagConstraints gbc_tf3_0608 = new GridBagConstraints();
		gbc_tf3_0608.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0608.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0608.gridx = 12;
		gbc_tf3_0608.gridy = 13;
		p3_panel.add(tf3_0608, gbc_tf3_0608);

		JLabel label_252 = new JLabel("=");
		GridBagConstraints gbc_label_252 = new GridBagConstraints();
		gbc_label_252.anchor = GridBagConstraints.EAST;
		gbc_label_252.insets = new Insets(0, 0, 5, 5);
		gbc_label_252.gridx = 13;
		gbc_label_252.gridy = 13;
		p3_panel.add(label_252, gbc_label_252);

		tf3_0708 = new JTextField();
		tf3_0708.setColumns(10);
		GridBagConstraints gbc_tf3_0708 = new GridBagConstraints();
		gbc_tf3_0708.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0708.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0708.gridx = 14;
		gbc_tf3_0708.gridy = 13;
		p3_panel.add(tf3_0708, gbc_tf3_0708);

		JLabel lblE_29 = new JLabel("E12");
		GridBagConstraints gbc_lblE_29 = new GridBagConstraints();
		gbc_lblE_29.anchor = GridBagConstraints.EAST;
		gbc_lblE_29.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_29.gridx = 15;
		gbc_lblE_29.gridy = 13;
		p3_panel.add(lblE_29, gbc_lblE_29);

		JLabel lblE_21 = new JLabel("E29");
		GridBagConstraints gbc_lblE_21 = new GridBagConstraints();
		gbc_lblE_21.anchor = GridBagConstraints.WEST;
		gbc_lblE_21.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_21.gridx = 1;
		gbc_lblE_21.gridy = 14;
		p3_panel.add(lblE_21, gbc_lblE_21);

		tf3_0109 = new JTextField();
		tf3_0109.setColumns(10);
		GridBagConstraints gbc_tf3_0109 = new GridBagConstraints();
		gbc_tf3_0109.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0109.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0109.gridx = 2;
		gbc_tf3_0109.gridy = 14;
		p3_panel.add(tf3_0109, gbc_tf3_0109);

		JLabel label_255 = new JLabel("+");
		GridBagConstraints gbc_label_255 = new GridBagConstraints();
		gbc_label_255.anchor = GridBagConstraints.EAST;
		gbc_label_255.insets = new Insets(0, 0, 5, 5);
		gbc_label_255.gridx = 3;
		gbc_label_255.gridy = 14;
		p3_panel.add(label_255, gbc_label_255);

		tf3_0209 = new JTextField();
		tf3_0209.setColumns(10);
		GridBagConstraints gbc_tf3_0209 = new GridBagConstraints();
		gbc_tf3_0209.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0209.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0209.gridx = 4;
		gbc_tf3_0209.gridy = 14;
		p3_panel.add(tf3_0209, gbc_tf3_0209);

		JLabel label_256 = new JLabel("+");
		GridBagConstraints gbc_label_256 = new GridBagConstraints();
		gbc_label_256.anchor = GridBagConstraints.EAST;
		gbc_label_256.insets = new Insets(0, 0, 5, 5);
		gbc_label_256.gridx = 5;
		gbc_label_256.gridy = 14;
		p3_panel.add(label_256, gbc_label_256);

		tf3_0309 = new JTextField();
		tf3_0309.setColumns(10);
		GridBagConstraints gbc_tf3_0309 = new GridBagConstraints();
		gbc_tf3_0309.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0309.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0309.gridx = 6;
		gbc_tf3_0309.gridy = 14;
		p3_panel.add(tf3_0309, gbc_tf3_0309);

		JLabel label_257 = new JLabel("-");
		GridBagConstraints gbc_label_257 = new GridBagConstraints();
		gbc_label_257.anchor = GridBagConstraints.EAST;
		gbc_label_257.insets = new Insets(0, 0, 5, 5);
		gbc_label_257.gridx = 7;
		gbc_label_257.gridy = 14;
		p3_panel.add(label_257, gbc_label_257);

		tf3_0409 = new JTextField();
		tf3_0409.setColumns(10);
		GridBagConstraints gbc_tf3_0409 = new GridBagConstraints();
		gbc_tf3_0409.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0409.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0409.gridx = 8;
		gbc_tf3_0409.gridy = 14;
		p3_panel.add(tf3_0409, gbc_tf3_0409);

		JLabel label_258 = new JLabel("-");
		GridBagConstraints gbc_label_258 = new GridBagConstraints();
		gbc_label_258.anchor = GridBagConstraints.EAST;
		gbc_label_258.insets = new Insets(0, 0, 5, 5);
		gbc_label_258.gridx = 9;
		gbc_label_258.gridy = 14;
		p3_panel.add(label_258, gbc_label_258);

		tf3_0509 = new JTextField();
		tf3_0509.setColumns(10);
		GridBagConstraints gbc_tf3_0509 = new GridBagConstraints();
		gbc_tf3_0509.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0509.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0509.gridx = 10;
		gbc_tf3_0509.gridy = 14;
		p3_panel.add(tf3_0509, gbc_tf3_0509);

		JLabel label_259 = new JLabel("-");
		GridBagConstraints gbc_label_259 = new GridBagConstraints();
		gbc_label_259.anchor = GridBagConstraints.EAST;
		gbc_label_259.insets = new Insets(0, 0, 5, 5);
		gbc_label_259.gridx = 11;
		gbc_label_259.gridy = 14;
		p3_panel.add(label_259, gbc_label_259);

		tf3_0609 = new JTextField();
		tf3_0609.setColumns(10);
		GridBagConstraints gbc_tf3_0609 = new GridBagConstraints();
		gbc_tf3_0609.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0609.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0609.gridx = 12;
		gbc_tf3_0609.gridy = 14;
		p3_panel.add(tf3_0609, gbc_tf3_0609);

		JLabel label_260 = new JLabel("=");
		GridBagConstraints gbc_label_260 = new GridBagConstraints();
		gbc_label_260.anchor = GridBagConstraints.EAST;
		gbc_label_260.insets = new Insets(0, 0, 5, 5);
		gbc_label_260.gridx = 13;
		gbc_label_260.gridy = 14;
		p3_panel.add(label_260, gbc_label_260);

		tf3_0709 = new JTextField();
		tf3_0709.setColumns(10);
		GridBagConstraints gbc_tf3_0709 = new GridBagConstraints();
		gbc_tf3_0709.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0709.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0709.gridx = 14;
		gbc_tf3_0709.gridy = 14;
		p3_panel.add(tf3_0709, gbc_tf3_0709);

		JLabel lblE_30 = new JLabel("E29");
		GridBagConstraints gbc_lblE_30 = new GridBagConstraints();
		gbc_lblE_30.anchor = GridBagConstraints.EAST;
		gbc_lblE_30.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_30.gridx = 15;
		gbc_lblE_30.gridy = 14;
		p3_panel.add(lblE_30, gbc_lblE_30);

		JSeparator separator_11 = new JSeparator();
		GridBagConstraints gbc_separator_11 = new GridBagConstraints();
		gbc_separator_11.gridwidth = 15;
		gbc_separator_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_11.insets = new Insets(0, 0, 5, 5);
		gbc_separator_11.gridx = 1;
		gbc_separator_11.gridy = 15;
		p3_panel.add(separator_11, gbc_separator_11);

		JLabel lblE_22 = new JLabel("E9");
		GridBagConstraints gbc_lblE_22 = new GridBagConstraints();
		gbc_lblE_22.anchor = GridBagConstraints.WEST;
		gbc_lblE_22.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_22.gridx = 1;
		gbc_lblE_22.gridy = 16;
		p3_panel.add(lblE_22, gbc_lblE_22);

		tf3_0110 = new JTextField();
		tf3_0110.setColumns(10);
		GridBagConstraints gbc_tf3_0110 = new GridBagConstraints();
		gbc_tf3_0110.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0110.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0110.gridx = 2;
		gbc_tf3_0110.gridy = 16;
		p3_panel.add(tf3_0110, gbc_tf3_0110);

		JLabel label_263 = new JLabel("+");
		GridBagConstraints gbc_label_263 = new GridBagConstraints();
		gbc_label_263.anchor = GridBagConstraints.EAST;
		gbc_label_263.insets = new Insets(0, 0, 5, 5);
		gbc_label_263.gridx = 3;
		gbc_label_263.gridy = 16;
		p3_panel.add(label_263, gbc_label_263);

		tf3_0210 = new JTextField();
		tf3_0210.setColumns(10);
		GridBagConstraints gbc_tf3_0210 = new GridBagConstraints();
		gbc_tf3_0210.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0210.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0210.gridx = 4;
		gbc_tf3_0210.gridy = 16;
		p3_panel.add(tf3_0210, gbc_tf3_0210);

		JLabel label_264 = new JLabel("+");
		GridBagConstraints gbc_label_264 = new GridBagConstraints();
		gbc_label_264.anchor = GridBagConstraints.EAST;
		gbc_label_264.insets = new Insets(0, 0, 5, 5);
		gbc_label_264.gridx = 5;
		gbc_label_264.gridy = 16;
		p3_panel.add(label_264, gbc_label_264);

		tf3_0310 = new JTextField();
		tf3_0310.setColumns(10);
		GridBagConstraints gbc_tf3_0310 = new GridBagConstraints();
		gbc_tf3_0310.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0310.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0310.gridx = 6;
		gbc_tf3_0310.gridy = 16;
		p3_panel.add(tf3_0310, gbc_tf3_0310);

		JLabel label_265 = new JLabel("-");
		GridBagConstraints gbc_label_265 = new GridBagConstraints();
		gbc_label_265.anchor = GridBagConstraints.EAST;
		gbc_label_265.insets = new Insets(0, 0, 5, 5);
		gbc_label_265.gridx = 7;
		gbc_label_265.gridy = 16;
		p3_panel.add(label_265, gbc_label_265);

		tf3_0410 = new JTextField();
		tf3_0410.setColumns(10);
		GridBagConstraints gbc_tf3_0410 = new GridBagConstraints();
		gbc_tf3_0410.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0410.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0410.gridx = 8;
		gbc_tf3_0410.gridy = 16;
		p3_panel.add(tf3_0410, gbc_tf3_0410);

		JLabel label_266 = new JLabel("-");
		GridBagConstraints gbc_label_266 = new GridBagConstraints();
		gbc_label_266.anchor = GridBagConstraints.EAST;
		gbc_label_266.insets = new Insets(0, 0, 5, 5);
		gbc_label_266.gridx = 9;
		gbc_label_266.gridy = 16;
		p3_panel.add(label_266, gbc_label_266);

		tf3_0510 = new JTextField();
		tf3_0510.setColumns(10);
		GridBagConstraints gbc_tf3_0510 = new GridBagConstraints();
		gbc_tf3_0510.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0510.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0510.gridx = 10;
		gbc_tf3_0510.gridy = 16;
		p3_panel.add(tf3_0510, gbc_tf3_0510);

		JLabel label_267 = new JLabel("-");
		GridBagConstraints gbc_label_267 = new GridBagConstraints();
		gbc_label_267.anchor = GridBagConstraints.EAST;
		gbc_label_267.insets = new Insets(0, 0, 5, 5);
		gbc_label_267.gridx = 11;
		gbc_label_267.gridy = 16;
		p3_panel.add(label_267, gbc_label_267);

		tf3_0610 = new JTextField();
		tf3_0610.setColumns(10);
		GridBagConstraints gbc_tf3_0610 = new GridBagConstraints();
		gbc_tf3_0610.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0610.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0610.gridx = 12;
		gbc_tf3_0610.gridy = 16;
		p3_panel.add(tf3_0610, gbc_tf3_0610);

		JLabel label_268 = new JLabel("=");
		GridBagConstraints gbc_label_268 = new GridBagConstraints();
		gbc_label_268.anchor = GridBagConstraints.EAST;
		gbc_label_268.insets = new Insets(0, 0, 5, 5);
		gbc_label_268.gridx = 13;
		gbc_label_268.gridy = 16;
		p3_panel.add(label_268, gbc_label_268);

		tf3_0710 = new JTextField();
		tf3_0710.setColumns(10);
		GridBagConstraints gbc_tf3_0710 = new GridBagConstraints();
		gbc_tf3_0710.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0710.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0710.gridx = 14;
		gbc_tf3_0710.gridy = 16;
		p3_panel.add(tf3_0710, gbc_tf3_0710);

		JLabel lblE_25 = new JLabel("E9");
		GridBagConstraints gbc_lblE_25 = new GridBagConstraints();
		gbc_lblE_25.anchor = GridBagConstraints.EAST;
		gbc_lblE_25.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_25.gridx = 15;
		gbc_lblE_25.gridy = 16;
		p3_panel.add(lblE_25, gbc_lblE_25);

		JLabel lblE_23 = new JLabel("E15");
		GridBagConstraints gbc_lblE_23 = new GridBagConstraints();
		gbc_lblE_23.anchor = GridBagConstraints.WEST;
		gbc_lblE_23.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_23.gridx = 1;
		gbc_lblE_23.gridy = 17;
		p3_panel.add(lblE_23, gbc_lblE_23);

		tf3_0111 = new JTextField();
		tf3_0111.setColumns(10);
		GridBagConstraints gbc_tf3_0111 = new GridBagConstraints();
		gbc_tf3_0111.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0111.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0111.gridx = 2;
		gbc_tf3_0111.gridy = 17;
		p3_panel.add(tf3_0111, gbc_tf3_0111);

		JLabel label_271 = new JLabel("+");
		GridBagConstraints gbc_label_271 = new GridBagConstraints();
		gbc_label_271.anchor = GridBagConstraints.EAST;
		gbc_label_271.insets = new Insets(0, 0, 5, 5);
		gbc_label_271.gridx = 3;
		gbc_label_271.gridy = 17;
		p3_panel.add(label_271, gbc_label_271);

		tf3_0211 = new JTextField();
		tf3_0211.setColumns(10);
		GridBagConstraints gbc_tf3_0211 = new GridBagConstraints();
		gbc_tf3_0211.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0211.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0211.gridx = 4;
		gbc_tf3_0211.gridy = 17;
		p3_panel.add(tf3_0211, gbc_tf3_0211);

		JLabel label_272 = new JLabel("+");
		GridBagConstraints gbc_label_272 = new GridBagConstraints();
		gbc_label_272.anchor = GridBagConstraints.EAST;
		gbc_label_272.insets = new Insets(0, 0, 5, 5);
		gbc_label_272.gridx = 5;
		gbc_label_272.gridy = 17;
		p3_panel.add(label_272, gbc_label_272);

		tf3_0311 = new JTextField();
		tf3_0311.setColumns(10);
		GridBagConstraints gbc_tf3_0311 = new GridBagConstraints();
		gbc_tf3_0311.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0311.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0311.gridx = 6;
		gbc_tf3_0311.gridy = 17;
		p3_panel.add(tf3_0311, gbc_tf3_0311);

		JLabel label_273 = new JLabel("-");
		GridBagConstraints gbc_label_273 = new GridBagConstraints();
		gbc_label_273.anchor = GridBagConstraints.EAST;
		gbc_label_273.insets = new Insets(0, 0, 5, 5);
		gbc_label_273.gridx = 7;
		gbc_label_273.gridy = 17;
		p3_panel.add(label_273, gbc_label_273);

		tf3_0411 = new JTextField();
		tf3_0411.setColumns(10);
		GridBagConstraints gbc_tf3_0411 = new GridBagConstraints();
		gbc_tf3_0411.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0411.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0411.gridx = 8;
		gbc_tf3_0411.gridy = 17;
		p3_panel.add(tf3_0411, gbc_tf3_0411);

		JLabel label_274 = new JLabel("-");
		GridBagConstraints gbc_label_274 = new GridBagConstraints();
		gbc_label_274.anchor = GridBagConstraints.EAST;
		gbc_label_274.insets = new Insets(0, 0, 5, 5);
		gbc_label_274.gridx = 9;
		gbc_label_274.gridy = 17;
		p3_panel.add(label_274, gbc_label_274);

		tf3_0511 = new JTextField();
		tf3_0511.setColumns(10);
		GridBagConstraints gbc_tf3_0511 = new GridBagConstraints();
		gbc_tf3_0511.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0511.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0511.gridx = 10;
		gbc_tf3_0511.gridy = 17;
		p3_panel.add(tf3_0511, gbc_tf3_0511);

		JLabel label_275 = new JLabel("-");
		GridBagConstraints gbc_label_275 = new GridBagConstraints();
		gbc_label_275.anchor = GridBagConstraints.EAST;
		gbc_label_275.insets = new Insets(0, 0, 5, 5);
		gbc_label_275.gridx = 11;
		gbc_label_275.gridy = 17;
		p3_panel.add(label_275, gbc_label_275);

		tf3_0611 = new JTextField();
		tf3_0611.setColumns(10);
		GridBagConstraints gbc_tf3_0611 = new GridBagConstraints();
		gbc_tf3_0611.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0611.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0611.gridx = 12;
		gbc_tf3_0611.gridy = 17;
		p3_panel.add(tf3_0611, gbc_tf3_0611);

		JLabel label_276 = new JLabel("=");
		GridBagConstraints gbc_label_276 = new GridBagConstraints();
		gbc_label_276.anchor = GridBagConstraints.EAST;
		gbc_label_276.insets = new Insets(0, 0, 5, 5);
		gbc_label_276.gridx = 13;
		gbc_label_276.gridy = 17;
		p3_panel.add(label_276, gbc_label_276);

		tf3_0711 = new JTextField();
		tf3_0711.setColumns(10);
		GridBagConstraints gbc_tf3_0711 = new GridBagConstraints();
		gbc_tf3_0711.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0711.insets = new Insets(0, 0, 5, 5);
		gbc_tf3_0711.gridx = 14;
		gbc_tf3_0711.gridy = 17;
		p3_panel.add(tf3_0711, gbc_tf3_0711);

		JLabel lblE_26 = new JLabel("E15");
		GridBagConstraints gbc_lblE_26 = new GridBagConstraints();
		gbc_lblE_26.anchor = GridBagConstraints.EAST;
		gbc_lblE_26.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_26.gridx = 15;
		gbc_lblE_26.gridy = 17;
		p3_panel.add(lblE_26, gbc_lblE_26);

		JLabel lblE_24 = new JLabel("E20");
		GridBagConstraints gbc_lblE_24 = new GridBagConstraints();
		gbc_lblE_24.anchor = GridBagConstraints.WEST;
		gbc_lblE_24.insets = new Insets(0, 0, 0, 5);
		gbc_lblE_24.gridx = 1;
		gbc_lblE_24.gridy = 18;
		p3_panel.add(lblE_24, gbc_lblE_24);

		tf3_0112 = new JTextField();
		tf3_0112.setColumns(10);
		GridBagConstraints gbc_tf3_0112 = new GridBagConstraints();
		gbc_tf3_0112.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0112.insets = new Insets(0, 0, 0, 5);
		gbc_tf3_0112.gridx = 2;
		gbc_tf3_0112.gridy = 18;
		p3_panel.add(tf3_0112, gbc_tf3_0112);

		JLabel label_279 = new JLabel("+");
		GridBagConstraints gbc_label_279 = new GridBagConstraints();
		gbc_label_279.anchor = GridBagConstraints.EAST;
		gbc_label_279.insets = new Insets(0, 0, 0, 5);
		gbc_label_279.gridx = 3;
		gbc_label_279.gridy = 18;
		p3_panel.add(label_279, gbc_label_279);

		tf3_0212 = new JTextField();
		tf3_0212.setColumns(10);
		GridBagConstraints gbc_tf3_0212 = new GridBagConstraints();
		gbc_tf3_0212.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0212.insets = new Insets(0, 0, 0, 5);
		gbc_tf3_0212.gridx = 4;
		gbc_tf3_0212.gridy = 18;
		p3_panel.add(tf3_0212, gbc_tf3_0212);

		JLabel label_280 = new JLabel("+");
		GridBagConstraints gbc_label_280 = new GridBagConstraints();
		gbc_label_280.anchor = GridBagConstraints.EAST;
		gbc_label_280.insets = new Insets(0, 0, 0, 5);
		gbc_label_280.gridx = 5;
		gbc_label_280.gridy = 18;
		p3_panel.add(label_280, gbc_label_280);

		tf3_0312 = new JTextField();
		tf3_0312.setColumns(10);
		GridBagConstraints gbc_tf3_0312 = new GridBagConstraints();
		gbc_tf3_0312.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0312.insets = new Insets(0, 0, 0, 5);
		gbc_tf3_0312.gridx = 6;
		gbc_tf3_0312.gridy = 18;
		p3_panel.add(tf3_0312, gbc_tf3_0312);

		JLabel label_281 = new JLabel("-");
		GridBagConstraints gbc_label_281 = new GridBagConstraints();
		gbc_label_281.anchor = GridBagConstraints.EAST;
		gbc_label_281.insets = new Insets(0, 0, 0, 5);
		gbc_label_281.gridx = 7;
		gbc_label_281.gridy = 18;
		p3_panel.add(label_281, gbc_label_281);

		tf3_0412 = new JTextField();
		tf3_0412.setColumns(10);
		GridBagConstraints gbc_tf3_0412 = new GridBagConstraints();
		gbc_tf3_0412.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0412.insets = new Insets(0, 0, 0, 5);
		gbc_tf3_0412.gridx = 8;
		gbc_tf3_0412.gridy = 18;
		p3_panel.add(tf3_0412, gbc_tf3_0412);

		JLabel label_282 = new JLabel("-");
		GridBagConstraints gbc_label_282 = new GridBagConstraints();
		gbc_label_282.anchor = GridBagConstraints.EAST;
		gbc_label_282.insets = new Insets(0, 0, 0, 5);
		gbc_label_282.gridx = 9;
		gbc_label_282.gridy = 18;
		p3_panel.add(label_282, gbc_label_282);

		tf3_0512 = new JTextField();
		tf3_0512.setColumns(10);
		GridBagConstraints gbc_tf3_0512 = new GridBagConstraints();
		gbc_tf3_0512.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0512.insets = new Insets(0, 0, 0, 5);
		gbc_tf3_0512.gridx = 10;
		gbc_tf3_0512.gridy = 18;
		p3_panel.add(tf3_0512, gbc_tf3_0512);

		JLabel label_283 = new JLabel("-");
		GridBagConstraints gbc_label_283 = new GridBagConstraints();
		gbc_label_283.anchor = GridBagConstraints.EAST;
		gbc_label_283.insets = new Insets(0, 0, 0, 5);
		gbc_label_283.gridx = 11;
		gbc_label_283.gridy = 18;
		p3_panel.add(label_283, gbc_label_283);

		tf3_0612 = new JTextField();
		tf3_0612.setColumns(10);
		GridBagConstraints gbc_tf3_0612 = new GridBagConstraints();
		gbc_tf3_0612.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0612.insets = new Insets(0, 0, 0, 5);
		gbc_tf3_0612.gridx = 12;
		gbc_tf3_0612.gridy = 18;
		p3_panel.add(tf3_0612, gbc_tf3_0612);

		JLabel label_284 = new JLabel("=");
		GridBagConstraints gbc_label_284 = new GridBagConstraints();
		gbc_label_284.anchor = GridBagConstraints.EAST;
		gbc_label_284.insets = new Insets(0, 0, 0, 5);
		gbc_label_284.gridx = 13;
		gbc_label_284.gridy = 18;
		p3_panel.add(label_284, gbc_label_284);

		tf3_0712 = new JTextField();
		tf3_0712.setColumns(10);
		GridBagConstraints gbc_tf3_0712 = new GridBagConstraints();
		gbc_tf3_0712.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf3_0712.insets = new Insets(0, 0, 0, 5);
		gbc_tf3_0712.gridx = 14;
		gbc_tf3_0712.gridy = 18;
		p3_panel.add(tf3_0712, gbc_tf3_0712);

		JLabel lblE_27 = new JLabel("E20");
		GridBagConstraints gbc_lblE_27 = new GridBagConstraints();
		gbc_lblE_27.anchor = GridBagConstraints.EAST;
		gbc_lblE_27.insets = new Insets(0, 0, 0, 5);
		gbc_lblE_27.gridx = 15;
		gbc_lblE_27.gridy = 18;
		p3_panel.add(lblE_27, gbc_lblE_27);

		tf1_0401.setEditable(false);
		tf1_0501.setEditable(false);
		tf1_0601.setEditable(false);

		tf1_0402.setEditable(false);
		tf1_0502.setEditable(false);
		tf1_0602.setEditable(false);

		tf1_0403.setEditable(false);
		tf1_0503.setEditable(false);
		tf1_0603.setEditable(false);

		tf1_0404.setEditable(false);
		tf1_0504.setEditable(false);
		tf1_0604.setEditable(false);

		tf1_0405.setEditable(false);
		tf1_0505.setEditable(false);
		tf1_0605.setEditable(false);

		tf1_0406.setEditable(false);
		tf1_0506.setEditable(false);
		tf1_0606.setEditable(false);

		tf1_0407.setEditable(false);
		tf1_0507.setEditable(false);
		tf1_0607.setEditable(false);

		tf1_0408.setEditable(false);
		tf1_0508.setEditable(false);
		tf1_0608.setEditable(false);

		tf1_0409.setEditable(false);
		tf1_0509.setEditable(false);
		tf1_0609.setEditable(false);

		tf1_0410.setEditable(false);
		tf1_0510.setEditable(false);
		tf1_0610.setEditable(false);

		tf1_0411.setEditable(false);
		tf1_0511.setEditable(false);
		tf1_0611.setEditable(false);

		tf1_0412.setEditable(false);
		tf1_0512.setEditable(false);
		tf1_0612.setEditable(false);

		tf2_0401.setEditable(false);
		tf2_0501.setEditable(false);
		tf2_0601.setEditable(false);

		tf2_0402.setEditable(false);
		tf2_0502.setEditable(false);
		tf2_0602.setEditable(false);

		tf2_0403.setEditable(false);
		tf2_0503.setEditable(false);
		tf2_0603.setEditable(false);

		tf2_0404.setEditable(false);
		tf2_0504.setEditable(false);
		tf2_0604.setEditable(false);

		tf2_0405.setEditable(false);
		tf2_0505.setEditable(false);
		tf2_0605.setEditable(false);

		tf2_0406.setEditable(false);
		tf2_0506.setEditable(false);
		tf2_0606.setEditable(false);

		tf2_0407.setEditable(false);
		tf2_0507.setEditable(false);
		tf2_0607.setEditable(false);

		tf2_0408.setEditable(false);
		tf2_0508.setEditable(false);
		tf2_0608.setEditable(false);

		tf2_0409.setEditable(false);
		tf2_0509.setEditable(false);
		tf2_0609.setEditable(false);

		tf2_0410.setEditable(false);
		tf2_0510.setEditable(false);
		tf2_0610.setEditable(false);

		tf2_0411.setEditable(false);
		tf2_0511.setEditable(false);
		tf2_0611.setEditable(false);

		tf2_0412.setEditable(false);
		tf2_0512.setEditable(false);
		tf2_0612.setEditable(false);

		tf3_0401.setEditable(false);
		tf3_0501.setEditable(false);
		tf3_0601.setEditable(false);

		tf3_0402.setEditable(false);
		tf3_0502.setEditable(false);
		tf3_0602.setEditable(false);

		tf3_0403.setEditable(false);
		tf3_0503.setEditable(false);
		tf3_0603.setEditable(false);

		tf3_0404.setEditable(false);
		tf3_0504.setEditable(false);
		tf3_0604.setEditable(false);

		tf3_0405.setEditable(false);
		tf3_0505.setEditable(false);
		tf3_0605.setEditable(false);

		tf3_0406.setEditable(false);
		tf3_0506.setEditable(false);
		tf3_0606.setEditable(false);

		tf3_0407.setEditable(false);
		tf3_0507.setEditable(false);
		tf3_0607.setEditable(false);

		tf3_0408.setEditable(false);
		tf3_0508.setEditable(false);
		tf3_0608.setEditable(false);

		tf3_0409.setEditable(false);
		tf3_0509.setEditable(false);
		tf3_0609.setEditable(false);

		tf3_0410.setEditable(false);
		tf3_0510.setEditable(false);
		tf3_0610.setEditable(false);

		tf3_0411.setEditable(false);
		tf3_0511.setEditable(false);
		tf3_0611.setEditable(false);

		tf3_0412.setEditable(false);
		tf3_0512.setEditable(false);
		tf3_0612.setEditable(false);

		tf1_0102.setEditable(false);
		tf1_0103.setEditable(false);
		tf1_0104.setEditable(false);
		tf1_0105.setEditable(false);
		tf1_0106.setEditable(false);
		tf1_0107.setEditable(false);
		tf1_0108.setEditable(false);
		tf1_0109.setEditable(false);
		tf1_0110.setEditable(false);
		tf1_0111.setEditable(false);
		tf1_0112.setEditable(false);

		tf1_0202.setEditable(false);
		tf1_0203.setEditable(false);
		tf1_0204.setEditable(false);
		tf1_0205.setEditable(false);
		tf1_0206.setEditable(false);
		tf1_0207.setEditable(false);
		tf1_0208.setEditable(false);
		tf1_0209.setEditable(false);
		tf1_0210.setEditable(false);
		tf1_0211.setEditable(false);
		tf1_0212.setEditable(false);

		tf1_0701.setEditable(false);
		tf1_0702.setEditable(false);
		tf1_0703.setEditable(false);
		tf1_0704.setEditable(false);
		tf1_0705.setEditable(false);
		tf1_0706.setEditable(false);
		tf1_0707.setEditable(false);
		tf1_0708.setEditable(false);
		tf1_0709.setEditable(false);
		tf1_0710.setEditable(false);
		tf1_0711.setEditable(false);
		tf1_0712.setEditable(false);

		tf1_0101.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.p1Prod[0][1] = Integer.parseInt(tf1_0101.getText());
					Utility.calculateAfterChange();

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		tf1_0301.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.p1Prod[0][3] = Integer.parseInt(tf1_0301.getText());
					Utility.calculateAfterChange();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		tf1_0302.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.p1Prod[1][3] = Integer.parseInt(tf1_0302.getText());
					Utility.calculateAfterChange();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		tf1_0303.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.p1Prod[2][3] = Integer.parseInt(tf1_0303.getText());
					Utility.calculateAfterChange();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		tf1_0304.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.p1Prod[3][3] = Integer.parseInt(tf1_0304.getText());
					Utility.calculateAfterChange();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		tf1_0305.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.p1Prod[4][3] = Integer.parseInt(tf1_0305.getText());
					Utility.calculateAfterChange();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		tf1_0306.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.p1Prod[5][3] = Integer.parseInt(tf1_0306.getText());
					Utility.calculateAfterChange();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		tf1_0307.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.p1Prod[6][3] = Integer.parseInt(tf1_0307.getText());
					Utility.calculateAfterChange();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		tf1_0308.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.p1Prod[7][3] = Integer.parseInt(tf1_0308.getText());
					Utility.calculateAfterChange();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		tf1_0309.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.p1Prod[8][3] = Integer.parseInt(tf1_0309.getText());
					Utility.calculateAfterChange();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		tf1_0310.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.p1Prod[9][3] = Integer.parseInt(tf1_0310.getText());
					Utility.calculateAfterChange();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		tf1_0311.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.p1Prod[10][3] = Integer.parseInt(tf1_0311.getText());
					Utility.calculateAfterChange();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		tf1_0312.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.p1Prod[11][3] = Integer.parseInt(tf1_0312.getText());
					Utility.calculateAfterChange();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		return materialplanningPane;
	}

	public static JTextField getTf1_0101() {
		return tf1_0101;
	}

	public static JTextField getTf1_0301() {
		return tf1_0301;
	}

	public static JTextField getTf1_0401() {
		return tf1_0401;
	}

	public static JTextField getTf1_0501() {
		return tf1_0501;
	}

	public static JTextField getTf1_0601() {
		return tf1_0601;
	}

	public static JTextField getTf1_0701() {
		return tf1_0701;
	}

	public static JTextField getTf1_0102() {
		return tf1_0102;
	}

	public static JTextField getTf1_0202() {
		return tf1_0202;
	}

	public static JTextField getTf1_0302() {
		return tf1_0302;
	}

	public static JTextField getTf1_0402() {
		return tf1_0402;
	}

	public static JTextField getTf1_0502() {
		return tf1_0502;
	}

	public static JTextField getTf1_0602() {
		return tf1_0602;
	}

	public static JTextField getTf1_0702() {
		return tf1_0702;
	}

	public static JTextField getTf1_0103() {
		return tf1_0103;
	}

	public static JTextField getTf1_0203() {
		return tf1_0203;
	}

	public static JTextField getTf1_0303() {
		return tf1_0303;
	}

	public static JTextField getTf1_0403() {
		return tf1_0403;
	}

	public static JTextField getTf1_0503() {
		return tf1_0503;
	}

	public static JTextField getTf1_0603() {
		return tf1_0603;
	}

	public static JTextField getTf1_0703() {
		return tf1_0703;
	}

	public static JTextField getTf1_0104() {
		return tf1_0104;
	}

	public static JTextField getTf1_0204() {
		return tf1_0204;
	}

	public static JTextField getTf1_0304() {
		return tf1_0304;
	}

	public static JTextField getTf1_0404() {
		return tf1_0404;
	}

	public static JTextField getTf1_0504() {
		return tf1_0504;
	}

	public static JTextField getTf1_0604() {
		return tf1_0604;
	}

	public static JTextField getTf1_0704() {
		return tf1_0704;
	}

	public static JTextField getTf1_0105() {
		return tf1_0105;
	}

	public static JTextField getTf1_0205() {
		return tf1_0205;
	}

	public static JTextField getTf1_0305() {
		return tf1_0305;
	}

	public static JTextField getTf1_0405() {
		return tf1_0405;
	}

	public static JTextField getTf1_0505() {
		return tf1_0505;
	}

	public static JTextField getTf1_0605() {
		return tf1_0605;
	}

	public static JTextField getTf1_0705() {
		return tf1_0705;
	}

	public static JTextField getTf1_0106() {
		return tf1_0106;
	}

	public static JTextField getTf1_0206() {
		return tf1_0206;
	}

	public static JTextField getTf1_0306() {
		return tf1_0306;
	}

	public static JTextField getTf1_0406() {
		return tf1_0406;
	}

	public static JTextField getTf1_0506() {
		return tf1_0506;
	}

	public static JTextField getTf1_0606() {
		return tf1_0606;
	}

	public static JTextField getTf1_0706() {
		return tf1_0706;
	}

	public static JTextField getTf1_0107() {
		return tf1_0107;
	}

	public static JTextField getTf1_0207() {
		return tf1_0207;
	}

	public static JTextField getTf1_0307() {
		return tf1_0307;
	}

	public static JTextField getTf1_0407() {
		return tf1_0407;
	}

	public static JTextField getTf1_0507() {
		return tf1_0507;
	}

	public static JTextField getTf1_0607() {
		return tf1_0607;
	}

	public static JTextField getTf1_0707() {
		return tf1_0707;
	}

	public static JTextField getTf1_0108() {
		return tf1_0108;
	}

	public static JTextField getTf1_0208() {
		return tf1_0208;
	}

	public static JTextField getTf1_0308() {
		return tf1_0308;
	}

	public static JTextField getTf1_0408() {
		return tf1_0408;
	}

	public static JTextField getTf1_0508() {
		return tf1_0508;
	}

	public static JTextField getTf1_0608() {
		return tf1_0608;
	}

	public static JTextField getTf1_0708() {
		return tf1_0708;
	}

	public static JTextField getTf1_0109() {
		return tf1_0109;
	}

	public static JTextField getTf1_0209() {
		return tf1_0209;
	}

	public static JTextField getTf1_0309() {
		return tf1_0309;
	}

	public static JTextField getTf1_0409() {
		return tf1_0409;
	}

	public static JTextField getTf1_0509() {
		return tf1_0509;
	}

	public static JTextField getTf1_0609() {
		return tf1_0609;
	}

	public static JTextField getTf1_0709() {
		return tf1_0709;
	}

	public static JTextField getTf1_0110() {
		return tf1_0110;
	}

	public static JTextField getTf1_0210() {
		return tf1_0210;
	}

	public static JTextField getTf1_0310() {
		return tf1_0310;
	}

	public static JTextField getTf1_0410() {
		return tf1_0410;
	}

	public static JTextField getTf1_0510() {
		return tf1_0510;
	}

	public static JTextField getTf1_0610() {
		return tf1_0610;
	}

	public static JTextField getTf1_0710() {
		return tf1_0710;
	}

	public static JTextField getTf1_0111() {
		return tf1_0111;
	}

	public static JTextField getTf1_0211() {
		return tf1_0211;
	}

	public static JTextField getTf1_0311() {
		return tf1_0311;
	}

	public static JTextField getTf1_0411() {
		return tf1_0411;
	}

	public static JTextField getTf1_0511() {
		return tf1_0511;
	}

	public static JTextField getTf1_0611() {
		return tf1_0611;
	}

	public static JTextField getTf1_0711() {
		return tf1_0711;
	}

	public static JTextField getTf1_0112() {
		return tf1_0112;
	}

	public static JTextField getTf1_0212() {
		return tf1_0212;
	}

	public static JTextField getTf1_0312() {
		return tf1_0312;
	}

	public static JTextField getTf1_0412() {
		return tf1_0412;
	}

	public static JTextField getTf1_0512() {
		return tf1_0512;
	}

	public static JTextField getTf1_0612() {
		return tf1_0612;
	}

	public static JTextField getTf1_0712() {
		return tf1_0712;
	}

	public static JTextField getTextField_1() {
		return tf2_0301;
	}

	public static JTextField getTextField() {
		return tf2_0102;
	}

	public static JTextField getTextField_3() {
		return tf2_0101;
	}

	public static JTextField getTextField_4() {
		return tf2_0103;
	}

	public static JTextField getTextField_5() {
		return tf2_0104;
	}

	public static JTextField getTextField_6() {
		return tf2_0105;
	}

	public static JTextField getTextField_7() {
		return tf2_0106;
	}

	public static JTextField getTextField_8() {
		return tf2_0107;
	}

	public static JTextField getTextField_9() {
		return tf2_0108;
	}

	public static JTextField getTextField_10() {
		return tf2_0109;
	}

	public static JTextField getTextField_11() {
		return tf2_0110;
	}

	public static JTextField getTextField_12() {
		return tf2_0111;
	}

	public static JTextField getTextField_13() {
		return tf2_0112;
	}

	public static JTextField getTextField_14() {
		return tf2_0202;
	}

	public static JTextField getTextField_15() {
		return tf2_0302;
	}

	public static JTextField getTextField_16() {
		return tf2_0203;
	}

	public static JTextField getTextField_17() {
		return tf2_0206;
	}

	public static JTextField getTextField_18() {
		return tf2_0205;
	}

	public static JTextField getTextField_19() {
		return tf2_0204;
	}

	public static JTextField getTextField_20() {
		return tf2_0207;
	}

	public static JTextField getTextField_21() {
		return tf2_0208;
	}

	public static JTextField getTextField_22() {
		return tf2_0209;
	}

	public static JTextField getTextField_23() {
		return tf2_0210;
	}

	public static JTextField getTextField_24() {
		return tf2_0211;
	}

	public static JTextField getTextField_25() {
		return tf2_0212;
	}

	public static JTextField getTextField_26() {
		return tf2_0303;
	}

	public static JTextField getTextField_27() {
		return tf2_0304;
	}

	public static JTextField getTextField_28() {
		return tf2_0305;
	}

	public static JTextField getTextField_29() {
		return tf2_0306;
	}

	public static JTextField getTextField_30() {
		return tf2_0307;
	}

	public static JTextField getTextField_31() {
		return tf2_0308;
	}

	public static JTextField getTextField_32() {
		return tf2_0309;
	}

	public static JTextField getTextField_33() {
		return tf2_0310;
	}

	public static JTextField getTextField_34() {
		return tf2_0311;
	}

	public static JTextField getTextField_35() {
		return tf2_0312;
	}

	public static JTextField getTextField_36() {
		return tf2_0402;
	}

	public static JTextField getTextField_37() {
		return tf2_0403;
	}

	public static JTextField getTextField_38() {
		return tf2_0404;
	}

	public static JTextField getTextField_39() {
		return tf2_0405;
	}

	public static JTextField getTextField_40() {
		return tf2_0406;
	}

	public static JTextField getTextField_41() {
		return tf2_0407;
	}

	public static JTextField getTextField_42() {
		return tf2_0408;
	}

	public static JTextField getTextField_43() {
		return tf2_0409;
	}

	public static JTextField getTextField_44() {
		return tf2_0410;
	}

	public static JTextField getTextField_45() {
		return tf2_0411;
	}

	public static JTextField getTextField_46() {
		return tf2_0412;
	}

	public static JTextField getTextField_2() {
		return tf2_0401;
	}

	public static JTextField getTextField_47() {
		return tf2_0501;
	}

	public static JTextField getTextField_48() {
		return tf2_0502;
	}

	public static JTextField getTextField_49() {
		return tf2_0503;
	}

	public static JTextField getTextField_50() {
		return tf2_0504;
	}

	public static JTextField getTextField_51() {
		return tf2_0505;
	}

	public static JTextField getTextField_52() {
		return tf2_0506;
	}

	public static JTextField getTextField_53() {
		return tf2_0507;
	}

	public static JTextField getTextField_54() {
		return tf2_0508;
	}

	public static JTextField getTextField_55() {
		return tf2_0509;
	}

	public static JTextField getTextField_56() {
		return tf2_0510;
	}

	public static JTextField getTextField_57() {
		return tf2_0511;
	}

	public static JTextField getTextField_58() {
		return tf2_0512;
	}

	public static JTextField getTextField_59() {
		return tf2_0601;
	}

	public static JTextField getTextField_60() {
		return tf2_0602;
	}

	public static JTextField getTextField_61() {
		return tf2_0603;
	}

	public static JTextField getTextField_62() {
		return tf2_0604;
	}

	public static JTextField getTextField_63() {
		return tf2_0605;
	}

	public static JTextField getTextField_64() {
		return tf2_0606;
	}

	public static JTextField getTextField_65() {
		return tf2_0607;
	}

	public static JTextField getTextField_66() {
		return tf2_0608;
	}

	public static JTextField getTextField_67() {
		return tf2_0609;
	}

	public static JTextField getTextField_68() {
		return tf2_0610;
	}

	public static JTextField getTextField_69() {
		return tf2_0611;
	}

	public static JTextField getTextField_70() {
		return tf2_0612;
	}

	public static JTextField getTextField_71() {
		return tf2_0701;
	}

	public static JTextField getTextField_72() {
		return tf2_0702;
	}

	public static JTextField getTextField_73() {
		return tf2_0703;
	}

	public static JTextField getTextField_74() {
		return tf2_0704;
	}

	public static JTextField getTextField_75() {
		return tf2_0705;
	}

	public static JTextField getTextField_76() {
		return tf2_0706;
	}

	public static JTextField getTextField_77() {
		return tf2_0707;
	}

	public static JTextField getTextField_78() {
		return tf2_0708;
	}

	public static JTextField getTextField_79() {
		return tf2_0709;
	}

	public static JTextField getTextField_80() {
		return tf2_0710;
	}

	public static JTextField getTextField_81() {
		return tf2_0711;
	}

	public static JTextField getTextField_82() {
		return tf2_0712;
	}

	public static JTextField getTextField_166() {
		return tf3_0101;
	}

	public static JTextField getTextField_167() {
		return tf3_0301;
	}

	public static JTextField getTextField_168() {
		return tf3_0401;
	}

	public static JTextField getTextField_169() {
		return tf3_0501;
	}

	public static JTextField getTextField_170() {
		return tf3_0601;
	}

	public static JTextField getTextField_171() {
		return tf3_0701;
	}

	public static JTextField getTextField_172() {
		return tf3_0102;
	}

	public static JTextField getTextField_173() {
		return tf3_0202;
	}

	public static JTextField getTextField_174() {
		return tf3_0302;
	}

	public static JTextField getTextField_175() {
		return tf3_0402;
	}

	public static JTextField getTextField_176() {
		return tf3_0502;
	}

	public static JTextField getTextField_177() {
		return tf3_0602;
	}

	public static JTextField getTextField_178() {
		return tf3_0702;
	}

	public static JTextField getTextField_179() {
		return tf3_0103;
	}

	public static JTextField getTextField_180() {
		return tf3_0203;
	}

	public static JTextField getTextField_181() {
		return tf3_0303;
	}

	public static JTextField getTextField_182() {
		return tf3_0403;
	}

	public static JTextField getTextField_183() {
		return tf3_0503;
	}

	public static JTextField getTextField_184() {
		return tf3_0603;
	}

	public static JTextField getTextField_185() {
		return tf3_0703;
	}

	public static JTextField getTextField_186() {
		return tf3_0104;
	}

	public static JTextField getTextField_187() {
		return tf3_0204;
	}

	public static JTextField getTextField_188() {
		return tf3_0304;
	}

	public static JTextField getTextField_189() {
		return tf3_0404;
	}

	public static JTextField getTextField_190() {
		return tf3_0504;
	}

	public static JTextField getTextField_191() {
		return tf3_0604;
	}

	public static JTextField getTextField_192() {
		return tf3_0704;
	}

	public static JTextField getTextField_193() {
		return tf3_0105;
	}

	public static JTextField getTextField_194() {
		return tf3_0205;
	}

	public static JTextField getTextField_195() {
		return tf3_0305;
	}

	public static JTextField getTextField_196() {
		return tf3_0405;
	}

	public static JTextField getTextField_197() {
		return tf3_0505;
	}

	public static JTextField getTextField_198() {
		return tf3_0605;
	}

	public static JTextField getTextField_199() {
		return tf3_0705;
	}

	public static JTextField getTextField_200() {
		return tf3_0106;
	}

	public static JTextField getTextField_201() {
		return tf3_0206;
	}

	public static JTextField getTextField_202() {
		return tf3_0306;
	}

	public static JTextField getTextField_203() {
		return tf3_0406;
	}

	public static JTextField getTextField_204() {
		return tf3_0506;
	}

	public static JTextField getTextField_205() {
		return tf3_0606;
	}

	public static JTextField getTextField_206() {
		return tf3_0706;
	}

	public static JTextField getTextField_207() {
		return tf3_0107;
	}

	public static JTextField getTextField_208() {
		return tf3_0207;
	}

	public static JTextField getTextField_209() {
		return tf3_0307;
	}

	public static JTextField getTextField_210() {
		return tf3_0407;
	}

	public static JTextField getTextField_211() {
		return tf3_0507;
	}

	public static JTextField getTextField_212() {
		return tf3_0607;
	}

	public static JTextField getTextField_213() {
		return tf3_0707;
	}

	public static JTextField getTextField_214() {
		return tf3_0108;
	}

	public static JTextField getTextField_215() {
		return tf3_0208;
	}

	public static JTextField getTextField_216() {
		return tf3_0308;
	}

	public static JTextField getTextField_217() {
		return tf3_0408;
	}

	public static JTextField getTextField_218() {
		return tf3_0508;
	}

	public static JTextField getTextField_219() {
		return tf3_0608;
	}

	public static JTextField getTextField_220() {
		return tf3_0708;
	}

	public static JTextField getTextField_221() {
		return tf3_0109;
	}

	public static JTextField getTextField_222() {
		return tf3_0209;
	}

	public static JTextField getTextField_223() {
		return tf3_0309;
	}

	public static JTextField getTextField_224() {
		return tf3_0409;
	}

	public static JTextField getTextField_225() {
		return tf3_0509;
	}

	public static JTextField getTextField_226() {
		return tf3_0609;
	}

	public static JTextField getTextField_227() {
		return tf3_0709;
	}

	public static JTextField getTextField_228() {
		return tf3_0110;
	}

	public static JTextField getTextField_229() {
		return tf3_0210;
	}

	public static JTextField getTextField_230() {
		return tf3_0310;
	}

	public static JTextField getTextField_231() {
		return tf3_0410;
	}

	public static JTextField getTextField_232() {
		return tf3_0510;
	}

	public static JTextField getTextField_233() {
		return tf3_0610;
	}

	public static JTextField getTextField_234() {
		return tf3_0710;
	}

	public static JTextField getTextField_235() {
		return tf3_0111;
	}

	public static JTextField getTextField_236() {
		return tf3_0211;
	}

	public static JTextField getTextField_237() {
		return tf3_0311;
	}

	public static JTextField getTextField_238() {
		return tf3_0411;
	}

	public static JTextField getTextField_239() {
		return tf3_0511;
	}

	public static JTextField getTextField_240() {
		return tf3_0611;
	}

	public static JTextField getTextField_241() {
		return tf3_0711;
	}

	public static JTextField getTextField_242() {
		return tf3_0112;
	}

	public static JTextField getTextField_243() {
		return tf3_0212;
	}

	public static JTextField getTextField_244() {
		return tf3_0312;
	}

	public static JTextField getTextField_245() {
		return tf3_0412;
	}

	public static JTextField getTextField_246() {
		return tf3_0512;
	}

	public static JTextField getTextField_247() {
		return tf3_0612;
	}

	public static JTextField getTextField_248() {
		return tf3_0712;
	}

}
