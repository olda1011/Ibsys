package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import util.Utility;

public class SequencePlanningObject {
	public static JTable spt_table;
	private int currentRow;
	private static JSpinner sps_splitnumber;
	private static DefaultTableModel model;

	public static JButton getSpb_up() {
		return spb_up;
	}

	public static void setSpb_up(JButton spb_up) {
		SequencePlanningObject.spb_up = spb_up;
	}

	public static JButton getSpb_down() {
		return spb_down;
	}

	public static void setSpb_down(JButton spb_down) {
		SequencePlanningObject.spb_down = spb_down;
	}

	public static JButton getSpb_split() {
		return spb_split;
	}

	public static void setSpb_split(JButton spb_split) {
		SequencePlanningObject.spb_split = spb_split;
	}

	private static JButton spb_up;
	private static JButton spb_down;
	private static JButton spb_split;

	public int getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}

	public JTable getSpt_table() {
		return spt_table;
	}

	public void setSpt_table(JTable spt_table) {
		this.spt_table = spt_table;
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
		model = new DefaultTableModel(new String[] { "Priorität", "Teil", "Menge" }, 0);
		for (int i = 0; i < 30; i++) {
			model.addRow(new Object[] { i + 1, null, null });
		}
		spt_table.setModel(model);

		spt_table.setDefaultRenderer(Object.class, new CellRendererSequence());

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridheight = 25;
		gbc.gridwidth = 12;
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.gridx = 0;
		gbc.gridy = 0;
		sequencePlanningPane.add(new JScrollPane(spt_table), gbc);

		spb_up = new JButton("Up");
		spb_up.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				up();
			}
		});
		GridBagConstraints gbc_spb_up = new GridBagConstraints();
		gbc_spb_up.fill = GridBagConstraints.HORIZONTAL;
		gbc_spb_up.insets = new Insets(0, 0, 5, 0);
		gbc_spb_up.gridx = 12;
		gbc_spb_up.gridy = 0;
		sequencePlanningPane.add(spb_up, gbc_spb_up);

		spb_down = new JButton("Down");
		spb_down.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				down();
			}
		});

		spt_table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent event) {
				if (spt_table.getSelectedRow() > -1 && event.getValueIsAdjusting() == true) {
					currentRow = spt_table.getSelectedRow();
					int splitvalue = (Integer) spt_table.getValueAt(currentRow, 2) / 2;
					sps_splitnumber.setValue(splitvalue);
				}
			}
		});

		GridBagConstraints gbc_spb_down = new GridBagConstraints();
		gbc_spb_down.fill = GridBagConstraints.HORIZONTAL;
		gbc_spb_down.insets = new Insets(0, 0, 5, 0);
		gbc_spb_down.gridx = 12;
		gbc_spb_down.gridy = 1;
		sequencePlanningPane.add(spb_down, gbc_spb_down);

		spb_split = new JButton("Split");
		spb_split.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int partid = (Integer) spt_table.getValueAt(spt_table.getSelectedRow(), 1);
				int valueNew = (Integer) sps_splitnumber.getValue();
				int valueOld = (Integer) spt_table.getValueAt(spt_table.getSelectedRow(), 2)
						- (Integer) sps_splitnumber.getValue();
				if ((Integer) sps_splitnumber.getValue() == 0) {
					JOptionPane.showMessageDialog(new JFrame(), "Can´t split less then 1 unit.", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					spt_table.setValueAt(valueOld, spt_table.getSelectedRow(), 2);
					model.addRow(new Object[] { spt_table.getRowCount() + 1, partid, valueNew });
					sps_splitnumber.setValue(valueOld / 2);
				}
				try {
					Utility.raiseSetupTime(partid);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		GridBagConstraints gbc_spb_split = new GridBagConstraints();
		gbc_spb_split.fill = GridBagConstraints.HORIZONTAL;
		gbc_spb_split.insets = new Insets(0, 0, 5, 0);
		gbc_spb_split.gridx = 12;
		gbc_spb_split.gridy = 2;
		sequencePlanningPane.add(spb_split, gbc_spb_split);

		sps_splitnumber = new JSpinner();
		GridBagConstraints gbc_sps_splitnumber = new GridBagConstraints();
		gbc_sps_splitnumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_sps_splitnumber.insets = new Insets(0, 0, 5, 0);
		gbc_sps_splitnumber.gridx = 12;
		gbc_sps_splitnumber.gridy = 3;
		sequencePlanningPane.add(sps_splitnumber, gbc_sps_splitnumber);

		JButton spb_reset = new JButton("Reset");
		spb_reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setModel();
				try {
					Utility.calculateAfterChange();
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					e.printStackTrace();
				}
				spt_table.setRowSelectionInterval(0, 0);
				int splitvalue = (Integer) spt_table.getValueAt(currentRow, 2) / 2;
				sps_splitnumber.setValue(splitvalue);
			}
		});
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

	private void up() {
		int row = spt_table.getSelectedRow();
		if (row > 0 && spt_table.getValueAt(row, 1) != null && spt_table.getValueAt(row, 2) != null) {
			int partup = (Integer) spt_table.getValueAt(row - 1, 1);
			int amountup = (Integer) spt_table.getValueAt(row - 1, 2);
			int part = (Integer) spt_table.getValueAt(row, 1);
			int amount = (Integer) spt_table.getValueAt(row, 2);

			spt_table.setValueAt(partup, row, 1);
			spt_table.setValueAt(part, row - 1, 1);
			spt_table.setValueAt(amountup, row, 2);
			spt_table.setValueAt(amount, row - 1, 2);

			spt_table.setRowSelectionInterval(row - 1, row - 1);
		}

	}

	private void down() {
		int row = spt_table.getSelectedRow();
		if (row < spt_table.getRowCount() - 1 && spt_table.getValueAt(row, 1) != null
				&& spt_table.getValueAt(row, 2) != null) {
			int partdown = (Integer) spt_table.getValueAt(row + 1, 1);
			int amountdown = (Integer) spt_table.getValueAt(row + 1, 2);
			int part = (Integer) spt_table.getValueAt(row, 1);
			int amount = (Integer) spt_table.getValueAt(row, 2);

			spt_table.setValueAt(partdown, row, 1);
			spt_table.setValueAt(part, row + 1, 1);
			spt_table.setValueAt(amountdown, row, 2);
			spt_table.setValueAt(amount, row + 1, 2);

			spt_table.setRowSelectionInterval(row + 1, row + 1);
		}

	}

	private void setModel() {
		model = new DefaultTableModel(new String[] { "Priorität", "Teil", "Menge" }, 0);
		for (int i = 0; i < 30; i++) {
			model.addRow(new Object[] { i + 1, null, null });
		}
		spt_table.setModel(model);
	}
}
