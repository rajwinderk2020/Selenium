package reusablefunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUtilFunctions {
	
	public WebDriver driver = null;
	
	public WebDriver launchBrowser(String browsername)
	{
		
		try {
			if (browsername.equalsIgnoreCase("chrome")) 
			{
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajwinder\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("browser is no available");
		} 
		return driver;
	}
	

}
