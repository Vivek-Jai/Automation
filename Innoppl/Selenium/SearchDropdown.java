package Innoppl.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchDropdown {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.divers-supply.com/");
		
		
		
		
		
		driver.findElementByXPath("//*[@class='targetbay_modal_block']//button//span").click();
		
		
		
		driver.findElementByXPath("//*[@id='algolia-searchbox']//span/input").sendKeys("scuba");
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		WebElement ele =driver.findElementByXPath("//*[@id='algolia-searchbox']//span/input");
		
		Actions act = new Actions(driver);
		
		for(int i =0;i<=6;i++)
		{
		
		act.click(ele).sendKeys(Keys.ARROW_DOWN).build().perform();
		
		if(i==3)
		{
			act.sendKeys(Keys.ENTER).build().perform();
			break;
		}
		
		
		}
		
		
		
		
		
		
		
		
		
		

	}

}
