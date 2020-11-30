package seleniumConcepts;
//program 2

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajwinder\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // to maximize browser
		
//1.  to open Application
		driver.get("https://www.google.ca/"); 
		
//2.  to capture Title of application
		String appTitle = driver.getTitle();  //Actual value
		
		if (appTitle.equalsIgnoreCase("google")) {
			
			System.out.println("Application opened is: " + appTitle);
		} else {

			System.out.println("Some Other application is opened");
		}
		
//3. to get URL of application
		String appURL = driver.getCurrentUrl();
		System.out.println("Application URL is : " + appURL);
		
		if (appURL.contains("google.ca")) {
			
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		driver.quit(); // to close browser
		
		
		
		
		
		
	}

}
