package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import application.Main;
import util.Utility;

public class PrognosenObject {
	public static String PLEASE_LOAD_VALUES = "Bitte laden Sie die Werte!";
	private static JTextField p1_n1;
	private static JTextField p1_n;
	private static JTextField p1_n2;
	private static JTextField p1_n3;
	private static JTextField p2_n;
	private static JTextField p2_n1;
	private static JTextField p2_n2;
	private static JTextField p2_n3;
	private static JTextField p3_n;
	private static JTextField p3_n1;
	private static JTextField p3_n2;
	private static JTextField p3_n3;
	private static JLabel pl_periode2;
	private static JLabel pl_periode3;
	private static JButton calculate;

	public static JButton getCalculate() {
		return calculate;
	}

	public static void setCalculate(JButton calculate) {
		PrognosenObject.calculate = calculate;
	}

	private static JLabel lblNewLabel_1;
	private static JButton btnNewButton;
	private static JLabel lblIconbig;

	/**
	 * @wbp.parser.entryPoint
	 */
	public static JPanel prognosenPlanning() {
		JPanel prognosenPane = new JPanel();
		GridBagLayout gbl_prognosenPane = new GridBagLayout();
		gbl_prognosenPane.columnWidths = new int[] { 10, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_prognosenPane.rowHeights = new int[] { 20, 15, 20, 0, 0, 0, 0, 20, 0, 0, 0, 0 };
		gbl_prognosenPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				Double.MIN_VALUE };
		gbl_prognosenPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, Double.MIN_VALUE };
		prognosenPane.setLayout(gbl_prognosenPane);

		lblNewLabel_1 = new JLabel("Bitte Werte eintragen");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 4;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 1;
		prognosenPane.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JLabel pl_soll = new JLabel("N");
		GridBagConstraints gbc_pl_soll = new GridBagConstraints();
		gbc_pl_soll.insets = new Insets(0, 0, 5, 5);
		gbc_pl_soll.gridx = 3;
		gbc_pl_soll.gridy = 3;
		prognosenPane.add(pl_soll, gbc_pl_soll);

		JLabel pl_periode1 = new JLabel("N+1");
		GridBagConstraints gbc_pl_periode1 = new GridBagConstraints();
		gbc_pl_periode1.insets = new Insets(0, 0, 5, 5);
		gbc_pl_periode1.gridx = 4;
		gbc_pl_periode1.gridy = 3;
		prognosenPane.add(pl_periode1, gbc_pl_periode1);

		pl_periode2 = new JLabel("N+2");
		GridBagConstraints gbc_pl_periode2 = new GridBagConstraints();
		gbc_pl_periode2.insets = new Insets(0, 0, 5, 5);
		gbc_pl_periode2.gridx = 5;
		gbc_pl_periode2.gridy = 3;
		prognosenPane.add(pl_periode2, gbc_pl_periode2);

		pl_periode3 = new JLabel("N+3");
		GridBagConstraints gbc_pl_periode3 = new GridBagConstraints();
		gbc_pl_periode3.insets = new Insets(0, 0, 5, 5);
		gbc_pl_periode3.gridx = 6;
		gbc_pl_periode3.gridy = 3;
		prognosenPane.add(pl_periode3, gbc_pl_periode3);

		JLabel lblNewLabel = new JLabel("P1");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 4;
		prognosenPane.add(lblNewLabel, gbc_lblNewLabel);

		p1_n = new JTextField();
		p1_n.setColumns(10);
		GridBagConstraints gbc_p1_n = new GridBagConstraints();
		gbc_p1_n.insets = new Insets(0, 0, 5, 5);
		gbc_p1_n.fill = GridBagConstraints.HORIZONTAL;
		gbc_p1_n.gridx = 3;
		gbc_p1_n.gridy = 4;
		prognosenPane.add(p1_n, gbc_p1_n);

		p1_n1 = new JTextField();
		p1_n1.setColumns(10);
		GridBagConstraints gbc_p1_n1 = new GridBagConstraints();
		gbc_p1_n1.insets = new Insets(0, 0, 5, 5);
		gbc_p1_n1.fill = GridBagConstraints.HORIZONTAL;
		gbc_p1_n1.gridx = 4;
		gbc_p1_n1.gridy = 4;
		prognosenPane.add(p1_n1, gbc_p1_n1);

