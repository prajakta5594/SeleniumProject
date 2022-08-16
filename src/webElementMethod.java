import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementMethod {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Way to_testing\\\\Selenium 21 june 2022\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.id("txtUsername"));
		Thread.sleep(2000);
		ele.clear();
		ele.sendKeys("Admin");
		
		/*String tagname=ele.getTagName();
		System.out.println("Tag name of username is:"+tagname);
		*/
		String Attributevalue=ele.getAttribute("name");
		System.out.println("Name_Attribute_valueIs  :"  +Attributevalue);
		
		boolean b=ele.isDisplayed();
		System.out.println("isDisplayed:"+b);
		
	/*	WebElement forgotpass=driver.findElement(By.xpath("//div[@id=\"forgotPasswordLink\"]/a"));
		String text=forgotpass.getText();
		System.out.println("getext:"+text);
		*/
		
		
	/*	org.openqa.selenium.Point p=ele.getLocation();
		int x=p.x;
		int y=p.y;
		System.out.println("x=:"+x);
		System.out.println("x=:"+y);*/
		
//		Dimension dim=ele.getSize();
//		int wd=dim.width;
//		int ht=dim.height;
//		System.out.println("width is:"+wd);
//		System.out.println("height is:"+ht);
		
		
		
		WebElement login_ele=driver.findElement(By.id("btnLogin"));
		login_ele.click();
		login_ele.click();
		login_ele.submit();
		System.out.println(login_ele.getSize().width);
	
	}

}
