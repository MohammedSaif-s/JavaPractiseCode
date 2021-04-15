package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.saif.sanaguppam\\Desktop\\Azure\\SAIF\\Java Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
		driver.findElement(By.xpath("//*[@id='createAccountSubmit']")).click();
		driver.findElement(By.name("customerName")).sendKeys("test");
		Thread.sleep(3000);
		
		Select select = new Select(driver.findElement(By.id("auth-country-picker")));
		select.selectByVisibleText("AS +1");
		Thread.sleep(3000);
		driver.quit();
	}

}
