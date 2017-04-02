package gui;

import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JButton clickMeButton;
	private JComboBox comboBox;
	private JDateChooser dataChooser;
	private JTable table_1;

	public MainFrame() {
		setAlwaysOnTop(true);
		initializeComponents();

		System.out.println("Table size: Row = " + table_1.getRowCount() + "Column = " + table_1.getColumnCount());

		clickMeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("Przycik wcisniety");

			}
		});

	}

	public static void main(String[] args) {
		new MainFrame();
	}

	public void initializeComponents() {

		getContentPane().setLayout(null);
		this.setSize(500, 500);
		clickMeButton = new JButton("Click me");
		clickMeButton.setName("Button");
		clickMeButton.setBounds(10, 11, 89, 23);
		getContentPane().add(clickMeButton);

		comboBox = new JComboBox();
		comboBox.setName("combo");
		String[] options = new String[] { "1", "2", "3", "4", "5" };
		for (String s : options) {
			comboBox.addItem(s);
		}
		comboBox.setBounds(10, 45, 145, 20);
		getContentPane().add(comboBox);

		textField = new JTextField();
		textField.setName("textField");
		textField.setBounds(109, 12, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		table = new JTable();
		table.setBounds(246, 15, 1, 1);
		getContentPane().add(table);

		dataChooser = new JDateChooser();
		dataChooser.setName("Calendarr");
		dataChooser.setBounds(20, 20, 100, 20);
		dataChooser.setLocation(10, 70);
		getContentPane().add(dataChooser);

		textField_1 = new JTextField();
		textField_1.setName("textField_1");
		textField_1.setBounds(205, 12, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setName("textField_2");
		textField_2.setBounds(301, 12, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 153, 264, 120);
		getContentPane().add(scrollPane);

		table_1 = new JTable();
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setName("table1");
		table_1.setModel(new DefaultTableModel(new Object[][] { { null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null }, }, new String[] { "Colum1", "Colum2", "Column3" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table_1);

		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
