package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps
{
//	WebDriver driver = null;
//	@Given("brower is open")
//	public void brower_is_open() 
//	{
//		System.out.println("Inside Step -  Browser is Opened");
//		
//		// Absolute path 
//		//System.setProperty("webdriver.chrome.driver", "C:/Users/m.saif.sanaguppam/Desktop/Azure/New folder/BDDJavaSelenium/src/test/resources/drivers/chromedriver.exe");
//		
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project Path is : " +projectPath);
//		System.setProperty("webdriver.chrome.driver",  projectPath + "/src/test/resources/drivers/chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() 
//	{
//		System.out.println("Inside Step -  User is on Google search page");
//		driver.navigate().to("https://google.com/");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() 
//	{
//		System.out.println("Inside Step - User enter the text");
//		driver.findElement(By.name("q")).sendKeys("az-104");
//	}
//
//	@And("hits enter")
//	public void hits_enter() 
//	{
//		System.out.println("Inside Step - User hits enter");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() 
//	{
//		System.out.println("Inside Step - User is navigated to the search results");
//		driver.getPageSource().contains("Microsoft Azure Administrator (AZ-104) | Pluralsight");
//		driver.quit();
//	}
}