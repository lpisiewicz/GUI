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

public class MainFrame extends JFrame {
	
	private JTextField textField;
	private JTable table;
	private JButton clickMeButton;
	private JComboBox comboBox;
	private JDateChooser dataChooser;
	
	public MainFrame() {
		setAlwaysOnTop(true);
		initializeComponents();
		
		clickMeButton.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("Przycik wcisniety");
				
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		new MainFrame();
	}
	
	
	
	public void initializeComponents(){
		
		getContentPane().setLayout(null);
		this.setSize(500, 500);
		clickMeButton = new JButton("Click me");
		clickMeButton.setName("Button");
		clickMeButton.setBounds(10, 11, 89, 23);
		getContentPane().add(clickMeButton);
		
		comboBox = new JComboBox();
		comboBox.setBounds(10, 45, 28, 20);
		getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(109, 12, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBounds(246, 15, 1, 1);
		getContentPane().add(table);
		
		dataChooser=new JDateChooser();
		getContentPane().add(dataChooser);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
