package WebClass_Package;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Class_Package.Test_Base_Class;

public class Flipkart_class extends Test_Base_Class{
	
	
	@FindBy(xpath="//div[@class='_1XBjg- row']//form//input[@type='text']")
	WebElement uname;
	
	@FindBy(xpath="//div[@class='_1XBjg- row']//form//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	WebElement clickbutton;
	
	@FindBy(xpath="(//div[@class='_1psGvi SLyWEo']/div)[1]")
	WebElement fashion_button;
	
	@FindBy (xpath="(//div[@class='_3XS_gI _7qr1OC']/a)[9]")
     WebElement Kids_index;
	
	@FindBy(xpath="//div[@class='_3XS_gI']/a")
	WebElement Boys_Girls_jeans;
	
	@FindBy(xpath="//div[text()='Price -- Low to High']")
	WebElement Sort_Price;
	
	@FindBy(xpath="(//div[@class='_2B099V']/a)[5]")
	WebElement Click_one_item;
	
	@FindBy(xpath="//span[@class='B_NuCI']")
	WebElement get_item_name;
	
	@FindBy(xpath="//div[@class='_30jeq3 _16Jk6d']")
	WebElement get_item_price;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement Add_Cart;
	

	
	Actions action = new Actions(driver);
	
	public Flipkart_class() {
		
		 PageFactory.initElements(driver, this);
	}
	public String launchTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
	
	public void clickcancel() {
		clickbutton.click();
		
	}
	
	public void Hover_Fashion_button() {
		action.moveToElement(fashion_button).build().perform();
		 
		
	}
	
	public void TestList() throws InterruptedException {
		List<WebElement>list = driver.findElements(By.xpath("//div[@class='_2IjXr8']/div/a"));
		System.out.println(list.size());
		for(int i=0;i<=list.size()-1;i++) {
			 String str_kids = list.get(i).getText();
			 String Kids_Text = "Kids";
			 System.out.println(str_kids);
			 if(str_kids.equalsIgnoreCase(Kids_Text)) {
			 action.moveToElement(Kids_index).build().perform();
			 Thread.sleep(1000);
			 List<WebElement>list_item = driver.findElements(By.xpath("//div[@class='_3XS_gI']/a"));
			 System.out.println(list_item);
			 Thread.sleep(1000);
			 for(WebElement item_test:list_item) {
			 System.out.println(item_test.getText());
			 String list_of_item = item_test.getText();
			 if(list_of_item.equalsIgnoreCase("Boys & Girls Jeans")) {
			 item_test.click();
			
				}
			 }
			 
			 }		 
	
}
		}
	
	      public void sort_by_section() {
		     Sort_Price.click();
		     
		 }
	      
	      public void Click_sort_item() throws InterruptedException {
	  		
	    	Click_one_item.click();
	  		Set<String> windows=driver.getWindowHandles();
	  		System.out.println(windows.size());
			Iterator<String> it = windows.iterator();
			String parentid = it.next();
			System.out.println(parentid);
			String childid = it.next();
			System.out.println(childid);
			driver.switchTo().window(childid);
			
	  		}
	  	
	      
	      public void fetching_item_details() throws InterruptedException {
	    	  Thread.sleep(1000);
	    		String item_name = get_item_name.getText();
	    		System.out.println("item_name_display:" +item_name);
	    		}
	      
	      public void item_price_details() throws InterruptedException {
	    	  Thread.sleep(1000);
	    		String item_price_details = get_item_price.getText();
	    		System.out.println("Price_display:" +item_price_details);
	    		
	    		
	    			}
	     
	      public void adddetails() {
	    	  List<WebElement> list = driver.findElements(By.xpath("//ul[@class='_1q8vHb']/li"));
	    	  
	    	  System.out.println( list.size());
	    	  for(int i=0;i<=list.size();i++) {
	    	System.out.println(list.get(i).getText());
	    	String actualText = list.get(i).getText();
	    	
	    	
	    		driver.findElements(By.xpath("(//ul[@class='_1q8vHb']/li/a)[2]")).get(i).click();
	    		break;
	    	
	    	  }
	    	  
	      }
	      
	      public void addcartitem() throws InterruptedException {
	    	  Thread.sleep(1000);
	    	  Add_Cart.click();
	      }
	     
	
}