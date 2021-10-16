package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {

	public static void main(String[] args) throws Throwable 
	{
     WebDriverManager.chromedriver().setup();
     
     ChromeDriver Autodrive = new ChromeDriver();
     
     Autodrive.get("http://leaftaps.com/opentaps/control/main");		
     Autodrive.manage().window().maximize();		
     Autodrive.findElement(By.id("username")).sendKeys("Demosalesmanager");		
     Autodrive.findElement(By.id("password")).sendKeys("crmsfa");				
     Autodrive.findElement(By.className("decorativeSubmit")).click();		
     Autodrive.findElement(By.linkText("CRM/SFA")).click();		
     Autodrive.findElement(By.linkText("Leads")).click();
     Autodrive.findElement(By.linkText("Find Leads")).click();
     Autodrive.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Kishore");
     Autodrive.findElement(By.xpath("//button[text()='Find Leads']")).click();
     Thread.sleep(2000);
     Autodrive.findElement(By.linkText("18446")).click();
     //Autodrive.findElement(By.xpath("//div[@class='x-grid3-body']//a[2]")).click();
     if (Autodrive.getTitle().contains("View Lead"))
     {
    	 System.out.println("Verified");
     }
     else
     {
    	System.out.println("Not Verified"); 
     }
     Autodrive.findElement(By.linkText("Edit")).click();
     String text = Autodrive.findElement(By.id("updateLeadForm_companyName")).getText();
     
     //Autodrive.findElement(By.id("updateLeadForm_companyName")).clear();
     //	Autodrive.findElement(By.id("updateLeadForm_companyName")).sendKeys("Kishore PVT LTD");
     Autodrive.findElement(By.xpath("//input[@name='submitButton']")).click();
     String text2 = Autodrive.findElement(By.id("viewLead_companyName_sp")).getText();
     if (text != text2)
     {
     System.out.println("Company name changed");
     }
     else
     {
   System.out.println("Not Changed");
     }
	}

}
