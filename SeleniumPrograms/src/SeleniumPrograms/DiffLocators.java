package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiffLocators 
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
		
		// 1. xpath - priority (2) to use
		// absolute xpath should not use --> eg:- html/body/div[1]/div[5]
		// only relative xpath should use 
		driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
		driver.findElement(By.xpath("//*[@id='createAccountSubmit']")).click();
		
		// 2. id -- priority (1) to use
//		driver.findElement(By.id("ap_customer_name")).sendKeys("test");
		
		// 3. name -- priority (3) to use
//		driver.findElement(By.name("customerName")).sendKeys("test");
		
		// 4. linkText -- priority (1) to use only for links
//		driver.findElement(By.linkText("Sign in")).click();
		
		// 5. partialLinkText - not recommended
//		driver.findElement(By.partialLinkText("Create a free")).click();
		
		// 6. CSS selector -- priority (2) to use
		driver.findElement(By.cssSelector("#ap_customer_name")).sendKeys("test");		
		
		// 7. Class - Not useful, and it can be same for different elements
		// priority (4) to use
		driver.findElement(By.className("a-link-emphasis")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
