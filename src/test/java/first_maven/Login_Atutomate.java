package first_maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Atutomate {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace_eclipse_hani\\Selenium_Training\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("http://www.facebook.com");
		driver.navigate().to("https://accounts.google.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//display
		/*
		 * boolean displaying=driver.findElement(By.id("identifierId")).isDisplayed();
		 * System.out.println("displayed "+displaying); //gettext String
		 * getText=driver.findElement(By.id("identifierId")).getText();
		 * System.out.println("getText "+getText);
		 */
		
		
		driver.findElement(By.id("identifierId")).sendKeys("nkmahesh8");
		driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/div[2]")).click();
		driver.findElement(By.name("password")).sendKeys("Mahi@2021");
		driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/div[2]")).click();
		

	}
}
