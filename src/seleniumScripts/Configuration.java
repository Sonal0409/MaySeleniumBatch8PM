package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuration {

	public static WebDriver driver;
	
	public static void initialsetup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32_ver81\\chromedriver.exe");
	
		driver = new ChromeDriver();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
