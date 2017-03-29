package gui;

import java.awt.Component;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import org.fest.swing.edt.FailOnThreadViolationRepaintManager;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.fixture.JButtonFixture;
import org.fest.swing.fixture.JTextComponentFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.toedter.calendar.JTextFieldDateEditor;
public class GuiTest {

	
	private FrameFixture frameFixture;
	
	@Before
	
	public void setUp() throws Exception {
		System.out.println("Test start");
		frameFixture=new FrameFixture(new MainFrame());
	}

	

	@Test
	public void test() {
		
		JButton button=ActionComponent.findButton(frameFixture.robot.finder(), "Button");
		ActionComponent.clickButton(frameFixture, button);
		
		 JComboBox<String> comboBox=ActionComponent.findComboBox(frameFixture, frameFixture.robot.finder());
		//Second option to assigne combo Box
		//JComboBox<String> comboBox=ActionComponent.findComboBox(frameFixture.robot.finder(), "combo");
		ActionComponent.selectComboBoxValue(frameFixture, comboBox, 3);		
		JTextField textfield=ActionComponent.findTextField(frameFixture, frameFixture.robot.finder());
		JTextComponentFixture t=new JTextComponentFixture(frameFixture.robot, textfield);
		t.deleteText();
		t.enterText("Dupa");
//		if (textfield !=null){
//			
//			frameFixture.textBox(textfield.getName()).deleteText();
//			frameFixture.textBox(textfield.getName()).enterText("Dodano Napis");
//		}
		 
		JTextFieldDateEditor calendar=ActionComponent.findCalendar(frameFixture, frameFixture.robot.finder());
		frameFixture.robot.click(calendar);
		System.out.println(calendar.getValue());
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		System.out.println("Test ends");
	}
	
	
	
	
	

}
