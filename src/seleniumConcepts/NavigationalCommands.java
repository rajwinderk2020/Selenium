package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program 3
public class NavigationalCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajwinder\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Google
		driver.get("https://www.google.ca/");
		System.out.println( driver.getTitle());
		
		//TekInspire
		driver.get("http://tekinspireinfotech.com/");
		System.out.println( driver.getTitle());
		
		//clicking on browser back button
// 1. driver.navigate.back();
		driver.navigate().back();
		System.out.println( driver.getTitle());
		
		
		//clicking on forward button of browser
// 2. driver.navigate().forward();
		driver.navigate().forward();
		System.out.println( driver.getTitle());
		
		//Refreshing browser
//3. driver.navigate().refresh();
		driver.navigate().refresh();
		
	}

}
