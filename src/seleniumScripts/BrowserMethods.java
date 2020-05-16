package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// Write a script to open chromebrowser, open Mercury NewTourse webpage
		// fetch the title of the page and fetch the url of the page

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32_ver81\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// to open the browser in maximum window
		
		driver.manage().window().maximize();
		
		// opening the application on chrome browser
		
		// get() method is used for opening the application on browser
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		// getTitle() method will fetch the title of the page
		
	String title	=driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Welcome"))
		{
			System.out.println("title is correct");
		}
		// getCurrentURL() method will fetch the URL of currentpage
		
	String url= driver.getCurrentUrl();
		
		System.out.println(url);
		
		
		// Navigation Methods
		
		// here it will navigate to the new page
		
		driver.navigate().to("https://www.selenium.dev/downloads/");
		
		// navigate back to mercury signin page
		
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		// Navigate forward to selenium page
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		// refresh a page
		
		driver.navigate().refresh();
		
		driver.close();
		
		driver.quit();
	
		
		}

}
