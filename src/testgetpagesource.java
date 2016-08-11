import org.openqa.selenium.firefox.FirefoxDriver;

public class testgetpagesource {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.bbc.co.uk");
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getTitle());
		driver.close(); //only ones that were opened by your program (quit)

	}

}
