package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce 
{

	public static void main(String[] args) throws Throwable
	{
    
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver Automated = new ChromeDriver();
		
		Automated.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		Automated.getTitle();
		
		Automated.manage().window().maximize();
		
	    //Thread.sleep(2000);

	    Automated.findElement(By.name("UserFirstName")).sendKeys("Kishore");
	    
	    Automated.findElement(By.name("UserLastName")).sendKeys("Kumar");
	    
	    Automated.findElement(By.name("UserEmail")).sendKeys("Kish23.cris@gmail.com");
	    
	    WebElement findElement = Automated.findElement(By.name("UserTitle"));
	    
	    Select Automated1 = new Select(findElement);
	    
	    Automated1.selectByIndex(6);
	    
	    Automated.findElement(By.name("CompanyName")).sendKeys("Fredo Consultancy Services Ltd");
	    
	    WebElement findElement2 = Automated.findElement(By.name("CompanyEmployees"));
	    
	    Select Automated2 = new Select(findElement2);
	    
	    Automated2.selectByIndex(2);
	    
	    Automated.findElement(By.name("UserPhone")).sendKeys("9003516565");
	    
	    WebElement findElement3 = Automated.findElement(By.name("CompanyCountry"));
	    
	    Select Automated3 = new Select(findElement3);
	    
	    Automated3.selectByValue("India");
	   	    
	    Automated.close();
	    
	    
	
		
	}

}
