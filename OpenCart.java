package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
	
	public static void main(String[] args) throws Throwable 
	{
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver Automation = new ChromeDriver();

	Automation.get("https://www.opencart.com/index.php?route=account/register");
	Automation.manage().window().maximize();
	Automation.findElement(By.id("input-username")).sendKeys("Kishore23cse");
	Automation.findElement(By.id("input-firstname")).sendKeys("Kishore");
	Automation.findElement(By.id("input-lastname")).sendKeys("Kumar");
	Automation.findElement(By.id("input-email")).sendKeys("kish23.cris@gmail.com");
	WebElement findElement1 = Automation.findElement(By.id("input-country"));
	
	Select Automation1 = new Select(findElement1);
	Automation1.selectByVisibleText("India");
	
	Automation.findElement(By.id("input-password")).sendKeys("Test@12345");
	
	Thread.sleep(2000);
	
	//Automation.findElement(By.xpath("//button[text()='Register']")).click();
	
	}

}
