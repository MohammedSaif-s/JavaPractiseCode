package testCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase extends BaseTest
{
	@Test(priority = 1, groups="Test")
	public void amazonLogoTest()
	{
		
		boolean a = driver.findElement(By.xpath("//a[contains(@id,'nav-logo-sprites')]")).isDisplayed();
		System.out.println(a);
		//Assert.assertEquals(a, true);
		Assert.assertTrue(a);
	}

	@Test(priority = 2, groups="Test")
	public void titleTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Title is not matched");
	}

	@Test(priority = 3, groups="Test")
	public void testAddress()
	{
		boolean b = driver.findElement(By.xpath("//a[contains(@id,'nav-global-location-popover-link')]")).isDisplayed();
		System.out.println(b);
		Assert.assertEquals(b, true);
	}

	@Test(priority=4, invocationCount = 4)
	public void sampleTest() 
	{
		System.out.println("Test this app");
	}
}