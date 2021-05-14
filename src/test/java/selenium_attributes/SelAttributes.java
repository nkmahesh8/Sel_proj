package selenium_attributes;

import org.testng.annotations.Test;

public class SelAttributes {
	//description
	@Test(description = "This is testcase1")
	public void testcase1()
	{

		System.out.println("HR");

	}
	
	//depends
	@Test
	public void WebStudentLogin() {
		System.out.println("Student login through web");
	}
	
	@Test(dependsOnMethods= {"WebStudentLogin"})
	public void APIStudentLogin()
	{
	System.out.println("Student login through API");

	}
	
	@Test(enabled=false)
	public void apple()
	{
		System.out.println("apples test case");
	}
	@Test(priority=1)
	public void mango()
	{
		System.out.println("mango test case");
	}
	@Test(priority=2)
	public void watermelon()
	{
		System.out.println("watermelon test case");
	}
	@Test(timeOut=200)
	public void testcase11() throws InterruptedException
	{
	Thread.sleep(500);
	System.out.println("This is testcase11");
	}
}