		p1_n2 = new JTextField();
		p1_n2.setColumns(10);
		GridBagConstraints gbc_p1_n2 = new GridBagConstraints();
		gbc_p1_n2.insets = new Insets(0, 0, 5, 5);
		gbc_p1_n2.fill = GridBagConstraints.HORIZONTAL;
		gbc_p1_n2.gridx = 5;
		gbc_p1_n2.gridy = 4;
		prognosenPane.add(p1_n2, gbc_p1_n2);

		p1_n3 = new JTextField();
		p1_n3.setColumns(10);
		GridBagConstraints gbc_p1_n3 = new GridBagConstraints();
		gbc_p1_n3.insets = new Insets(0, 0, 5, 5);
		gbc_p1_n3.fill = GridBagConstraints.HORIZONTAL;
		gbc_p1_n3.gridx = 6;
		gbc_p1_n3.gridy = 4;
		prognosenPane.add(p1_n3, gbc_p1_n3);

		JLabel lblP = new JLabel("P2");
		GridBagConstraints gbc_lblP = new GridBagConstraints();
		gbc_lblP.anchor = GridBagConstraints.EAST;
		gbc_lblP.insets = new Insets(0, 0, 5, 5);
		gbc_lblP.gridx = 1;
		gbc_lblP.gridy = 5;
		prognosenPane.add(lblP, gbc_lblP);

		p2_n = new JTextField();
		p2_n.setColumns(10);
		GridBagConstraints gbc_p2_n = new GridBagConstraints();
		gbc_p2_n.insets = new Insets(0, 0, 5, 5);
		gbc_p2_n.fill = GridBagConstraints.HORIZONTAL;
		gbc_p2_n.gridx = 3;
		gbc_p2_n.gridy = 5;
		prognosenPane.add(p2_n, gbc_p2_n);

		p2_n1 = new JTextField();
		p2_n1.setColumns(10);
		GridBagConstraints gbc_p2_n1 = new GridBagConstraints();
		gbc_p2_n1.insets = new Insets(0, 0, 5, 5);
		gbc_p2_n1.fill = GridBagConstraints.HORIZONTAL;
		gbc_p2_n1.gridx = 4;
		gbc_p2_n1.gridy = 5;
		prognosenPane.add(p2_n1, gbc_p2_n1);

		p2_n2 = new JTextField();
		p2_n2.setColumns(10);
		GridBagConstraints gbc_p2_n2 = new GridBagConstraints();
		gbc_p2_n2.insets = new Insets(0, 0, 5, 5);
		gbc_p2_n2.fill = GridBagConstraints.HORIZONTAL;
		gbc_p2_n2.gridx = 5;
		gbc_p2_n2.gridy = 5;
		prognosenPane.add(p2_n2, gbc_p2_n2);

		p2_n3 = new JTextField();
		p2_n3.setColumns(10);
		GridBagConstraints gbc_p2_n3 = new GridBagConstraints();
		gbc_p2_n3.insets = new Insets(0, 0, 5, 5);
		gbc_p2_n3.fill = GridBagConstraints.HORIZONTAL;
		gbc_p2_n3.gridx = 6;
		gbc_p2_n3.gridy = 5;
		prognosenPane.add(p2_n3, gbc_p2_n3);

		JLabel lblP_1 = new JLabel("P3");
		GridBagConstraints gbc_lblP_1 = new GridBagConstraints();
		gbc_lblP_1.anchor = GridBagConstraints.EAST;
		gbc_lblP_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblP_1.gridx = 1;
		gbc_lblP_1.gridy = 6;
		prognosenPane.add(lblP_1, gbc_lblP_1);

		p3_n = new JTextField();
		p3_n.setColumns(10);
		GridBagConstraints gbc_p3_n = new GridBagConstraints();
		gbc_p3_n.insets = new Insets(0, 0, 5, 5);
		gbc_p3_n.fill = GridBagConstraints.HORIZONTAL;
		gbc_p3_n.gridx = 3;
		gbc_p3_n.gridy = 6;
		prognosenPane.add(p3_n, gbc_p3_n);

		p3_n1 = new JTextField();
		p3_n1.setColumns(10);
		GridBagConstraints gbc_p3_n1 = new GridBagConstraints();
		gbc_p3_n1.insets = new Insets(0, 0, 5, 5);
		gbc_p3_n1.fill = GridBagConstraints.HORIZONTAL;
		gbc_p3_n1.gridx = 4;
		gbc_p3_n1.gridy = 6;
		prognosenPane.add(p3_n1, gbc_p3_n1);

