import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazontest {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","D:\\\\Way to_testing\\\\Selenium 21 june 2022\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	/*	driver.get("http://demo.automationtesting.in/Register.html");
		List<WebElement> radiobtn=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		for(WebElement e:radiobtn)
		{
			String radio=e.getAttribute("value");
			System.out.println("radio");
			if(radio.equals("FeMale"))
			{
				e.click();
			}
		}
		*/
		
		
	driver.get("https://www.amazon.in/");
		List<WebElement> Allbtns=driver.findElements(By.xpath("//div[@id=\"nav-xshop\"]/a"));
		System.out.println(Allbtns.size());
		for(WebElement e:Allbtns)
		{
			e.getText();
		}
	}
		
}
