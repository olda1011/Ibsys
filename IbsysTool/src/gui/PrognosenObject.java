package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PrognosenObject {
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField;
	private static JTextField textField_5;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_8;
	private static JTextField textField_9;
	private static JTextField textField_10;
	private static JTextField textField_11;
	private static JLabel pl_periode2;
	private static JLabel pl_periode3;

	/**
	 * @wbp.parser.entryPoint
	 */
	public static JPanel prognosenPlanning() {
		JPanel prognosenPane = new JPanel();
		GridBagLayout gbl_prognosenPane = new GridBagLayout();
		gbl_prognosenPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_prognosenPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_prognosenPane.columnWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_prognosenPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		prognosenPane.setLayout(gbl_prognosenPane);

		JLabel pl_soll = new JLabel("Soll");
		GridBagConstraints gbc_pl_soll = new GridBagConstraints();
		gbc_pl_soll.insets = new Insets(0, 0, 5, 5);
		gbc_pl_soll.gridx = 2;
		gbc_pl_soll.gridy = 2;
		prognosenPane.add(pl_soll, gbc_pl_soll);

		JLabel pl_periode1 = new JLabel("Periode 1");
		GridBagConstraints gbc_pl_periode1 = new GridBagConstraints();
		gbc_pl_periode1.insets = new Insets(0, 0, 5, 5);
		gbc_pl_periode1.gridx = 3;
		gbc_pl_periode1.gridy = 2;
		prognosenPane.add(pl_periode1, gbc_pl_periode1);

		pl_periode2 = new JLabel("Periode 2");
		GridBagConstraints gbc_pl_periode2 = new GridBagConstraints();
		gbc_pl_periode2.insets = new Insets(0, 0, 5, 5);
		gbc_pl_periode2.gridx = 4;
		gbc_pl_periode2.gridy = 2;
		prognosenPane.add(pl_periode2, gbc_pl_periode2);

		pl_periode3 = new JLabel("Periode 3");
		GridBagConstraints gbc_pl_periode3 = new GridBagConstraints();
		gbc_pl_periode3.insets = new Insets(0, 0, 5, 5);
		gbc_pl_periode3.gridx = 5;
		gbc_pl_periode3.gridy = 2;
		prognosenPane.add(pl_periode3, gbc_pl_periode3);

		JLabel lblNewLabel = new JLabel("P1");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		prognosenPane.add(lblNewLabel, gbc_lblNewLabel);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		prognosenPane.add(textField_2, gbc_textField_2);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 3;
		prognosenPane.add(textField_1, gbc_textField_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 4;
		gbc_textField_3.gridy = 3;
		prognosenPane.add(textField_3, gbc_textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 5;
		gbc_textField_4.gridy = 3;
		prognosenPane.add(textField_4, gbc_textField_4);

		JLabel lblP = new JLabel("P2");
		GridBagConstraints gbc_lblP = new GridBagConstraints();
		gbc_lblP.anchor = GridBagConstraints.EAST;
		gbc_lblP.insets = new Insets(0, 0, 5, 5);
		gbc_lblP.gridx = 1;
		gbc_lblP.gridy = 4;
		prognosenPane.add(lblP, gbc_lblP);

		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 4;
		prognosenPane.add(textField, gbc_textField);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 3;
		gbc_textField_5.gridy = 4;
		prognosenPane.add(textField_5, gbc_textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 4;
		gbc_textField_6.gridy = 4;
		prognosenPane.add(textField_6, gbc_textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 5;
		gbc_textField_7.gridy = 4;
		prognosenPane.add(textField_7, gbc_textField_7);

		JLabel lblP_1 = new JLabel("P3");
		GridBagConstraints gbc_lblP_1 = new GridBagConstraints();
		gbc_lblP_1.anchor = GridBagConstraints.EAST;
		gbc_lblP_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblP_1.gridx = 1;
		gbc_lblP_1.gridy = 5;
		prognosenPane.add(lblP_1, gbc_lblP_1);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 0, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 2;
		gbc_textField_8.gridy = 5;
		prognosenPane.add(textField_8, gbc_textField_8);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 0, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 3;
		gbc_textField_9.gridy = 5;
		prognosenPane.add(textField_9, gbc_textField_9);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 0, 5);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 4;
		gbc_textField_10.gridy = 5;
		prognosenPane.add(textField_10, gbc_textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 0, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 5;
		gbc_textField_11.gridy = 5;
		prognosenPane.add(textField_11, gbc_textField_11);
		return prognosenPane;
	}

}
