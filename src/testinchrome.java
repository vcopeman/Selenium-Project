import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//3rd party drivers on Selenium HQ site
// needs to be set in system property

public class testinchrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		//only line need to learn for Chrome
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bbc.co.uk");
		
		
		

	}

}
