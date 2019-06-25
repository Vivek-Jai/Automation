package JavaPractice;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		String b ="Amazon";
		String c= "HCL";
		
		try {
			for( String window: allwindows)
			{
			driver.switchTo().window(window);
			String a= driver.getTitle();
				if(a.equalsIgnoreCase(b) || a.equalsIgnoreCase(c))
				{
					
					driver.close();
					
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		//System.out.println("Amazon window is closed");
		
          
          
	}

}
