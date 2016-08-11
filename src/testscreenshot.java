import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("unused")
public class testscreenshot {
	
	//@Test
	public testscreenshot() throws IOException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http:www.thetrainline.com");
		File srcFile = 
				
		// As TakesScreenshot interface has getScreenshotAs method, (cake)
		// casting driver to TakesScreenshot will be essential (icing)
				
				
		((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Automation"));

		//wherever file is stored, create and put in this location
		// this is outside Selenium, more Java
				
		driver.manage().window().maximize();
				
		//driver manage useful
		
	}
	
}
