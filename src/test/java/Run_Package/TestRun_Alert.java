package Run_Package;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base_Class_Package.TestBase_Alert_class;
import WebClass_Package.Alert_Class;
import WebClass_Package.DemoQAClass;

public class TestRun_Alert extends TestBase_Alert_class{
	
	Alert_Class alertobject;
	
	public TestRun_Alert () {
		super();
		}
	@BeforeClass
	public void setup() {
		intialization();
		alertobject = new Alert_Class();
		
		
	}
	
	@Test(priority=1)
	public void firstalertrun() {
		alertobject.firstAlert();
	}
	@Test(priority=2)
	public void secondalertrun() throws InterruptedException {
		
		alertobject.secondalert();
		Thread.sleep(1000);
	}
	
	@Test(priority=3)
	public void thirdlertrun() {
		alertobject.thirdalert();
	}
	
	@Test(priority=4)
	public void fourthalertrun() {
		alertobject.fourthalert();
	}

}
