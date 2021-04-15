package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.saif.sanaguppam\\Desktop\\Azure\\SAIF\\Java Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Priority Check-in")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Priority Check-in')]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
