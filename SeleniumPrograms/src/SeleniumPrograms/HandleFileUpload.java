package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpload 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Selenium does not support any window popup
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.saif.sanaguppam\\Desktop\\Azure\\SAIF\\Java Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://html.com/input-type-file/");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\m.saif.sanaguppam\\Desktop\\SampleFile.html");
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\m.saif.sanaguppam\\Desktop\\Sample.txt");
		Thread.sleep(2000);		
		driver.quit();
	}
}