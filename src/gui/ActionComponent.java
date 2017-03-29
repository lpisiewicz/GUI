package gui;

import java.awt.Component;
import java.awt.Robot;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import org.fest.swing.core.ComponentFinder;
import org.fest.swing.exception.ComponentLookupException;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.fixture.JButtonFixture;
import org.fest.swing.fixture.JComboBoxFixture;

import com.toedter.calendar.JTextFieldDateEditor;

public class ActionComponent {

	// JButton
	public static JButton findButton(ComponentFinder finder, String name) {
		try {
			JButton button = (JButton) finder.findByName(name);
			return button;
		} catch (ComponentLookupException e) {
			return null;
		}

	}

	public static void clickButton(FrameFixture frame, JButton button) {
		final JButtonFixture fixButton = new JButtonFixture(frame.robot, button);
		fixButton.click();

	}

	// JComboBox
	public static JComboBox<String> findComboBox(ComponentFinder finder, String name) {
		try {
			JComboBox<String> comboBox = (JComboBox<String>) finder.findByName(name);
			return comboBox;
		} catch (ComponentLookupException e) {
			return null;
		}

	}

	public static void selectComboBoxValue(FrameFixture frame, JComboBox<String> comboBox, int index) {
		final JComboBoxFixture fixComboBox = new JComboBoxFixture(frame.robot, comboBox);
		fixComboBox.selectItem(index);

	}
	
	public static JComboBox<String> findComboBox(FrameFixture frame, ComponentFinder finder){
		try {
			JComboBox<String> textfield = (JComboBox<String>) finder.find(frame.target,c -> c instanceof JComboBox && c.isShowing());
			return textfield;
		} catch (ComponentLookupException e) {
			return null;
		}

	}
	

	// JTextField

	public static JTextField findTextField(FrameFixture frame, ComponentFinder finder) {
		try {
			
			JTextField textfield = (JTextField) finder.find(frame.target,c -> c instanceof JTextField && c.getClass().getName()!=JTextFieldDateEditor.class.getName() && c.isShowing());
			return textfield;
		} catch (ComponentLookupException e) {
			e.printStackTrace();
			return null;
		}

	}
	
	public static JTextField findTextField(FrameFixture frame, ComponentFinder finder, String name) {
		try {
			
			JTextField textfield = (JTextField) finder.find(frame.target,c -> c instanceof JTextField && c.getClass().getName()!=JTextFieldDateEditor.class.getName() 
					&& c.isShowing() && c.getName()==name);
			return textfield;
		} catch (ComponentLookupException e) {
			e.printStackTrace();
			return null;
		}

	}
	
	
	//JCalendarField
	public static JTextFieldDateEditor findCalendar(FrameFixture frame, ComponentFinder finder) {
		try {
			
			JTextFieldDateEditor calendar = (JTextFieldDateEditor) finder.find(frame.target,c -> c instanceof JTextFieldDateEditor && c.isShowing());
			System.out.println(calendar.getClass().getName());
			return calendar;
		} catch (ComponentLookupException e) {
			e.printStackTrace();
			return null;
		}

	}
	

	

}
