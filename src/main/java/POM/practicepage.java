package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practicepage {
	
	public WebDriver driver;
	
	By ppheader=By.xpath("h2[text()='Join now to Practice']");
	By email =By.id("name");
	By password=By.id("email");
	By agree=By.id("agreeTerms");
	By submit=By.id("form-submit");
	public practicepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement pptitle(){
		return driver.findElement(ppheader);
		
	}
	
	public WebElement email(){
		return driver.findElement(email);
		
	}
	public WebElement password(){
		return driver.findElement(password);
		
	}
	public WebElement agree(){
		return driver.findElement(agree);
		
	}
	public WebElement submit(){
		return driver.findElement(submit);
		
	}

}
