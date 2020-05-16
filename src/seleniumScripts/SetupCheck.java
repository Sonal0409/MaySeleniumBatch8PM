package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupCheck  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Use the browser drivers to open browser on your machine
		
		// these 2 lines will be the very first lines in every selenium script that your write
		
		
	// providing the location of our chrome driver to the script	
	// key here will be the name of driver
		// value will be the location of driver in your machine
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32_ver81\\chromedriver.exe");
	
	// calling the interface and classes of selenium and creating a reference variable
	
	// Class implementing WebDriver methods ChromeDriver
	// FireFoxDriver class, InternetExplorerDriver
	
	WebDriver driver = new ChromeDriver();
	
	// 1. Open the browser 2. Open the application(url) in the browser 
	//3. provide username in username textbox, provide password in the text box and click on sign in button
	
	//Configuration.initialsetup();
	// provide the location of text box in the script and action to be done 
	
	driver.get("www.google.com");
	
	driver.findElement(By.id("searchInput"));
	
	// locate an element using XPATH
	
	driver.findElement(By.xpath("//input[@id='mw-searchButton']"));
	
	////tagname[@attributename='Value']

	
	driver.findElement(By.xpath("//input[@name='userName']"));
	
	driver.findElement(By.name("userName"));
	
	driver.findElement(By.tagName("input"));
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
		
		
		
		
	}

}
