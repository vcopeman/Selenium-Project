import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testfindelements { 

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.bbc.co.uk");
		//ArrayList links = driver.findElementsByTagName("a")
		List<WebElement> links = driver.findElementsByTagName("a");
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) //change to number of elements in arraylist
		{
			System.out.println(links.get(i).getAttribute("href"));
			
		}

	}

}
