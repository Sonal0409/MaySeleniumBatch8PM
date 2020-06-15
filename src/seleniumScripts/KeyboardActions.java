package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		driver.findElement(By.name("userName")).sendKeys("Username1");
		
		Actions action= new Actions(driver);
		// to perform tab
		action.sendKeys(Keys.TAB).build().perform();
		// to enter data in text box
		action.sendKeys("pssword").build().perform();
		// to press enter.
		action.sendKeys(Keys.RETURN).build().perform();
		
		
		
		
		
		
		
		
	}

}
