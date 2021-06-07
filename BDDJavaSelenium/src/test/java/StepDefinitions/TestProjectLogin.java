package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class TestProjectLogin
{
	WebDriver driver = null;
	@Given("browser page is open")
	public void browser_page_is_open() 
	{
		// Absolute path 
		//System.setProperty("webdriver.chrome.driver", "C:/Users/m.saif.sanaguppam/Desktop/Azure/New folder/BDDJavaSelenium/src/test/resources/drivers/chromedriver.exe");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path is : " +projectPath);
		System.setProperty("webdriver.chrome.driver",  projectPath + "/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@And("user is on the login page")
	public void user_is_on_the_login_page() 
	{
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("user enters the valid username and password")
	public void user_enters_the_valid_username_and_password() throws InterruptedException 
	{
		driver.findElement(By.id("name")).sendKeys("SAIF");
		driver.findElement(By.id("password")).sendKeys("12345");
		Thread.sleep(3000);
	}

	@And("user clicks login page")
	public void user_clicks_login_page() 
	{
		driver.findElement(By.id("login")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException 
	{
		driver.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(3000);
		driver.quit();
	}
}