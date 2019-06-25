package Innoppl.Selenium;



import javax.swing.JOptionPane;

import org.openqa.selenium.chrome.ChromeDriver;

public class Captcha_Automate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://qc-chairup.enterpriseapplicationdevelopers.com/customer/account/create/");
		
		
		String Captval = JOptionPane.showInputDialog("Enter the captcha");
		
		driver.findElementByXPath("//*[@id='captcha_user_create']").sendKeys(Captval);
		
		

	}

}
