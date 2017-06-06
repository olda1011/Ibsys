package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class SequencePlanningObject {
	private JTable spt_table;
	private int currentRow;

	public int getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public JPanel sequencePlanning() {
		JPanel sequencePlanningPane = new JPanel();
		GridBagLayout gbl_sequencePlanningPane = new GridBagLayout();
		gbl_sequencePlanningPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_sequencePlanningPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_sequencePlanningPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				1.0, 0.0, Double.MIN_VALUE };
		gbl_sequencePlanningPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		sequencePlanningPane.setLayout(gbl_sequencePlanningPane);

		spt_table = new JTable();
		spt_table.setModel(
				new DefaultTableModel(
						new Object[][] { { null, null, null }, { null, null, null }, { null, null, null },
								{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
								{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
								{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
								{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
								{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
								{ null, null, null }, { null, null, null }, },
						new String[] { "Priorität", "Teil", "Menge" }));

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridheight = 23;
		gbc.gridwidth = 12;
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.gridx = 0;
		gbc.gridy = 0;
		sequencePlanningPane.add(new JScrollPane(spt_table), gbc);

		JButton spb_up = new JButton("Up");
		spb_up.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		GridBagConstraints gbc_spb_up = new GridBagConstraints();
		gbc_spb_up.fill = GridBagConstraints.HORIZONTAL;
		gbc_spb_up.insets = new Insets(0, 0, 5, 0);
		gbc_spb_up.gridx = 12;
		gbc_spb_up.gridy = 0;
		sequencePlanningPane.add(spb_up, gbc_spb_up);

		JButton spb_down = new JButton("Down");
		spb_down.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		spt_table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent event) {
				if (spt_table.getSelectedRow() > -1 && event.getValueIsAdjusting() == true) {
					currentRow = spt_table.getSelectedRow();
					System.out.println("selected" + spt_table.getSelectedRow());
				}
			}
		});

		GridBagConstraints gbc_spb_down = new GridBagConstraints();
		gbc_spb_down.fill = GridBagConstraints.HORIZONTAL;
		gbc_spb_down.insets = new Insets(0, 0, 5, 0);
		gbc_spb_down.gridx = 12;
		gbc_spb_down.gridy = 1;
		sequencePlanningPane.add(spb_down, gbc_spb_down);

		JButton spb_split = new JButton("Split");
		GridBagConstraints gbc_spb_split = new GridBagConstraints();
		gbc_spb_split.fill = GridBagConstraints.HORIZONTAL;
		gbc_spb_split.insets = new Insets(0, 0, 5, 0);
		gbc_spb_split.gridx = 12;
		gbc_spb_split.gridy = 2;
		sequencePlanningPane.add(spb_split, gbc_spb_split);

		JSpinner sps_splitnumber = new JSpinner();
		GridBagConstraints gbc_sps_splitnumber = new GridBagConstraints();
		gbc_sps_splitnumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_sps_splitnumber.insets = new Insets(0, 0, 5, 0);
		gbc_sps_splitnumber.gridx = 12;
		gbc_sps_splitnumber.gridy = 3;
		sequencePlanningPane.add(sps_splitnumber, gbc_sps_splitnumber);

		JButton spb_reset = new JButton("Reset");
		GridBagConstraints gbc_spb_reset = new GridBagConstraints();
		gbc_spb_reset.fill = GridBagConstraints.HORIZONTAL;
		gbc_spb_reset.insets = new Insets(0, 0, 5, 0);
		gbc_spb_reset.gridx = 12;
		gbc_spb_reset.gridy = 4;
		sequencePlanningPane.add(spb_reset, gbc_spb_reset);
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridheight = 6;
		gbc_table.gridwidth = 11;
		gbc_table.insets = new Insets(0, 0, 0, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 0;

		return sequencePlanningPane;
	}
}
