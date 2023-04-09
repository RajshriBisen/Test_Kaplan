package WebClass_Package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Class_Package.TestBase_Window;

public class Window_Class extends TestBase_Window {
	
	@FindBy(id="windowButton")
	WebElement newwindow;
	

	public Window_Class() {
		
		 PageFactory.initElements(driver, this);
	}
	
	public void opennewwindow() {
		newwindow.click();
		
		String parentwindow = driver.getWindowHandle();
		System.out.println("parentwindow id:" +parentwindow);
		
		Set<String>set = driver.getWindowHandles();
		System.out.println(set.size());
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			
			String ChildWindow = it.next();
            if (!parentwindow.equalsIgnoreCase(ChildWindow)) {
            driver.switchTo().window(ChildWindow);
            WebElement actualText = driver.findElement(By.id("sampleHeading"));
            System.out.println("Childwindow text is:" +actualText.getText());
			driver.close();			
		}
		
	}

}}
