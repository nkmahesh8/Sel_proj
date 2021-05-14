package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RdioButton {
	@Test
	public void testRadbutton() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace_eclipse_hani\\Selenium_Training\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/mortgage-payoff-calculator.html");
	      driver.manage().window().maximize();
	      
	      // Click on Radio Button
	      driver.findElement(By.id("cpayoff1")).click();
	      System.out.println("The Output of the IsSelected " +
	         driver.findElement(By.id("cpayoff1")).isSelected());
	      System.out.println("The Output of the IsEnabled " +
	         driver.findElement(By.id("cpayoff1")).isEnabled());
	      System.out.println("The Output of the IsDisplayed " +
	         driver.findElement(By.id("cpayoff1")).isDisplayed());
	      
	      //Close the Browser.
	      //driver.close();
		
			   }	
	}

