import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testpopup {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("/html/body/button").click();
		
		//above action will open pop up
		
		Alert testalert = driver.switchTo().alert();
		
		//this is an alert so alert class needed
		
		System.out.println(testalert.getText());
		Thread.sleep(5000);
		//testalert.accept();
		//testalert.dismiss();
		testalert.sendKeys("We are learning Selenium");
		
		driver.quit();

	}

}
