package Run_Package;

import org.testng.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base_Class_Package.Test_Base_Class;

import WebClass_Package.Flipkart_class;

public class Flipkart_run extends Test_Base_Class {
	
	Flipkart_class Flipkart;
	
	public Flipkart_run() {
		super();
		}
	@BeforeClass
	public void setup() {
		intialization();
		Flipkart = new Flipkart_class();
		
		
	}
	@Test(priority=1)
	
	public void FlipKartPageTitle() throws InterruptedException {
		Thread.sleep(5000);
		
	String pagestr = Flipkart.launchTitle();
	System.out.println(pagestr);
	}
	
	@Test(priority=2)
	public void clickbutton() {
		Flipkart.clickcancel();
	}
	
	@Test(priority=3)
	public void Hover_Fashion() {
		Flipkart.Hover_Fashion_button();
	}
	@Test(priority=4)
	public void Select_KidsSection() throws InterruptedException {
		Thread.sleep(1000);
		Flipkart.TestList();
	}
	
	
	@Test(priority=5)
	public void Sort_By_Price() {
		Flipkart.sort_by_section();
	}
	@Test(priority=6)
	public void Select_one_item() throws InterruptedException {
		Thread.sleep(1000);
		Flipkart.Click_sort_item();
	}
	
	
	@Test(priority=7)
	public void display_itemname() throws InterruptedException {
		Flipkart.fetching_item_details();
	}
	@Test(priority=8)
	public void display_price() throws InterruptedException {
		Flipkart.item_price_details();
	}
	
	@Test(priority=9)
	public void adddetails() {
		Flipkart.adddetails();
	}
	@Test(priority=10)
	public void addItemInCart() throws InterruptedException {
		Flipkart.addcartitem();
	}
	
}
