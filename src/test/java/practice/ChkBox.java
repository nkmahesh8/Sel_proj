package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChkBox {
	@Test
	public void chkbx()
	{
	System.setProperty("webdriver.chrome.driver",
			"D:\\workspace_eclipse_hani\\Selenium_Training\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    //Launch website
    driver.navigate().to("http://www.calculator.net/mortgage-calculator.html");
    driver.manage().window().maximize();
    
    //Click on check Box
    driver.findElement(By.id("caddoptional11")).click();
    
    System.out.println("The Output of the IsSelected " +
       driver.findElement(By.id("caddoptional")).isSelected());      
    System.out.println("The Output of the IsEnabled " +
       driver.findElement(By.id("caddoptional")).isEnabled());
    System.out.println("The Output of the IsDisplayed " +
       driver.findElement(By.id("caddoptional")).isDisplayed());
    
   // driver.close();
	}
}
