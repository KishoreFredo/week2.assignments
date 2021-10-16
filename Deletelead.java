package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Deletelead 
{
	public static void main(String[] args) throws Throwable  
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver Auto = new ChromeDriver();
		Auto.get("http://leaftaps.com/opentaps/control/main");
        Auto.manage().window().maximize();		
		Auto.findElement(By.id("username")).sendKeys("Demosalesmanager");	
		Auto.findElement(By.id("password")).sendKeys("crmsfa");				
		Auto.findElement(By.className("decorativeSubmit")).click();		
		Auto.findElement(By.linkText("CRM/SFA")).click();		
		Auto.findElement(By.linkText("Leads")).click();		
		Auto.findElement(By.linkText("Find Leads")).click();		
		//Auto.findElement(By.xpath("//span[text()='Phone']")).click();				
		//Auto.findElement(By.name("phoneNumber")).sendKeys("9003516565");						
		//Auto.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//Auto.findElement(By.linkText("18442")).click();
	    //Auto.findElement(By.className("subMenuButtonDangerous")).click();
		//Auto.findElement(By.linkText("Find Leads")).click();
		Auto.findElement(By.xpath("//input[@id='ext-gen246']")).click();
		Auto.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys("18442");
		Auto.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		Auto.close();

		
		

		

			
	}

}
