import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebHandlingEx {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\Way to_testing\\\\Selenium 21 june 2022\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Thread.sleep(2000);
		List<WebElement> Allcheckbox=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for(WebElement e:Allcheckbox)
		{
			String v=e.getAttribute("value");
			System.out.println(v);
			if(v.equals("Movies"))
			{
				e.click();
			}
			if(v.equals("Hockey"))
			{
				e.click();
			}
		}
		
		
		
		
		
		
		
	    //driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	   /* WebElement element=driver.findElement(By.id("exp-0"));
	    element.click();
	    */
	 /*   List<WebElement> Allradiobtn=driver.findElements(By.xpath("(//div[@class=\"control-group\"])[5]/input"));
	    for(WebElement e:Allradiobtn)
	    {
	    	String value=e.getAttribute("value");
	    	System.out.println(value);
	    if(value.equals("5"))
	    {
	    	Thread.sleep(1000);
	    	e.click();
	    }*/
	    }

}
