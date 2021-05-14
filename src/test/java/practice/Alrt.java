package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Dropdown.Alert;

public class Alrt {
	@Test
	public void drpdown() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver",
			"D:\\workspace_eclipse_hani\\Selenium_Training\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	String url ="https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm";
    driver.get(url);
    
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    //method 1 for scrolling
    //js.executeScript("window.scrollBy(0,1000)");
    //method 2 fopr scrolling
    WebElement webelmnt= driver.findElement(By.xpath("//button[@name='submit']"));
    js.executeScript("arguments[0].scrollIntoView();", webelmnt);
    // identify element
    driver.findElement(By.xpath("//button[@name='submit']")).click();
    // Alert interface and switchTo().alert() method
    org.openqa.selenium.Alert al = driver.switchTo().alert();
    // click on OK to accept with accept()
    al.accept();
	}

}
