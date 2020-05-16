package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
			
			Thread.sleep(2000);
			
			
			driver.switchTo().frame("packageListFrame");
			
			Thread.sleep(2000);
			
			
			driver.findElement(By.linkText("com.thoughtworks.selenium.webdriven")).click();
			
			
			Thread.sleep(2000);
			
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame("classFrame");
			
			driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
			////*[@id="n-contents"]/a
			

	}

}
