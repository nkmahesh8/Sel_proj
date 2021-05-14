package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ifrme {
	@Test
	public void frame() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver",
			"D:\\workspace_eclipse_hani\\Selenium_Training\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); //navigates to the Browser

	//driver.get("http://demo.guru99.com/test/guru99home/");

	// navigates to the page consisting an iframe
	driver.get("http://www.spicejet.com");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.manage().window().maximize();
	int size = driver.findElements(By.tagName("iframe")).size();
	System.out.println("size "+size);
	driver.switchTo().frame(0);
		/*
		 * driver.switchTo().frame("a077aa5e"); //switching the frame by ID
		 * 
		 * System.out.println("********We are switch to the iframe*******");
		 * Thread.sleep(2000); driver.findElement(By.xpath("html/body/a/img")).click();
		 * Thread.sleep(2000);
		 */
	}
}
