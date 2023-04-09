package Run_Package;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base_Class_Package.TestBase_Window;

import WebClass_Package.Window_Class;

public class Window_Run_Class extends TestBase_Window{
	
	
	Window_Class windowobject;
	
	public Window_Run_Class () {
		super();
		}
	@BeforeClass
	public void setup() {
		intialization();
		windowobject = new Window_Class();
		
		
	}
	@Test(priority=1)
	public void openwindownew() {
		windowobject.opennewwindow();
	}

}
