package Base_Class_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase_DemoQA {
	
	public static WebDriver driver;
    public static void intialization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbisen\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    	ChromeOptions chromeOptions = new ChromeOptions();

    	chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

    	driver = new ChromeDriver(chromeOptions);
			
			driver.get("https://demoqa.com/nestedframes");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
			
			
			
			 
		}

}
