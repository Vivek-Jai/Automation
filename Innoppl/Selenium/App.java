package Innoppl.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //WebDriver driver= new FirefoxDriver();
       //System.setProperty("webdriver.gecko.driver","C:\\sel\\Selenium\\driver\\geckodriver.exe");
      System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(); 
       // driver.manage().window().maximize();
        //driver.get("http://staging.w3llpeople.com/");
        driver.get("http://developer:heymagento@staging.w3llpeople.com/");
    }
}
