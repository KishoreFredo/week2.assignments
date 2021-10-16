package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Duplicatelead
{
	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver Automations = new ChromeDriver();
        Automations.get("http://leaftaps.com/opentaps/control/main");		
        Automations.manage().window().maximize();		
        Automations.findElement(By.id("username")).sendKeys("Demosalesmanager");		
        Automations.findElement(By.id("password")).sendKeys("crmsfa");				
        Automations.findElement(By.className("decorativeSubmit")).click();		
        Automations.findElement(By.linkText("CRM/SFA")).click();		
        Automations.findElement(By.linkText("Leads")).click();      
		Automations.findElement(By.linkText("Find Leads")).click();
        Automations.findElement(By.xpath("//span[text()='Email']")).click();
        Automations.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("Kish23.cris@gmail.com");
	    Automations.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(2000);
	    Automations.findElement(By.linkText("18446")).click();
	    Automations.findElement(By.linkText("Duplicate Lead")).click();	
	    /*if (driver.getPageSource().contains("Duplicate Lead")) {
		System.out.println("verified title duplicate lead");
} else {
		System.out.println("not verified");
	}
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	String text2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	if (text.contains(text2)) {
		System.out.println("duplicate lead created");

	} else {
		System.out.println("duplicate lead not created");
	}*/
	    Automations.findElement(By.xpath("//input)[@name='submitButton']")).click();
	    
	    Automations.close();
	}

}
