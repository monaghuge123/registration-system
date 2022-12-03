package automatiombatch1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentforjob {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Monika\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://meralda.scalenext.io/user/register");
		driver.findElement(By.name("first_name")).sendKeys("shuddhamati");
		driver.findElement(By.name("last_name")).sendKeys("Throve");
		driver.findElement(By.name("email")).sendKeys("mona140597@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("8830638970");
		
		//code for date of birth
		driver.findElement(By.name("date")).click();
		
		//code for month
		driver.findElement(By.xpath("//button[@class='mx-btn mx-btn-text mx-btn-current-month']")).click();
		driver.findElement(By.xpath("//td[@data-month='4']")).click();
		
		//code for year
		Thread.sleep(20);
	    while(true)
	    {
		String text=driver.findElement(By.xpath("//button[@class='mx-btn mx-btn-text mx-btn-current-year']")).getText();
        if(text.equals("1997")) 
        {
        	break;
        }
        else
        {
        	driver.findElement(By.xpath("//i[@class='mx-icon-double-left']")).click();
        }
	    }
	    
	   //code for date
	    driver.findElement(By.xpath("//div[text()='14']")).click();
	    
	    //code for password
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("suddhu123");
	    
	    //code for confirm password
	    driver.findElement(By.name("password_confirmation")).sendKeys("suddhu123");
	    
	    Thread.sleep(2000);
	    //code for Ragistaration button
	    //driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	  driver.findElement(By.xpath("//a[text()='Login']")).click();
	  
	  
	  //code for login page
	  
	  driver.findElement(By.name("username")).sendKeys("mona140597@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("suddhu123");
	  driver.findElement(By.xpath("//button[text()='Login']")).click();
	    
	    
				
	
		
	
		
	   

}}
