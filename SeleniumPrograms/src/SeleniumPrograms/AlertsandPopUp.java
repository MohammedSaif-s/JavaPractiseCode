package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsandPopUp
{
	public static void main(String[] args) throws InterruptedException 
	{
		// All popups/ alerts are Javascript popups and it defines by developes
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.saif.sanaguppam\\Desktop\\Azure\\SAIF\\Java Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(5000);
		
		// have to use alert API to handle alerts and then we have to switch 
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String text = alert.getText();
		
		if (text.equals("Please enter a valid user name"))
		{
			System.out.println("Correct Alert Message");
		}
		else
		{
			System.out.println("In-Correct Alert Message");
		}
		alert.accept();
		Thread.sleep(5000);
		driver.quit();
	}

}
