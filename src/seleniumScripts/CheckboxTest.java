package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ironspider.ca/forms/checkradio.htm");
		
		driver.findElement(By.xpath("//input[@value='red']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='yellow']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='blue']")).click();
		Thread.sleep(3000);
		

	    
	   

	}

}
