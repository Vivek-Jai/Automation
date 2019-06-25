package Innoppl.Selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Links_in_a_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		
		
		driver.get("https://www.streetstrider.com/");
		driver.manage().window().maximize();
		
		List<WebElement> link = driver.findElementsByTagName("a");
		
		int count = link.size();
		
		System.out.println(count);
		
		
		for (WebElement links:link)
		{
			System.out.println(links.getText()+ "-" + links.getAttribute("href"));
		}
			

	}

}
