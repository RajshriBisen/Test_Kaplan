package WebClass_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Base_Class_Package.TestBase_DemoQA;

public class DemoQAClass extends TestBase_DemoQA{
	
	
	public DemoQAClass() {
		
		 PageFactory.initElements(driver, this);
	}
	
	public void childFrame() {
		 int totalframepage =driver. findElements(By. tagName("iframe")). size();
	        
	        WebElement frame1=driver.findElement(By.id("frame1"));
	        driver.switchTo().frame(frame1);
	        int Iframeone =driver. findElements(By. tagName("iframe")). size();
	        driver.switchTo().frame(0);
	        int Iframettwo =driver. findElements(By. tagName("iframe")). size();
	        WebElement frame1ele= driver.findElement(By.tagName("body"));
	        String frame1Text=frame1ele.getText();
	        System.out.println("childframe  is :"+frame1Text);
}}