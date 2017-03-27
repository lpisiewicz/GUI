package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo extends JFrame {
	 
	private JButton button = new JButton("Click Me!");
	private JLabel label = new JLabel("Button wasn't clicked!");
 
	public Demo() {
 
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(button);
		this.getContentPane().add(label);
 
		button.setName("myButton");
		label.setName("myLabel");
 
		button.addActionListener(new ActionListener() {	
 
			public void actionPerformed(ActionEvent e) {
	
				label.setText("Button was clicked!");
			}
		});
		
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
 
		new Demo();
	}
}