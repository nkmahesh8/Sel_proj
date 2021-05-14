package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {
	@Test
	public void Handling_alerts() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace_eclipse_hani\\Selenium_Training\\drivers\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	 // to lunch url in a new tab
	driver.navigate().to("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	// command to refresh the current page
	driver.navigate().refresh();
	// lines to maximize the chrome tab
	driver.manage().window().maximize();

	WebElement click_me_btn=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
	click_me_btn.click();
	Thread.sleep(6000);

	String s=driver.switchTo().alert().getText();

	System.out.println("Alert message"+ " "+s);

	driver.switchTo().alert().dismiss();

	Thread.sleep(7000);
}
}