		p3_n2 = new JTextField();
		p3_n2.setColumns(10);
		GridBagConstraints gbc_p3_n2 = new GridBagConstraints();
		gbc_p3_n2.insets = new Insets(0, 0, 5, 5);
		gbc_p3_n2.fill = GridBagConstraints.HORIZONTAL;
		gbc_p3_n2.gridx = 5;
		gbc_p3_n2.gridy = 6;
		prognosenPane.add(p3_n2, gbc_p3_n2);

		p3_n3 = new JTextField();
		p3_n3.setColumns(10);
		GridBagConstraints gbc_p3_n3 = new GridBagConstraints();
		gbc_p3_n3.insets = new Insets(0, 0, 5, 5);
		gbc_p3_n3.fill = GridBagConstraints.HORIZONTAL;
		gbc_p3_n3.gridx = 6;
		gbc_p3_n3.gridy = 6;
		prognosenPane.add(p3_n3, gbc_p3_n3);

		calculate = new JButton("Berechnen");
		calculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					Main.prognosen[0][1] = Integer.parseInt(p1_n.getText());
					Main.prognosen[1][1] = Integer.parseInt(p2_n.getText());
					Main.prognosen[2][1] = Integer.parseInt(p3_n.getText());
					Main.prognosen[0][2] = Integer.parseInt(p1_n1.getText());
					Main.prognosen[1][2] = Integer.parseInt(p2_n1.getText());
					Main.prognosen[2][2] = Integer.parseInt(p3_n1.getText());
					Main.prognosen[0][3] = Integer.parseInt(p1_n2.getText());
					Main.prognosen[1][3] = Integer.parseInt(p2_n2.getText());
					Main.prognosen[2][3] = Integer.parseInt(p3_n2.getText());
					Main.prognosen[0][4] = Integer.parseInt(p1_n3.getText());
					Main.prognosen[1][4] = Integer.parseInt(p2_n3.getText());
					Main.prognosen[2][4] = Integer.parseInt(p3_n3.getText());
					Utility.calculateAfterChangeWithMatrix();
				} catch (NullPointerException | NoSuchMethodException | SecurityException
						| IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					JOptionPane.showMessageDialog(new JFrame(), PLEASE_LOAD_VALUES, "Error",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		btnNewButton = new JButton("Default");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				p1_n.setText("" + 100);
				p2_n.setText("" + 150);
				p3_n.setText("" + 200);
				p1_n1.setText("" + 150);
				p2_n1.setText("" + 200);
				p3_n1.setText("" + 250);
				p1_n2.setText("" + 100);
				p2_n2.setText("" + 200);
				p3_n2.setText("" + 150);
				p1_n3.setText("" + 200);
				p2_n3.setText("" + 150);
				p3_n3.setText("" + 200);
				Main.prognosen[0][1] = 100;
				Main.prognosen[1][1] = 150;
				Main.prognosen[2][1] = 200;
				Main.prognosen[0][2] = 150;
				Main.prognosen[1][2] = 200;
				Main.prognosen[2][2] = 250;
				Main.prognosen[0][3] = 100;
				Main.prognosen[1][3] = 200;
				Main.prognosen[2][3] = 150;
				Main.prognosen[0][4] = 200;
				Main.prognosen[1][4] = 150;
				Main.prognosen[2][4] = 200;

			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 8;
		prognosenPane.add(btnNewButton, gbc_btnNewButton);
		GridBagConstraints gbc_calculate = new GridBagConstraints();
		gbc_calculate.fill = GridBagConstraints.HORIZONTAL;
		gbc_calculate.insets = new Insets(0, 0, 5, 5);
		gbc_calculate.gridx = 6;
		gbc_calculate.gridy = 8;
		prognosenPane.add(calculate, gbc_calculate);

		ImageIcon imageIcon = new ImageIcon(Main.class.getResource("Logo_bearbeitet.png"));
		lblIconbig = new JLabel(imageIcon);
		GridBagConstraints gbc_lblIconbig = new GridBagConstraints();
		gbc_lblIconbig.gridwidth = 5;
		gbc_lblIconbig.insets = new Insets(0, 0, 0, 5);
		gbc_lblIconbig.gridx = 2;
		gbc_lblIconbig.gridy = 10;
		prognosenPane.add(lblIconbig, gbc_lblIconbig);

		p1_n.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.prognosen[0][1] = Integer.parseInt(p1_n.getText());

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		p2_n.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.prognosen[1][1] = Integer.parseInt(p2_n.getText());

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		p3_n.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.prognosen[2][1] = Integer.parseInt(p3_n.getText());

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		p1_n1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.prognosen[0][2] = Integer.parseInt(p1_n1.getText());

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		p2_n1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.prognosen[1][2] = Integer.parseInt(p1_n1.getText());

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		p3_n1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.prognosen[2][2] = Integer.parseInt(p1_n1.getText());

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		p1_n2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.prognosen[0][3] = Integer.parseInt(p1_n1.getText());

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		p2_n2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.prognosen[1][3] = Integer.parseInt(p1_n1.getText());

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		p3_n2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.prognosen[2][3] = Integer.parseInt(p1_n1.getText());

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		p1_n3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.prognosen[0][4] = Integer.parseInt(p1_n1.getText());

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		p2_n3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.prognosen[1][4] = Integer.parseInt(p1_n1.getText());

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		p3_n3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.prognosen[2][4] = Integer.parseInt(p1_n1.getText());

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(new JFrame(),
							"Please choose only valid numbers! (0-9)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		return prognosenPane;
	}

	public static JTextField getP1_n1() {
		return p1_n1;
	}

	public static void setP1_n1(JTextField p1_n1) {
		PrognosenObject.p1_n1 = p1_n1;
	}

	public static JTextField getP1_n() {
		return p1_n;
	}

	public static void setP1_n(JTextField p1_n) {
		PrognosenObject.p1_n = p1_n;
	}

	public static JTextField getP1_n2() {
		return p1_n2;
	}

	public static void setP1_n2(JTextField p1_n2) {
		PrognosenObject.p1_n2 = p1_n2;
	}

	public static JTextField getP1_n3() {
		return p1_n3;
	}

	public static void setP1_n3(JTextField p1_n3) {
		PrognosenObject.p1_n3 = p1_n3;
	}

	public static JTextField getP2_n() {
		return p2_n;
	}

	public static void setP2_n(JTextField p2_n) {
		PrognosenObject.p2_n = p2_n;
	}

	public static JTextField getP2_n1() {
		return p2_n1;
	}

	public static void setP2_n1(JTextField p2_n1) {
		PrognosenObject.p2_n1 = p2_n1;
	}

	public static JTextField getP2_n2() {
		return p2_n2;
	}

	public static void setP2_n2(JTextField p2_n2) {
		PrognosenObject.p2_n2 = p2_n2;
	}

	public static JTextField getP2_n3() {
		return p2_n3;
	}

	public static void setP2_n3(JTextField p2_n3) {
		PrognosenObject.p2_n3 = p2_n3;
	}

	public static JTextField getP3_n() {
		return p3_n;
	}

	public static void setP3_n(JTextField p3_n) {
		PrognosenObject.p3_n = p3_n;
	}

	public static JTextField getP3_n1() {
		return p3_n1;
	}

	public static void setP3_n1(JTextField p3_n1) {
		PrognosenObject.p3_n1 = p3_n1;
	}

	public static JTextField getP3_n2() {
		return p3_n2;
	}

	public static void setP3_n2(JTextField p3_n2) {
		PrognosenObject.p3_n2 = p3_n2;
	}

	public static JTextField getP3_n3() {
		return p3_n3;
	}

	public static void setP3_n3(JTextField p3_n3) {
		PrognosenObject.p3_n3 = p3_n3;
	}

	public static JLabel getPl_periode2() {
		return pl_periode2;
	}

	public static void setPl_periode2(JLabel pl_periode2) {
		PrognosenObject.pl_periode2 = pl_periode2;
	}

	public static JLabel getPl_periode3() {
		return pl_periode3;
	}

	public static void setPl_periode3(JLabel pl_periode3) {
		PrognosenObject.pl_periode3 = pl_periode3;
	}

	public static JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public static void setLblNewLabel_1(JLabel lblNewLabel_1) {
		PrognosenObject.lblNewLabel_1 = lblNewLabel_1;
	}

	public static JButton getBtnNewButton() {
		return btnNewButton;
	}

	public static void setBtnNewButton(JButton btnNewButton) {
		PrognosenObject.btnNewButton = btnNewButton;
	}

}
