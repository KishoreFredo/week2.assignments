package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws Throwable 
	
	{
		
     WebDriverManager.chromedriver().setup();
     
     ChromeDriver Automate = new ChromeDriver();
     
     Automate.get("https://en-gb.facebook.com/");
     
     Automate.getTitle();
     
     System.out.println("Title is : " + Automate.getTitle());
     
     Automate.manage().window().maximize();
          
     Automate.findElement(By.linkText("Create New Account")).click();
     
      Thread.sleep(2000);
      
      Automate.findElement(By.name("firstname")).sendKeys("Kishore");

      Automate.findElement(By.name("lastname")).sendKeys("Fredo");
     
      Automate.findElement(By.name("reg_email__")).sendKeys("kishore.soccerplayer@gmail.com");
     
     Automate.findElement(By.name("reg_email_confirmation__")).sendKeys("kishore.soccerplayer@gmail.com");

     Automate.findElement(By.name("reg_passwd__")).sendKeys("Test@12345");
    
     Automate.findElement(By.name("birthday_day")).sendKeys("25");
     
     Automate.findElement(By.name("birthday_month")).sendKeys("Nov");
     
     Automate.findElement(By.name("birthday_year")).sendKeys("1990");
     
     Automate.findElement(By.xpath("//input[@value='1']")).click();
        
     
     	}

}
