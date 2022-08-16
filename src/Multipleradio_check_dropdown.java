import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multipleradio_check_dropdown {

public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	//driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	driver.manage().window().maximize();
	
	/*List<WebElement> allradiobtn=driver.findElements(By.xpath("//div[@class=\"control-group\"][5]/input"));
	for(WebElement e:allradiobtn)
	{
		String s=e.getAttribute("value");
		System.out.println(s);
		if(s.equals("1"))
		{
			e.click();
			Thread.sleep(1000);
		}
	}*/
	
	List<WebElement> allcheckbox=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	for(WebElement e:allcheckbox)
	{
		String v=e.getAttribute("value");
		if(v.equals("Movies"))
		{
			e.click();
		}
		if(v.equals("Hockey"))
		{
			e.click();
		}
	}
	
	
}
}
