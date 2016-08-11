import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class testDropdown {
	
	@Test
	public void testdropdownmethod() throws InterruptedException
	
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://tfl.gov.uk/journeyplanner");
		driver.manage().window().maximize();
		
		//Select Datedropdown = new Select(driver.findElementByXPath(".//*[@id='Date']"));
		  Select Timedropdown = new Select(driver.findElementByXPath(".//*[@id='Time']"));
				
				//Datedropdown.selectByVisibleText("Tomorrow");
				  Timedropdown.selectByVisibleText("14:45");
				Thread.sleep(10000);
				//Datedropdown.selectByIndex(5);
				//Timedropdown.selectByIndex(55);
				  Timedropdown.selectByVisibleText("01:45");
				  
		  //ArrayList values = Timedropdown.getOptions();
		    List<WebElement> values = Timedropdown.getOptions();
		    for(int i=0;i<values.size();i++)
		    {
		    	System.out.println(values.get(i).getText());
		    }
		    
		    //This is radio button
		    driver.findElementById("departing").click();
		    Thread.sleep(5000);
		    
		    //This is check box
		    driver.findElementById("NationalSearch").click();
		    Thread.sleep(5000);
		    driver.findElementById("NationalSearch").click();
		    
				    
				Thread.sleep(5000);
				driver.quit();
	}

}
