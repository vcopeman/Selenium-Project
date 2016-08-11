import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingiframes {
	
	@Test
	public void testframes()
	
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.easyjet.com");
		
		driver.switchTo().frame("tabco-iframe-1"); //** important to remember
		
		//try thread sleep if doesn't work at first
		//if not, could be iFrame
		
		driver.findElementById("acDestinationAirport").sendKeys("Paris");
		
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		
		driver.quit();
	}

}
