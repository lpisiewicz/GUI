package gui;

import java.awt.Component;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.fest.swing.edt.FailOnThreadViolationRepaintManager;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.fixture.JButtonFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class GuiTest {

	
	private FrameFixture frameFixture;
	
	@Before
	
	public void setUp() throws Exception {
		System.out.println("Test start");
		frameFixture=new FrameFixture(new MainFrame());
	}

	

	@Test
	public void test() {

	
		try{
			JButton button=(JButton)frameFixture.robot.finder().findByName("Budtton");
		if (button != null){
			JButtonFixture buttonfixture=new JButtonFixture(frameFixture.robot,(JButton)frameFixture.robot.finder().findByName("Button"));
			buttonfixture.click();
		}
		else{
			System.out.println("Button nie istnieje");
		}
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("Test ends");
	}

}
