package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signuppage {

	public WebDriver driver;
	
	
	
	By spheader=By.xpath("//h1[@class='text-center']");
	By email=By.id("user_email");
	By pwd=By.id("user_password");
	By signup=By.xpath("//input[@type='submit']");
	
	public signuppage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement spheader(){
		return driver.findElement(spheader);
	}
	
	public WebElement email(){
		return driver.findElement(email);
	}
	public WebElement pwd(){
		return driver.findElement(pwd);
	}
	public WebElement signup(){
		return driver.findElement(signup);
	}
	
}
