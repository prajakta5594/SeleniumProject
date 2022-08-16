import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsExample {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Way to_testing\\Selenium 21 june 2022\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	/*	driver.get("https://demo.guru99.com/test/link.html");*/
	driver.get("http://demo.automationtesting.in/");

	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	WebElement element=driver.findElement(By.id("btn2"));
	element.click();
	
	WebElement Firstname=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
	//Firstname.clear();
	if(Firstname.isDisplayed())
	{
		System.out.println("it is displayed");
	Firstname.sendKeys("prajakta");
	}
	else
	{
		System.out.println("not displayed");
	}
	
	WebElement Lastname=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
	Lastname.clear();
	Lastname.sendKeys("patil");
	
	WebElement Address=driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
	Address.clear();
	Address.sendKeys("vita");
	
	WebElement EmailAddress=driver.findElement(By.xpath("//input[@type=\"email\"]"));
	EmailAddress.clear();
	EmailAddress.sendKeys("prajaktapatil03@gmail.com");
	
	WebElement phone_no=driver.findElement(By.xpath("//input[@type=\"tel\"]"));
	phone_no.sendKeys("888889999");
	
	WebElement radiobutton=driver.findElement(By.name("radiooptions"));
	radiobutton.click();
	
	
	WebElement checkbox=driver.findElement(By.id("checkbox2"));
	if(!checkbox.isSelected())
	{
		checkbox.click();
	}
	
	WebElement password=driver.findElement(By.id("firstpassword"));
	if(password.isEnabled())
	{
	password.sendKeys("praj@123");
	}
	else
	{
		System.out.println("password not enabled");
	}
	WebElement Confpass=driver.findElement(By.id("secondpassword"));
	Confpass.clear();
	Confpass.sendKeys("praj@123");
	
	WebElement submitbtn=driver.findElement(By.id("submitbtn"));
	submitbtn.submit();
	
	/*WebElement link=driver.findElement(By.linkText("Practice Site"));
	link.click();*/
	
	WebElement Skilldropdown=driver.findElement(By.id("Skills"));
	Select s=new Select(Skilldropdown);
	Thread.sleep(2000);
	s.selectByValue("Android");
	
	
	

	/*WebElement Countriesdrop=driver.findElement(By.id("countries"));
	Countriesdrop.click();*/
	
	
	
	/*WebElement Fiirstname=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
	driver.findElement(By.partialLinkText("here")).click();*/

	
	
	
/*	WebElement link1=driver.findElement(By.linkText("WebTable"));
	link1.click();*/
	
	//driver.findElement(By.partialLinkText("Table")).click();;
	

	
	
}
}