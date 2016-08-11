import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumgetandnavigate {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		//driver.get("http://www.bbc.co.uk/"); //get vs navigate
		
		//driver.get("http://www.thetrainline.com");
		
		driver.navigate().to("http://www.bbc.co.uk/");
		driver.navigate().to("http://www.thetrainline.com");
		
		driver.navigate().back();
		
		if(driver.getCurrentUrl().equalsIgnoreCase("http://www.bbc.co.uk/"))
		{
			System.out.println("Test Passed");
		}
		
		else
		{
			System.out.println("Test failed");
		}
		//System.out.println(driver.getCurrentUrl());

	}

}
