package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {


public WebDriver driver;
public homepage(WebDriver driver) {
	this.driver=driver;
}

By header=By.xpath("//div[@class='col-md-6 text-left']/h2/span");
By practiceplink=By.xpath("//div[@class='nav-outer clearfix'] //ul[@class='navigation clearfix']/li[4]/a");

public WebElement header(){
	return driver.findElement(header);
	
	
}

public WebElement practiceLink(){
	 return driver.findElement(practiceplink);
	 
	 
	
}

	

}
