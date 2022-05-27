package stepDefinitions;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.reporters.jq.TimesPanel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testRunner.BrowserSetup;

public class StepDefinition extends BrowserSetup {
	
	@Given("User redirected to fb login page with url {string}")
	public void user_redirected_to_fb_login_page_with_url(String ApplicationURL) {
		
		Setup(ApplicationURL);
		driver.manage().window().maximize();
		System.out.println("Browsersetup success");
	
	}
	@When("User enters username {string} and password {string}")
	public void user_enters_username_and_password(String userName, String Password) {
	 
		driver.findElement(By.id("email")).sendKeys(userName);
		System.out.println("User name entered");
		driver.findElement(By.id("pass")).sendKeys(Password);
		System.out.println("Password entered");
	}
	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.name("login")).click();
		System.out.println("Clicked on login button");
		
	}
	@Then("verify login error {string}")
	public void verify_login_error(String Error) {
		
		WebElement ele=driver.findElement(By.xpath("//div[@id='email_container']/div[2]"));
		waitforElement(ele);
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='email_container']/div[2]")).getText(),Error);
		System.out.println("Verified login error");
	}
	@Then("Close the browser session")
	public void close_the_browser_session() {
		
	 driver.close();
	 System.out.println("Browser Session Closed");
	}

}
