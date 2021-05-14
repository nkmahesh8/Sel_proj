package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	@Test
	public void drpdown()
	{
	System.setProperty("webdriver.chrome.driver",
			"D:\\workspace_eclipse_hani\\Selenium_Training\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
	 //Launch website
    driver.navigate().to("http://www.calculator.net/interest-calculator.html");
    driver.manage().window().maximize();
    
    //Selecting an item from Drop Down list Box
    Select dropdown = new Select(driver.findElement(By.id("ccompound")));
    dropdown.selectByVisibleText("continuously");
    
    //you can also use dropdown.selectByIndex(1) to select second element as
    //index starts with 0.
    //You can also use dropdown.selectByValue("annually");
    
    System.out.println("The Output of the IsSelected " +
       driver.findElement(By.id("ccompound")).isSelected());
    System.out.println("The Output of the IsEnabled " +
       driver.findElement(By.id("ccompound")).isEnabled());
    System.out.println("The Output of the IsDisplayed " +
       driver.findElement(By.id("ccompound")).isDisplayed());
    
	}
}
