import org.openqa.selenium.firefox.FirefoxDriver;

public class findelementbytagname { //relative and absolute

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.gmail.com");
		driver.findElementById("Email").sendKeys("a@gmail.com");
		driver.findElementById("next").click();
		
		Thread.sleep(5000); //sleep for 20 seconds
		driver.findElementByCssSelector("input[type = 'password']").sendKeys("London");
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
