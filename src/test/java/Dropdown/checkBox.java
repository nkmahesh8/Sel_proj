package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkBox {
	WebDriver driver;

	 @Test
	public void selectOption() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver",
					"D:\\workspace_eclipse_hani\\Selenium_Training\\drivers\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
	WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'])[5]"));
	 checkbox1.click();
	Boolean c= checkbox1.isSelected();
	 System.out.println(c);
}
}
