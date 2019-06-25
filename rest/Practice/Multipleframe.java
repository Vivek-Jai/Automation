package rest.Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipleframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/recaptcha/api2/demo");
		WebElement number= driver.findElementByXPath("//*[@id='recaptcha-demo']/div/div/iframe");
		driver.switchTo().frame(number);
		driver.findElementById("recaptcha-anchor").click();
		driver.switchTo().defaultContent();
		WebElement number1= driver.findElementByXPath("/html/body/div[2]/div[4]/iframe");
		driver.switchTo().frame(number1);
		driver.findElementByXPath("//*[text()='Verify']").click();
		
		

	}

}
