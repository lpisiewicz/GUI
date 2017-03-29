package gui;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import org.fest.swing.core.ComponentFinder;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.fixture.JTextComponentFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.toedter.calendar.JTextFieldDateEditor;
public class GuiTest {

	
	private FrameFixture frameFixture;
	private static HashMap<String, String> map;
	
	@Before
	
	public void setUp() throws Exception {
		System.out.println("Test start");
		frameFixture=new FrameFixture(new MainFrame());
		fillMap();
	}

	

	@Test
	public void test() {
		
		JButton button=ActionComponent.findButton(frameFixture.robot.finder(), "Button");
		ActionComponent.clickButton(frameFixture, button);
		JComboBox<String> comboBox=ActionComponent.findComboBox(frameFixture, frameFixture.robot.finder());	 
		ActionComponent.selectComboBoxValue(frameFixture, comboBox, 3);	
	
		SetAllTextFields(frameFixture, frameFixture.robot.finder(), map);
	
		JTextFieldDateEditor calendar=ActionComponent.findCalendar(frameFixture, frameFixture.robot.finder());
		frameFixture.robot.click(calendar);
		frameFixture.robot.enterText("2017-03-16");
		System.out.println(calendar.getValue());
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		System.out.println("Test ends");
	}
	
	
	public static void SetAllTextFields(FrameFixture frameFixture, ComponentFinder finder, HashMap<String, String> map){
		for (Map.Entry<String, String> entry : map.entrySet()) {
		    String key = entry.getKey();
		    String value = entry.getValue();
		    JTextField textfield=ActionComponent.findTextField(frameFixture, frameFixture.robot.finder(), key);
			JTextComponentFixture fixTextfield=new JTextComponentFixture(frameFixture.robot, textfield);
			fixTextfield.deleteText();
			fixTextfield.enterText(value);
		
	}	
	}
	
	public static void fillMap(){
		map=new HashMap<>();
		map.put("textField", "To");
		map.put("textField_1", "Jest");
		map.put("textField_2", "Test");
	}
}
