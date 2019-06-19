package stepdefination;

import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.client.SendFailure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations 
{
	public static WebDriver driver;
	String driverpath="C:\\Users\\adamer01\\Documents\\Selenuim Practise\\Jars\\chromedriver.exe";
	@Given("^user is in on Homepage$")
	public void user_is_in_on_Homepage() throws Throwable
	{
		
			//String Browser=prop.getProperty("Browser");
			//System.out.println(Browser);
			
				System.setProperty("webdriver.chrome.driver", driverpath);
				 ChromeOptions options = new ChromeOptions();
				 
				options.setExperimentalOption("useAutomationExtension", false);
				driver=new ChromeDriver(options);
		
			
		//	System.out.println(prop.getProperty("url"));
			driver.get("http://test.salesforce.com");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//driver.manage().deleteAllCookies();
			//driver.get(Url);
		
			driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	
	}
	

	@When("^user navigates to login$")
	public void user_navigates_to_login() throws Throwable 
	{
		
	   
	}

	@Then("^User enter username and password$")
	public void User_enter_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("anitha.damerla@bcbsma.com.stagesand");
		//private WebElement userName;
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Snowfall@2019");
	
		
		Thread.sleep(1500);
	  
	}

	@And("^user click login buttons$")
	public void user_click_login_buttons() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	   
	}


}
