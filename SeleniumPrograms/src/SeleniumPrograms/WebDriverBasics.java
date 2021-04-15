package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.saif.sanaguppam\\Desktop\\Azure\\SAIF\\Java Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google"))
		{
			System.out.println("Correct Title");
		}
		else
		{
			System.out.println("In-Correct Title");
		}
		System.out.println(driver.findElement(By.tagName("title")).getText());
		driver.quit();		
	}
}
