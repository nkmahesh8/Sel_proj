package assrtions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssrtEquals {
	WebDriver driver;
	String title;
	@Test
	public void test() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver",
			"D:\\workspace_eclipse_hani\\Selenium_Training\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	//navigate
	driver.navigate().to("https://www.makemytrip.com/");
	// to launch url or website
	//driver.get("https://www.facebook.com/");
	// lines to maximize the chrome tab
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//title
	title=driver.getTitle();
//	System.out.println("title is "+title);
//	
	

	//url
//	String url=driver.getCurrentUrl();
//	System.out.println(" current url is "+url);
	
//	driver.navigate().forward();
//	driver.navigate().forward();
	
	//driver.navigate().refresh();
	//page source
	//String pageSource=driver.getPageSource();
	//System.out.println(" page source is "+pageSource);
	// use of ID locator
	/*
	 * WebElement round_trip=driver.findElement(By.id("roundTrip"));
	 * round_trip.click();
	 */

	// use of class name locator

	
//	   WebElement icon_text=driver.findElement(By.className("iconText"));
//	   icon_text.click();
	 
	//driver.close();

}
	
	@Test(dependsOnMethods = "test")
	public void assertEquals(){
	Assert.assertEquals(driver.getTitle(),"MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");
	System.out.println("This line is executed because assertEquals "
	+ "passed since both the strings are same");
	
	}
}
