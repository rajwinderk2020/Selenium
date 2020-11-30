package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import reusablefunctions.BaseUtilFunctions;

//program 1
public class FirstSeleniumCode extends BaseUtilFunctions{

	public static void main(String[] args) {
		
		
		/*
		// giving path of chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajwinder\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		// opening new chrome browser 
		WebDriver driver = new ChromeDriver();
		*/
		
		// OR
		
		BaseUtilFunctions b = new BaseUtilFunctions();
		b.launchBrowser("chrome"); 
		
		
		
		
	}

}
