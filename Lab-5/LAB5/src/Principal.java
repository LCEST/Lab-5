import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;

public class Principal {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1201, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Tanques", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(22, 38, 104, 303);
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 1;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 0;
		gbc_textField_2.gridy = 2;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 0;
		gbc_textField_3.gridy = 3;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 0;
		gbc_textField_4.gridy = 4;
		panel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 0;
		gbc_textField_5.gridy = 5;
		panel.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 0;
		gbc_textField_6.gridy = 6;
		panel.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 0);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 0;
		gbc_textField_7.gridy = 7;
		panel.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 0);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 0;
		gbc_textField_8.gridy = 8;
		panel.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 0);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 0;
		gbc_textField_9.gridy = 9;
		panel.add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton = new JButton("INGRESAR ");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 10;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Tanque 1", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(125, 38, 104, 334);
		frame.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton btnNewButton_9 = new JButton("Valvula 1");
		GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
		gbc_btnNewButton_9.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_9.gridx = 0;
		gbc_btnNewButton_9.gridy = 1;
		panel_1.add(btnNewButton_9, gbc_btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("Valvula 2");
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_8.gridx = 0;
		gbc_btnNewButton_8.gridy = 2;
		panel_1.add(btnNewButton_8, gbc_btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("Valvula 3");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_7.gridx = 0;
		gbc_btnNewButton_7.gridy = 3;
		panel_1.add(btnNewButton_7, gbc_btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("Valvula 4");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_6.gridx = 0;
		gbc_btnNewButton_6.gridy = 4;
		panel_1.add(btnNewButton_6, gbc_btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("Valvula 5");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_5.gridx = 0;
		gbc_btnNewButton_5.gridy = 5;
		panel_1.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_3 = new JButton("Valvula 6");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 6;
		panel_1.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Valvula 7");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 7;
		panel_1.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Valvula 8");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 8;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("Valvula 9");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 9;
		panel_1.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnValvula = new JButton("Valvula 10");
		GridBagConstraints gbc_btnValvula = new GridBagConstraints();
		gbc_btnValvula.insets = new Insets(0, 0, 5, 0);
		gbc_btnValvula.gridx = 0;
		gbc_btnValvula.gridy = 10;
		panel_1.add(btnValvula, gbc_btnValvula);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Tanque 2", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(228, 38, 104, 334);
		frame.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton button = new JButton("Valvula 1");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.gridx = 0;
		gbc_button.gridy = 1;
		panel_2.add(button, gbc_button);
		
		JButton button_1 = new JButton("Valvula 2");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 0);
		gbc_button_1.gridx = 0;
		gbc_button_1.gridy = 2;
		panel_2.add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton("Valvula 3");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 0);
		gbc_button_2.gridx = 0;
		gbc_button_2.gridy = 3;
		panel_2.add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton("Valvula 4");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 0);
		gbc_button_3.gridx = 0;
		gbc_button_3.gridy = 4;
		panel_2.add(button_3, gbc_button_3);
		
		JButton button_4 = new JButton("Valvula 5");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 5, 0);
		gbc_button_4.gridx = 0;
		gbc_button_4.gridy = 5;
		panel_2.add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("Valvula 6");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 5, 0);
		gbc_button_5.gridx = 0;
		gbc_button_5.gridy = 6;
		panel_2.add(button_5, gbc_button_5);
		
		JButton button_6 = new JButton("Valvula 7");
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 5, 0);
		gbc_button_6.gridx = 0;
		gbc_button_6.gridy = 7;
		panel_2.add(button_6, gbc_button_6);
		
		JButton button_7 = new JButton("Valvula 8");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.insets = new Insets(0, 0, 5, 0);
		gbc_button_7.gridx = 0;
		gbc_button_7.gridy = 8;
		panel_2.add(button_7, gbc_button_7);
		
		JButton button_8 = new JButton("Valvula 9");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.insets = new Insets(0, 0, 5, 0);
		gbc_button_8.gridx = 0;
		gbc_button_8.gridy = 9;
		panel_2.add(button_8, gbc_button_8);
		
		JButton button_9 = new JButton("Valvula 10");
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.insets = new Insets(0, 0, 5, 0);
		gbc_button_9.gridx = 0;
		gbc_button_9.gridy = 10;
		panel_2.add(button_9, gbc_button_9);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Tanque 3", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(331, 38, 104, 334);
		frame.getContentPane().add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JButton button_10 = new JButton("Valvula 1");
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.insets = new Insets(0, 0, 5, 0);
		gbc_button_10.gridx = 0;
		gbc_button_10.gridy = 1;
		panel_3.add(button_10, gbc_button_10);
		
		JButton button_11 = new JButton("Valvula 2");
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.insets = new Insets(0, 0, 5, 0);
		gbc_button_11.gridx = 0;
		gbc_button_11.gridy = 2;
		panel_3.add(button_11, gbc_button_11);
		
		JButton button_12 = new JButton("Valvula 3");
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.insets = new Insets(0, 0, 5, 0);
		gbc_button_12.gridx = 0;
		gbc_button_12.gridy = 3;
		panel_3.add(button_12, gbc_button_12);
		
		JButton button_13 = new JButton("Valvula 4");
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.insets = new Insets(0, 0, 5, 0);
		gbc_button_13.gridx = 0;
		gbc_button_13.gridy = 4;
		panel_3.add(button_13, gbc_button_13);
		
		JButton button_14 = new JButton("Valvula 5");
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.insets = new Insets(0, 0, 5, 0);
		gbc_button_14.gridx = 0;
		gbc_button_14.gridy = 5;
		panel_3.add(button_14, gbc_button_14);
		
		JButton button_15 = new JButton("Valvula 6");
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.insets = new Insets(0, 0, 5, 0);
		gbc_button_15.gridx = 0;
		gbc_button_15.gridy = 6;
		panel_3.add(button_15, gbc_button_15);
		
		JButton button_16 = new JButton("Valvula 7");
		GridBagConstraints gbc_button_16 = new GridBagConstraints();
		gbc_button_16.insets = new Insets(0, 0, 5, 0);
		gbc_button_16.gridx = 0;
		gbc_button_16.gridy = 7;
		panel_3.add(button_16, gbc_button_16);
		
		JButton button_17 = new JButton("Valvula 8");
		GridBagConstraints gbc_button_17 = new GridBagConstraints();
		gbc_button_17.insets = new Insets(0, 0, 5, 0);
		gbc_button_17.gridx = 0;
		gbc_button_17.gridy = 8;
		panel_3.add(button_17, gbc_button_17);
		
		JButton button_18 = new JButton("Valvula 9");
		GridBagConstraints gbc_button_18 = new GridBagConstraints();
		gbc_button_18.insets = new Insets(0, 0, 5, 0);
		gbc_button_18.gridx = 0;
		gbc_button_18.gridy = 9;
		panel_3.add(button_18, gbc_button_18);
		
		JButton button_19 = new JButton("Valvula 10");
		GridBagConstraints gbc_button_19 = new GridBagConstraints();
		gbc_button_19.insets = new Insets(0, 0, 5, 0);
		gbc_button_19.gridx = 0;
		gbc_button_19.gridy = 10;
		panel_3.add(button_19, gbc_button_19);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Tanque 4", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(434, 38, 104, 334);
		frame.getContentPane().add(panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JButton button_20 = new JButton("Valvula 1");
		GridBagConstraints gbc_button_20 = new GridBagConstraints();
		gbc_button_20.insets = new Insets(0, 0, 5, 0);
		gbc_button_20.gridx = 0;
		gbc_button_20.gridy = 1;
		panel_4.add(button_20, gbc_button_20);
		
		JButton button_21 = new JButton("Valvula 2");
		GridBagConstraints gbc_button_21 = new GridBagConstraints();
		gbc_button_21.insets = new Insets(0, 0, 5, 0);
		gbc_button_21.gridx = 0;
		gbc_button_21.gridy = 2;
		panel_4.add(button_21, gbc_button_21);
		
		JButton button_22 = new JButton("Valvula 3");
		GridBagConstraints gbc_button_22 = new GridBagConstraints();
		gbc_button_22.insets = new Insets(0, 0, 5, 0);
		gbc_button_22.gridx = 0;
		gbc_button_22.gridy = 3;
		panel_4.add(button_22, gbc_button_22);
		
		JButton button_23 = new JButton("Valvula 4");
		GridBagConstraints gbc_button_23 = new GridBagConstraints();
		gbc_button_23.insets = new Insets(0, 0, 5, 0);
		gbc_button_23.gridx = 0;
		gbc_button_23.gridy = 4;
		panel_4.add(button_23, gbc_button_23);
		
		JButton button_24 = new JButton("Valvula 5");
		GridBagConstraints gbc_button_24 = new GridBagConstraints();
		gbc_button_24.insets = new Insets(0, 0, 5, 0);
		gbc_button_24.gridx = 0;
		gbc_button_24.gridy = 5;
		panel_4.add(button_24, gbc_button_24);
		
		JButton button_25 = new JButton("Valvula 6");
		GridBagConstraints gbc_button_25 = new GridBagConstraints();
		gbc_button_25.insets = new Insets(0, 0, 5, 0);
		gbc_button_25.gridx = 0;
		gbc_button_25.gridy = 6;
		panel_4.add(button_25, gbc_button_25);
		
		JButton button_26 = new JButton("Valvula 7");
		GridBagConstraints gbc_button_26 = new GridBagConstraints();
		gbc_button_26.insets = new Insets(0, 0, 5, 0);
		gbc_button_26.gridx = 0;
		gbc_button_26.gridy = 7;
		panel_4.add(button_26, gbc_button_26);
		
		JButton button_27 = new JButton("Valvula 8");
		GridBagConstraints gbc_button_27 = new GridBagConstraints();
		gbc_button_27.insets = new Insets(0, 0, 5, 0);
		gbc_button_27.gridx = 0;
		gbc_button_27.gridy = 8;
		panel_4.add(button_27, gbc_button_27);
		
		JButton button_28 = new JButton("Valvula 9");
		GridBagConstraints gbc_button_28 = new GridBagConstraints();
		gbc_button_28.insets = new Insets(0, 0, 5, 0);
		gbc_button_28.gridx = 0;
		gbc_button_28.gridy = 9;
		panel_4.add(button_28, gbc_button_28);
		
		JButton button_29 = new JButton("Valvula 10");
		GridBagConstraints gbc_button_29 = new GridBagConstraints();
		gbc_button_29.insets = new Insets(0, 0, 5, 0);
		gbc_button_29.gridx = 0;
		gbc_button_29.gridy = 10;
		panel_4.add(button_29, gbc_button_29);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Tanque 5", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(537, 38, 104, 334);
		frame.getContentPane().add(panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_5.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JButton button_30 = new JButton("Valvula 1");
		GridBagConstraints gbc_button_30 = new GridBagConstraints();
		gbc_button_30.insets = new Insets(0, 0, 5, 0);
		gbc_button_30.gridx = 0;
		gbc_button_30.gridy = 1;
		panel_5.add(button_30, gbc_button_30);
		
		JButton button_31 = new JButton("Valvula 2");
		GridBagConstraints gbc_button_31 = new GridBagConstraints();
		gbc_button_31.insets = new Insets(0, 0, 5, 0);
		gbc_button_31.gridx = 0;
		gbc_button_31.gridy = 2;
		panel_5.add(button_31, gbc_button_31);
		
		JButton button_32 = new JButton("Valvula 3");
		GridBagConstraints gbc_button_32 = new GridBagConstraints();
		gbc_button_32.insets = new Insets(0, 0, 5, 0);
		gbc_button_32.gridx = 0;
		gbc_button_32.gridy = 3;
		panel_5.add(button_32, gbc_button_32);
		
		JButton button_33 = new JButton("Valvula 4");
		GridBagConstraints gbc_button_33 = new GridBagConstraints();
		gbc_button_33.insets = new Insets(0, 0, 5, 0);
		gbc_button_33.gridx = 0;
		gbc_button_33.gridy = 4;
		panel_5.add(button_33, gbc_button_33);
		
		JButton button_34 = new JButton("Valvula 5");
		GridBagConstraints gbc_button_34 = new GridBagConstraints();
		gbc_button_34.insets = new Insets(0, 0, 5, 0);
		gbc_button_34.gridx = 0;
		gbc_button_34.gridy = 5;
		panel_5.add(button_34, gbc_button_34);
		
		JButton button_35 = new JButton("Valvula 6");
		GridBagConstraints gbc_button_35 = new GridBagConstraints();
		gbc_button_35.insets = new Insets(0, 0, 5, 0);
		gbc_button_35.gridx = 0;
		gbc_button_35.gridy = 6;
		panel_5.add(button_35, gbc_button_35);
		
		JButton button_36 = new JButton("Valvula 7");
		GridBagConstraints gbc_button_36 = new GridBagConstraints();
		gbc_button_36.insets = new Insets(0, 0, 5, 0);
		gbc_button_36.gridx = 0;
		gbc_button_36.gridy = 7;
		panel_5.add(button_36, gbc_button_36);
		
		JButton button_37 = new JButton("Valvula 8");
		GridBagConstraints gbc_button_37 = new GridBagConstraints();
		gbc_button_37.insets = new Insets(0, 0, 5, 0);
		gbc_button_37.gridx = 0;
		gbc_button_37.gridy = 8;
		panel_5.add(button_37, gbc_button_37);
		
		JButton button_38 = new JButton("Valvula 9");
		GridBagConstraints gbc_button_38 = new GridBagConstraints();
		gbc_button_38.insets = new Insets(0, 0, 5, 0);
		gbc_button_38.gridx = 0;
		gbc_button_38.gridy = 9;
		panel_5.add(button_38, gbc_button_38);
		
		JButton button_39 = new JButton("Valvula 10");
		GridBagConstraints gbc_button_39 = new GridBagConstraints();
		gbc_button_39.insets = new Insets(0, 0, 5, 0);
		gbc_button_39.gridx = 0;
		gbc_button_39.gridy = 10;
		panel_5.add(button_39, gbc_button_39);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Tanque 6", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBounds(640, 38, 104, 334);
		frame.getContentPane().add(panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 0};
		gbl_panel_6.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_6.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		JButton button_40 = new JButton("Valvula 1");
		GridBagConstraints gbc_button_40 = new GridBagConstraints();
		gbc_button_40.insets = new Insets(0, 0, 5, 0);
		gbc_button_40.gridx = 0;
		gbc_button_40.gridy = 1;
		panel_6.add(button_40, gbc_button_40);
		
		JButton button_41 = new JButton("Valvula 2");
		GridBagConstraints gbc_button_41 = new GridBagConstraints();
		gbc_button_41.insets = new Insets(0, 0, 5, 0);
		gbc_button_41.gridx = 0;
		gbc_button_41.gridy = 2;
		panel_6.add(button_41, gbc_button_41);
		
		JButton button_42 = new JButton("Valvula 3");
		GridBagConstraints gbc_button_42 = new GridBagConstraints();
		gbc_button_42.insets = new Insets(0, 0, 5, 0);
		gbc_button_42.gridx = 0;
		gbc_button_42.gridy = 3;
		panel_6.add(button_42, gbc_button_42);
		
		JButton button_43 = new JButton("Valvula 4");
		GridBagConstraints gbc_button_43 = new GridBagConstraints();
		gbc_button_43.insets = new Insets(0, 0, 5, 0);
		gbc_button_43.gridx = 0;
		gbc_button_43.gridy = 4;
		panel_6.add(button_43, gbc_button_43);
		
		JButton button_44 = new JButton("Valvula 5");
		GridBagConstraints gbc_button_44 = new GridBagConstraints();
		gbc_button_44.insets = new Insets(0, 0, 5, 0);
		gbc_button_44.gridx = 0;
		gbc_button_44.gridy = 5;
		panel_6.add(button_44, gbc_button_44);
		
		JButton button_45 = new JButton("Valvula 6");
		GridBagConstraints gbc_button_45 = new GridBagConstraints();
		gbc_button_45.insets = new Insets(0, 0, 5, 0);
		gbc_button_45.gridx = 0;
		gbc_button_45.gridy = 6;
		panel_6.add(button_45, gbc_button_45);
		
		JButton button_46 = new JButton("Valvula 7");
		GridBagConstraints gbc_button_46 = new GridBagConstraints();
		gbc_button_46.insets = new Insets(0, 0, 5, 0);
		gbc_button_46.gridx = 0;
		gbc_button_46.gridy = 7;
		panel_6.add(button_46, gbc_button_46);
		
		JButton button_47 = new JButton("Valvula 8");
		GridBagConstraints gbc_button_47 = new GridBagConstraints();
		gbc_button_47.insets = new Insets(0, 0, 5, 0);
		gbc_button_47.gridx = 0;
		gbc_button_47.gridy = 8;
		panel_6.add(button_47, gbc_button_47);
		
		JButton button_48 = new JButton("Valvula 9");
		GridBagConstraints gbc_button_48 = new GridBagConstraints();
		gbc_button_48.insets = new Insets(0, 0, 5, 0);
		gbc_button_48.gridx = 0;
		gbc_button_48.gridy = 9;
		panel_6.add(button_48, gbc_button_48);
		
		JButton button_49 = new JButton("Valvula 10");
		GridBagConstraints gbc_button_49 = new GridBagConstraints();
		gbc_button_49.insets = new Insets(0, 0, 5, 0);
		gbc_button_49.gridx = 0;
		gbc_button_49.gridy = 10;
		panel_6.add(button_49, gbc_button_49);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Tanque 7", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7.setBounds(743, 38, 104, 334);
		frame.getContentPane().add(panel_7);
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[]{0, 0};
		gbl_panel_7.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_7.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_7.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_7.setLayout(gbl_panel_7);
		
		JButton button_50 = new JButton("Valvula 1");
		GridBagConstraints gbc_button_50 = new GridBagConstraints();
		gbc_button_50.insets = new Insets(0, 0, 5, 0);
		gbc_button_50.gridx = 0;
		gbc_button_50.gridy = 1;
		panel_7.add(button_50, gbc_button_50);
		
		JButton button_51 = new JButton("Valvula 2");
		GridBagConstraints gbc_button_51 = new GridBagConstraints();
		gbc_button_51.insets = new Insets(0, 0, 5, 0);
		gbc_button_51.gridx = 0;
		gbc_button_51.gridy = 2;
		panel_7.add(button_51, gbc_button_51);
		
		JButton button_52 = new JButton("Valvula 3");
		GridBagConstraints gbc_button_52 = new GridBagConstraints();
		gbc_button_52.insets = new Insets(0, 0, 5, 0);
		gbc_button_52.gridx = 0;
		gbc_button_52.gridy = 3;
		panel_7.add(button_52, gbc_button_52);
		
		JButton button_53 = new JButton("Valvula 4");
		GridBagConstraints gbc_button_53 = new GridBagConstraints();
		gbc_button_53.insets = new Insets(0, 0, 5, 0);
		gbc_button_53.gridx = 0;
		gbc_button_53.gridy = 4;
		panel_7.add(button_53, gbc_button_53);
		
		JButton button_54 = new JButton("Valvula 5");
		GridBagConstraints gbc_button_54 = new GridBagConstraints();
		gbc_button_54.insets = new Insets(0, 0, 5, 0);
		gbc_button_54.gridx = 0;
		gbc_button_54.gridy = 5;
		panel_7.add(button_54, gbc_button_54);
		
		JButton button_55 = new JButton("Valvula 6");
		GridBagConstraints gbc_button_55 = new GridBagConstraints();
		gbc_button_55.insets = new Insets(0, 0, 5, 0);
		gbc_button_55.gridx = 0;
		gbc_button_55.gridy = 6;
		panel_7.add(button_55, gbc_button_55);
		
		JButton button_56 = new JButton("Valvula 7");
		GridBagConstraints gbc_button_56 = new GridBagConstraints();
		gbc_button_56.insets = new Insets(0, 0, 5, 0);
		gbc_button_56.gridx = 0;
		gbc_button_56.gridy = 7;
		panel_7.add(button_56, gbc_button_56);
		
		JButton button_57 = new JButton("Valvula 8");
		GridBagConstraints gbc_button_57 = new GridBagConstraints();
		gbc_button_57.insets = new Insets(0, 0, 5, 0);
		gbc_button_57.gridx = 0;
		gbc_button_57.gridy = 8;
		panel_7.add(button_57, gbc_button_57);
		
		JButton button_58 = new JButton("Valvula 9");
		GridBagConstraints gbc_button_58 = new GridBagConstraints();
		gbc_button_58.insets = new Insets(0, 0, 5, 0);
		gbc_button_58.gridx = 0;
		gbc_button_58.gridy = 9;
		panel_7.add(button_58, gbc_button_58);
		
		JButton button_59 = new JButton("Valvula 10");
		GridBagConstraints gbc_button_59 = new GridBagConstraints();
		gbc_button_59.insets = new Insets(0, 0, 5, 0);
		gbc_button_59.gridx = 0;
		gbc_button_59.gridy = 10;
		panel_7.add(button_59, gbc_button_59);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Tanque 8", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_8.setBounds(846, 38, 104, 334);
		frame.getContentPane().add(panel_8);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{0, 0};
		gbl_panel_8.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_8.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		JButton button_60 = new JButton("Valvula 1");
		GridBagConstraints gbc_button_60 = new GridBagConstraints();
		gbc_button_60.insets = new Insets(0, 0, 5, 0);
		gbc_button_60.gridx = 0;
		gbc_button_60.gridy = 1;
		panel_8.add(button_60, gbc_button_60);
		
		JButton button_61 = new JButton("Valvula 2");
		GridBagConstraints gbc_button_61 = new GridBagConstraints();
		gbc_button_61.insets = new Insets(0, 0, 5, 0);
		gbc_button_61.gridx = 0;
		gbc_button_61.gridy = 2;
		panel_8.add(button_61, gbc_button_61);
		
		JButton button_62 = new JButton("Valvula 3");
		GridBagConstraints gbc_button_62 = new GridBagConstraints();
		gbc_button_62.insets = new Insets(0, 0, 5, 0);
		gbc_button_62.gridx = 0;
		gbc_button_62.gridy = 3;
		panel_8.add(button_62, gbc_button_62);
		
		JButton button_63 = new JButton("Valvula 4");
		GridBagConstraints gbc_button_63 = new GridBagConstraints();
		gbc_button_63.insets = new Insets(0, 0, 5, 0);
		gbc_button_63.gridx = 0;
		gbc_button_63.gridy = 4;
		panel_8.add(button_63, gbc_button_63);
		
		JButton button_64 = new JButton("Valvula 5");
		GridBagConstraints gbc_button_64 = new GridBagConstraints();
		gbc_button_64.insets = new Insets(0, 0, 5, 0);
		gbc_button_64.gridx = 0;
		gbc_button_64.gridy = 5;
		panel_8.add(button_64, gbc_button_64);
		
		JButton button_65 = new JButton("Valvula 6");
		GridBagConstraints gbc_button_65 = new GridBagConstraints();
		gbc_button_65.insets = new Insets(0, 0, 5, 0);
		gbc_button_65.gridx = 0;
		gbc_button_65.gridy = 6;
		panel_8.add(button_65, gbc_button_65);
		
		JButton button_66 = new JButton("Valvula 7");
		GridBagConstraints gbc_button_66 = new GridBagConstraints();
		gbc_button_66.insets = new Insets(0, 0, 5, 0);
		gbc_button_66.gridx = 0;
		gbc_button_66.gridy = 7;
		panel_8.add(button_66, gbc_button_66);
		
		JButton button_67 = new JButton("Valvula 8");
		GridBagConstraints gbc_button_67 = new GridBagConstraints();
		gbc_button_67.insets = new Insets(0, 0, 5, 0);
		gbc_button_67.gridx = 0;
		gbc_button_67.gridy = 8;
		panel_8.add(button_67, gbc_button_67);
		
		JButton button_68 = new JButton("Valvula 9");
		GridBagConstraints gbc_button_68 = new GridBagConstraints();
		gbc_button_68.insets = new Insets(0, 0, 5, 0);
		gbc_button_68.gridx = 0;
		gbc_button_68.gridy = 9;
		panel_8.add(button_68, gbc_button_68);
		
		JButton button_69 = new JButton("Valvula 10");
		GridBagConstraints gbc_button_69 = new GridBagConstraints();
		gbc_button_69.insets = new Insets(0, 0, 5, 0);
		gbc_button_69.gridx = 0;
		gbc_button_69.gridy = 10;
		panel_8.add(button_69, gbc_button_69);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Tanque 9", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_9.setBounds(949, 38, 104, 334);
		frame.getContentPane().add(panel_9);
		GridBagLayout gbl_panel_9 = new GridBagLayout();
		gbl_panel_9.columnWidths = new int[]{0, 0};
		gbl_panel_9.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_9.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_9.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_9.setLayout(gbl_panel_9);
		
		JButton button_70 = new JButton("Valvula 1");
		GridBagConstraints gbc_button_70 = new GridBagConstraints();
		gbc_button_70.insets = new Insets(0, 0, 5, 0);
		gbc_button_70.gridx = 0;
		gbc_button_70.gridy = 1;
		panel_9.add(button_70, gbc_button_70);
		
		JButton button_71 = new JButton("Valvula 2");
		GridBagConstraints gbc_button_71 = new GridBagConstraints();
		gbc_button_71.insets = new Insets(0, 0, 5, 0);
		gbc_button_71.gridx = 0;
		gbc_button_71.gridy = 2;
		panel_9.add(button_71, gbc_button_71);
		
		JButton button_72 = new JButton("Valvula 3");
		GridBagConstraints gbc_button_72 = new GridBagConstraints();
		gbc_button_72.insets = new Insets(0, 0, 5, 0);
		gbc_button_72.gridx = 0;
		gbc_button_72.gridy = 3;
		panel_9.add(button_72, gbc_button_72);
		
		JButton button_73 = new JButton("Valvula 4");
		GridBagConstraints gbc_button_73 = new GridBagConstraints();
		gbc_button_73.insets = new Insets(0, 0, 5, 0);
		gbc_button_73.gridx = 0;
		gbc_button_73.gridy = 4;
		panel_9.add(button_73, gbc_button_73);
		
		JButton button_74 = new JButton("Valvula 5");
		GridBagConstraints gbc_button_74 = new GridBagConstraints();
		gbc_button_74.insets = new Insets(0, 0, 5, 0);
		gbc_button_74.gridx = 0;
		gbc_button_74.gridy = 5;
		panel_9.add(button_74, gbc_button_74);
		
		JButton button_75 = new JButton("Valvula 6");
		GridBagConstraints gbc_button_75 = new GridBagConstraints();
		gbc_button_75.insets = new Insets(0, 0, 5, 0);
		gbc_button_75.gridx = 0;
		gbc_button_75.gridy = 6;
		panel_9.add(button_75, gbc_button_75);
		
		JButton button_76 = new JButton("Valvula 7");
		GridBagConstraints gbc_button_76 = new GridBagConstraints();
		gbc_button_76.insets = new Insets(0, 0, 5, 0);
		gbc_button_76.gridx = 0;
		gbc_button_76.gridy = 7;
		panel_9.add(button_76, gbc_button_76);
		
		JButton button_77 = new JButton("Valvula 8");
		GridBagConstraints gbc_button_77 = new GridBagConstraints();
		gbc_button_77.insets = new Insets(0, 0, 5, 0);
		gbc_button_77.gridx = 0;
		gbc_button_77.gridy = 8;
		panel_9.add(button_77, gbc_button_77);
		
		JButton button_78 = new JButton("Valvula 9");
		GridBagConstraints gbc_button_78 = new GridBagConstraints();
		gbc_button_78.insets = new Insets(0, 0, 5, 0);
		gbc_button_78.gridx = 0;
		gbc_button_78.gridy = 9;
		panel_9.add(button_78, gbc_button_78);
		
		JButton button_79 = new JButton("Valvula 10");
		GridBagConstraints gbc_button_79 = new GridBagConstraints();
		gbc_button_79.insets = new Insets(0, 0, 5, 0);
		gbc_button_79.gridx = 0;
		gbc_button_79.gridy = 10;
		panel_9.add(button_79, gbc_button_79);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Tanque 10", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_10.setBounds(1052, 38, 104, 334);
		frame.getContentPane().add(panel_10);
		GridBagLayout gbl_panel_10 = new GridBagLayout();
		gbl_panel_10.columnWidths = new int[]{0, 0};
		gbl_panel_10.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_10.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_10.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_10.setLayout(gbl_panel_10);
		
		JButton button_80 = new JButton("Valvula 1");
		GridBagConstraints gbc_button_80 = new GridBagConstraints();
		gbc_button_80.insets = new Insets(0, 0, 5, 0);
		gbc_button_80.gridx = 0;
		gbc_button_80.gridy = 1;
		panel_10.add(button_80, gbc_button_80);
		
		JButton button_81 = new JButton("Valvula 2");
		GridBagConstraints gbc_button_81 = new GridBagConstraints();
		gbc_button_81.insets = new Insets(0, 0, 5, 0);
		gbc_button_81.gridx = 0;
		gbc_button_81.gridy = 2;
		panel_10.add(button_81, gbc_button_81);
		
		JButton button_82 = new JButton("Valvula 3");
		GridBagConstraints gbc_button_82 = new GridBagConstraints();
		gbc_button_82.insets = new Insets(0, 0, 5, 0);
		gbc_button_82.gridx = 0;
		gbc_button_82.gridy = 3;
		panel_10.add(button_82, gbc_button_82);
		
		JButton button_83 = new JButton("Valvula 4");
		GridBagConstraints gbc_button_83 = new GridBagConstraints();
		gbc_button_83.insets = new Insets(0, 0, 5, 0);
		gbc_button_83.gridx = 0;
		gbc_button_83.gridy = 4;
		panel_10.add(button_83, gbc_button_83);
		
		JButton button_84 = new JButton("Valvula 5");
		GridBagConstraints gbc_button_84 = new GridBagConstraints();
		gbc_button_84.insets = new Insets(0, 0, 5, 0);
		gbc_button_84.gridx = 0;
		gbc_button_84.gridy = 5;
		panel_10.add(button_84, gbc_button_84);
		
		JButton button_85 = new JButton("Valvula 6");
		GridBagConstraints gbc_button_85 = new GridBagConstraints();
		gbc_button_85.insets = new Insets(0, 0, 5, 0);
		gbc_button_85.gridx = 0;
		gbc_button_85.gridy = 6;
		panel_10.add(button_85, gbc_button_85);
		
		JButton button_86 = new JButton("Valvula 7");
		GridBagConstraints gbc_button_86 = new GridBagConstraints();
		gbc_button_86.insets = new Insets(0, 0, 5, 0);
		gbc_button_86.gridx = 0;
		gbc_button_86.gridy = 7;
		panel_10.add(button_86, gbc_button_86);
		
		JButton button_87 = new JButton("Valvula 8");
		GridBagConstraints gbc_button_87 = new GridBagConstraints();
		gbc_button_87.insets = new Insets(0, 0, 5, 0);
		gbc_button_87.gridx = 0;
		gbc_button_87.gridy = 8;
		panel_10.add(button_87, gbc_button_87);
		
		JButton button_88 = new JButton("Valvula 9");
		GridBagConstraints gbc_button_88 = new GridBagConstraints();
		gbc_button_88.insets = new Insets(0, 0, 5, 0);
		gbc_button_88.gridx = 0;
		gbc_button_88.gridy = 9;
		panel_10.add(button_88, gbc_button_88);
		
		JButton button_89 = new JButton("Valvula 10");
		GridBagConstraints gbc_button_89 = new GridBagConstraints();
		gbc_button_89.insets = new Insets(0, 0, 5, 0);
		gbc_button_89.gridx = 0;
		gbc_button_89.gridy = 10;
		panel_10.add(button_89, gbc_button_89);
		
		JLabel lblPrecionesLosBotones = new JLabel("Preciones los botones de valvulas para abrirlas o cerrarlas");
		lblPrecionesLosBotones.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrecionesLosBotones.setBounds(22, 421, 479, 31);
		frame.getContentPane().add(lblPrecionesLosBotones);
		
		JLabel lblIngreseLaCantidad = new JLabel("Ingrese la cantidad de agua con la que cuenta cada tanque");
		lblIngreseLaCantidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIngreseLaCantidad.setBounds(22, 396, 491, 14);
		frame.getContentPane().add(lblIngreseLaCantidad);
		
		JLabel lblValvulasDeTanques = new JLabel("Valvulas de tanques");
		lblValvulasDeTanques.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblValvulasDeTanques.setBounds(553, 11, 176, 25);
		frame.getContentPane().add(lblValvulasDeTanques);
	}
}
