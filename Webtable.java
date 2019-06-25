package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22398/mi-vs-dc-3rd-match-indian-premier-league-2019");
		WebElement table=driver.findElementByXPath("//*[@id='innings_2']/div[1]");
		int rowcount= table.findElements(By.xpath("//*[@id='innings_2']/div[1]//*[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count= table.findElements(By.xpath("//*[@id='innings_2']/div[1]//*[@class='cb-col cb-col-100 cb-scrd-itms']//div[3]")).size();
	
		for (int i=0;i<count-2;i++)
		{
			System.out.println(table.findElements(By.xpath("//*[@id='innings_2']/div[1]//*[@class='cb-col cb-col-100 cb-scrd-itms']//div[3]")).get(i).getText());
		}
		
		System.out.println(table.findElement(By.xpath("//*[@id='innings_2']//div[text()='Extras']/following-sibling::div[1]")).getText());
		System.out.println(table.findElement(By.xpath("//*[@id='innings_2']//div[text()='Total']/following-sibling::div[1]")).getText());
		
}
}
