package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class CellRenderer extends JLabel implements TableCellRenderer {

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		Font headerFont = new Font("header", Font.BOLD, 12);
		table.getTableHeader().setBackground(new Color(224, 224, 224));
		table.getTableHeader().setFont(headerFont);
		table.getTableHeader().setForeground(Color.BLACK);
		setOpaque(true);
		setBackground(row % 2 == 0 ? Color.WHITE : new Color(204, 229, 255));
		if (column == 0) {
			setBackground(new Color(224, 224, 224));
			setBackground(row % 2 == 0 ? new Color(224, 224, 224) : new Color(192, 192, 192));
			setForeground(Color.BLACK);
			setHorizontalAlignment(CENTER);
			setFont(headerFont);

		}

		if (column == 1) {
			setBackground(row % 2 == 0 ? Color.WHITE : new Color(255, 255, 204));

		}

		if (column > 1 && column < 7) {
			setBackground(row % 2 == 0 ? Color.WHITE : new Color(171, 255, 216));

		}

		if (column > 6 && column < 11) {
			setBackground(row % 2 == 0 ? Color.WHITE : new Color(255, 171, 171));

		}

		setForeground(Color.BLACK);
		setText((value != null) ? value.toString() : "");
		if (isSelected) {
			setBorder(BorderFactory.createLineBorder(Color.BLACK));
		} else {
			setBorder(BorderFactory.createLineBorder(table.getBackground()));
		}
		return this;
	}
}
