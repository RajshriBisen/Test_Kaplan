package WebClass_Package;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Class_Package.TestBase_Alert_class;

public class Alert_Class extends TestBase_Alert_class {
	
	
	
	public Alert_Class() {
		
		 PageFactory.initElements(driver, this);
	}
	
	
	public void firstAlert() {
		driver.findElement(By.id("alertButton")).click();
	    Alert simpleAlert = driver.switchTo().alert();
	    simpleAlert.accept();
		
	}
	
	public void secondalert() throws InterruptedException {
		
            driver.findElement(By.id("timerAlertButton")).click();
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert simpleAlert = driver.switchTo().alert();
            simpleAlert.accept();
            System.out.println("Unexpected alert accepted");
         
		
	}
	public void thirdalert() {
		  WebElement element = driver.findElement(By.id("confirmButton"));
		  ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		  Alert confirmationAlert = driver.switchTo().alert();
		  String alertText = confirmationAlert.getText();
		  System.out.println("Third Alert" + alertText);
		  
		  confirmationAlert.accept();
		
	}
	public void fourthalert() {
		   WebElement element = driver.findElement(By.id("promtButton"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		   Alert promptAlert  = driver.switchTo().alert();
		   String alertText = promptAlert.getText();
		   System.out.println("Fourth Alert" + alertText);
		 
		   promptAlert.sendKeys("Rajshri");
		   promptAlert.accept();
		
		
	}
	
	
	
	
	
	

}
