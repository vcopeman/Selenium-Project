//code wrong

import org.openqa.selenium.firefox.FirefoxDriver;

public class testpopupwindow {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.quackit.com/javascript/html_popup_windows.cfm");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("google_ads_frame1");
		driver.findElementByXPath("html/body/div[1]/div/article/div[2]/div[2]/div[2]/div").click();
		System.out.println(driver.getTitle());
		driver.switchTo().window("popupwindow");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
