package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver;


	System.setProperty("webdriver.chrome.driver",
			"D:\\workspace_eclipse_hani\\Selenium_Training\\drivers\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	WebElement dropdown = driver.findElement(By.id("multi-select"));
	Select select = new Select(dropdown);
	// select by visible text
	//select.selectByVisibleText("Tuesday");
	// select by visible value
	select.selectByValue("Florida");
	// select by Index
	//select.selectByIndex(3);
	Thread.sleep(5000);
	// Need to use when their are multiple select in a dropdown
}
}
