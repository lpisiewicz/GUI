package gui;

import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DemoTest {
	 
		private FrameFixture demo;
		
		@Before
		public void setUp() {
	 
			demo = new FrameFixture(new Demo());
		}
		
		@After
		public void tearDown() {
	 
			demo.cleanUp();
		}
		
		@Test
		public void test() {
			
			demo.label("myLabel").requireText("Button wasn't clicked!");
			demo.button("myButton").click();
			demo.label("myLabel").requireText("Button was clicked!");
		}
	}