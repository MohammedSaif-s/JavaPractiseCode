package com.dynamicpaths.learn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//customize xpath concept
public class PathsSelec
{
	public static void main(String[] args) throws InterruptedException 
	{		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.saif.sanaguppam\\Desktop\\Azure\\SAIF\\Java Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		/*DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("ignoreProtectModeSettings", true);
		cap.setCapability("ignoreZoomSetting", true);
			
		System.setProperty("webdriver.ie.driver", "C:\\Users\\m.saif.sanaguppam\\Desktop\\Azure\\SAIF\\Java Notes\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(cap);*/
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Python Pocket Reference");
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Python Pocket Reference");
		//driver.findElement(By.xpath("//input[contains(@id,'twotabsearch') and contains(@name,'keywords')]")).sendKeys("Python Pocket Reference");
		//driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearch') and ends-with(@name,'field')]")).sendKeys("Python Pocket Reference");
		
		driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}