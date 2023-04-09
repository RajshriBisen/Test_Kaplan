package WebClass_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Class_Package.Test_Base_droppable;

public class Droppable_class extends Test_Base_droppable {
	
	@FindBy(xpath="//div[@class='droppable-container']/nav")
	WebElement SelectOptions;
	
	@FindBy(id="notAcceptable")
	WebElement NotAccept;
	
	@FindBy(id="droppable")
	WebElement drophere;
	
	
	public Droppable_class() {
		
		 PageFactory.initElements(driver, this);
	}
	
	public void Select_option_accept() {
		List<WebElement>option_list = driver.findElements(By.xpath("//div[@class='droppable-container']/nav/a"));
	    System.out.println(option_list.size());
	    for(WebElement options:option_list) {
	    System.out.println(options.getText());
	    String accept_option = options.getText();
	    if(accept_option.equalsIgnoreCase("Accept")) {
	    	options.click();
	    }
	    	
	    }
	
	}
	
	public void dropNotAccept() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(10000);
		/*Actions action = new Actions(driver);
		Thread.sleep(10000);
		action.dragAndDrop(NotAccept, drophere).build().perform();
		*/
		WebElement src = driver.findElement(By.id("notAcceptable"));
		WebElement trg = driver.findElement(By.xpath("(//div[@class='drop-box ui-droppable']/p)[2]"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(src, trg).build().perform();
		

		
				
		
	}

}
