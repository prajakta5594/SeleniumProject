import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Way to_testing\\Selenium 21 june 2022\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.amazon.in/");
		String title1=driver.getTitle();
		System.out.println("title is : "+title1);

	
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/");
		
	/*	driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();*/
		
		driver.navigate().to("https://www.google.com/");
		
		
		String current_url=driver.getCurrentUrl();
		System.out.println("current url is:"+current_url);
		
		driver.close();
	//	String pagecode=driver.getPageSource();
	//	System.out.println("pagecode is:" +pagecode);
		
		
		
		
		
//		driver.get("https://www.flipkart.com/");
//		String title2=driver.getTitle();
//		System.out.println("title is : "+title2);
	}

}
