package stepDefenation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import resources.Base;


public class Hooks extends Base{
 
	
	
	/*@Before
	public void setup() throws IOException{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//resources//data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.contains("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//main//java//POM//chromedriver.exe");
			ChromeOptions cp=new ChromeOptions();
			if(browserName.contains("headless")){
				cp.addArguments("headless");
			}
			driver=new ChromeDriver(cp);
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}*/
	
	
	@After 
	public void teardown() throws IOException{
		
		driver.close();
	}
	
	/*public static WebDriver getDriver(){
		return driver;
	}*/
}
	
	
