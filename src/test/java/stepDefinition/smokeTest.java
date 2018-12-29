package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTest {
	
	WebDriver driver;
	
	@Given("^Open Chrome and start application$")
	public void open_Chrome_and_start_application()  {
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_enter_valid_and_valid(String arg1, String arg2)  {
		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("pass")).sendKeys(arg2);
	   
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() {
		System.out.println("I am logged in");
	 
	}

	@Then("^application should be closed$")
	public void application_should_be_closed()  {
	    
	    
	}

}
