import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testseleniumjunit {
	
	FirefoxDriver driver; //best practice to keep in a method rather than at top
	
	@Before
	public void Setup()
	{
		driver = new FirefoxDriver();
	}
	
	@Test //annotations expected, or will not run, run as JUnit test
	public void test1() //JUnit test methods
	{
		driver.get("http://www.bbc.co.uk");
	}
	
	@Test
	public void test2()
	{
		driver.get("http://www.thetrainline.com");
	}
	
	//@Test
	public void test3()
	{
		System.out.println("This is test 3");
	}
	
	@After
	public void teardown()
	{
		driver.quit();
	}

}
