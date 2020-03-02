package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FormFill {
	
	WebDriver driver;
	
	@Test(dataProvider ="register" ,dataProviderClass = ExcelToDataProvider.class)
	
	public void formdata(String URL, String Firstname, String Lastname, String email, String password,String mobile)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get(URL);
		
		driver .manage().window().maximize();
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys(Firstname);
		
		driver.findElement(By.id("usernamereg-lastName")).sendKeys(Lastname);
		
		driver.findElement(By.id("usernamereg-yid")).sendKeys(email);
		
	    driver.findElement(By.id("usernamereg-password")).sendKeys(password);
	    
	    driver.findElement(By.id("usernamereg-phone")).sendKeys(mobile);
		
		
	}

}
