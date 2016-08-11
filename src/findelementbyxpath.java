import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findelementbyxpath { //relative and absolute

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		driver.findElementById("Email").sendKeys("a@gmail.com");
		driver.findElementById("next").click();
		
		//Thread.sleep(5000); //sleep for 5 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//input[@type = 'password']").sendKeys("London");
		
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.quit();
		

	}

}
