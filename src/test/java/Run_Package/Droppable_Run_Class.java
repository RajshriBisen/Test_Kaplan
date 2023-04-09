package Run_Package;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base_Class_Package.Test_Base_droppable;

import WebClass_Package.Droppable_class;

public class Droppable_Run_Class extends Test_Base_droppable {
	
	Droppable_class dropobject;
	
	public Droppable_Run_Class () {
		super();
		}
	@BeforeClass
	public void setup() {
		intialization();
		dropobject = new Droppable_class();
		
		
	}
	
	@Test(priority=1)
	public void select_option_run() {
		dropobject.Select_option_accept();
	}
	@Test(priority=2)
	public void drop() throws InterruptedException {
		Thread.sleep(10000);
		dropobject.dropNotAccept();
	}

}
