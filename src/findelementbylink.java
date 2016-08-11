import org.openqa.selenium.firefox.FirefoxDriver;

public class findelementbylink {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.bbc.co.uk");
		//driver.findElementByLinkText("iPlayer").click();
		driver.findElementByPartialLinkText("iPl").click();
		//driver.wait();
		driver.quit();

	}

}
