package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	public WebDriver driver;
	By loginlink=By.xpath("//a[contains(@href,'sign_in')]");

	public loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement loginlink(){
		return driver.findElement(loginlink);
	}
	
	
}
