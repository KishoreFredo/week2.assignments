package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {

	public static void main(String[] args)
	{

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver Automation = new ChromeDriver();
		
		Automation.get("http://leaftaps.com/opentaps/control/login");
		
		//Automation.getTitle();
		
		//System.out.println("Title is : " + Automation.getTitle());
		
		Automation.manage().window().maximize();
		
		Automation.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		
		Automation.findElement(By.id("password")).sendKeys("crmsfa");
		
		//decorativeSubmit
		
		Automation.findElement(By.className("decorativeSubmit")).click();
		
		Automation.findElement(By.linkText("CRM/SFA")).click();
		
		//Contacts
		
		Automation.findElement(By.linkText("Contacts")).click();
		
		Automation.findElement(By.linkText("Create Contact")).click();
		
		Automation.findElement(By.id("firstNameField")).sendKeys("Kishore");

		Automation.findElement(By.id("lastNameField")).sendKeys("Kumar");
		
		Automation.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Kishore");
		
		Automation.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Kumar J");

		Automation.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");

		Automation.findElement(By.id("createContactForm_description")).sendKeys("My contact number is : 9003516565");

		
		Automation.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Kish23.cris@gmail.com");
		
		//createContactForm_generalStateProvinceGeoId
		
		WebElement findElement = Automation.findElement(By.id("createContactForm_generalStateProvinceGeoId"));

        Select Automation1 = new Select(findElement);
        
        Automation1.selectByVisibleText("New York");
        
        Automation.findElement(By.xpath("//input[@class='smallSubmit']")).click();
        
        //smallSubmit
        
        Automation.findElement(By.className("subMenuButton")).click();
        
        //updateContactForm_description
        
        Automation.findElement(By.id("updateContactForm_description")).clear();
        
        //updateContactForm_importantNote
        
        Automation.findElement(By.id("updateContactForm_importantNote")).sendKeys("EMERGENCY contact number already provided");
        
//submitButton
        
        Automation.findElement(By.xpath("//input[@type='submit']")).click();
        
         Automation.getTitle();
		
		System.out.println("Title is : " + Automation.getTitle());
		
		Automation.close();
        	
	}

}
