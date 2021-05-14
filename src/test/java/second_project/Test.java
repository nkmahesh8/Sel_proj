package second_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace_eclipse_hani\\Selenium_Training\\drivers\\chromedriver.exe");		   
		WebDriver driver = new ChromeDriver();
		// to launch url or website
		driver.get("https://makemytrip.com/");

		// navigate to command
		//driver.navigate().to("https://makemytrip.com");


		// lines to maximize the chrome tab
		driver.manage().window().maximize();

		Thread.sleep(5000);

		// to get title
		String title=driver.getTitle();
		System.out.println("title of the page"+" "+title);
		// to get current URL
		String Current_URL=driver.getCurrentUrl();
		System.out.println("Currnt URL of the page"+" "+Current_URL);
		// to get pagesource
//		String Pagesource=driver.getPageSource();
//		System.out.println("Pagesource"+" "+Pagesource);

		// browser navigation command
		//driver.navigate().forward();
		// driver.navigate().back();

		driver.navigate().refresh();


		// click on Login button
		WebElement login_button = driver.findElement(By.xpath("//li[@data-cy='account']"));
		Boolean displaying= login_button.isDisplayed();
		System.out.println(displaying);
		Boolean enabled= login_button.isEnabled();
		System.out.println(enabled);
		
		String getText=login_button.getText();
		System.out.println("getText"+getText);
		
		String getTag=login_button.getTagName();
		System.out.println("getTag"+getTag);
		
		String getCss=login_button.getCssValue("background-color");
		System.out.println("getCss"+getCss);
		
		Dimension getSize=login_button.getSize();
		System.out.println("getSize"+getSize);
		
		String getAttr=login_button.getAttribute("class");
		System.out.println("getAttr"+getAttr);
		
		Thread.sleep(2000);
		login_button.click();

		// use of ID locator
		WebElement Username_field = driver.findElement(By.id("username"));

		Username_field.sendKeys("777777777");


//		// use of xpath locator
//		WebElement hotel_link = driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/hotels/']"));
//		// use of class name
//		WebElement classname= driver.findElement(By.className("latoBold"));
//		// use of link text
//
//		WebElement link= driver.findElement(By.linkText("https://www.makemytrip.com/homestays/"));
//
//		// use of partial link text
//
//		WebElement link= driver.findElement(By.linkText("https://www.makemytrip.com/homes"));
//
//		// use of css selector
//
//		WebElement Username_field_css=driver.findElement(By.cssSelector("input#username"));
//
//		// use of class name locator
//
//		WebElement icon_text=driver.findElement(By.className("iconText"));
//		icon_text.click();
//		// command to close browser
//		driver.close();

		
	}

}
