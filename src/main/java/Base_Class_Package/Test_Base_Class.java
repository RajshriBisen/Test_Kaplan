package Base_Class_Package;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Test_Base_Class {
	
	public static WebDriver driver;
	public static Properties prop;
	
	//Reading property config file
	public Test_Base_Class() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\rbisen\\eclipse-workspace\\Test_01\\src\\main\\java\\Config_Package\\Config_File");
			prop.load(ip);
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void intialization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbisen\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    	ChromeOptions chromeOptions = new ChromeOptions();

    	chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

    	driver = new ChromeDriver(chromeOptions);
			
			 driver.get(prop.getProperty("url"));
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
			
			
			
			 
		}
		
		
		
	}


