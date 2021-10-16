package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class acmeSystem {

	public static void main(String[] args) throws Throwable 
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver Driver = new ChromeDriver();

	Driver.get("https://acme-test.uipath.com/login");
	Driver.manage().window().maximize();
	Driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");//leaf@12
	Driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
	Driver.findElement(By.xpath("//button[@type='submit']")).click(); //Log Out
	Driver.getTitle();
	System.out.println("Title is : " + Driver.getTitle());
	Driver.findElement(By.xpath("//a[text()='Log Out']")).click(); //Log Out
	Thread.sleep(2000);
	Driver.close();
	}

}
