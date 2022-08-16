import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo1 {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Way to_testing\\Selenium 21 june 2022\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		String title=driver.getTitle();
		
		System.out.println("title is:" +title);
		driver.get("https://www.google.com/");
		
		String Currenturl=driver.getCurrentUrl();
		System.out.println("current url is:+currenturl");
//		String pagecode=driver.getPageSource();
//		
//		System.out.println("page code is:"+pagecode);
		
		
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.navigate().forward();
//		Thread.sleep(1000);
//		driver.navigate().refresh();
		
//		driver.navigate().to("https://www.amazon.in/");
//		driver.close();
//		driver.manage().window().maximize();
//		driver.quit();
		
}

}


