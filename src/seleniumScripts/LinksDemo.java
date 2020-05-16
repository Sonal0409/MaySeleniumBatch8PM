package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
			
			Thread.sleep(2000);
			
		WebElement lin= driver.findElement(By.linkText("Main page"));
		
		
System.out.println(" to check if button is displayed or not : " + lin.isDisplayed());
		
		System.out.println(" to check if button is enabled or not : " +lin.isEnabled());
	    lin.click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.partialLinkText("Donate to")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.navigate().back();
	    
	    driver.findElement(By.partialLinkText("Contents")).click();
	    
	    driver.close();
		
	}

}
