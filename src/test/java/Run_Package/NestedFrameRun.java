package Run_Package;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base_Class_Package.TestBase_DemoQA;
import WebClass_Package.DemoQAClass;
import WebClass_Package.Flipkart_class;

public class NestedFrameRun extends TestBase_DemoQA {
	
	DemoQAClass demoqa;
	
	public NestedFrameRun () {
		super();
		}
	@BeforeClass
	public void setup() {
		intialization();
		demoqa = new DemoQAClass();
		
		
	}
	@Test(priority=1)
	public void childframerun() {
		demoqa.childFrame();
	}
	

}
