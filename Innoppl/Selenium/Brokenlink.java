package Innoppl.Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.HttpConnection;

public class Brokenlink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.divers-supply.com/");
		
		List<WebElement> linklist = driver.findElementsByTagName("a");
		
		linklist.addAll(driver.findElementsByTagName("img"));
		
		System.out.println("size of full links and images" +linklist.size());
		
		List<WebElement> activelinks = new ArrayList<WebElement>();
		
		for(int i=0;i<linklist.size();i++)
		{
			if(linklist.get(i).getAttribute("href") != null && (!linklist.get(i).getAttribute("href").contains("javascript")))
			{
				activelinks.add(linklist.get(i));
			}
		}
		
		System.out.println("size of active links and images" + activelinks.size());
		
		for (int j =0 ; j<activelinks.size(); j++)
		{
			
			HttpURLConnection connection = (HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response =connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href") + "------->" +response);
		}
	}

}
