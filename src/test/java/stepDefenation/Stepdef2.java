package stepDefenation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import POM.homepage;
import POM.loginpage;
import POM.practicepage;
import POM.signuppage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import resources.Base;


public class Stepdef2{
	private static WebDriver driver=null;
    

	practicepage pp;
	homepage hp;
	loginpage lp;
	signuppage sp;

		
		
		 @Given("^user is on homepage \"([^\"]*)\"$")
		    public void user_is_on_homepage_something(String url) throws Throwable {
		     driver=Base.intializeBrowser(); 
			 driver.get(url);
		    }



		
		@Then("user is able to validate the header successfully")
		public void user_is_able_to_validate_the_header_successfully() {
		   hp=new homepage(driver);
		   Assert.assertEquals("An Academy to Learn Earn & Shine in  your QA Carrer", hp.header().getText());
	
		}
		
		
			@When("user clicks on practice page link")
			public void user_clicks_on_practice_page_link() {
				
				 hp.practiceLink().click();				
			   
			}


	
			@Then("user is navigated to pracice page")
			public void user_is_navigated_to_pracice_page() {
				
				Assert.assertEquals("Join now to Practice", pp.pptitle().getText());
			   
			}
			@When("selects the checkbox")
			public void selects_the_checkbox() {
				pp.agree().click();
			   
			}
			@When("clicks on submit")
			public void clicks_on_submit() {
			   pp.submit().click();
			}
			@Then("user is successfully unlocked the practice apps")
			public void user_is_successfully_unlocked_the_practice_apps() {
				System.out.println("success practice page");
			   
			}


				@When("user clicks on Login tab")
				public void user_clicks_on_login_tab() {
					lp=new loginpage(driver);
					lp.loginlink().click();
				  
				}
				

			    @When("^user enters the name \"([^\"]*)\" and emailId \"([^\"]*)\"$")
			    public void user_enters_the_name_something_and_emailid_something(String strArg1, String strArg2) throws Throwable {
			    	practicepage pp=new practicepage(driver);
			    	pp.email().sendKeys(strArg1);
			    	pp.password().sendKeys(strArg2);
			    	
			    }

				@Then("user is navigated to signup page")
				public void user_is_navigated_to_signup_page() {
					sp=new signuppage(driver);
					
					Assert.assertEquals("Log In to Rahul Shetty Academy", sp.spheader().getText());
					System.out.println("signup page displayed");
											
				   
				}
				@When("clicks on Login")
				public void clicks_on_login() {
					 sp.signup().click();
				   
				}
				@Then("user is able to login to the app")
				public void user_is_able_to_login_to_the_app() {
					System.out.println("Able to login to th app");
				    
				}
				@When("^user enters username(.+) and password(.+)$")
				public void user_enters_username_and_password(String username, String password) {
					   sp.email().sendKeys(username);
					   sp.pwd().sendKeys(password);
					  
				}



		
		




}
