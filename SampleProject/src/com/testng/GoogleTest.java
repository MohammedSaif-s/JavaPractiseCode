package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest 
{
	WebDriver driver;	
	// pre conditions
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.saif.sanaguppam\\Desktop\\Azure\\SAIF\\Java Notes\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	// Test cases not dependent on other test cases, always independent
	@Test(priority = 1, groups = "Title")
	public void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority = 2, groups = "MailLink")
	public void mailLinkTest()
	{
		boolean a = driver.findElement(By.xpath("//a[contains(text(), 'Gmail')]")).isDisplayed();
		System.out.println(a);
	}
	
	@Test(priority = 3, groups = "SignIn")
	public void googleSigninTest()
	{
		boolean b = driver.findElement(By.xpath("//a[text()='Sign in']")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(priority = 4, groups = "Logo")
	public void googleLogoTest()
	{
		boolean c = driver.findElement(By.xpath("//img[contains(@class,'lnXdpd')]")).isDisplayed();
		System.out.println(c);
	}
	
	@Test(priority=5, groups = "Test")
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test(priority=6, groups = "Test")
	public void test2()
	{
		System.out.println("Test2");
	}
	
	// post conditions
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}