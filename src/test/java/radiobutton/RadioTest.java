package radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioTest {

	@Test
	public void selectradiobutton() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace_eclipse_hani\\Selenium_Training\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
	Thread.sleep(5000);

	//WebElement radiobutton1 = driver.findElement(By.xpath("(//input[@value='Female'])[2]"));
	WebElement radiobutton2 = driver.findElement(By.xpath("//(input[@value='0 - 5'][2]"));
	//*[@id="easycont"]/div/div[2]/div[2]/div[2]/div[2]/label[2]
	//*[@id="easycont"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input
	// radiobutton1.click();
	
	//(//input[@type='radio'])[5] xpath with group indexing
	 radiobutton2.click();
	
}
}
